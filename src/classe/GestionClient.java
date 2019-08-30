package classe;


import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.exceptions.MySQLSyntaxErrorException;

import modele.Utilisateur;
import modele.DBConnection;
import modele.Voyage;
import modele.Client;


public class GestionClient {
	DBConnection c, x;
	public java.sql.Connection con;
	
	public GestionClient() throws ClassNotFoundException, SQLException {
		this.c = new DBConnection("l3guidina");
	}
	
	
	public Voyage chercherClient(String email) throws SQLException, ClassNotFoundException{
		Voyage v = new Voyage();
		
		c.resultset = c.statement.executeQuery("Select * From clients Where email='"+email+"';");
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
	
	public boolean login(Utilisateur user) throws ClassNotFoundException, SQLException{
		String query = "Select * From utilisateurs where email='"+user.getEmail()+"' and motpass='"+user.getMotPasse()+"';";
		String email1 = "Nothing@database.toz";
		c.resultset = c.statement.executeQuery(query);
		if(c.resultset.next()) {
			String password = c.resultset.getString("motpass");
			String email2 = c.resultset.getString("email");
			if(password.equals(user.getMotPasse()) && email2.equals(user.getEmail())) {
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
	////4189071156
	public Client getReservasionClient (String email) throws SQLException, ClassNotFoundException{
        c.resultset=c.statement.executeQuery("SELECT * FROM utilisateurs Join clients on utilisateurs.iduser=clients.idclient and email like'"+email+"';");
        if(c.resultset.next()){
        	Client cl = new Client();
            cl.setIdClient(c.resultset.getString("idclient"));
            cl.setBirthdate(c.resultset.getString("birthdate"));
            cl.setEmail(c.resultset.getString("email"));
            cl.setAddress(c.resultset.getString("address"));
            cl.setMotPasse(c.resultset.getString("motpass"));
            cl.setNom(c.resultset.getString("nom"));
            cl.setNumTlphn(c.resultset.getString("phone"));
            cl.setPrenom(c.resultset.getString("prenom"));
            cl.setSexe(c.resultset.getString("sexe"));
            cl.setImage(c.resultset.getString("image"));
            cl.setPoints(c.resultset.getInt("points"));
            cl.setCredit(c.resultset.getDouble("credit"));
            return cl;
        }else {
        	return null;
        }
        
    }
	
	
	
	public Client getClientUsingEmail (String email) throws SQLException, ClassNotFoundException{
        c.resultset=c.statement.executeQuery("SELECT * FROM utilisateurs Join clients on utilisateurs.iduser=clients.idclient and email like'"+email+"';");
        if(c.resultset.next()){
        	Client cl = new Client();
            cl.setIdClient(c.resultset.getString("idclient"));
            cl.setBirthdate(c.resultset.getString("birthdate"));
            cl.setEmail(c.resultset.getString("email"));
            cl.setAddress(c.resultset.getString("address"));
            cl.setMotPasse(c.resultset.getString("motpass"));
            cl.setNom(c.resultset.getString("nom"));
            cl.setNumTlphn(c.resultset.getString("phone"));
            cl.setPrenom(c.resultset.getString("prenom"));
            cl.setSexe(c.resultset.getString("sexe"));
            cl.setImage(c.resultset.getString("image"));
            cl.setPoints(c.resultset.getInt("points"));
            cl.setCredit(c.resultset.getDouble("credit"));
            return cl;
        }else {
        	return null;
        }
        
    }
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		GestionClient gc = new GestionClient();
		Utilisateur cl = new Client();
		//cl.set("UCli-1892");
		//cl.setEmail("ichrak@sheeps.com");
		System.out.println(gc.getClientUsingEmail("abeaganj@google.ca").getImage());
		
		
	}
}
