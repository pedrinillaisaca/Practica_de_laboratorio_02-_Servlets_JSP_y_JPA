package ec.edu.ups.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.entidad.Usuario;

/**
 * Servlet implementation class InicioSesion
 */
@WebServlet("/InicioSesion")
public class InicioSesion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InicioSesion() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		String correo = request.getParameter("correo");
		String contrasenia = request.getParameter("contra");
		UsuarioDAO usuarioDAO = DAOFactory.getFactory().getUsuarioDAO();
		List<Usuario> usuarios = usuarioDAO.findAllUsers();
		Usuario usuarioLogeado = null;
		HttpSession session = (HttpSession) request.getSession().getAttribute("session");

		for (Usuario usuario : usuarios) {

			if (usuario.getCorreo().equals(correo) && usuario.getContrasenia().equals(contrasenia)) {
				System.out.println("FUNCIONO LA PINCHE VALIDACION...");
				usuarioLogeado = usuario;
				session = request.getSession(true);// el usuario a iniciado sesion
				request.getSession().setAttribute("session", session);
				String url = null;

				request.setAttribute("usuario", usuarioLogeado);
				url = "/privada/ajendaTelefonica.jsp";

				getServletContext().getRequestDispatcher(url).forward(request, response);
				break;
			}
		}
		String urll = null;
		try {
			request.setAttribute("loginError", "Credenciales Incorrectas");
			urll = "/publica/index.jsp";
			getServletContext().getRequestDispatcher(urll).forward(request, response);
			System.out.println("ERROR SERVLET:inicioSesion");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Inicio Sesion Exitoso");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
