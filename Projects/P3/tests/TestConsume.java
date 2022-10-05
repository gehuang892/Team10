import java.io.*;
import junit.framework.*;

public class TestConsume extends TestCase {

  public void testConsume() throws FileNotFoundException {
    MainFrame frame = new MainFrame();
    Map m = frame.getMap();

    Map m = new Map(30);
	  m.add("pacman", new Location(9, 12), new PacManComponent (9, 12, 20), Map.Type.PACMAN);
	  PacMan pacman = new PacMan("pacman", new Location(9, 12), m);
    
    // No cookie exists
    assertTrue(pacman.consume() == null);
    
    // Cookie exists but is not in pacman's current coordinates
	  m.add("cookie", new Location(9, 10), new CookieComponent (9, 10, 20), Map.Type.COOKIE);
    assertTrue(pacman.consume() == null);

    // Cookie exists and is in pacman's current coordinates
    m.add("cookie", new Location(9, 12), new CookieComponent (9, 12, 20), Map.Type.COOKIE);
    assertTrue(m.getLoc().contains(Map.Type.COOKIE));
    assertTrue(pacman.consume() != null && pacman.consume() == CookieComponent(9, 12, 20));
  }
}
