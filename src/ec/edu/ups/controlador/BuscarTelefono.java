package ec.edu.ups.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.entidad.Telefono;
/**
 * pedro illaisaca
 */
/**
 * Servlet implementation class BuscarTelefono
 */
@WebServlet("/BuscarTelefono")
public class BuscarTelefono extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscarTelefono() {
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
		 *AQUI SE VA A MOFIFICAR DETERMINADO NUMERO DE UN USUARIO SOLO SE NECESITA DEL ID DEL TELEFONO
		 */
		
		String ced=request.getParameter("ced");
		String id=request.getParameter("id");
		
		
		TelefonoDAO telefonoDAO=DAOFactory.getFactory().getTelefonoDAO();
		Telefono telefono=telefonoDAO.read(Integer.valueOf(id));
		
		System.out.println("numero del telefono: "+ telefono.getNumero()+" tipo: "+telefono.getId());
		String url=null;
		try {
			request.setAttribute("telefono", telefono);
			request.setAttribute("ced", ced);
			url="/privada/editarParamTelefono.jsp";
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR SERVLET:BuscarTefono");
		}
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
