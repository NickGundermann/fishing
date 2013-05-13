package db;

@Entity
@Table ( name = "art" )
public class DTOArt {
	
	@Id
	@GeneratedValue
	@Column (name="id")
	private int id;
	
	@Column (name="groesse(cm)")
	private double groesse;
	
	@Column (name="gewicht(g)")
	private double gewicht;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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
	
	
	

}
