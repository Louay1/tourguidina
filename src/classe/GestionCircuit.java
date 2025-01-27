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
		c.resultset = c.statement.executeQuery("Select * From circuits Where idcircuit='"+id+"';");
		
		if(c.resultset.next()) {
			int ident = c.resultset.getInt("idcircuit");
			String name = c.resultset.getString("nomcircuit");
			String startpoint = c.resultset.getString("pointdep");
			String endponit = c.resultset.getString("pointarv");
			
			ci.setId(ident); ci.setName(name);  ci.setEndponit(endponit); ci.setStartpoint(startpoint);
			
			return ci;
		}else {
			return null;
		}
	
	}
	
	public boolean ajouterCircuit(Circuit ci) throws ClassNotFoundException, SQLException{
		
		
		if(chercheCircuit(ci.getId()) != null) {
			System.out.println(ci.getId());
			return false;
		}else {
			c.statement.executeUpdate("Insert Into circuits(nomcircuit, pointdep, pointarv) Values('"+ci.getName()+"','"+ci.getStartpoint()+"','"+ci.getEndponit()+"');");
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
			ci.setName(c.resultset.getString("nomcircuit"));
			ci.setStartpoint(c.resultset.getString("pointdep"));
			ci.setEndponit(c.resultset.getString("pointarv"));
			
			cis.add(ci);
		}
		
		return cis;
	}
	
	public boolean deleteCircuit(int id) throws ClassNotFoundException, SQLException{
		String query = "Delete from circuits where idcircuit="+id;
		int i = c.statement.executeUpdate(query);
		if(i==1) {
			System.out.println(query);
			return true;
		}else {
			System.out.println("Not Deleted");
			return false;
		}
	}
	
	public boolean updateCircuitEnd(int id, String end) throws ClassNotFoundException, SQLException{
		String query = "Update circuits Set pointarv = '"+end+"'  where idcircuit"+id;
		int i = c.statement.executeUpdate(query);
		if(i==1) {
			System.out.println(query);
			return true;
		}else {
			System.out.println("Not Updated");
			return false;
		}
	}
	
	public boolean updateCircuitStart(int id, String start) throws ClassNotFoundException, SQLException{
		String query = "Update circuits Set pointdep = '"+start+"'  where idcircuit"+id;
		int i = c.statement.executeUpdate(query);
		if(i==1) {
			System.out.println(query);
			return true;
		}else {
			System.out.println("Not Updated");
			return false;
		}
	}
	
	public boolean updateCircuitName(int id, String name) throws ClassNotFoundException, SQLException{
		String query = "Update circuits Set nomcircuit = '"+name+"'  where idcircuit"+id;
		int i = c.statement.executeUpdate(query);
		if(i==1) {
			System.out.println(query);
			return true;
		}else {
			System.out.println("Not Updated");
			return false;
		}
	}
	

}
