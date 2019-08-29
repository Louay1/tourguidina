package modele;

public class Offre {
	private String idoffre, daredep, datefin, type;
	private double reduction;
	private int idcircuit;
	public Offre() {
		super();
	}
	public String getIdoffre() {
		return idoffre;
	}
	public void setIdoffre(String idoffre) {
		this.idoffre = idoffre;
	}
	public String getDaredep() {
		return daredep;
	}
	public void setDaredep(String daredep) {
		this.daredep = daredep;
	}
	public String getDatefin() {
		return datefin;
	}
	public void setDatefin(String datefin) {
		this.datefin = datefin;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getReduction() {
		return reduction;
	}
	public void setReduction(double reduction) {
		this.reduction = reduction;
	}
	public int getIdcircuit() {
		return idcircuit;
	}
	public void setIdcircuit(int idcircuit) {
		this.idcircuit = idcircuit;
	}
	
	
}
