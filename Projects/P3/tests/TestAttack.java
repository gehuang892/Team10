import java.awt.Color;
import java.io.*;
import junit.framework.*;

public class TestAttack extends TestCase {

  public void testAttack() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    Map map = frame.getMap();

    Ghost ghost1 = frame.addGhost(new Location(6, 11), "name", Color.red);

    // No pacman exists
    assertTrue(ghost1.attack() == false);

    PacMan pacman = frame.addPacMan(new Location(1, 1));

    // Pacman added but is out of range 
    assertTrue(ghost1.attack() == false);
    assertTrue(ghost1.attack() == map.attack("name"));

    Ghost ghost2 = frame.addGhost(new Location(9, 11), "name", Color.red);
    PacMan pacman2 = frame.addPacMan(new Location(9, 12));
    
    // Pacman exists and is within range of newly added ghost2
    assertTrue(ghost2.attack() == true);
    assertTrue(ghost2.attack() == map.attack("name"));
  }
}
