package controle.client;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import classe.*;
import modele.*;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		Utilisateur user = new Utilisateur();
		user.setEmail(email); user.setMotPasse(password);
		HttpSession session = request.getSession();
		
		try {
			GestionClient gc = new GestionClient();
			GestionReservation gr = new GestionReservation();
			GestionVoyage gv = new GestionVoyage();
			boolean isIt = gc.login(user);
			
			if(isIt) {
				Client cl = new Client();
				ArrayList<Reservation> rs = new ArrayList<>();
				ArrayList<Reservation> ms = new ArrayList<>();
				ArrayList<Reservation> st = new ArrayList<>();
				//ArrayList<Voyage> vs = new ArrayList<>();
				cl = gc.getClientUsingEmail(email);
				rs = gr.getVoyagesClient(cl.getIdClient());
				ms = gr.getManifestClient(cl.getIdClient());
				st = gr.getSitesClient(cl.getIdClient());
				String id = rs.get(0).getIdVoy();
				System.out.println(id);
				//vs = gv.getVoyagesById(id);
				session.setAttribute("client", cl);
				session.setAttribute("rs", rs);
				session.setAttribute("ms", ms);
				session.setAttribute("st", st);
				//session.setAttribute("vs", vs);
				response.sendRedirect("ClientSite/profile.jsp");
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
