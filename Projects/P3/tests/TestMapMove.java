import java.io.*;
import junit.framework.*;

public class TestMapMove extends TestCase {

  public void testMapMove() throws FileNotFoundException {
    Map m = new Map(30);
    Location loc = new Location(9,11);

    m.add("pacman", loc, new PacManComponent (9, 11, 2), Map.Type.PACMAN);
    PacMan pacman = new PacMan("pacman", loc, m);
    Location dest = new Location(9, 12);
    assertTrue(m.move("pacman", dest, Map.Type.PACMAN));
  }
}
