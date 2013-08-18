package db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table ( name = "koederart" )
public class DTOArt {
	
	@Id
	@Column (name="koederart")
	private String koederart;
	
	
	public String getBezeichnung() {
		return koederart;
	}

	public void setBezeichnung(String id) {
		this.koederart = id;
	}

	

}
