package BaseDeDatosJDBC.DAO_Interfaces;

public class DAOutil {
	public static ClienteDAO getClienteDAO() {
		//Implementamos JDBC
		return new ClienteDAOimpleJDBC();
		//return new ClienteDAOimpleHIbernate(); //En este caso implementamos Hibernate
	}
}
//Factory Method para abstraernos de la implementacion