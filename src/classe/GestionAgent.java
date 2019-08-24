package classe;

import java.sql.SQLException;

import modele.DBConnection;
import modele.*;

public class GestionAgent {
	DBConnection c, x;
	public java.sql.Connection con;
	
	public GestionAgent() throws ClassNotFoundException, SQLException {
		this.c = new DBConnection("l3guidina");
	}
	
	public boolean loginAgent(Utilisateur user) throws ClassNotFoundException, SQLException{
		String query = "Select * From utilisateurs where email='"+user.getEmail()+"' and motpass='"+user.getMotPasse()+"';";
		c.resultset = c.statement.executeQuery(query);
		
		if(c.resultset.next()) {
			String password = c.resultset.getString("motpass");
			String email = c.resultset.getString("email");
			
			if(password.equals(user.getMotPasse()) && email.equals(user.getEmail())) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	public Agent getAgentUsingEmail(String email) throws SQLException, ClassNotFoundException {
		String query = "SELECT * FROM utilisateurs Join agents on utilisateurs.iduser=agents.idagent and email like'"+email+"';";
		c.resultset = c.statement.executeQuery(query);
		System.out.println("0");
		if(c.resultset.next()) {
			System.out.println("1");
			
			Agent agent = new Agent();
			agent.setIdagent(c.resultset.getString("idagent"));
			agent.setBirthdate(c.resultset.getString("birthdate"));
			agent.setEmail(c.resultset.getString("email"));
			agent.setAddress(c.resultset.getString("address"));
			agent.setMotPasse(c.resultset.getString("motpass"));
			agent.setNom(c.resultset.getString("nom"));
			agent.setPrenom(c.resultset.getString("prenom"));
			agent.setNumTlphn(c.resultset.getString("phone"));
			agent.setSexe(c.resultset.getString("sexe"));
			agent.setImage(c.resultset.getString("image"));
			agent.setScode(c.resultset.getString("secode"));
			System.out.println("2");
			
            System.out.println("3");
            
            return agent;
            
		}else {
			return null;
		}
		
	}
}
