package modele;

public class Utilisateur {
	private int idUsr;
	private String nom,email,motPasse,phone,sexe;
	
	public Utilisateur() {
		super();
	}
	
	public int getIdUsr() {
		return idUsr;
	}
	public void setIdUsr(int idUsr) {
		this.idUsr = idUsr;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMotPasse() {
		return motPasse;
	}
	public void setMotPasse(String motPasse) {
		this.motPasse = motPasse;
	}
	
	public String getNumTlphn() {
		return phone;
	}
	public void setNumTlphn(String phone) {
		this.phone = phone;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
}
