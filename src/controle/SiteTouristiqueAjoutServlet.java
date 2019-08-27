package controle;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classe.GestionSiteTouristique;
import modele.SiteTourisrique;

/**
 * Servlet implementation class SiteTouristiqueAjoutServlet
 */
@WebServlet("/SiteTouristiqueAjoutServlet")
public class SiteTouristiqueAjoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SiteTouristiqueAjoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomsite = request.getParameter("nomsite");
		String idvoy = request.getParameter("idvoy");
		String heuredep = request.getParameter("heuredep");
		String heurefin = request.getParameter("heurefin");
		int idville = Integer.parseInt(request.getParameter("idville"));
		String address = request.getParameter("address");
		double prix = Double.parseDouble(request.getParameter("fees"));
		
		try {
			GestionSiteTouristique gt = new GestionSiteTouristique();
			SiteTourisrique st = new SiteTourisrique();
			st.setIdsitetour(gt.keyGen());
			st.setNomsitetour(nomsite);
			st.setIdvoy(idvoy);
			st.setHeuredep(heuredep);
			st.setHeurefin(heurefin);
			st.setIdville(idville);
			st.setAddress(address);
			st.setPrix(prix);
			boolean hum = gt.ajouterSite(st);
			
			if(hum) {
				response.sendRedirect("AgentSite/profile-ag.jsp");
			}else {
				System.out.println("Check again !");
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
