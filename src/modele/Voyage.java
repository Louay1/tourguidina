package modele;

import java.sql.Date;

public class Voyage {
	private int places, nbrjours;
	private double price;
	private Date datedepart;
	private String dist, nom, idvoy, heuredep;
	public Voyage() {
		super();
	}

	public int getNbrjours() {
		return nbrjours;
	}

	public void setNbrjours(int nbrjours) {
		this.nbrjours = nbrjours;
	}

	public Date getDatedepart() {
		return datedepart;
	}

	public void setDatedepart(Date datedepart) {
		this.datedepart = datedepart;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getIdvoy() {
		return idvoy;
	}

	public void setIdvoy(String idvoy) {
		this.idvoy = idvoy;
	}

	public String getHeuredep() {
		return heuredep;
	}

	public void setHeuredep(String heuredep) {
		this.heuredep = heuredep;
	}

	public int getPlaces() {
		return places;
	}
	public void setPlaces(int places) {
		this.places = places;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	
	public String toString() {
		return "Id = "+idvoy+" Dist = "+dist+" Price = "+price+" Places Av = "+places;
	}
}
