import java.util.*;
import java.io.*;
public class ASCIIGenerator {
  public ASCIIGenerator() {

  }
  public String getASCIIofPokemon(Pokemon p) throws FileNotFoundException {
    String str = "";
    String pokemon = p.getName().toLowerCase();
    String filename = "assets/pokemon/" + pokemon + ".txt";
    Scanner file = new Scanner(new File(filename));
    while (file.hasNextLine()) {
      str += file.nextLine() + "\n";
    }
    return str;
  }
}
