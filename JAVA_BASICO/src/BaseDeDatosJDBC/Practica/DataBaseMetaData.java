package BaseDeDatosJDBC.Practica;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class DataBaseMetaData {

	public static void main(String[] args) throws SQLException {
		try{  
			Class.forName("org.postgresql.Driver");  
			  
			Connection con=DriverManager.getConnection(  
			"jdbc:postgresql://127.0.0.1:5432/ventas","postgres","admin");  
			//Objento el objeto DataBaseMetaData  
			DatabaseMetaData dbmd=con.getMetaData();
			
			String table[]={"TABLE"};
			//Obtener las tablas del usuario
			ResultSet tables=dbmd.getTables(null,"public","%",table);  
			  
			while(tables.next()){
				String tableName = tables.getString("TABLE_NAME");
				System.out.println("TABLA: "+tableName);  
				
				//Obtengo las columnas de la tabla
				ResultSet columns = dbmd.getColumns(null,"public", tableName, "%");
				
				//Iteramos sobre los campos
				while(columns.next()) {
					String columName = columns.getString("COLUMN_NAME");
					String columType = columns.getString("TYPE_NAME");
					
					System.out.println("- "+columName+ " ("+columType+") ");
				}
			}  
			  
			con.close();  
			  
			}catch(Exception e){
				System.out.println(e);
				}  
			}  

}  

