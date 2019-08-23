package classe;

import java.sql.SQLException;
import java.util.ArrayList;

import modele.DBConnection;
import modele.Manifestation;
import modele.SiteTourisrique;

public class GestionSiteTouristique {
	DBConnection c;
	public java.sql.Connection con;	
	
	public  GestionSiteTouristique() throws ClassNotFoundException, SQLException {
		this.c = new DBConnection("l3guidina");
	}
	
	public ArrayList<SiteTourisrique> getSiteById(String idsutetour) throws ClassNotFoundException, SQLException{
		ArrayList<SiteTourisrique> sts = new ArrayList<>();
		String query = "Select * From sitetouristiques where idsitetour like '"+idsutetour+"';";
		c.resultset = c.statement.executeQuery(query);
		while(c.resultset.next()) {
			SiteTourisrique s = new SiteTourisrique();
			s.setIdsitetour(c.resultset.getString("idsitetour"));
			s.setNomsitetour(c.resultset.getString("nomsitetour"));
			s.setAddress(c.resultset.getString("address"));
			s.setIdville(c.resultset.getInt("idville"));
			s.setHeuredep(c.resultset.getString("heuredep"));
			s.setHeurefin(c.resultset.getString("heurefin"));
			s.setPrix(c.resultset.getDouble("prix"));
			
			sts.add(s);
		}
		 
		return sts;
	}
	
	public ArrayList<SiteTourisrique> getAllSites() throws ClassNotFoundException, SQLException{
		ArrayList<SiteTourisrique> sts = new ArrayList<>();
		String query = "Select * From sitetouristiques ;";
		c.resultset = c.statement.executeQuery(query);
		while(c.resultset.next()) {
			SiteTourisrique s = new SiteTourisrique();
			s.setIdsitetour(c.resultset.getString("idsitetour"));
			s.setIdvoy(c.resultset.getString("idvoy"));
			s.setNomsitetour(c.resultset.getString("nomsitetour"));
			s.setAddress(c.resultset.getString("address"));
			s.setIdville(c.resultset.getInt("idville"));
			s.setHeuredep(c.resultset.getString("heuredep"));
			s.setHeurefin(c.resultset.getString("heurefin"));
			s.setPrix(c.resultset.getDouble("prix"));
			
			sts.add(s);
		}
		 
		return sts;
	}
	
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		GestionSiteTouristique gs = new GestionSiteTouristique();
		ArrayList<SiteTourisrique> sts = new ArrayList<>();
		sts = gs.getAllSites();
		for(SiteTourisrique s : sts) {
			System.out.println(s.getIdsitetour());
		}
		
}
	
}
