import java.awt.Color;
import java.io.*;
import junit.framework.*;

public class TestAttack extends TestCase {

  public void testAttack() throws FileNotFoundException {
    MainFrame frame = new MainFrame();
    Map map = frame.getMap();

    Ghost ghost1 = frame.addGhost(new Location(9, 11), "name", Color.red);

    // No pacman exists
    assertTrue(ghost1.attack() == false);

    PacMan pacman = frame.addPacMan(new Location(1, 1));

    // Pacman out of range 
    assertTrue(ghost1.attack() == false);
    assertTrue(ghost1.attack() == map.attack("name"));

    PacMan pacman2 = frame.addPacMan(new Location(9, 12));
    
    // Pacman exists and is within range
    assertTrue(ghost1.attack() == true);
    assertTrue(ghost1.attack() == map.attack("name"));
  }
}
