package controle;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classe.GestionServices;

/**
 * Servlet implementation class CampSuppServlet
 */
@WebServlet("/CampSuppServlet")
public class CampSuppServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CampSuppServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("idcamp");
		
		try {
			GestionServices gs = new GestionServices();
			boolean humm = gs.deleteCamp(id);
			boolean humm0 = gs.deleteService(id);
			
			if(humm && humm0) {
				response.sendRedirect("AgentSite/profile-ag.jsp");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO: handle exception
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
