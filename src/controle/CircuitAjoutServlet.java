package controle;

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
 * Servlet implementation class AjouterCircuitServlet
 */
@WebServlet("/CircuitAjoutServlet")
public class CircuitAjoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CircuitAjoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String nomcircuit = request.getParameter("nomcircuit");
		String pointdep = request.getParameter("pointdep");
		String pointfin = request.getParameter("pointdfin");
		
		try {
			Circuit ci = new Circuit();
			ci.setName(nomcircuit);
			ci.setStartpoint(pointdep);
			ci.setEndponit(pointfin);
			GestionCircuit gci = new GestionCircuit();
			boolean humm = gci.ajouterCircuit(ci);
			if(humm) {
				response.sendRedirect("AgentSite/profile-ag.jsp");
			}else {
				System.out.println(humm);
			}
			
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
