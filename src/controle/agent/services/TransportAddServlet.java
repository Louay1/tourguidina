package controle.agent.services;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classe.GestionServices;
import modele.Transport;

/**
 * Servlet implementation class TransportAddServlet
 */
@WebServlet("/TransportAddServlet")
public class TransportAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TransportAddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nomtrans");
		String address = request.getParameter("address");
		int idville = Integer.parseInt(request.getParameter("idville"));
		int nbrplaces = Integer.parseInt(request.getParameter("nbrplaces"));
		
		try {
			GestionServices gs = new GestionServices();
			Transport t = new Transport();
			t.setIdService(gs.keyGenTr());
			t.setName(nom);
			t.setAddress(address);
			t.setPrix(0);
			t.setNbrplace(nbrplaces);
			t.setVille(idville);
			boolean hum0 = gs.ajouterService(t);
			System.out.println(hum0);
			boolean hum = gs.ajouterTransport(t);
			System.out.println(hum);
			if(hum0 && hum) {
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
