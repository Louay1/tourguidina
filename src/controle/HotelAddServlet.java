package controle;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classe.GestionServices;
import modele.*;

/**
 * Servlet implementation class HotelAddServlet
 */
@WebServlet("/HotelAddServlet")
public class HotelAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HotelAddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomhotel = request.getParameter("nomhotel");
		String address = request.getParameter("address");
		int nbrchambres = Integer.parseInt(request.getParameter("rooms"));
		int idville = Integer.parseInt(request.getParameter("ville"));
		double prix = Double.parseDouble(request.getParameter("avprice"));
		System.out.println("Please");
		try {
			GestionServices gs = new GestionServices();
			Hotel h = new Hotel();
			h.setIdService(gs.keyGenHo());
			h.setName(nomhotel);
			h.setAddress(address);
			h.setVille(idville);
			h.setPrix(prix);
			h.setNbrchambre(nbrchambres);
			System.out.println(h.getIdService());
			boolean humm = gs.ajouterService(h);
			System.out.println("Please2");
			boolean humm2 = gs.ajouterHotel(h);
			System.out.println("Please3");
			if(humm && humm2) {
				response.sendRedirect("AgentSite/profile-ag.jsp");
			}else {
				System.out.println("Check again :,( ");
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
