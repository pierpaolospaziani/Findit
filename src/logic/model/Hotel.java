package logic.model;

public class Hotel {
	
	private String name;
	private String owner;
	private String type;
	private String city;
	private String address;
	private String rooms;  // qui non va bene dovrei avere un vector di istanze
	private String agenda;  //
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getRooms() {
		return rooms;
	}
	
	public void setRooms(String rooms) {
		this.rooms = rooms;
	}
	
	public String getAgenda() {
		return agenda;
	}
	
	public void setAgenda(String agenda) {
		this.agenda = agenda;
	}
}
