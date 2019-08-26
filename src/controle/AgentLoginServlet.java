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

import classe.GestionAgent;
import classe.GestionCircuit;
import classe.GestionManifestation;
import classe.GestionServices;
import classe.GestionSiteTouristique;
import modele.Agent;
import modele.CampingSite;
import modele.Circuit;
import modele.Guide;
import modele.Hotel;
import modele.Manifestation;
import modele.Restaurant;
import modele.SiteTourisrique;
import modele.Transport;
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
		System.out.println(email+" "+password+"1"); // Testing
		
		try {
			System.out.println(email+" "+password+"2"); // Testing
			GestionAgent ga = new GestionAgent();
			GestionCircuit gci = new GestionCircuit();
			GestionManifestation gm = new GestionManifestation();
			GestionSiteTouristique gst = new GestionSiteTouristique();
			GestionServices gs = new GestionServices();
			System.out.println(email+" "+password+"3"); // Testing
			
			
			boolean isIt = ga.loginAgent(user);
			
			System.out.println(email+" "+password+"4"); // Testing
			if(isIt) {
				System.out.println(email+" "+password+"5"); // Testing
				
				Agent ag = new Agent();
				ArrayList<Circuit> crs = new ArrayList<Circuit>();
				ArrayList<Manifestation> mfs = new ArrayList<>();
				ArrayList<SiteTourisrique> sts = new ArrayList<>();
				
				//Services
				ArrayList<Hotel> hs = new ArrayList<>();
				ArrayList<CampingSite> cps = new ArrayList<>();
				ArrayList<Transport> tps = new ArrayList<>();
				ArrayList<Guide> gds = new ArrayList<>();
				ArrayList<Restaurant> rsts = new ArrayList<>();
				//ArrayList<Reservation> sts = new ArrayList<>();
				crs = gci.getAllCircuits();
				
				System.out.println(email+" "+password+"6"); // Testing
				
				ag = ga.getAgentUsingEmail(email);
				mfs = gm.getAllManifest();
				sts = gst.getAllSites();
				System.out.println("Start");
				// Services
				hs = gs.getAllHotels();
				System.out.println("Hotel");
				cps = gs.getAllCamps();
				System.out.println("Camps");
				tps = gs.getAllTransports();
				System.out.println("Trans");
				gds = gs.getAllGuides();
				System.out.println("Guide");
				rsts = gs.getAllRestaux();
				System.out.println("Restau");
				
				System.out.println(email+" "+password+"7"); // Testing
				session.setAttribute("ag", ag);
				session.setAttribute("crs", crs);
				session.setAttribute("mfs", mfs);
				session.setAttribute("sts", sts);
				
				//Services
				session.setAttribute("hs", hs);
				session.setAttribute("cps", cps);
				session.setAttribute("tps", tps);
				session.setAttribute("gds", gds);
				session.setAttribute("rsts", rsts);
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
