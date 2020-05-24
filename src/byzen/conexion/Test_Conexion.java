package byzen.conexion;

import java.sql.Connection;

public class Test_Conexion {

	public static void main(String[] args) {
		
		Connection cn = Conexion.Abrir_Conexion();
		if(cn != null) {
			System.out.println("Conexion establecida!!");
		}else {
			System.out.println("Conexion no establecida!!");
		}
		
		
		
	}

}
