package voyage;

import java.io.Serializable;
import java.util.ArrayList;
@SuppressWarnings("serial")

public class Stay implements Serializable {
	//Attributes:
	private Date Start;
	private Date End;
	
	//Constructeurs:
	Stay() {
		Start = new Date();
		End = new Date();
	}
	Stay(Date start, Date end) {
		Start = start;
		End = end;
	}	

	public	void setStay(int i) {
		Start = reservedStayHotel.get(i).getStart();
		End = reservedStayHotel.get(i).getEnd();
	}
	
	
	//Getters et Setters:
	public Date getStart() { return Start; }
	public void setStart(Date start) { Start = start; }
	
	public Date getEnd() { return End; }
	public void setEnd(Date end) { End = end; }
	
	
	//Methodes calculatePrice():
	public void calculatePrice(int i) {
		double price = 0.0;
		String Room = reservedStayHotel.get(i).getRoomType();
		int NombreNight = reservedStayHotel.get(i).getNombreNight();
		int NombreRoom = reservedStayHotel.get(i).getNombreRoom();
		
		if(Room.equals("SINGLE")) price = 200*NombreNight*NombreRoom;
		else if(Room.equals("DOUBLE")) price = 400*NombreNight*NombreRoom;
		else if(Room.equals("FAMILY")) price = 1000*NombreNight*NombreRoom;
		
		System.out.println("\t*********************************"
				         + "\n\t  Votre Prix est: " +price+ "DHs"
			         	 + "\n\t*********************************");
	}
	
	public void calculatePrice() {
		double price = 0.0;
		String Room = reservedStayHotel.get(0).getRoomType();
		int NombreNight = reservedStayHotel.get(0).getNombreNight();
		int NombreRoom = reservedStayHotel.get(0).getNombreRoom();
		
		if(Room.equals("SINGLE")) price = 200*NombreNight*NombreRoom;
		if(Room.equals("DOUBLE")) price = 400*NombreNight*NombreRoom;
		if(Room.equals("FAMILY")) price = 1000*NombreNight*NombreRoom;
				
		System.out.println("\t*********************************"
						 + "\n\t  Votre Prix est: " +price+ "DHs"
						 + "\n\t*********************************");
	}
	

	////-------------------------------------------------------------------////
	protected final ArrayList<PlaneTicket> transport = new ArrayList<>();
	public ArrayList<PlaneTicket> getTransport() { return transport; }
	public void addTransport(PlaneTicket pt) { this.transport.add(pt); }
	
	protected final ArrayList<HotelBooking> reservedStayHotel = new ArrayList<>();
	public ArrayList<HotelBooking> getReservedStayHotel() { return reservedStayHotel; }
	public void addReservedStayHotel(HotelBooking hb) { this.reservedStayHotel.add(hb);}
	
	
	//methode toString()
	public String toString() {
		return "Les information du Sejour \nJour de depart: " + Start + ", Jour de fin:" + End + "\n" + this.reservedStayHotel.get(0).toString() + this.transport.get(0).toString();
	}
}
