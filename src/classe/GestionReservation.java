package classe;

import java.sql.SQLException;
import java.sql.Time;
import java.sql.Date;


import modele.*;

public class GestionReservation {
	DBConnection c;
	public java.sql.Connection con;
	
	public GestionReservation() throws ClassNotFoundException, SQLException{
		this.c = new DBConnection("l3guidina");
	}
	
	public boolean ajouterReservation(Reservation reservation) throws ClassNotFoundException, SQLException{
		
		String query = "Insert Into reservation(idres, prixpay, jourdep, heuredep, idcli) Values("+reservation.getIdRes()+","+reservation.getPrixpaye()+",'"+reservation.getDateDep()+"','"+reservation.getHeureDep()+"','"+reservation.getIdCli()+"');";
		System.out.println(query);
		int hum = c.statement.executeUpdate(query);
		if(hum==1) {
			return true;
		}else {
			System.out.println("Not inserted");
			return false;
		}
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		GestionReservation gr = new GestionReservation();
		Reservation res = new Reservation();
		res.setIdRes(1); res.setPrixpaye(1400.00); res.setDateDep(new Date(0)); res.setHeureDep(new Time(0));
		gr.ajouterReservation(res);
	}
}
