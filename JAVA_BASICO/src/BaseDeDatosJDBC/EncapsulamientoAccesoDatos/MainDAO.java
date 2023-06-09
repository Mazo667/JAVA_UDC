package BaseDeDatosJDBC.EncapsulamientoAccesoDatos;

public class MainDAO {

	public static void main(String[] args) {
		ClienteDAO dao = new ClienteDAO();
		
		int idCliente = 41324177;
		Cliente cli = dao.find(idCliente);
		
		System.out.println("DNI: "+cli.getDni()+"\n"+cli.getApellido()+" "
		+cli.getNombre()+"\nDOMICILIO: "+cli.getDomicilio()+"\nSEXO: "
		+cli.getSexo()+"\nFECHA DE NACIMIENTO: "+cli.getFechaNac() );
	}

}
