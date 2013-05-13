package db;

@Entity
@Table (name="fischart")
public class DTOFischart {
	
	@Id
	@GeneratedValue
	@Column (name="id")
	private int id;
	
	@Column (name="bezeichnung")
	private String bezeichnung;

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
	
	

}
