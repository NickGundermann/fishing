package db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table (name="koeder")
public class DTOKoeder {

	@Id
	@Column (name="bezeichnung")
	private int bezeichnung;
	
	@Column (name="firma")
	@ForeignKey(name = "firmen")
	private int firmenId;
	
	@Column (name="fischart")
	@ForeignKey(name = "fischart") 
	private int artId;
	
	@Column (name="groesse(cm)")
	private double groesse;
	
	@Column (name="gewicht(g)")
	private double gewicht;


	public double getGroesse() {
		return groesse;
	}

	public void setGroesse(double groesse) {
		this.groesse = groesse;
	}

	public double getGewicht() {
		return gewicht;
	}

	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}

	public int getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(int bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public int getFirmenId() {
		return firmenId;
	}

	public void setFirmenId(int firmenId) {
		this.firmenId = firmenId;
	}

	public int getArtId() {
		return artId;
	}

	public void setArtId(int artId) {
		this.artId = artId;
	}
	
	
}
