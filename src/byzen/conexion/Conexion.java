package byzen.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	

	private static final String user = "byzen";
	private static final String pass = "1234";
	private static final String url = "jdbc:oracle:thin:@//localhost:1521/XE";

	public static Connection Abrir_Conexion() {
	
		Connection cn = null;
		try {
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			//cn = DriverManager.getConnection(url, user, pass);
			
			 Class.forName ("oracle.jdbc.OracleDriver");
			 cn = DriverManager.getConnection(url, user, pass);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Error:"+e);
		}
		
		return cn;
	}

}
