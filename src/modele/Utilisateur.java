package modele;

public class Utilisateur {
	private String idUsr;
	private String nom,email,motPasse,phone,sexe, prenom, image, address, birthdate;
	private int ville;
	
	
	public Utilisateur() {
		super();
	}
	
	public String getIdUsr() {
		return idUsr;
	}
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setIdUsr(String i) {
		this.idUsr = i;
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

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public int getVille() {
		return ville;
	}

	public void setVille(int ville) {
		this.ville = ville;
	}
}
