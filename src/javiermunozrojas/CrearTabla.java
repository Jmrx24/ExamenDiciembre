package javiermunozrojas;

import java.io.IOException;
import java.util.ArrayList;


public class CrearTabla {

	public static String pintar(ArrayList<Bus> listaBus) {
		String html = "<html>";
		html += "<table border=1>";
		html+="<tr><td>Label</td><td>NameA(Salida)</td><td>NameB(Destino)</td></tr>";
		for (Bus bus : listaBus) {
			html += "<table border=1>";
//			html += "<tr><td>Label</td><td>" + bus.getLabel() + "</td></tr>";
//			System.out.println(bus.getLabel());
//			html += "<tr><td>NameA(Salida)</td><td>" + bus.getNameA() + "</td></tr>";
//			System.out.println(bus.getNameA());
//			html += "<tr><td>NameB(Destino)</td><td>" + bus.getNameB() + "</td></tr>";
//			System.out.println(bus.getNameB());
			html+="<tr><td>"+bus.getLabel()+"</td><td>"+bus.getNameA()+"</td><td>"+bus.getNameB()+"</td></tr>";
			html += "</table>";

			
			
		}

		html += "</html>";
		CrearFichero.crearHTML(html);
		return html;
		
	}

	
	
}
