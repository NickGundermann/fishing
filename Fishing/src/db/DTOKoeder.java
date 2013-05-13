package db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="koeder")
public class DTOKoeder {

	@Id
	@Column (name="bezeichnung")
	private int bezeichnung;
	
	@Column (name="firma")
	private int firmenId;
	
	@Column (name="art")
	private int artId;

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
