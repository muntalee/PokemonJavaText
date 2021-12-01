import java.util.ArrayList;

public class Pokemon {
	private String name;
	private int maxHealth;
	private int health;
	private String type;
	private int damage;
	private int defense;
	private ArrayList<Attack> attack;

	public Pokemon(String name, String type, int maxHealth, int damage, int defense) {
		this.name = name;
		this.type = type;
		this.maxHealth = maxHealth;
		health = maxHealth;
		this.damage = damage;
		this.defense = defense;
		attack =  new ArrayList<Attack>();
	}

	public String getName() {
		return name;
	}

	public Attack getAttack(String name) {
    for (int i = 0; i < attack.size(); i++) {
      if (attack.get(i).getName().equals(name)) {
				return attack.get(i);
      }
    }
    return null;
	}

	public void addMoveSet(ArrayList<Attack> attack) {
		this.attack = attack;
	}

	public String toString() {
		return name + " (" + type + ")\t" + health + "/" + maxHealth + "hp\nDMG: " + damage + "\nDEF: " + defense; 
	}
}
