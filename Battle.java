import java.util.*;

public class Battle {

  private Player player1;
  private Player player2;
  private boolean isPlayer1Turn;

  public Battle(Player player1, Player player2) {
    this.player1 = player1;
    this.player2 = player2;
    isPlayer1Turn = true;
  }

  public void startBattle(Pokemon p1, Pokemon p2) {
    Scanner in = new Scanner(System.in);
    String option;
    int turns = 0;
    System.out.println("Here are the Pokemons: ");
    System.out.println();
    System.out.println(p1.getName() + " and " + p2.getName());
    System.out.println();
    System.out.println(p1.toString());
    System.out.println(p2.toString());
    System.out.println("BATTLE STARTS NOW");
    System.out.println("Enter the option on prompt");
    System.out.println();
    while (true) {
      System.out.println(p1.displayHealth());
      System.out.println(p2.displayHealth());
      if (p1.getHealth() <= 0) {
        System.out.println(p1.getName() + "'s health is 0!");
        System.out.println(p2.getName() + " is the winner!");
        break;
      } else if (p2.getHealth() <= 0) {
        System.out.println(p2.getName() + "'s health is 0!");
        System.out.println(p1.getName() + " is the winner!");
        break;
      }
      if (turns % 2 == 0) {
        System.out.println(p1.getName() + "'s Turn");
      } else {
        System.out.println(p2.getName() + "'s Turn");
      }
      System.out.println("[ FIGHT ] | [ POKEMON] | [ RUN ]");
      System.out.print("> ");
      option = in.next();
      System.out.println();
      if (option.toLowerCase().equals("run")) {
        System.out.println("You ran away!");
        break;
      } else if (option.toLowerCase().equals("fight")) {
        if (turns % 2 == 0) {
          p1.printAttacks();
        } else {
          p2.printAttacks();
        }
        System.out.print("> ");
        String attack = in.next();
        if (turns % 2 == 0) {
          p1.attack(p2, p1.getAttack(attack));
        } else {
          p2.attack(p1, p2.getAttack(attack));
        }
        turns++;
      } else if (option.toLowerCase().equals("pokemon")) {
        System.out.println("Select a Pokemon: ");
        if (this.isPlayer1Turn) {
          player1.printBackpackBattle();
        } else {
          player2.printBackpackBattle();
        }
        System.out.print("> ");
        String selectedPokemon = in.next();
        if (this.isPlayer1Turn) {
          this.isPlayer1Turn = false;
          startBattle(p2, player1.throwOut(selectedPokemon));
          return;
        } 
        else {
          this.isPlayer1Turn = true;
          startBattle(p1, player2.throwOut(selectedPokemon));
          return;
        }
      }
      System.out.println();
    }
  }
}
