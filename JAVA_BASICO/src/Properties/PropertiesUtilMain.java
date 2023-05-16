package Properties;
import java.util.Properties;

public class PropertiesUtilMain {

	public static void main(String[] args) {
		Properties props = PropertiesUtil.getproperties("persona.properties");
		
		//Si el archivo de propiedades fuera exclisivo para la clase Aplicacion deberia invocarse asi
		//Properties props = PropertiesUtil.getProperties(Aplicacion.class);

	}

}
