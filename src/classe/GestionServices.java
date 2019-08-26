package classe;

import java.sql.SQLException;
import java.util.ArrayList;

import modele.DBConnection;
import modele.*;

public class GestionServices {
	DBConnection c;
	public java.sql.Connection con;	
	
	public GestionServices() throws ClassNotFoundException, SQLException {
		this.c = new DBConnection("l3guidina");
	}
	/* Hotels Zone
	 * Get All of Hotels
	 * Add Hotel
	 * Delete Hotel
	 * Update Hotel */
	
	public ArrayList<Hotel> getAllHotels() throws ClassNotFoundException, SQLException{
		ArrayList<Hotel> hs = new ArrayList<>();
		String query = "SELECT * FROM services, hotels WHERE services.idservice LIKE hotels.idhotel";
		c.resultset = c.statement.executeQuery(query);
		
		while(c.resultset.next()) {
			Hotel h = new Hotel();
			h.setIdHotel(c.resultset.getString("idhotel"));
			h.setName(c.resultset.getString("nomservice"));
			h.setAddress(c.resultset.getString("address"));
			h.setPrix(c.resultset.getDouble("prix"));
			h.setNbrchambre(c.resultset.getInt("nbrchambre"));
			h.setVille(c.resultset.getInt("ville"));
			h.setStars(c.resultset.getInt("stars"));
			
			hs.add(h);
		}
		
		return hs;
		
	}
	
	/* Restaurants Zone
	 * Get All of Restaurants
	 * Add Restaurant
	 * Delete Restaurant
	 * Update Restaurant */
	
	public ArrayList<Restaurant> getAllRestaux() throws ClassNotFoundException, SQLException{
		ArrayList<Restaurant> rs = new ArrayList<>();
		String query = "SELECT * FROM services, restaurants WHERE services.idservice LIKE restaurants.idrestau";
		c.resultset = c.statement.executeQuery(query);
		
		while(c.resultset.next()) {
			Restaurant r = new Restaurant();
			r.setIdRest(c.resultset.getString("idrestau"));
			r.setName(c.resultset.getString("nomservice"));
			r.setAddress(c.resultset.getString("address"));
			r.setPrix(c.resultset.getDouble("prix"));
			r.setVille(c.resultset.getInt("ville"));
			r.setStars(c.resultset.getInt("stars"));
			
			rs.add(r);
		}
		
		return rs;
		
	}
	
	/* Guides Zone
	 * Get All of Guides
	 * Add Guide
	 * Delete Guide
	 * Update Guide */
	
	public ArrayList<Guide> getAllGuides() throws ClassNotFoundException, SQLException{
		ArrayList<Guide> gs = new ArrayList<>();
		String query = "SELECT * FROM services, guidestouristique WHERE services.idservice LIKE guidestouristique.idguide";
		c.resultset = c.statement.executeQuery(query);
		
		while(c.resultset.next()) {
			Guide g = new Guide();
			g.setIdguide(c.resultset.getString("idguide"));
			g.setName(c.resultset.getString("nomservice"));
			g.setAddress(c.resultset.getString("address"));
			g.setPrix(c.resultset.getDouble("prix"));
			g.setVille(c.resultset.getInt("ville"));
			g.setEmail(c.resultset.getString("email"));
			g.setPhone(c.resultset.getString("phone"));
			g.setResume(c.resultset.getString("resume"));
			gs.add(g);
		}
		return gs;
	}
	
	/* CampingSites Zone
	 * Get All of CampingSites
	 * Add CampingSite
	 * Delete CampingSite
	 * Update CampingSite */
	
	public ArrayList<CampingSite> getAllCamps() throws ClassNotFoundException, SQLException{
		ArrayList<CampingSite> cps = new ArrayList<>();
		String query = "SELECT * FROM services, campingsites WHERE services.idservice LIKE campingsites.idcamping";
		c.resultset = c.statement.executeQuery(query);
		
		while(c.resultset.next()) {
			CampingSite cp = new CampingSite();
			cp.setIdCS(c.resultset.getString("idcamping"));
			cp.setName(c.resultset.getString("nomservice"));
			cp.setAddress(c.resultset.getString("address"));
			cp.setPrix(c.resultset.getDouble("prix"));
			cp.setVille(c.resultset.getInt("ville"));
			cp.setCapacity(c.resultset.getInt("nbrplaces"));
			cp.setArea(c.resultset.getDouble("area"));
			cps.add(cp);
		}
		return cps;
	}
	
	
	/* Transport Zone
	 * Get All of Transport
	 * Add Transport
	 * Delete Transport
	 * Update Transport */
	
	public ArrayList<Transport> getAllTransports() throws ClassNotFoundException, SQLException{
		ArrayList<Transport> ts = new ArrayList<>();
		String query = "SELECT * FROM services, transport WHERE services.idservice LIKE transport.idtransport";
		c.resultset = c.statement.executeQuery(query);
		
		while(c.resultset.next()) {
			Transport tp = new Transport();
			tp.setId(c.resultset.getString("idtransport"));
			tp.setName(c.resultset.getString("nomservice"));
			tp.setAddress(c.resultset.getString("address"));
			tp.setPrix(c.resultset.getDouble("prix"));
			tp.setVille(c.resultset.getInt("ville"));
			tp.setNbrplace(c.resultset.getInt("nbrplaces"));
			ts.add(tp);
		}
		return ts;
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		GestionServices gs = new GestionServices();
		ArrayList<Hotel> hs = new ArrayList<>();
		hs = gs.getAllHotels();
		for(Hotel h : hs) {
			System.out.println(h.getName());
		}
	}
	
}
