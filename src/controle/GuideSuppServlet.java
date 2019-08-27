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
 * Servlet implementation class GuideSuppServlet
 */
@WebServlet("/GuideSuppServlet")
public class GuideSuppServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GuideSuppServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("idguide");
		
		try {
			GestionServices gs = new GestionServices();
			System.out.println("Lol");
			boolean hum = gs.deleteGuide(id);
			System.out.println(hum);
			boolean hum0 = gs.deleteService(id);
			System.out.println(hum0);
			if(hum && hum0) {
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
