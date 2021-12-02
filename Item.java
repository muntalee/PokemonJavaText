import java.util.*;
public class Item {
  private int healValue;
  public Item() { 
    healValue = 5;
  }

  public void useHeal(Pokemon p) {
    Random rand = new Random();
    // 10-15 = (5) + 11
    this.healValue = rand.nextInt(5) + 11;
    p.addHealth(healValue);
  }

  public void revive(Pokemon p) {
    if (p.getHealth() == 0) {
      if (p.getRevives() < 3) {
        p.reviving();
      }
      else {
        System.out.println("You cannot revive! (Revived too many)");
      }
    }
    else {
      System.out.println("Revive only works if Pokemon is at health 0");
    }
  }

}
