package voyage;

import java.io.Serializable;
import java.util.ArrayList;
@SuppressWarnings("serial")

public class Client implements Serializable {
	//Attributes:
	private String Nom;
	private int Id;
	private String Adresse;
	
	
	//Constructeurs:
	Client() {
		Nom = "";
		Id = 0;
		Adresse = "";
	}
	Client(String nom, int id, String adresse) {
		Nom = nom;
		Id = id;
		Adresse = adresse;
	}

	
	//Getters et Setters:
	public String getNom() { return Nom; }
	public void setNom(String nom) { Nom = nom; }

	public int getId() { return Id; }
	public void setId(int id) { Id = id; }

	public String getAdresse() { return Adresse; }
	public void setAdresse(String adresse) { Adresse = adresse; }

	
	//-------------------------------------------------------------------//
	protected ArrayList<Stay> client = new ArrayList<>();;
	public ArrayList<Stay> getStayClient() { return client; }
	public void addStayClient(Stay subject) { this.client.add(subject); }
	
	protected ArrayList<Stay> guest = new ArrayList<>();;
	public ArrayList<Stay> getStayGuest() { return guest; }
	public void addStayGuest(Stay stay) { this.guest.add(stay); }
	
	protected ArrayList <PlaneTicket> travel_document = new ArrayList<>();;
	public ArrayList<PlaneTicket> getTravel_document() { return travel_document; }
	public void addTravel_document(PlaneTicket travel_document) { this.travel_document.add(travel_document); }
	
	protected ArrayList <HotelBooking> reservedClientHotel = new ArrayList<>();;
	public ArrayList<HotelBooking> getReservedClientHotel() { return reservedClientHotel; }
	public void addReservedClientHotel(HotelBooking reserved) { this.reservedClientHotel.add(reserved); }
	
	
	//methode toString()
	public String toString(int i) {
		return "Les information du client N"+(i+1)+": "+" \n\tNom: "+this.getNom()+"\n\tId: "+this.getId()+"\n\tAdresse: "
	            +this.getAdresse()+"\n"+this.travel_document.get(0).toString()+this.reservedClientHotel.get(0).toString()+"\n";
	}

}
