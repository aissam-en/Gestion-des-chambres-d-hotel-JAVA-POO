package voyage;

import java.io.Serializable;
@SuppressWarnings("serial")

public class HotelBooking implements Serializable {
	//Attributes:
	private int nombreRoom;
	private Date Start;
	private Date End;
	private int nombreNight;
	private String roomType;
	private boolean Smoking;
	
	
	//Constructeurs:
	HotelBooking() {
		nombreRoom = 0;
		Start = new Date();
		End = new Date();
		nombreNight = 0;
		roomType = "";
		Smoking = true;
	}
	HotelBooking(int _numeroRoom, Date start, Date end, String _roomType, boolean smoking) {
		nombreRoom = _numeroRoom;
		Start = start;
		End = end;
		setNombreNight();
		roomType = _roomType;
		Smoking = smoking;
	}
		
	
	//Getters et Setters:
	public int getNombreRoom() { return nombreRoom; }
	public void setNombreRoom(int nombreRoom) { this.nombreRoom = nombreRoom; }
	
	public Date getStart() { return Start; }
	public void setStart(Date start) { Start = start; }
	
	public Date getEnd() { return End; }
	public void setEnd(Date end) { End = end; }
	
	public int getNombreNight() { return nombreNight; }
	public void setNombreNight(int nombreNight) { this.nombreNight = nombreNight; }
	public void setNombreNight() {
		int e = this.End.getAnnee()*360 // 1 Mois ~= 30 Jours  ====>  1 Annee ~= 12*30 = 360 Jours
				+ this.End.getMois()*30
				+ this.End.getJour();
		
		int s = this.Start.getAnnee()*360
				+ this.Start.getMois()*30
				+ this.Start.getJour();
		
		this.nombreNight = e-s+1;
	}
	
	public String getRoomType() { return roomType; }
	public void setRoomType(String roomType) { this.roomType = roomType; }
	
	public boolean isSmoking() { return Smoking; }
	public void setSmoking(boolean smoking) { Smoking = smoking; }
	
	
	//methode toString()
	public String toString() {
		return "Les information de la Reservation de l Hotel : \n\tNombre de chambres: " + nombreRoom + "\n\tJour de depart: " + Start 
				+ "\n\tJour de fin: " + End + "\n\tNombre de nuits: "
				+ nombreNight + "\n\tType de chambres: " + roomType + "\n\tFumer? : " + Smoking + "\n";
	}
	
	
	
	
	
	
	
	
	
	
	
	///<<Enumeration>> RoomType :
	/*
	public enum RoomType{
		SINGLE,DOUBLE,FAMILY;
	}
	*/

}