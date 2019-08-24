package modele;

public class Agent extends Utilisateur {
	private String idagent, scode, villen;

	public Agent() {
		super();
	}

	public String getIdagent() {
		return idagent;
	}

	public void setIdagent(String idagent) {
		this.idagent = idagent;
	}

	public String getScode() {
		return scode;
	}

	public void setScode(String scode) {
		this.scode = scode;
	}

	public String getVillen() {
		return villen;
	}

	public void setVillen(String villen) {
		this.villen = villen;
	}
}
