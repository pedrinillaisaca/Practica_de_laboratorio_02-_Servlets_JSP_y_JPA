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
 * Servlet implementation class ModificarTelefono
 */
@WebServlet("/ModificarTelefono")
public class ModificarTelefono extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificarTelefono() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String ced=request.getParameter("ced");
		//------------------------------------------
		String numero=request.getParameter("numero");
		String operadora=request.getParameter("operadora");
		String tipo=request.getParameter("tipo");
		int id=Integer.valueOf(request.getParameter("id"));
				
		TelefonoDAO telefonoDAO=DAOFactory.getFactory().getTelefonoDAO();
		Telefono teledit=telefonoDAO.read(id);
		teledit.setNumero(numero);
		teledit.setOperadora(operadora);
		teledit.setTipo(tipo);
		telefonoDAO.update(teledit);
		
		UsuarioDAO usuarioDAO =DAOFactory.getFactory().getUsuarioDAO();
		Usuario u =usuarioDAO.findByCedula(ced);
		
		
		String url="";
		try {
			request.setAttribute("usuario", u);
			url="/privada/ajendaTelefonica.jsp";
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
