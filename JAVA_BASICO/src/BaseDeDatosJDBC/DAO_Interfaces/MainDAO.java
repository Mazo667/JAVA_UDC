package BaseDeDatosJDBC.DAO_Interfaces;

import BaseDeDatosJDBC.EncapsulamientoAccesoDatos.Cliente;

public class MainDAO {

	public static void main(String[] args) {
		ClienteDAO dao = DAOutil.getClienteDAO();
		
		int idCliente = 41324177;
		Cliente cli = dao.find(idCliente);
		
		System.out.println("DNI: "+cli.getDni()+"\n"+cli.getApellido()+" "
				+cli.getNombre()+"\nDOMICILIO: "+cli.getDomicilio()+"\nSEXO: "
				+cli.getSexo()+"\nFECHA DE NACIMIENTO: "+cli.getFechaNac() );
	}

}
