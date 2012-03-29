package fr.univaix.iut.cas2.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@IdClass(OccuperId.class)
public class Occuper implements Serializable {
	private static final long serialVersionUID = -817912719333394936L;

	@Id
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	
	@Id
	@ManyToOne
	private Resident resident;
	
	@Id
	@ManyToOne	
	private Emplacement emplacement;
	
    private int duree;
    
	public Occuper() {
	}

	public Occuper(Date dateDebut, Resident resident, Emplacement emplacement) {
		this.dateDebut = dateDebut;
		this.resident = resident;
		this.emplacement = emplacement;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public Resident getResident() {
		return resident;
	}

	public Emplacement getEmplacement() {
		return emplacement;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}
}

