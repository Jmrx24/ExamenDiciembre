package javiermunozrojas;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CrearFichero {

	public static void crearCSV(ArrayList<Bus> listaBus) {
		
		String fichero="";
		for (Bus bus : listaBus) {
			
			fichero+=bus.getLabel()+","+bus.getNameA()+","+bus.getNameB()+";\n";
		}
		
		try {
			FileWriter fw=new FileWriter("csvExamen.csv");
			
			fw.write(fichero);
			
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
	
	public static void crearHTML(String html) {

		try {
			FileWriter fw = new FileWriter("htmlExamen.html");

			fw.write(html);
			fw.close();
			
		} catch (IOException e) {
			System.out.println("Error E/S: " + e);
		}
		

	}

}
