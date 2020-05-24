package byzen.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import byzen.conexion.Conexion;
import byzen.modelo.bean.Usuario;

public class UsuarioDAO {

	public static Usuario Login(String user, String pass) {
		
		Usuario u = null;
		PreparedStatement ps;
		ResultSet rs = null;
		Connection cn = null;
		String sql = "SELECT * FROM usuario WHERE usuario = ? and clave = ?";
		//Abro conexion
		cn = Conexion.Abrir_Conexion();
		try {
			// Preparo la consulta
			ps = cn.prepareStatement(sql);
			// Asigno Valores a los parametros
			ps.setString(1, user);
			ps.setString(2, pass);
			rs = ps.executeQuery();
			if(rs.next() == true) {
				u = new Usuario();
				u.setIdUsuario(rs.getInt(1));
				u.setNombre(rs.getString(2));
				u.setUsuario(rs.getString(3));
				u.setClave(rs.getString(4));
				u.setCorreo(rs.getString(5));
				u.setIdCliente(rs.getInt(6));
			}
			cn.close();
			ps.close();
			rs.close();	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//System.out.println("Error:"+e);
			e.printStackTrace();
		}	
		return u;
	}
}
