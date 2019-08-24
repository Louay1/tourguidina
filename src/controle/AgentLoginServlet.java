package controle;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import classe.GestionAgent;
import modele.Agent;
import modele.Utilisateur;

/**
 * Servlet implementation class AgentLoginServlet
 */
@WebServlet("/AgentLoginServlet")
public class AgentLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgentLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		System.out.println(email+" "+password+"0");
		
		Utilisateur user = new Utilisateur();
		user.setEmail(email); user.setMotPasse(password);
		HttpSession session = request.getSession();
		System.out.println(email+" "+password+"1");
		
		try {
			System.out.println(email+" "+password+"2");
			GestionAgent ga = new GestionAgent();
			
			System.out.println(email+" "+password+"3");
			
			
			boolean isIt = ga.loginAgent(user);
			
			System.out.println(email+" "+password+"4");
			if(isIt) {
				System.out.println(email+" "+password+"5");
				Agent ag = new Agent();
				
				System.out.println(email+" "+password+"6");
				
				ag = ga.getAgentUsingEmail(email);
				
				System.out.println(email+" "+password+"7");
				session.setAttribute("ag", ag);
				response.sendRedirect("AgentSite/profile.jsp");
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
