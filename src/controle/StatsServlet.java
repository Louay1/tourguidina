package controle;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import classe.*;

/**
 * Servlet implementation class StatsServlet
 */
@WebServlet("/StatsServlet")
public class StatsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public StatsServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			HttpSession session=request.getSession(true);
			System.out.println("Here1");
			GestionAdmin ga = new GestionAdmin();
			System.out.println("Here2");
			int voyages = ga.statVoy();
			System.out.println("Here3");
			//request.getSession().setAttribute("voyages", voyages);
			session.setAttribute("voyages", voyages);
			response.sendRedirect("ClientSite/index.jsp"); 
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			response.sendRedirect("SiteAdmin/Authentification_admin.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		GestionAdmin ga = new GestionAdmin();
		int voyages = ga.statVoy();
		System.out.println(voyages);
	}

}
