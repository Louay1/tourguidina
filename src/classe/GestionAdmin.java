package classe;
import java.sql.SQLException;


import modele.*;

public class GestionAdmin {
	DBConnection c;
	public java.sql.Connection con;
	
	public GestionAdmin() throws ClassNotFoundException, SQLException {
		this.c = new DBConnection("l3guidina");
		
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
	
	
	public String statAgents() throws ClassNotFoundException, SQLException{
		String query = "Select Count(*) as totalagents From agents;";
		c.resultset = c.statement.executeQuery(query);
		int i = 0;
		if(c.resultset.next()) {
			i = c.resultset.getInt("totalagents");
		}
		return i + " Agent";
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
	
	public int statVilles() throws ClassNotFoundException, SQLException{
		String query = "Select Count(*) as totalvilles From villes;";
		c.resultset = c.statement.executeQuery(query);
		int i = 0;
		if(c.resultset.next()) {
			i = c.resultset.getInt("totalvilles");
		}
		return i ;
	}
	 
	/*public boolean ajouterAgent(Agent agent) throws ClassNotFoundException, SQLException{
		
	}*/
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		GestionAdmin ga = new GestionAdmin();
		System.out.println(ga.statClients());
		System.out.println(ga.statAgents());
		System.out.println(ga.statHotels());
		System.out.println(ga.statRestau());
		System.out.println(ga.statCamps());
		System.out.println(ga.statTransport());
		System.out.println(ga.statGuides());
		System.out.println(ga.statVoy());
		System.out.println(ga.statReservation());
	}
}
