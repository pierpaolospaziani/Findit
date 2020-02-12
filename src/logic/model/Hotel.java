package logic.model;

public class Hotel {
	
	private String name;
	private String owner;
	private String address;
	private String rooms;  // qui non va bene dovrei avere un vector di istanze
	private String agenda;  //
	
	public String getName() {
		return name;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getRooms() {
		return rooms;
	}
	
	public String getAgenda() {
		return agenda;
	}
}
