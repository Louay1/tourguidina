package classe;

import java.sql.SQLException;

import modele.DBConnection;

public class GestionManifestation {
	DBConnection c;
	public java.sql.Connection con;	
	
	public GestionManifestation() throws ClassNotFoundException, SQLException {
		this.c = new DBConnection("l3guidina");
	}
}
