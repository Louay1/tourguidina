package classe;


import java.sql.DriverManager;
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
			user.setNom(c.resultset.getString("nom"));
			user.setEmail(c.resultset.getString("email"));
			user.setMotPasse(c.resultset.getString("motpass"));
			user.setNumTlphn(c.resultset.getString("phone"));
			user.setSexe(c.resultset.getString("sexe"));
			
			return user;
			
		}else {
			return null;
		}
	}
	
	public boolean ajouterUtilisateur(Utilisateur user) throws ClassNotFoundException, SQLException{
		
		if(user.getEmail().contentEquals("vide")) {
			c.statement.executeUpdate("Insert Into utilisateurs(iduser, nom, prenom, birthedate, sexe, address, image, motpass, email, phone, idville) Values('"+user.getIdUsr()+"','"+user.getNom()+"','"+user.getPrenom()+"','"+user.getBirthdate()+"','"+user.getSexe()+"','"+user.getAddress()+"','"+user.getImage()+"','"+user.getMotPasse()+"','"+user.getEmail()+"','"+user.getNumTlphn()+"',"+user.getVille()+");");
			c.connection.close();
			c.resultset.close();
			c.statement.close();
			return true;
		}else {
			if(chercherUtilisateur(user.getEmail()) != null) {
				c.connection.close();
				c.resultset.close();
				c.statement.close();
				return false;
				

			}else {
				c.statement.executeUpdate("Insert Into utilisateurs  Values('"+user.getIdUsr()+"','"+user.getNom()+"','"+user.getPrenom()+"','"+user.getBirthdate()+"','"+user.getSexe()+"','"+user.getAddress()+"','"+user.getImage()+"','"+user.getMotPasse()+"','"+user.getEmail()+"','"+user.getNumTlphn()+"',"+user.getVille()+");");
				c.connection.close();
				c.resultset.close();
				c.statement.close();
				return true;
			}
		}
	}
	
	public boolean ajouterClient(String iduser) throws ClassNotFoundException, SQLException{
		String query = "Insert into clients(idclient, points, credit) values('"+iduser+"', 0, 20000000);";
		c.connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/l3guidina","root","mynewpassword");
		c.statement=c.connection.createStatement();
		int isit = c.statement.executeUpdate(query);
		if(isit == 1) {
			System.out.println(query);
			return true;
		}else {
			System.out.println(query);
			return false;
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
