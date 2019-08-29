package controle.admin;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classe.GestionVoyage;
import modele.Voyage;

/**
 * Servlet implementation class VoyageAjoutServlet
 */
@WebServlet("/VoyageAjoutServlet")
public class VoyageAjoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VoyageAjoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomvoyage = request.getParameter("nomvoyage");
		int nbrplaces = Integer.parseInt(request.getParameter("nbrplaces"));
		double prix = Double.parseDouble(request.getParameter("avprix"));
		String heuredep = request.getParameter("heuredep");
		String datedep = request.getParameter("datedep");
		int jours = Integer.parseInt(request.getParameter("nbrjour"));
		int idcir = Integer.parseInt(request.getParameter("idcir"));
		
		
		try {
			GestionVoyage gv = new GestionVoyage();
			Voyage v = new Voyage();
			
			v.setIdvoy(gv.keyGenVo());
			v.setNom(nomvoyage);
			v.setNbrjours(jours);
			v.setPlaces(nbrplaces);
			v.setPrice(prix);
			v.setHeuredep(heuredep);
			v.setDatedepart(datedep);
			v.setIdCir(idcir);
			System.out.println(v.getIdvoy());
			boolean humm = gv.ajouterVoyage(v);
			
			if(humm) {
				response.sendRedirect("AdminSite/profile-ad.jsp");
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
