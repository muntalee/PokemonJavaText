import java.awt.image.*;
import java.awt.*;

public class Game implements Runnable {

  private Display display;
  public int width, height;
  public String title;

  private Thread thread;
  private boolean running = false;

  private BufferStrategy bs;
  private Graphics g;
  
  private BufferedImage testimage;
  
  public Game(String title, int width, int height) {
    this.width = width;
    this.height = height;
    this.title = title;
  }
  
  private void init() {
    display = new Display(title, width, height);
    testimage = ImageLoader.loadImage("/textures/player/1.png");
  }
  
  private void tick() {
    
  }
  
  private void render() {
    bs = display.getCanvas().getBufferStrategy();
    if (bs == null) {
      display.getCanvas().createBufferStrategy(3);
      return;
    }

    g = bs.getDrawGraphics();
    // Clear Screen 
    g.clearRect(0,0,width,height);
    // Start Drawing
  
    g.drawImage(testimage, 40,40, null);
    
    // End Drawing
    bs.show();
    g.dispose();
  }
  
  public void run() {
    init();

    while (running) {
      tick();
      render();
    }
    
    stop();
  }
  
  public synchronized void start() {
    if (running) {
      return;
    }
    running = true;
    thread = new Thread(this);
    thread.start();
  }

  public synchronized void stop() {
    if (!running) {
      return;
    }
    running = false;
    try {
      thread.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
  
}
