package definition;

public class Koeder {

	
private	 String bezeichnung;
private	 Firma firma;
private Koederart art;
private Groesse groesse;
private Gewicht gewicht;

public Groesse getGroesse() {
	return groesse;
}
public void setGroesse(Groesse groesse) {
	this.groesse = groesse;
}
public Gewicht getGewicht() {
	return gewicht;
}
public void setGewicht(Gewicht gewicht) {
	this.gewicht = gewicht;
}
public String getBezeichnung() {
	return bezeichnung;
}
public void setBezeichnung(String bezeichnung) {
	this.bezeichnung = bezeichnung;
}
public Firma getFirma() {
	return firma;
}
public void setFirma(Firma firma) {
	this.firma = firma;
}
public Koederart getArt() {
	return art;
}
public void setArt(Koederart art) {
	this.art = art;
}
	
	
	
	
	
}
