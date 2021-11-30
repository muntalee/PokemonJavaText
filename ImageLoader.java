import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class ImageLoader {
  
  public static BufferedImage loadImage(String path) {
    try {
      return ImageIO.read(ImageLoader.class.getResource(path));
    } catch (IOException e) {
      e.printStackTrace();
      System.exit(1);
    }
    return null;
  }
  
}
