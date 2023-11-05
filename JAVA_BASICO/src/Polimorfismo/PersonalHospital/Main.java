import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		ArrayList<PersonalHospital> personal = new ArrayList<PersonalHospital>();
		
		personal.add(new Enfermera("Gabriela","Enfemera"));
		personal.add(new Medico("Manuel","Medico"));
		
		for(PersonalHospital per : personal) {
			per.presentarse();
		}
	}

}
