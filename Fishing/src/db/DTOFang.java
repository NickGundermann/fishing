package db;

@Entity
@Table (name = "fang")
public class DTOFang {

	@Id
	@GeneratedValue
	@Column (name = "id")
	private int id;
	
	@Column (name = "art")
	private int fischartId;
	
	@Column (name = "groesse(cm)")
	private double groesse;
	
	@Column ( name = "koeder")
	private int koederId;
	
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

	public int getArt() {
		return fischartId;
	}

	public void setArt(int art) {
		this.fischartId = art;
	}

	public double getGroesse() {
		return groesse;
	}

	public void setGroesse(double groesse) {
		this.groesse = groesse;
	}

	public int getKoeder() {
		return koederId;
	}

	public void setKoeder(int koeder) {
		this.koederId = koeder;
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
