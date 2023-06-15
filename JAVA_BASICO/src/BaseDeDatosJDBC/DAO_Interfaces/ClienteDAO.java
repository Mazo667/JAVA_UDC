package BaseDeDatosJDBC.DAO_Interfaces;

import BaseDeDatosJDBC.EncapsulamientoAccesoDatos.Cliente;

public interface ClienteDAO {
	public Cliente find(int idCliente);
}
