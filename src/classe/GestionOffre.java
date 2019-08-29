package classe;

import java.sql.SQLException;
import java.util.ArrayList;

import modele.*;

public class GestionOffre {
	DBConnection c, x;
	public java.sql.Connection con;
	
	public GestionOffre() throws ClassNotFoundException, SQLException {
		this.c = new DBConnection("l3guidina");
	}
	
	public String keyGenOff() {
		return "off-" + ((int) Math.random()*9999);
	}
	
	
	public ArrayList<Offre> getAllOffres() throws ClassNotFoundException, SQLException{
		String query = "select * from offres";
		c.resultset = c.statement.executeQuery(query);
		ArrayList<Offre> offs = new ArrayList<>();
		while(c.resultset.next()) {
			Offre off = new Offre();
			off.setIdoffre(c.resultset.getString("idoffre"));
			off.setDaredep(c.resultset.getString("datedep"));
			off.setDatefin(c.resultset.getString("datefin"));
			off.setType(c.resultset.getString("type"));
			off.setReduction(c.resultset.getDouble("reduction"));
			off.setIdcircuit(c.resultset.getInt("idcircuit"));
			
			offs.add(off);
		}
		
		return offs;
	}
	
	public boolean ajoutOff(Offre off) throws ClassNotFoundException, SQLException {
		String query = "Insert into offres values('"+off.getIdoffre()+"','"+off.getDaredep()+"','"+off.getDatefin()+"','"+off.getType()+"','"+off.getReduction()+"','"+off.getIdcircuit()+"');";
		int hum = c.statement.executeUpdate(query);
		System.out.println(query);
		if(hum==1) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
