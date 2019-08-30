package controle.agent.services;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classe.GestionServices;
import modele.Hotel;
import modele.Restaurant;

/**
 * Servlet implementation class RestauAddServlet
 */
@WebServlet("/RestauAddServlet")
public class RestauAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RestauAddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomrestau = request.getParameter("nomrestau");
		String address = request.getParameter("address");
		double prix = Double.parseDouble(request.getParameter("prix"));
		int idville = Integer.parseInt(request.getParameter("idville"));
		
		try {
			GestionServices gs = new GestionServices();
			Restaurant r = new Restaurant();
			r.setIdService(gs.keyGenRes());
			r.setName(nomrestau);
			r.setAddress(address);
			r.setVille(idville);
			r.setPrix(prix);

			boolean humm = gs.ajouterService(r);

			boolean humm2 = gs.ajouterResau(r);

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
