package controle.client;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classe.GestionReservation;
import modele.Reservation;

/**
 * Servlet implementation class ManifestBookingServlet
 */
@WebServlet("/ManifestBookingServlet")
public class ManifestBookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManifestBookingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idvoy = request.getParameter("idvoy");
		String manifest = request.getParameter("idmanifest");
		String resnom = request.getParameter("nomres");
		String heuredep = request.getParameter("heuredep");
		String idcli = request.getParameter("idcli");
		String datedep =  request.getParameter("datedep");
		double prix = Double.parseDouble(request.getParameter("fees"));
		
		Reservation res = new Reservation();
		
		GestionReservation gr;
		try {
			gr = new GestionReservation();
			res.setIdVoy(idvoy);
			res.setResname(resnom);
			res.setDateDep(datedep);
			res.setHeureDep(heuredep);
			res.setIdCli(idcli);
			res.setIdManifest(manifest);
			res.setPrixpaye(prix);
			
			gr.ajouterReservationM(res);
			
			boolean hum = gr.payment(prix, res);
			System.out.println(hum);
			
			if(hum) {
				response.sendRedirect("ClientSite/success.jsp");
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
