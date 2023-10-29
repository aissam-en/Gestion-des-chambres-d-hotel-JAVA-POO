package voyage;

import java.io.Serializable;
@SuppressWarnings("serial")

public class PlaneTicket implements Serializable {
	//Attribute:
	private String Reference;


	//Constructeurs:
	PlaneTicket() { Reference = ""; }
	PlaneTicket(String reference) { Reference = reference; }
	
	
	//Getters et Setters:
	public String getReference() { return Reference; }
	public void setReference(String reference) { Reference = reference; }
		
	
	//metode toString()
	public String toString() {
		return "Les informations de la Billet d Avion : \n\tReference de l'avion: " + Reference + "\n";
	}
}
