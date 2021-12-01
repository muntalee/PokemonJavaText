import java.util.*;

public class Player {
  private String name;
  private ArrayList<Pokemon> backpack;

  public Player(String name) {
    this.name = name;
    backpack = new ArrayList<Pokemon>();
  }

  public String getName() {
    return name;
  }

  public int numPokemon() {
    return backpack.size();
  }

  public void addPokemon(Pokemon p) {
    backpack.add(p);
  }

  public void printBackpack() {
    System.out.println(name + "'s Pokemons:");
    for (int i = 0; i < backpack.size(); i++) {
      System.out.println(backpack.get(i));
    }
  }
}
