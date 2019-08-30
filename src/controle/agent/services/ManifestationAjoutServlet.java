package controle.agent.services;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import classe.GestionManifestation;
import modele.Manifestation;

/**
 * Servlet implementation class ManifestationAjoutServlet
 */
@WebServlet("/ManifestationAjoutServlet")
public class ManifestationAjoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManifestationAjoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		String nommanifest = request.getParameter("nommanifest");
		String adr = request.getParameter("adr");
		int idville = Integer.parseInt(request.getParameter("idville"));
		String heure = request.getParameter(request.getParameter("heure"));
		String heurefin = request.getParameter(request.getParameter("heurefin"));
		String datefin = request.getParameter(request.getParameter("datefin"));
		int nbrjour = Integer.parseInt(request.getParameter("nbrjour"));
		double fees = Double.parseDouble(request.getParameter("fees"));
		String idvoy = request.getParameter("idvoy");
		
		try {
			GestionManifestation gm = new GestionManifestation();
			Manifestation manifest = new Manifestation();
			manifest.setIdmanifest(gm.keyGen());
			manifest.setNommanifest(nommanifest);
			manifest.setAddress(adr);
			manifest.setIdville(idville);
			manifest.setHeure(heure);
			manifest.setHeurefin(heurefin);
			manifest.setDatefin(datefin);
			manifest.setNbrjour(nbrjour);
			manifest.setFees(fees);
			manifest.setIdvoy(idvoy);
			

			boolean humm = gm.ajouterManifest(manifest);

			if(humm) {
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
