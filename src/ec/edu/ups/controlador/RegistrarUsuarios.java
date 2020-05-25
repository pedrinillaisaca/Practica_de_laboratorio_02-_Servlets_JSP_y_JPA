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
 * Servlet implementation class RegistrarUsuarios
 */
@WebServlet("/RegistrarUsuarios")
public class RegistrarUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrarUsuarios() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		/**
		 * QUEDA PENDIENTE VALIDAR LOS FORMULARIOS
		 */
		String correo = request.getParameter("correo");
		String contra = request.getParameter("contra");
		String nombres = request.getParameter("nombres");
		String apellidos = request.getParameter("apellidos");
		String numCedula= request.getParameter("numeroced");
		
		
		UsuarioDAO usuarioDAO= DAOFactory.getFactory().getUsuarioDAO();
		
		Usuario u1 =new Usuario(numCedula,nombres.trim().toLowerCase(),apellidos.trim().toLowerCase(),correo,contra);
		usuarioDAO.create(u1);
		
		getServletContext().getRequestDispatcher("/publica/index.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
