package javiermunozrojas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

public class ParseoXml {

	static URL url;

	public static void Parsear() {
		Bus b;
		ArrayList<Bus> listaBus = new ArrayList<Bus>();
		SAXBuilder sxb = new SAXBuilder();

		try {
			url = new URL("http://opendata.emtmadrid.es/data/opendata/XML/Lines.xml");
			URLConnection conex;
			conex = url.openConnection();
			BufferedReader bf = new BufferedReader(new InputStreamReader(conex.getInputStream()));
			Document documento = sxb.build(bf);
			Element e = documento.getRootElement();
			Element documentE= e.getChild("DocumentElement");
			
			List<Element> registro=documentE.getChildren("REG");
			
			for (Element element : registro) {
				//Labels
				Element lab=element.getChild("Label");
				String label=lab.getValue();
				//NamesA
				Element nA=element.getChild("NameA");
				String nameA=nA.getValue();
				//NamesB
				Element nB=element.getChild("NameB");
				String nameB=nB.getValue();
				//Crear objeto
				Bus busesito=new Bus(label, nameA, nameB);
				listaBus.add(busesito);
			}
			String html=CrearTabla.pintar(listaBus);
			CrearFichero.crearCSV(listaBus);
			Conexion.insertarBus(listaBus);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
