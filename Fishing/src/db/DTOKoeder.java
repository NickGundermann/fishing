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
	private String bezeichnung;
	
	@Column (name="firma")
	@ForeignKey(name = "firmen")
	private String firmenId;
	
	@Column (name="fischart")
	@ForeignKey(name = "fischart") 
	private String artId;
	
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

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public String getFirmenId() {
		return firmenId;
	}

	public void setFirmenId(String firmenId) {
		this.firmenId = firmenId;
	}

	public String getArtId() {
		return artId;
	}

	public void setArtId(String string) {
		this.artId = string;
	}
	
	
}
