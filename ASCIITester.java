import java.io.FileNotFoundException;

public class ASCIITester {
  public static void main(String[] args) throws FileNotFoundException {
    Pokedex p = new Pokedex();
    ASCIIGenerator ascii = new ASCIIGenerator();
    String pikachu = ascii.getASCIIofPokemon(p.getPokemon("pikachu"));
    System.out.println(pikachu);
  }
  
}
