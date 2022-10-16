import java.io.*;
import junit.framework.*;

public class TestMapEatCookie extends TestCase {

  public void testMapEatCookie() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    Map m = frame.getMap();

    // Try to eat an unknown cookie, expect null since no Cookie should exist
    assertTrue(m.eatCookie("test") == null);

    // a Cookie already exists at Location (1,1), so placing Pacman at this location should return a cookie
    PacMan pacman = frame.addPacMan(new Location(1,1));
    assertTrue(m.eatCookie("pacman") != null);
  }
}
