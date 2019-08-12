package modele;

public class Restaurant extends Service{
	private int idRest, stars;
	private String type;

	public Restaurant() {
		super();
	}

	public int getIdRest() {
		return idRest;
	}

	public void setIdRest(int idRest) {
		this.idRest = idRest;
	}

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
