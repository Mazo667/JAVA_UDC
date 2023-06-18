package BaseDeDatosJDBC.DAO_Interfaces;

import BaseDeDatosJDBC.EncapsulamientoAccesoDatos.Cliente;

public class MainDAO2Dinamico {
	public static void main(String[] args) {
		ClienteDAO dao = DAOutil2.getObject("ClienteDAO");
		
		int clienteId = 41324177;
		Cliente cli = dao.find(clienteId);
	}
}
