package modele;

public class Admin extends Utilisateur{
	private String idadmin, scode;

	public Admin() {
		super();
	}

	public String getIdadmin() {
		return idadmin;
	}

	public void setIdadmin(String idadmin) {
		this.idadmin = idadmin;
	}

	public String getScode() {
		return scode;
	}

	public void setScode(String scode) {
		this.scode = scode;
	}
}
