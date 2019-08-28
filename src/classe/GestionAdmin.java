package classe;
import java.sql.SQLException;
import java.util.ArrayList;

import modele.*;

public class GestionAdmin {
	DBConnection c;
	public java.sql.Connection con;
	
	public GestionAdmin() throws ClassNotFoundException, SQLException {
		this.c = new DBConnection("l3guidina");
		
	}
	
	public Admin getAdminUsingEmail(String email) throws SQLException, ClassNotFoundException {
		String query = "SELECT * FROM utilisateurs Join admins on utilisateurs.iduser=admins.idadmin and email like'"+email+"';";
		c.resultset = c.statement.executeQuery(query);
		System.out.println("0");
		if(c.resultset.next()) {
			System.out.println("1");
			
			Admin admin = new Admin();
			admin.setIdadmin(c.resultset.getString("idadmin"));
			admin.setBirthdate(c.resultset.getString("birthdate"));
			admin.setEmail(c.resultset.getString("email"));
			admin.setAddress(c.resultset.getString("address"));
			admin.setMotPasse(c.resultset.getString("motpass"));
			admin.setNom(c.resultset.getString("nom"));
			admin.setPrenom(c.resultset.getString("prenom"));
			admin.setNumTlphn(c.resultset.getString("phone"));
			admin.setSexe(c.resultset.getString("sexe"));
			admin.setImage(c.resultset.getString("image"));
			admin.setScode(c.resultset.getString("secode"));
			System.out.println("2");
			
            System.out.println("3");
            
            return admin;
            
		}else {
			return null;
		}
		
	}
	
	

	public int statClients() throws ClassNotFoundException, SQLException{
		String query = "Select Count(*) as totalclients From clients;";
		c.resultset = c.statement.executeQuery(query);
		int i = 0;
		if(c.resultset.next()) {
			i=c.resultset.getInt("totalclients");
		}
		return i ;
	}
	
	
	public int statAgents() throws ClassNotFoundException, SQLException{
		String query = "Select Count(*) as totalagents From agents;";
		c.resultset = c.statement.executeQuery(query);
		int i = 0;
		if(c.resultset.next()) {
			i = c.resultset.getInt("totalagents");
		}
		return i ;
	}
	
	public int statHotels() throws ClassNotFoundException, SQLException{
		String query = "Select Count(*) as totalhotels From hotels;";
		c.resultset = c.statement.executeQuery(query);
		int i = 0;
		if(c.resultset.next()) {
			i = c.resultset.getInt("totalhotels");
		}
		return i ;
	}
	
	public int statRestau() throws ClassNotFoundException, SQLException{
		String query = "Select Count(*) as totalrestau From restaurants;";
		c.resultset = c.statement.executeQuery(query);
		int i = 0;
		if(c.resultset.next()) {
			i = c.resultset.getInt("totalrestau");
		}
		return i;
	}
	
	public int statCamps() throws ClassNotFoundException, SQLException{
		String query = "Select Count(*) as totalcamps From campingsites;";
		c.resultset = c.statement.executeQuery(query);
		int i = 0;
		if(c.resultset.next()) {
			i = c.resultset.getInt("totalcamps");
		}
		return i ;
	}
	
	public int statTransport() throws ClassNotFoundException, SQLException{
		String query = "Select Count(*) as totalveh From transport;";
		c.resultset = c.statement.executeQuery(query);
		int i = 0;
		if(c.resultset.next()) {
			i = c.resultset.getInt("totalveh");
		}
		return i ;
	}
	
	public int statGuides() throws ClassNotFoundException, SQLException{
		String query = "Select Count(*) as totalguide From guidestouristique;";
		c.resultset = c.statement.executeQuery(query);
		int i = 0;
		if(c.resultset.next()) {
			i = c.resultset.getInt("totalguide");
		}
		return i ;
	}
	
	
	public int statVoy() throws ClassNotFoundException, SQLException{
		String query = "Select Count(*) as totalvoy From voyages;";
		c.resultset = c.statement.executeQuery(query);
		int i = 0;
		if(c.resultset.next()) {
			i = c.resultset.getInt("totalvoy");
		}
		return i ;
	}
	
	public int statReservation() throws ClassNotFoundException, SQLException{
		String query = "Select Count(*) as totalres From reservation;";
		c.resultset = c.statement.executeQuery(query);
		int i = 0;
		if(c.resultset.next()) {
			i = c.resultset.getInt("totalres");
		}
		return i ;
	}
	
	public int statManifest() throws ClassNotFoundException, SQLException{
		String query = "Select Count(*) as totalm From manifestations;";
		c.resultset = c.statement.executeQuery(query);
		int i = 0;
		if(c.resultset.next()) {
			i = c.resultset.getInt("totalm");
		}
		return i ;
	}
	
	public int statSite() throws ClassNotFoundException, SQLException{
		String query = "Select Count(*) as totals From sitetouristiques;";
		c.resultset = c.statement.executeQuery(query);
		int i = 0;
		if(c.resultset.next()) {
			i = c.resultset.getInt("totals");
		}
		return i ;
	}
	
	public int statVilles() throws ClassNotFoundException, SQLException{
		String query = "Select Count(*) as totalvilles From villes;";
		c.resultset = c.statement.executeQuery(query);
		int i = 0;
		if(c.resultset.next()) {
			i = c.resultset.getInt("totalvilles");
		}
		return i ;
	}
	
	
	public boolean loginAdmin(Utilisateur user) throws ClassNotFoundException, SQLException{
		String query = "Select * From utilisateurs where email='"+user.getEmail()+"' and motpass='"+user.getMotPasse()+"';";
		c.resultset = c.statement.executeQuery(query);
		
		if(c.resultset.next()) {
			String password = c.resultset.getString("motpass");
			String email = c.resultset.getString("email");
			
			if(password.equals(user.getMotPasse()) && email.equals(user.getEmail())) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	 
	/*public boolean ajouterAgent(Agent agent) throws ClassNotFoundException, SQLException{
		
	}*/
	
	public ArrayList<Integer> getAll() throws ClassNotFoundException, SQLException{
		ArrayList<Integer> stats = new ArrayList<>();
		stats.add(this.statClients());
		stats.add(this.statAgents());
		stats.add(this.statVilles());
		stats.add(this.statReservation());
		
		stats.add(this.statManifest());
		stats.add(this.statSite());
		stats.add(this.statVoy());
		
		stats.add(this.statCamps());
		stats.add(this.statGuides());
		stats.add(this.statHotels());
		stats.add(this.statRestau());
		stats.add(this.statTransport());

		return stats;
		
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		GestionAdmin ga = new GestionAdmin();
		/*System.out.println(ga.statClients());
		System.out.println(ga.statAgents());
		System.out.println(ga.statHotels());
		System.out.println(ga.statRestau());
		System.out.println(ga.statCamps());
		System.out.println(ga.statTransport());
		System.out.println(ga.statGuides());
		System.out.println(ga.statVoy());
		System.out.println(ga.statReservation());*/
		ArrayList<Integer> stats = new ArrayList<>();
		stats = ga.getAll();
		for(Integer i : stats) {
			System.out.println(i);
		}
	}
}
