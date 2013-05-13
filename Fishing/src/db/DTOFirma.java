package db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="firmen")
public class DTOFirma {
	
	@Id
	@GeneratedValue
	@Column (name="id")
	private int id;
	
	@Column (name="name")
	private String firmenname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirmenname() {
		return firmenname;
	}

	public void setFirmenname(String firmenname) {
		this.firmenname = firmenname;
	}
	
	
}
