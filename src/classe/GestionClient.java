package classe;


import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.exceptions.MySQLSyntaxErrorException;

import modele.Utilisateur;
import modele.DBConnection;
import modele.Voyage;
import modele.Client;


public class GestionClient {
	DBConnection c;
	public java.sql.Connection con;
	
	public GestionClient() throws ClassNotFoundException, SQLException {
		this.c = new DBConnection("l3guidina");
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
	
	public boolean login(String email, String pass) throws ClassNotFoundException, SQLException{
		//String query = "Select * From utilisateurs where email='"+email+"';";
		String query = "Select * From utilisateurs where email='"+email+"' and motpass='"+pass+"';";
		String email1 = "Nothing@database.toz";
		c.resultset = c.statement.executeQuery(query);
		
		if(c.resultset.next()) {
			String password = c.resultset.getString("motpass");
			String email2 = c.resultset.getString("email");
			if(password.equals(pass) && email2.equals(email)) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	public boolean ajouterClient(Client cl) throws ClassNotFoundException, SQLException{
		
		if(chercherClient(cl.getEmail()) != null) {
			return false;
		}else {
			
		}
		
		return false;
	}
	
	public Client chercherClient (Utilisateur t) throws SQLException, ClassNotFoundException{
        c.resultset=c.statement.executeQuery("SELECT * FROM clients WHERE idclient='"+t.getIdUsr()+"';");
        Client cl = new Client();
        if(c.resultset.next()){
            cl.setIdClient(c.resultset.getString("idclient"));
            cl.setBirthdate(t.getBirthdate());
            cl.setEmail(t.getEmail());
            cl.setAddress(t.getAddress());
            cl.setMotPasse(t.getMotPasse());
            cl.setNom(t.getNom());
            cl.setNumTlphn(t.getNumTlphn());
            cl.setPrenom(t.getPrenom());
            cl.setSexe(t.getSexe());
            cl.setImage(t.getImage());
            return cl;
        }
            
        return cl;
    }
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		GestionClient gc = new GestionClient();
		Client cl = new Client();
		cl.setIdClient("UCli-1892");
		cl.setEmail("ichrak@sheeps.com");
		System.out.println(gc.login("ichrak@sheeps.com", "Haha"));
		
		
	}
}
