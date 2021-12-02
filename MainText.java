public class MainText {
  public static void main(String[] args) {
    Pokedex pokedex = new Pokedex();
    Player p1 = new Player("Player 1");
    Player p2 = new Player("Player 2");
    p1.addPokemon(pokedex.getPokemon("Pikachu"));
    p1.addPokemon(pokedex.getPokemon("Bulbasaur"));
    p2.addPokemon(pokedex.getPokemon("Eevee"));
    p2.addPokemon(pokedex.getPokemon("Squirtle"));
    Battle testBattle = new Battle(p1.throwOut("Pikachu"), p2.throwOut("Eevee"));
    testBattle.startBattle();
  }
}
