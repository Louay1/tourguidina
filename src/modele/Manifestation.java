package modele;

public class Manifestation {
	private String idmanifest, nommanifest, address, image, heure, heurefin, datefin, idservic, idvoy;
	private int nbrjour, idville;
	private double fees;
	public Manifestation() {
		super();
	}
	public String getIdmanifest() {
		return idmanifest;
	}
	public void setIdmanifest(String idmanifest) {
		this.idmanifest = idmanifest;
	}
	public String getNommanifest() {
		return nommanifest;
	}
	public void setNommanifest(String nommanifest) {
		this.nommanifest = nommanifest;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getHeure() {
		return heure;
	}
	public void setHeure(String heure) {
		this.heure = heure;
	}
	public String getHeurefin() {
		return heurefin;
	}
	public void setHeurefin(String heurefin) {
		this.heurefin = heurefin;
	}
	public String getDatefin() {
		return datefin;
	}
	public void setDatefin(String datefin) {
		this.datefin = datefin;
	}
	public String getIdservic() {
		return idservic;
	}
	public void setIdservic(String idservic) {
		this.idservic = idservic;
	}
	public String getIdvoy() {
		return idvoy;
	}
	public void setIdvoy(String idvoy) {
		this.idvoy = idvoy;
	}
	public int getNbrjour() {
		return nbrjour;
	}
	public void setNbrjour(int nbrjour) {
		this.nbrjour = nbrjour;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public int getIdville() {
		return idville;
	}
	public void setIdville(int idville) {
		this.idville = idville;
	}
	
	
}
