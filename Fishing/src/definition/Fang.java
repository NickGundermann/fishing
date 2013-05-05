package definition;

import java.sql.Date;
import java.sql.Time;

public class Fang {
	
	/**
	 * Vereinigung aller anderen definiton-classes zum eigentlichen Datenbankobjekt
	 */
	private Fischart fischart;
	private Groesse groesse;
	private Gewaesser gewaesser;
	private	Koeder koeder;
	private Date date;
	private Time time;
	
	
	public Fischart getFischart() {
		return fischart;
	}
	public void setFischart(Fischart fischart) {
		this.fischart = fischart;
	}
	public Groesse getGroesse() {
		return groesse;
	}
	public void setGroesse(Groesse groesse) {
		this.groesse = groesse;
	}
	public Gewaesser getGewaesser() {
		return gewaesser;
	}
	public void setGewaesser(Gewaesser gewaesser) {
		this.gewaesser = gewaesser;
	}
	public Koeder getKoeder() {
		return koeder;
	}
	public void setKoeder(Koeder koeder) {
		this.koeder = koeder;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
}
