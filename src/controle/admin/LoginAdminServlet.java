package controle.admin;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import classe.GestionAdmin;
import modele.Admin;
import modele.Utilisateur;

/**
 * Servlet implementation class LoginAdminServlet
 */
@WebServlet("/LoginAdminServlet")
public class LoginAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginAdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		ArrayList<Integer> stats = new ArrayList<>();
		
		Utilisateur user = new Utilisateur();
		user.setEmail(email); user.setMotPasse(password);
		HttpSession session = request.getSession();
		
		try {
			GestionAdmin ga = new GestionAdmin();
			stats = ga.getAll();
			boolean isIn = ga.loginAdmin(user);
			if(isIn) {
				Admin ad = new Admin();
				ad = ga.getAdminUsingEmail(email);
				session.setAttribute("ad", ad);
				session.setAttribute("stats", stats);
				response.sendRedirect("AdminSite/profile-ad.jsp");
			}
		} catch (Exception e) {
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
