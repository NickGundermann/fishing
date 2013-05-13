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
	@Column (name="id")
	private int id;
	
	@Column (name="bezeichnung")
	private String bezeichnung;
	
	@Column (name="groesse(ha)")
	private Double groesse;
	
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

	public Double getGroesse() {
		return groesse;
	}

	public void setGroesse(Double groesse) {
		this.groesse = groesse;
	}

	public String getLage() {
		return lage;
	}

	public void setLage(String lage) {
		this.lage = lage;
	}
	
	
}
