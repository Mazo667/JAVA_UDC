package BaseDeDatosJDBC.EncapsulamientoAccesoDatos;

import java.sql.Connection;

public class Transaction {
	private Connection con = null;
	
	public Transaction(Connection con) {
		this.con = con;
	}
	public void commit() {
		try {
			con.commit();
		}catch(Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}
	public void rollback() {
		try {
			con.rollback();
		}catch(Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}
}
