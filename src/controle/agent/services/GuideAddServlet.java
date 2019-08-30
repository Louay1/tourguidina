package controle.agent.services;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classe.GestionServices;
import modele.Guide;

/**
 * Servlet implementation class GuideAddServlet
 */
@WebServlet("/GuideAddServlet")
public class GuideAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GuideAddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomcamp = request.getParameter("nomguide");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		double avprix = Double.parseDouble(request.getParameter("avprix"));
		int idville = Integer.parseInt(request.getParameter("idville"));
		
		try {
			GestionServices gs = new GestionServices();
			Guide cs = new Guide();
			cs.setIdService(gs.keyGenGui());
			cs.setName(nomcamp);
			cs.setAddress(address);
			cs.setEmail(email);
			cs.setPhone(phone);
			cs.setPrix(avprix);
			cs.setVille(idville);

			boolean humm = gs.ajouterService(cs);

			boolean humm2 = gs.ajouterGuide(cs);

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
