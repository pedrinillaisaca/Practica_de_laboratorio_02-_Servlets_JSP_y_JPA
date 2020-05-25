package ec.edu.ups.filtros;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpSession;



/**
 * Servlet Filter implementation class FiltroSesiones
 */
//@WebFilter({"/FiltroSesiones","/ajendaTelefonica.jsp"})
@WebFilter(description = "verga de filtro", urlPatterns = {"/privada/*"})
//@WebFilter("/FiltroSesiones")
public class FiltroSesiones implements Filter {

    /**
     * Default constructor. 
     */
    public FiltroSesiones() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		// pass the request along the filter chain
		HttpServletRequest reqHttp= (HttpServletRequest)request;
		HttpSession sesion=reqHttp.getSession();
		System.out.println("filtro maricon esta haciedo de las suyas");
		 if (sesion.getAttribute("session") !=null) {
			 	System.out.println("EL FILTRO CONSEDE EL ACCESO");
				chain.doFilter(request, response);
			}else{
				System.out.println("El fitro marica dice que la sesion no esta iniciada");
				//((HttpServletResponse)response).sendRedirect("/publica/login.jsp");
				request.getRequestDispatcher("/publica/index.jsp").forward(request, response);
			}
		/**
		try {
			if (sesion.isNew()) {
				Proceder_a_operar(request, response);
			}else {
				Proceder_a_operar(request, response);
			}
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("NO HAS INICIADO SESION ");
			response.sendRedirect("http://localhost:8080/HolaMundoServlets/Login");
		}			
		 */
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
