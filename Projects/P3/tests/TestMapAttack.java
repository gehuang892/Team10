import java.awt.Color;
import junit.framework.*;
import java.io.*;

public class TestMapAttack extends TestCase {

  public void testMapAttack() throws FileNotFoundException {
    MainFrame frame = new MainFrame();
    Map map = frame.getMap();

    PacMan pacman = frame.addPacMan(new Location(1, 1));

    // Ghost with name "name" doesn't exist and shouldn't be able to attack
    assertTrue(map.attack("name") == false);
    assertTrue(map.isGameOver() == false);

    Location loc = new Location(1, 2);

    Ghost ghost1 = frame.addGhost(loc, "name", Color.red);

    assertTrue(map.attack("name") == true);
    assertTrue(map.isGameOver() == true);
  }
}
