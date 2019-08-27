package classe;

import java.sql.SQLException;
import java.util.ArrayList;

import modele.DBConnection;
import modele.*;

public class GestionManifestation {
	DBConnection c;
	public java.sql.Connection con;	
	
	public GestionManifestation() throws ClassNotFoundException, SQLException {
		this.c = new DBConnection("l3guidina");
	}
	
	public ArrayList<Manifestation> getManifestById(String idmanifest) throws ClassNotFoundException, SQLException{
		ArrayList<Manifestation> ms = new ArrayList<>();
		String query = "Select * From manifestations where idvoyage like '"+idmanifest+"';";
		c.resultset = c.statement.executeQuery(query);
		while(c.resultset.next()) {
			Manifestation m = new Manifestation();
			m.setIdmanifest(c.resultset.getString("idmnifest"));
			m.setNommanifest(c.resultset.getString("nommanifest"));
			m.setAddress(c.resultset.getString("adr"));
			m.setNbrjour(c.resultset.getInt("nbrjour"));
			m.setHeure(c.resultset.getString("heure"));
			m.setHeurefin(c.resultset.getString("heurefin"));
			m.setDatefin(c.resultset.getString("datefin"));
			m.setFees(c.resultset.getDouble("fees"));
			
			ms.add(m);
		}
		 
		return ms;
	}
	
	public ArrayList<Manifestation> getAllManifest() throws ClassNotFoundException, SQLException{
		ArrayList<Manifestation> ms = new ArrayList<>();
		String query = "Select * From manifestations ;";
		c.resultset = c.statement.executeQuery(query);
		while(c.resultset.next()) {
			Manifestation m = new Manifestation();
			m.setIdmanifest(c.resultset.getString("idmnifest"));
			m.setNommanifest(c.resultset.getString("nommanifest"));
			m.setAddress(c.resultset.getString("adr"));
			m.setNbrjour(c.resultset.getInt("nbrjour"));
			m.setHeure(c.resultset.getString("heure"));
			m.setHeurefin(c.resultset.getString("heurefin"));
			m.setDatefin(c.resultset.getString("datefin"));
			m.setFees(c.resultset.getDouble("fees"));
			m.setIdvoy(c.resultset.getString("idvoy"));
			m.setIdville(c.resultset.getInt("idville"));
			ms.add(m);
		}
		 
		return ms;
	}
	
	public boolean ajouterManifest(Manifestation manifest) throws ClassNotFoundException, SQLException{
		String query="";
		int hum = c.statement.executeUpdate(query);
		if(hum==1) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
	}
	
	
	
	
	
}
