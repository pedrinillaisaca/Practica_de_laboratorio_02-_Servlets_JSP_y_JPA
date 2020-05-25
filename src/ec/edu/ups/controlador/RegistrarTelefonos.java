package ec.edu.ups.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.entidad.Telefono;
import ec.edu.ups.entidad.Usuario;

/**
 * Servlet implementation class RegistrarTelefonos
 */
@WebServlet("/RegistrarTelefonos")
public class RegistrarTelefonos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrarTelefonos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String numero=request.getParameter("numero");
		String operadora=request.getParameter("operadora");
		String tipo=request.getParameter("tipo");
		String num_ced=request.getParameter("num_ced");
		
		UsuarioDAO usuarioDAO=DAOFactory.getFactory().getUsuarioDAO();
		
		Usuario u=usuarioDAO.findByCedula(num_ced);
		Telefono telefono=new Telefono(numero,tipo,operadora,u);
		telefono.setUsuario(u);
		TelefonoDAO telefonoDAO=DAOFactory.getFactory().getTelefonoDAO();
		telefonoDAO.create(telefono);
		String url="";
		
		//UsuarioDAO usuarioDAO=DAOFactory.getFactory().getUsuarioDAO();
		Usuario usuario=usuarioDAO.findByCedula(num_ced);
		try {
			request.setAttribute("usuario", usuario);
			url="/privada/ajendaTelefonica.jsp";
			getServletContext().getRequestDispatcher(url).forward(request, response);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR SERVLET:BuscarTefono");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
