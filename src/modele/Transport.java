package modele;

public class Transport extends Service{
	private int idTransport;
	private String type, departCity, arrCity;
	public Transport() {
		super();
	}
	public int getId() {
		return idTransport;
	}
	public void setId(int id) {
		this.idTransport = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDepartCity() {
		return departCity;
	}
	public void setDepartCity(String departCity) {
		this.departCity = departCity;
	}
	public String getArrCity() {
		return arrCity;
	}
	public void setArrCity(String arrCity) {
		this.arrCity = arrCity;
	}
	
}
