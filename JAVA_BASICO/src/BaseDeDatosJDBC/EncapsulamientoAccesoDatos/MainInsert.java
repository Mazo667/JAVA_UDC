package BaseDeDatosJDBC.EncapsulamientoAccesoDatos;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import BaseDeDatosJDBC.AdminstrarConexion.JdbcUtil;

public class MainInsert {
	public static void main(String[] args) throws SQLException {
		ClienteDAO dao = new ClienteDAO();
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(Calendar.YEAR,1955);
		gc.set(Calendar.MONTH,02);
		gc.set(Calendar.DAY_OF_MONTH,14);
		
		long ts = gc.getTimeInMillis();
		Date d = new Date(ts);
		
		Cliente cli = new Cliente();
		cli.setApellido("ARGENTO");
		cli.setNombre("PEPE");
		cli.setDni(22114222);
		cli.setDomicilio("25 de Mayo 328");
		cli.setFechaNac(d);
		cli.setLocalidad(2);
		cli.setSexo("M");
		dao.insertar(cli);
		//Connection con = JdbcUtil3.getConnection();
		//con.commit();
	}
}
