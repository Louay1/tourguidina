package controle.admin;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classe.GestionOffre;
import modele.Offre;

/**
 * Servlet implementation class OffreAjoutServlet
 */
@WebServlet("/OffreAjoutServlet")
public class OffreAjoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OffreAjoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("idcircuit"));
		String datedep = request.getParameter("datedep");
		String datefin = request.getParameter("datefin");
		String type = request.getParameter("type");
		double reduction = Double.parseDouble(request.getParameter("reduction"));
		
		try {
			GestionOffre go = new GestionOffre();
			Offre off = new Offre();
			
			off.setIdoffre(go.keyGenOff());
			off.setDaredep(datedep);
			off.setDatefin(datefin);
			off.setReduction(reduction);
			off.setType(type);
			off.setIdcircuit(id);
			
			boolean hum = go.ajoutOff(off);
			if(hum) {
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
