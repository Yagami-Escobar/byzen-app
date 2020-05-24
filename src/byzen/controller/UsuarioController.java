package byzen.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import byzen.modelo.bean.Usuario;
import byzen.modelo.dao.UsuarioDAO;

/**
 * Servlet implementation class UsuarioController
 */
@WebServlet(name = "/UsuarioController", urlPatterns = {"/validarUser", "/cerrarSesion"})
public class UsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		doGet(request, response);
		
		//Obtengo el Path del Servlet
		String path = request.getServletPath();
		//Valido el Path del Servlet
		if(path.equals("/validarUser")) {
			//Obtengo los campos del Login
			String txt_user = request.getParameter("name_user");
			String txt_pass = request.getParameter("name_pass");
			
			Usuario u = null;
			u = UsuarioDAO.Login(txt_user, txt_pass);
			if(u != null) {
				//Creamos una variable de session
				request.getSession().setAttribute("var_ok", u);
				//Redireccionamos a Welcome.jsp
				request.getRequestDispatcher("Welcome.jsp").forward(request, response);;
			}else {
				//Creamos una variable de session
				request.getSession().setAttribute("var_msg","Usuario y/o Clave Incorrecto !!!");
				request.getRequestDispatcher("Login.jsp").forward(request, response);
			}
		}
		
		
		protected void autenticarUser(HttpServletRequest request, HttpServletResponse response) {
			
			
		}
		
	}

}
