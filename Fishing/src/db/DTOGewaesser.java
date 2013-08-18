	package db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="gewaesser")
public class DTOGewaesser {

	@Id
	@GeneratedValue
	@Column (name="gewaesserid")
	private int id;
	
	@Column (name="bezeichnung")
	private String bezeichnung;
	
	@Column (name="groesse(ha)")
	private double groesse;
	
	@Column (name="lage")
	private String lage;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public double getGroesse() {
		return groesse;
	}

	public void setGroesse(double groesse) {
		this.groesse = groesse;
	}

	public String getLage() {
		return lage;
	}

	public void setLage(String lage) {
		this.lage = lage;
	}
	
	
}
