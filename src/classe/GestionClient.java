package classe;


import java.sql.SQLException;
import java.util.ArrayList;
import modele.Connection;
import modele.Voyage;
import modele.Client;


public class GestionClient {
	Connection c;
	public java.sql.Connection con;
	
	public GestionClient() throws ClassNotFoundException, SQLException {
		this.c = new Connection("l3guidina");
	}	
	
	
	public Voyage chercherClient(String email) throws SQLException, ClassNotFoundException{
		Voyage v = new Voyage();
		
		c.resultset = c.statement.executeQuery("Select * From clients Where email='"+email+"';");
		//c.resultset = c.statement.executeQuery("Select * From users.clients Where email='"+email+"';");
		if(c.resultset.next()) {
			String ident = c.resultset.getString("idvoy");
			int places = c.resultset.getInt("places");
			double price = c.resultset.getDouble("price");
			String dist = c.resultset.getString("dist");
			v.setIdvoy(ident); v.setDist(dist); v.setPlaces(places); v.setPrice(price);
			return v;
		}else {
			return null;
		}
	}
	
	public boolean ajouterClient(Client cl) throws ClassNotFoundException, SQLException{
		
		if(chercherClient(cl.getEmail()) != null) {
			return false;
		}
		
		return false;
	}
}
