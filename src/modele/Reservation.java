package modele;

import java.sql.Date;
import java.sql.Time;

public class Reservation {
	private int idRes;
	private String idVoy, idCli, idManifest, idSitetou;
	private Date dateDep;
	private Time heureDep;	
	private double prixpaye;
	
	
	public Reservation() {
		super();
	}
	
	public Reservation(int idRes, String idVoy, String idCli, String idManifest, String idSitetou, Date dateDep,
			Time heureDep, double prixpaye) {
		super();
		this.idRes = idRes;
		this.idVoy = idVoy;
		this.idCli = idCli;
		this.idManifest = idManifest;
		this.idSitetou = idSitetou;
		this.dateDep = dateDep;
		this.heureDep = heureDep;
		this.prixpaye = prixpaye;
	}

	public int getIdRes() {
		return idRes;
	}
	public void setIdRes(int i) {
		this.idRes = i;
	}
	public String getIdVoy() {
		return idVoy;
	}
	public void setIdVoy(String idVoy) {
		this.idVoy = idVoy;
	}
	public String getIdCli() {
		return idCli;
	}
	public void setIdCli(String idCli) {
		this.idCli = idCli;
	}
	public Date getDateDep() {
		return dateDep;
	}
	public void setDateDep(Date dateDep) {
		this.dateDep = dateDep;
	}
	public Time getHeureDep() {
		return heureDep;
	}
	public void setHeureDep(Time heureDep) {
		this.heureDep = heureDep;
	}
	public double getPrixpaye() {
		return prixpaye;
	}
	public void setPrixpaye(double prixpaye) {
		this.prixpaye = prixpaye;
	}


	public String getIdManifest() {
		return idManifest;
	}


	public void setIdManifest(String idManifest) {
		this.idManifest = idManifest;
	}


	public String getIdSitetou() {
		return idSitetou;
	}


	public void setIdSitetou(String idSitetou) {
		this.idSitetou = idSitetou;
	}
	
	
	
}
