package javiermunozrojas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Conexion {

	static String usuario = "root";
	static String passwd = "";
	static String url = "jdbc:mysql://localhost:3306/examen?serverTimezone=UTC";
	static String driver = "com.mysql.cj.jdbc.Driver";
	static Connection conex;

	public static void Acceder() {

		try {
			Class.forName(driver);
			conex = DriverManager.getConnection(url, usuario, passwd);
			System.out.println("Conexión realizada a la base de datos con éxito.");
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

	public static Connection getConnection() {
		return conex;
	}

	public static void insertarBus(ArrayList<Bus> listaBus)  {
		Acceder();
			Statement stm;
			try {
				stm=conex.createStatement();
				for (Bus bus : listaBus) {

					String sql = "INSERT INTO bus values('"+bus.getLabel()+"','"+bus.getNameA()+"','"+bus.getNameB()+"' )";

					stm.executeUpdate(sql);
				}
				stm.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}

	public static void buscarNombre(Scanner sc) {
		Acceder();
		
		
		
	}

}
