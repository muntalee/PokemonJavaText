public class Pokemon {
	private String name;
	private int maxHealth;
	private int health;
	private String type;

	public Pokemon(String name, String type, int maxHealth) {
		this.name = name;
		this.type = type;
		this.maxHealth = maxHealth;
		health = maxHealth;
	}


	
	public String toString() {
		return name + " (" + type + ")\t" + health + "/" + maxHealth + "hp";
	}
}
