package classe;

import java.sql.SQLException;

import java.util.ArrayList;



import modele.*;

public class GestionReservation {
	DBConnection c, x;
	public java.sql.Connection con;
	
	public GestionReservation() throws ClassNotFoundException, SQLException{
		this.c = new DBConnection("l3guidina");
	}
	
	public boolean ajouterReservation(Reservation reservation) throws ClassNotFoundException, SQLException{
		
		String query = "Insert Into reservation(idres, prixpay, jourdep, heuredep,idvoy, idcli) Values("+reservation.getIdRes()+","+reservation.getPrixpaye()+",'"+reservation.getDateDep()+"','"+reservation.getHeureDep()+"','"+reservation.getIdVoy()+"','"+reservation.getIdCli()+"');";
		System.out.println(query);
		int hum = c.statement.executeUpdate(query);
		if(hum==1) {
			return true;
		}else {
			System.out.println("Not inserted");
			return false;
		}
	}
	
	public boolean ajouterReservationM(Reservation reservation) throws ClassNotFoundException, SQLException{
		
		String query = "Insert Into reservation(idres, prixpay, jourdep, heuredep,idvoy,idmanifest, idcli) Values("+reservation.getIdRes()+","+reservation.getPrixpaye()+",'"+reservation.getDateDep()+"','"+reservation.getHeureDep()+"','"+reservation.getIdVoy()+"','"+reservation.getIdManifest()+"','"+reservation.getIdCli()+"');";
		System.out.println(query);
		int hum = c.statement.executeUpdate(query);
		if(hum==1) {
			return true;
		}else {
			System.out.println("Not inserted");
			return false;
		}
	}
	
	
	
	public boolean payment(double amount, Reservation res) throws ClassNotFoundException, SQLException{
		
		c.resultset = c.statement.executeQuery("select credit from clients where idclient like '"+res.getIdCli()+"';");
		if(c.resultset.next()) {
			double credit = c.resultset.getDouble("credit");
			System.out.println(credit+"---"+res.getIdCli());
			if(credit >= amount) {
				double newcredit = credit - amount;
				int hum = c.statement.executeUpdate("Update clients SET credit = "+newcredit+" where idclient like '"+res.getIdCli()+"';");
				if(hum==1) {
					return true;
				}else {
					System.out.println("3rd");
					return false;
				}
			}else {
				System.out.println("2nd");
				return false;
			}
			
		}else {
			System.out.println("1st");
			return false;
		}
	}
	
	
	public boolean toAccountxD(double amount) throws ClassNotFoundException, SQLException{
		c.resultset = c.statement.executeQuery("Select credit from admins ;");
		if(c.resultset.first()) {
			double newamount = c.resultset.getDouble("credit");
			System.out.println(newamount+"----"+amount);
			newamount = newamount +amount;
			String query = "Update admins Set credit="+newamount+";";
			System.out.println(query);
			int hum = c.statement.executeUpdate(query);
			System.out.println(newamount+"----"+amount);
			
			return true;
		}else {
			return false;
		}
	}
	
	public boolean ajouterReservationST(Reservation reservation) throws ClassNotFoundException, SQLException{
		
		String query = "Insert Into reservation(idres, prixpay, heuredep,idvoy,idsitetour, idcli) Values("+reservation.getIdRes()+","+reservation.getPrixpaye()+",'"+reservation.getHeureDep()+"','"+reservation.getIdVoy()+"','"+reservation.getIdSitetou()+"','"+reservation.getIdCli()+"');";
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
			res.setDateDep(c.resultset.getString("jourdep"));
			res.setHeureDep(c.resultset.getString("heuredep"));
			res.setIdCli(c.resultset.getString("idcli"));
			reservations.add(res);
		}
		
		return reservations;
	}
	
	public ArrayList<Reservation> getVoyagesClient (String id) throws SQLException, ClassNotFoundException{
        c.resultset=c.statement.executeQuery("SELECT * FROM reservation, voyages, clients WHERE reservation.idvoy=voyages.idvoyage and reservation.idcli=clients.idclient and idcli like'"+id+"';");
        ArrayList<Reservation> rvs = new ArrayList<>();
        while(c.resultset.next()){
        	Reservation r = new Reservation();
            r.setIdRes(c.resultset.getInt("idres"));
            r.setPrixpaye(c.resultset.getDouble("prix"));
            r.setIdVoy(c.resultset.getString("idvoy"));
            r.setHeureDep(c.resultset.getString("heuredep"));
            r.setDateDep(c.resultset.getString("datedep"));
            r.setResname(c.resultset.getString("nomvoyage"));
            rvs.add(r);
        }
        return rvs;
    }
	
	public ArrayList<Reservation> getSitesClient (String id) throws SQLException, ClassNotFoundException{
        c.resultset=c.statement.executeQuery("SELECT * FROM reservation, sitetouristiques, clients WHERE reservation.idsitetour=sitetouristiques.idsitetour and reservation.idcli=clients.idclient and idcli like'"+id+"';");
        ArrayList<Reservation> rvs = new ArrayList<>();
        while(c.resultset.next()){
        	Reservation r = new Reservation();
            r.setIdRes(c.resultset.getInt("idres"));
            r.setPrixpaye(c.resultset.getDouble("prix"));
            r.setIdSitetou(c.resultset.getString("idsitetour"));
            r.setHeureDep(c.resultset.getString("heuredep"));
            r.setDateDep(c.resultset.getString("heurefin"));
            r.setResname(c.resultset.getString("nomsitetour"));
            rvs.add(r);
        }
        return rvs;
    }
	
		public boolean deleteBooking(int res) throws ClassNotFoundException, SQLException {
			String query = "delete from reservation where idres="+res+";";
			int humm = c.statement.executeUpdate(query);
			if(humm == 1) {
				System.out.println(query);
				return true;
			}else {
				System.out.println("Not Deleted");
				return false;
			}
		}
	public ArrayList<Reservation> getManifestClient (String id) throws SQLException, ClassNotFoundException{
        c.resultset=c.statement.executeQuery("SELECT * FROM reservation, manifestations, clients WHERE reservation.idmanifest=manifestations.idmnifest and reservation.idcli=clients.idclient and idcli like'"+id+"';");
        ArrayList<Reservation> rvs = new ArrayList<>();
        while(c.resultset.next()){
        	Reservation r = new Reservation();
            r.setIdRes(c.resultset.getInt("idres"));
            r.setPrixpaye(c.resultset.getDouble("fees"));
            r.setIdManifest(c.resultset.getString("idmnifest"));
            r.setHeureDep(c.resultset.getString("heure"));
            r.setDateDep(c.resultset.getString("datefin"));
            r.setResname(c.resultset.getString("nommanifest"));
            rvs.add(r);
        }
        return rvs;
    }
	
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		GestionReservation gr = new GestionReservation();
		Reservation res = new Reservation();

		ArrayList<Reservation> rs = new ArrayList<>();
		rs = gr.getManifestClient("UCli-428");
		for(Reservation r : rs) {
			System.out.println(r.getIdRes());
		}
		
		
	}
}
