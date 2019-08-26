package modele;

public class Transport extends Service{
	private String idTransport;
	private int nbrplace;
	public Transport() {
		super();
	}
	public String getId() {
		return idTransport;
	}
	public void setId(String id) {
		this.idTransport = id;
	}
	public int getNbrplace() {
		return nbrplace;
	}
	public void setNbrplace(int nbrplace) {
		this.nbrplace = nbrplace;
	}
	
}
