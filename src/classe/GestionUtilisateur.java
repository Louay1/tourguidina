package classe;


import java.sql.SQLException;
import java.util.ArrayList;
import modele.*;

public class GestionUtilisateur {
	DBConnection c;
	
	public GestionUtilisateur() throws ClassNotFoundException, SQLException{
		c = new DBConnection("l3guidina");
	}
	
	public Utilisateur chercherUtilisateur(String email) throws ClassNotFoundException, SQLException{
		c.resultset = c.statement.executeQuery("Select * From utilisateurs Where email='"+email+"';");
		
		if(c.resultset.next()) {
			Utilisateur user = new Utilisateur();
			user.setIdUsr(c.resultset.getString("iduser"));
			user.setNom(c.resultset.getString("name"));
			user.setEmail(c.resultset.getString("email"));
			user.setMotPasse(c.resultset.getString("password"));
			user.setNumTlphn(c.resultset.getString("phone"));
			user.setSexe(c.resultset.getString("sex"));
			
			return user;
			
		}else {
			return null;
		}
	}
	
	public boolean ajouterUtilisateur(Utilisateur user) throws ClassNotFoundException, SQLException{
		
		if(user.getEmail().contentEquals("vide")) {
			int res = c.statement.executeUpdate("Insert Into utilisateurs Values('"+keyGen()+"','"+user.getNom()+"','"+user.getPrenom()+"','"+user.getBirthdate()+"','"+user.getSexe()+"','"+user.getAddress()+"','"+user.getImage()+"','"+user.getMotPasse()+"','"+user.getEmail()+"','"+user.getNumTlphn()+"',"+user.getVille()+");");
			return true;
		}else {
			if(chercherUtilisateur(user.getEmail()) != null) {
				return false;
			}else {
				int res = c.statement.executeUpdate("Insert Into utilisateurs Values('"+keyGen()+"','"+user.getNom()+"','"+user.getPrenom()+"','"+user.getBirthdate()+"','"+user.getSexe()+"','"+user.getAddress()+"','"+user.getImage()+"','"+user.getMotPasse()+"','"+user.getEmail()+"','"+user.getNumTlphn()+"',"+user.getVille()+");");
				System.out.println(res==1);
				return res==1;
			}
		}
	}
	
	public String keyGen() throws ClassNotFoundException, SQLException{
		return "UCli-"+((int) (Math.random()*9999));
	}
	
	public boolean modifierEmail(int id, String email) throws ClassNotFoundException, SQLException{
		int res = c.statement.executeUpdate("Update users set email='"+email+"' Where iduser='"+id+"';");
		return res==1;
	}
	
	public boolean modifierPhone(int id, String phone) throws ClassNotFoundException, SQLException{
		int res = c.statement.executeUpdate("Update users set email='"+phone+"' Where iduser='"+id+"';");
		return res==1;
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		GestionUtilisateur gu = new GestionUtilisateur();
		System.out.println(gu.keyGen());
		
		Utilisateur user = new Utilisateur();
		user.setIdUsr(gu.keyGen());
		user.setNom("Louai");
		user.setPrenom("Chouchane");
		user.setBirthdate("1997-02-19");
		user.setAddress("Fuck off, okay ?");
		user.setImage("Hehe Nice try");
		user.setMotPasse("password");
		user.setNumTlphn("0799959010");
		user.setEmail("vide");
		user.setSexe("Male");
		user.setVille(13);
		
		System.out.println(gu.ajouterUtilisateur(user));
	
	}
	
	
}
