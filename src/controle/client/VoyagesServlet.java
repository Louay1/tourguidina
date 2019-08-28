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
 * Servlet implementation class VoyagesServlet
 */
@WebServlet("/VoyagesServlet")
public class VoyagesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VoyagesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			HttpSession session=request.getSession();
			GestionAdmin ga = new GestionAdmin();
			GestionVoyage gv = new GestionVoyage();
			ArrayList<Voyage> allvoyages = new ArrayList<>();
			allvoyages = gv.getAllVoyages();
			session.setAttribute("allvoyages", allvoyages);
			//System.out.println(response);
			response.sendRedirect("ClientSite/voyages.jsp");
			System.out.println(response);
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
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		GestionVoyage gv = new GestionVoyage();
		ArrayList<Voyage> allvoyages = new ArrayList<>();
		allvoyages = gv.getAllVoyages();
		for(Voyage voyage : allvoyages) {
			System.out.println(voyage.getNom());
		}
	}
}
