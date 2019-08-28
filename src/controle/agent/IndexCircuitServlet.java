package controle.agent;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import classe.GestionCircuit;
import modele.Circuit;

/**
 * Servlet implementation class IndexCircuitServlet
 */
@WebServlet("/IndexCircuitServlet")
public class IndexCircuitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexCircuitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String some = "Index Servlet For Circuit";
		HttpSession session = request.getSession();
		ArrayList<Circuit> crs = new ArrayList<Circuit>();
		try {
			GestionCircuit gci = new GestionCircuit();
			crs = gci.getAllCircuits();
			session.setAttribute("crs", crs);
			response.sendRedirect("AgentSite/profile.jsp");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
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
