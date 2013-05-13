package db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "fang")
public class DTOFang {

	@Id
	@GeneratedValue
	@Column (name = "id")
	private int id;
	
	@Column (name = "art")
	private String fischartId;
	
	@Column (name = "groesse(cm)")
	private double groesse;
	
	@Column ( name = "koeder")
	private String koeder;
	
	@Column ( name = "date")
	private String date;
	
	@Column ( name = "time")
	private String time;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getArt() {
		return fischartId;
	}

	public void setArt(String art) {
		this.fischartId = art;
	}

	public double getGroesse() {
		return groesse;
	}

	public void setGroesse(double groesse) {
		this.groesse = groesse;
	}

	public String getKoeder() {
		return koeder;
	}

	public void setKoeder(String koeder) {
		this.koeder = koeder;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	
}
