package logic.model;


public class Restaurant {

	private String name;
	private String owner; // questo deve essere un riferimento a istanza di classe utente proprietario
	private String type; // mettiamo qui il tipo o serie di attributi booleani
	private String city;
	private String address;
	private int rating;
	private int budget;
	private boolean pizza;
	private boolean sushi;
	private boolean hamburgher;
	private boolean pasta;
	private boolean meat;
	private boolean vegan;
	private boolean fish;
	private boolean gourmet;
	
	public Restaurant() {
		
	}
	
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
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	public boolean isPizza() {
		return pizza;
	}
	public void setPizza(boolean pizza) {
		this.pizza = pizza;
	}
	public boolean isSushi() {
		return sushi;
	}
	public void setSushi(boolean sushi) {
		this.sushi = sushi;
	}
	public boolean isHamburgher() {
		return hamburgher;
	}
	public void setHamburgher(boolean hamburgher) {
		this.hamburgher = hamburgher;
	}
	public boolean isPasta() {
		return pasta;
	}
	public void setPasta(boolean pasta) {
		this.pasta = pasta;
	}
	public boolean isMeat() {
		return meat;
	}
	public void setMeat(boolean meat) {
		this.meat = meat;
	}
	public boolean isVegan() {
		return vegan;
	}
	public void setVegan(boolean vegan) {
		this.vegan = vegan;
	}
	public boolean isFish() {
		return fish;
	}
	public void setFish(boolean fish) {
		this.fish = fish;
	}
	public boolean isGourmet() {
		return gourmet;
	}
	public void setGourmet(boolean gourmet) {
		this.gourmet = gourmet;
	}
}
