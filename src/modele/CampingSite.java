package modele;

public class CampingSite extends Service{
	private int idCS, capacity;

	public CampingSite() {
		super();
	}

	public int getIdCS() {
		return idCS;
	}

	public void setIdCS(int idCS) {
		this.idCS = idCS;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}
