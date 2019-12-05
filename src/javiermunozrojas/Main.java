package javiermunozrojas;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ParseoXml.Parsear();
		try {
			Runtime.getRuntime().exec(new String[]{"cmd", "/c","start chrome file:///C:/Users/Javier%20Mu%C3%B1oz/Desktop/MY%20WORKSPACE%20V2/ExamenDiciembre/htmlExamen.html"});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Introduce una salida o un destino: ");
//		sc.nextLine();
//		
//		Conexion.buscarNombre(sc);
		
	}

}
