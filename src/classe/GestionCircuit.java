package classe;


import java.sql.SQLException;
import modele.*;

public class GestionCircuit {
	
	DBConnection c;
	public java.sql.Connection con;
	
	public GestionCircuit() throws ClassNotFoundException, SQLException{
		this.c = new DBConnection("l3guidina");
	}
	
	public Circuit chercheCircuit(int id) throws ClassNotFoundException, SQLException {
		Circuit ci = new Circuit();
		c.resultset = c.statement.executeQuery("Select * From circuits Where id='"+id+"';");
		
		if(c.resultset.next()) {
			int ident = c.resultset.getInt("id");
			int places = c.resultset.getInt("places");
			String name = c.resultset.getString("name");
			String locations = c.resultset.getString("locations");
			double price = c.resultset.getDouble("price");
			
			ci.setId(ident); ci.setName(name); ci.setPlaces(places); ci.setLocations(locations); ci.setPrice(price);
			
			return ci;
		}else {
			return null;
		}
	
	}
	
	public boolean ajouterCircuit(Circuit ci) throws ClassNotFoundException, SQLException{
		
		
		if(chercheCircuit(ci.getId()) != null) {
			return false;
		}else {
			c.statement.executeUpdate("Insert Into circuits Values('"+ci.getId()+"','"+ci.getName()+"','"+ci.getLocations()+"','"+ci.getPlaces()+"','"+ci.getPrice()+"');");
			return true;
		}
	}
	
	public int getNomberCircuit() throws SQLException {
		int i = 0;
		c.resultset = c.statement.executeQuery("Select COUNT(*) As total From circuit;");
		if(c.resultset.next()) {
			i = c.resultset.getInt("total");
		}
		
		return i;
	}
}
