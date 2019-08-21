package classe;

import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
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
		
	public ArrayList<Reservation> getAllResByClient(String idcl) throws ClassNotFoundException, SQLException{
		String query = "Select * From reservation where idcli like '"+idcl+"';";
		ArrayList<Reservation> reservations = new ArrayList<>();
		c.resultset = c.statement.executeQuery(query);
		while(c.resultset.next()) {
			Reservation res = new Reservation();
			res.setIdRes(c.resultset.getInt("idres"));
			res.setPrixpaye(c.resultset.getDouble("prixpay"));
			res.setDateDep(c.resultset.getDate("jourdep"));
			res.setHeureDep(c.resultset.getTime("heuredep"));
			res.setIdCli(c.resultset.getString("idcli"));
			reservations.add(res);
		}
		
		return reservations;
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		GestionReservation gr = new GestionReservation();
		Reservation res = new Reservation();
		//res.setIdRes(1); res.setPrixpaye(1400.00); res.setDateDep(new Date(0)); res.setHeureDep(new Time(0));
		//gr.ajouterReservation(res);
		ArrayList<Reservation> rs = new ArrayList<>();
		rs = gr.getAllResByClient("UCli-428");
		for(Reservation r : rs) {
			System.out.println(r.getIdRes());
		}
		
		
	}
}
