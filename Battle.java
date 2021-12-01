import javax.swing.*;
import java.awt.*;
public class Battle {
  private Player p1;
	private Player p2;
	public Battle(Player p1, Player p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public void battleStatus() {
		System.out.println("Players Currently in battle: ");
		System.out.println(p1.getName() + ": " + p1.numPokemon() + " pokemon(s)");
		System.out.println(p2.getName() + ": " + p2.numPokemon() + " pokemon(s)");
	}

  public void displayBattle() {
       
  }

}
