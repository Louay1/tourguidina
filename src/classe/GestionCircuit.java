package classe;


import java.sql.SQLException;
import java.util.ArrayList;

import modele.Circuit;
import modele.DBConnection;

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
			String name = c.resultset.getString("name");
			String startpoint = c.resultset.getString("locations");
			String endponit = c.resultset.getString("price");
			
			ci.setId(ident); ci.setName(name);  ci.setEndponit(endponit); ci.setStartpoint(startpoint);
			
			return ci;
		}else {
			return null;
		}
	
	}
	
	public boolean ajouterCircuit(Circuit ci) throws ClassNotFoundException, SQLException{
		
		
		if(chercheCircuit(ci.getId()) != null) {
			return false;
		}else {
			c.statement.executeUpdate("Insert Into circuits Values('"+ci.getId()+"','"+ci.getName()+"','"+ci.getStartpoint()+"','"+ci.getEndponit()+"');");
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
	
	
	public ArrayList<Circuit> getAllCircuits() throws ClassNotFoundException, SQLException {
		String query = "Select * From circuits ;";
		c.resultset = c.statement.executeQuery(query);
		
		ArrayList<Circuit> cis = new ArrayList<>();
		
		while(c.resultset.next()) {
			Circuit ci = new Circuit();
			ci.setId(c.resultset.getInt("idcircuit"));
			ci.setName(c.resultset.getString("nimcircuit"));
			ci.setStartpoint(c.resultset.getString("startpoint"));
			ci.setEndponit(c.resultset.getString("pointarv"));
			
			cis.add(ci);
		}
		
		return cis;
	}
	
	/*public boolean deleteCircuit(int id) throws ClassNotFoundException, SQLException{
		
	}*/
	
	
	
}
