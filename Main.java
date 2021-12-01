import javax.swing.*;
import java.awt.*;

public class Main {
  public static void main(String[] args) {
    // Creating Frame
    JFrame window = new JFrame();
    window.setSize(800,600);
    window.setTitle("Bootleg Pokemon Java Edition");
    window.setResizable(false);
    window.getContentPane().setBackground(Color.white);
    window.setLayout(null);
    window.setVisible(true);

    // Container for window
    Container con = window.getContentPane();

    // Making panel for title
    JPanel title = new JPanel();
    title.setBounds(100, 100, 600, 150);
    title.setBackground(Color.white);

    /* TITLE TEXT */
    // Creating Tile Screen Label
    JLabel titleText = new JLabel("Pokemon Java Edition");
    Font titleFont = new Font("Pokemon Fire Red", Font.PLAIN, 90);
    titleText.setForeground(Color.black);
    titleText.setFont(titleFont);
    // add text to panel
    title.add(titleText);
    // Add title to container
    con.add(title);


    /* START BUTTON */
    // Making panel for start
    JPanel start = new JPanel();
    start.setBounds(300, 400, 200, 100);
    start.setBackground(Color.white);
    JButton startButton = new JButton("Start!");
    startButton.setBackground(Color.white); 
    startButton.setForeground(Color.black);
    start.add(startButton);

    con.add(start);

  }
}
