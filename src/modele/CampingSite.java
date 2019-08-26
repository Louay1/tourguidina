package modele;

public class CampingSite extends Service{
	private String idCS; 
	private int capacity;
	private double area;

	public CampingSite() {
		super();
	}

	public String getIdCS() {
		return idCS;
	}

	public void setIdCS(String idCS) {
		this.idCS = idCS;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
}
