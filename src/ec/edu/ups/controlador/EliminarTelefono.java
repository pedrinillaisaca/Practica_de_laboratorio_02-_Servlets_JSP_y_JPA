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

import ec.edu.ups.entidad.Usuario;

/**
 * Servlet implementation class EliminarTelefono
 */
@WebServlet("/EliminarTelefono")
public class EliminarTelefono extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarTelefono() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());	
		String ced=request.getParameter("ced");
		//--------------------------------------------------------------------------
		int id=Integer.valueOf(request.getParameter("id"));
		//Telefono tel=new Telefono(id,null,null,null);
		
		TelefonoDAO telefonoDAO=DAOFactory.getFactory().getTelefonoDAO();
		//Telefono telefonoEliminar=telefonoDAO.findbyTelefonoId(id);
		
		telefonoDAO.deleteByID(id);
		
		UsuarioDAO usuarioDAO =DAOFactory.getFactory().getUsuarioDAO();
		Usuario u =usuarioDAO.findByCedula(ced);
		
		/**
		 * Se podria me
		 */
		String url="";
		try {
			request.setAttribute("usuario", u);
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
