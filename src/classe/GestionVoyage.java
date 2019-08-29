package classe;

import java.sql.SQLException;
import java.util.ArrayList;
import modele.DBConnection;
import modele.Voyage;

	public class GestionVoyage {
		DBConnection c;
		public java.sql.Connection con;	
		
		public GestionVoyage() throws ClassNotFoundException, SQLException {
			this.c = new DBConnection("l3guidina");
		}
		
		public int getNomberVoyages() throws SQLException {
			int i = 0;
			c.resultset = c.statement.executeQuery("Select COUNT(*) As total From voyages;");
			if(c.resultset.next()) {
				i = c.resultset.getInt("total");
			}
			
			return i;
		}
		
		public Voyage chercherVoyage(String string) throws SQLException, ClassNotFoundException{
			Voyage v = new Voyage();
			
			c.resultset = c.statement.executeQuery("Select * From voyages Where id='"+string+"';");
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
		
		public ArrayList<Voyage> chercherVoyageInternaute(String dist) throws SQLException{
			ArrayList<Voyage> voyages = new ArrayList<>();
			
			c.resultset = c.statement.executeQuery("Select * From voyages Where dist='"+dist+"';");
			while(c.resultset.next()) {
				String disti = c.resultset.getString("dist");
				String id = c.resultset.getString("idvoy");
				int places = c.resultset.getInt("places");
				double price = c.resultset.getDouble("price");
				Voyage v = new Voyage();
				v.setIdvoy(id); v.setDist(disti); v.setPlaces(places); v.setPrice(price);
				voyages.add(v);
			}
			
			return voyages;
		}
		
		public boolean ajouterVoyage(Voyage v) throws SQLException, ClassNotFoundException{
			String query = "Insert Into voyages Values('"+v.getIdvoy()+"','"+v.getNom()+"',"+v.getPlaces()+","+v.getPrice()+",'"+v.getHeuredep()+"','"+v.getDatedepart()+"',"+v.getNbrjours()+","+v.getIdCir()+");";
			System.out.println(query);
			int hum = c.statement.executeUpdate(query);
			System.out.println(query);
			if(hum==1) {
				return true;
			}else {
				return false;
			}			
		}
		
		public ArrayList<Voyage> getVoyagesById(String idvoy) throws ClassNotFoundException, SQLException{
			ArrayList<Voyage> vs = new ArrayList<>();
			String query = "Select * From voyages where idvoyage like '"+idvoy+"';";
			c.resultset = c.statement.executeQuery(query);
			while(c.resultset.next()) {
				Voyage v = new Voyage();
				v.setIdvoy(c.resultset.getString("idvoyage"));
				v.setNom(c.resultset.getString("nomvoyage"));
				v.setNbrjours(c.resultset.getInt("nbrjours"));
				v.setHeuredep(c.resultset.getString("heuredep"));
				v.setDatedepart(c.resultset.getString("datedep"));
				v.setPlaces(c.resultset.getInt("nbrplaces"));
				v.setPrice(c.resultset.getDouble("prix"));
				v.setIdCir(c.resultset.getInt("idcircuit"));
				vs.add(v);
			}
			 
			return vs;
		}
		
		public ArrayList<Voyage> getAllVoyages() throws SQLException{
			ArrayList<Voyage> voyages = new ArrayList<>();
			String query = "Select * From voyages;";
			c.resultset = c.statement.executeQuery(query);
			
			while(c.resultset.next()) {
				/*String idvoyage = c.resultset.getString("idvoyage");
				//String nomvoyage= c.resultset.getString("nomvoyage");
				int nbrplaces = c.resultset.getInt("nbrplaces");
				double prix = c.resultset.getDouble("prix");
				java.sql.Time heuredep = c.resultset.getTime("heuredep");
				java.sql.Date datedep = c.resultset.getDate("datedep");
				int nbrjour = c.resultset.getInt("nbrjours");**/
				
				int idcircuit = c.resultset.getInt("idcircuit");
				
				Voyage voyage = new Voyage();
				voyage.setIdvoy(c.resultset.getString("idvoyage"));
				voyage.setNom(c.resultset.getString("nomvoyage"));
				voyage.setPlaces(c.resultset.getInt("nbrplaces"));
				voyage.setPrice(c.resultset.getDouble("prix"));
				voyage.setHeuredep(c.resultset.getString("heuredep"));
				voyage.setDatedepart(c.resultset.getString("datedep"));
				voyage.setNbrjours(c.resultset.getInt("nbrjours"));
				voyage.setIdCir(c.resultset.getInt("idcircuit"));
				voyages.add(voyage);
			}
			
			return voyages;
		}
		
		
		public String keyGenVo() throws ClassNotFoundException, SQLException{
			return "voy-"+((int) (Math.random()*9999));
		}
		
		
		public static void main(String[] args) throws SQLException, ClassNotFoundException {
			GestionVoyage gv = new GestionVoyage();
			//System.out.println(gv.getNomberVoyages());
			//Voyage v = new Voyage();
			//System.out.println(gv.chercherVoyage(5).getDist());
			/*ArrayList<Voyage> vs = new ArrayList<>();
			vs = gv.chercherVoyageInternaute("Biskra");
			for(Voyage v : vs) {
				System.out.println(v.toString());
			}*/
			
			Voyage v = new Voyage();
			v.setDist("Batna"); v.setPlaces(4); v.setPrice(2500.00);
			
			//System.out.println(gv.ajouterVoyage(v));
			System.out.println(gv.getVoyagesById("voy-214"));
		}
}
