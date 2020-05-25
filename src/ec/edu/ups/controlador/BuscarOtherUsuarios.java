package ec.edu.ups.controlador;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.UsuarioDAO;

import ec.edu.ups.entidad.Usuario;

/**
 * Servlet implementation class BuscarOtherUsuarios
 */
@WebServlet("/BuscarOtherUsuarios")
public class BuscarOtherUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * pedro illaisaca
	 */
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BuscarOtherUsuarios() {
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
		String criterio = request.getParameter("criterio");
		String cedulaUserLog = request.getParameter("cedulaUserLog");
		System.out.println("PARAM: " + criterio);

		UsuarioDAO usuarioDAO = DAOFactory.getFactory().getUsuarioDAO();		
		String url = null;
		Usuario usuario = null;

		if (criterio.contains("@")) {
			System.out.println("es correo");
			System.out.println(criterio);
			usuario = usuarioDAO.findByCorreo(criterio);
			if (usuario == null) {
				getServletContext().getRequestDispatcher("/privada/errNotUsuario.jsp?ced=" + cedulaUserLog)
						.forward(request, response);
			} else {
				
				try {
					usuario.setCedula(cedulaUserLog);
					request.setAttribute("usuario", usuario);
					url = "/privada/viewOthersUsuarios.jsp";
					getServletContext().getRequestDispatcher(url).forward(request, response);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("ERROR SERVLET:inicioSesion");
				}
			}

			
		} else if (criterio.matches("[0-9]+") && criterio.length() == 10) {
			System.out.println("cedula valida");
			System.out.println(criterio);
			usuario = usuarioDAO.findByCedula(criterio);
			if (usuario == null) {				
				getServletContext().getRequestDispatcher("/privada/errNotUsuario.jsp?ced=" + cedulaUserLog)
						.forward(request, response);
			} else {				
				try {
					usuario.setCedula(cedulaUserLog);
					request.setAttribute("usuario", usuario);
					url = "/privada/viewOthersUsuarios.jsp";
					getServletContext().getRequestDispatcher(url).forward(request, response);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("ERROR SERVLET:inicioSesion");
				}
			}
		} else {
			System.out.println("ERROR correo no valido o numero de cedula contiene caracteres");

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
