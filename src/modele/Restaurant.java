package modele;

public class Restaurant extends Service{
	private int stars;
	private String idRest;
	public Restaurant() {
		super();
	}

	public String getIdRest() {
		return idRest;
	}

	public void setIdRest(String idRest) {
		this.idRest = idRest;
	}

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}


}
