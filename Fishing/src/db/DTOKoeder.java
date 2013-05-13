package db;

public class DTOKoeder {

	@Id
	@GeneratedValue
	@Column (name="id")
	private int id;
	
	@Column (name="bezeichnung")
	private int bezeichnung;
	
	@Column (name="firma")
	private int firmenId;
	
	@Column (name="art")
	private int artId;
}
