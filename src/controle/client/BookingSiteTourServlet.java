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
 * Servlet implementation class BookingSiteTourServlet
 */
@WebServlet("/BookingSiteTourServlet")
public class BookingSiteTourServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public BookingSiteTourServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idvoy = request.getParameter("idvoy");
		String idsite = request.getParameter("idsite");
		String resnom = request.getParameter("nomres");
		String heuredep = request.getParameter("heuredep");
		String idcli = request.getParameter("idcli");
		String datedep =  request.getParameter("datedep");
		double prix = Double.parseDouble(request.getParameter("prix"));
		
		Reservation res = new Reservation();
		
		GestionReservation gr;
		try {
			gr = new GestionReservation();
			res.setIdVoy(idvoy);
			res.setResname(resnom);
			res.setDateDep(datedep);
			res.setHeureDep(heuredep);
			res.setIdCli(idcli);
			res.setIdSitetou(idsite);
			res.setPrixpaye(prix);
			
			gr.ajouterReservationST(res);
			boolean hum = gr.payment(prix, res);
			
			if(hum) {
				response.sendRedirect("ClientSite/success.jsp");
			
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
