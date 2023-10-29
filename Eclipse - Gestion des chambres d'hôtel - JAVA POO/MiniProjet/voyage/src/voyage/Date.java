package voyage;

import java.io.Serializable;
@SuppressWarnings("serial")

public class Date implements Serializable {
	//Attributes:
	private int Jour;
	private int Mois;
	private int Annee;
	
	
	//Constructeurs:
	Date() {
		Jour = 0;
		Mois = 0;
		Annee = 0;
	}
	Date(int jour, int mois, int annee) {
		Jour = jour;
		Mois = mois;
		Annee = annee;
	}
		
	
	//Getters et Setters: //Pas Importants
	public int getJour() { return Jour; }
	public void setJour(int jour) { Jour = jour; }
	
	public int getMois() { return Mois; }
	public void setMois(int mois) { Mois = mois; }

	public int getAnnee() { return Annee; }
	public void setAnnee(int annee) { Annee = annee; }
	
		
	//methode toString()
	public String toString() { return Jour + "/" + Mois + "/" + Annee; }
		
		
	
		
}
