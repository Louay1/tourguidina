package controle.client;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import classe.GestionUtilisateur;
import modele.Client;
import modele.Utilisateur;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String birthdate = request.getParameter("birthdate");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String password = request.getParameter("password");
		String sexe = request.getParameter("sexe");
		String address = request.getParameter("address");
		
		Utilisateur user = new Utilisateur();
		try {
			GestionUtilisateur gu = new GestionUtilisateur();
			user.setIdUsr(gu.keyGen());
			user.setNom(nom);
			user.setPrenom(prenom);
			user.setBirthdate(birthdate);
			user.setAddress(address);
			user.setImage("https://robohash.org/aliquamporroipsa.png");
			user.setMotPasse(password);
			user.setNumTlphn(phone);
			user.setEmail(email);
			user.setSexe(sexe);
			user.setVille(19);
			
			gu.ajouterUtilisateur(user);
			gu.ajouterClient(user.getIdUsr());
			response.sendRedirect("ClientSite/index.jsp");
			
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
