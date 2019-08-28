package controle.agent.services;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classe.GestionServices;
import modele.CampingSite;

/**
 * Servlet implementation class CampAddServlet
 */
@WebServlet("/CampAddServlet")
public class CampAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CampAddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomcamp = request.getParameter("nomcamp");
		String address = request.getParameter("address");
		int capa = Integer.parseInt(request.getParameter("capa"));
		double area = Double.parseDouble(request.getParameter("area"));
		double avprix = Double.parseDouble(request.getParameter("avprix"));
		int idville = Integer.parseInt(request.getParameter("idville"));
		
		try {
			GestionServices gs = new GestionServices();
			CampingSite cs = new CampingSite();
			cs.setIdService(gs.keyGenCP());
			cs.setName(nomcamp);
			cs.setAddress(address);
			cs.setCapacity(capa);
			cs.setArea(area);
			cs.setPrix(avprix);
			cs.setVille(idville);
			System.out.println("Humm" + 8);
			boolean humm = gs.ajouterService(cs);
			System.out.println("Humm" + humm);
			boolean humm2 = gs.ajouterCamp(cs);
			System.out.println("Humm2" + humm);
			if(humm && humm2) {
				response.sendRedirect("AgentSite/profile-ag.jsp");
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
