package controle.client;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classe.GestionReservation;
import modele.Reservation;

/**
 * Servlet implementation class BookingServlet
 */
@WebServlet("/BookingServlet")
public class BookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		try {
			String idvoy = request.getParameter("idvoy");
			String resnom = request.getParameter("nomres");
			String heuredep = request.getParameter("heuredep");
			String idcli = request.getParameter("idcli");
			String datedep =  request.getParameter("datedep");
			double prix = Double.parseDouble(request.getParameter("price"));
			
			
			Reservation res = new Reservation();
			
			GestionReservation gr = new GestionReservation();
			res.setIdVoy(idvoy);
			res.setResname(resnom);
			res.setDateDep(datedep);
			res.setHeureDep(heuredep);
			res.setIdCli(idcli);
			res.setPrixpaye(prix);
			
			gr.ajouterReservation(res);
			response.sendRedirect("ClientSite/manifest.jsp");
			
		}catch(ClassNotFoundException | SQLException e) {
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
