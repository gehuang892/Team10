import java.io.*;
import junit.framework.*;

public class TestPacManMove extends TestCase {

  public void testPacManMove() throws FileNotFoundException {
	  Map m = new Map(30);
	  m.add("pacman", new Location(9, 11), new PacManComponent (9, 11, 2), Map.Type.PACMAN);
	  PacMan p = new PacMan("pacman", new Location(9, 11), m);
	  assertTrue(p.move() == false);
	  m.add("cookie", new Location(9, 12), new CookieComponent (9, 12, 2), Map.Type.COOKIE);
	  assertTrue(p.move() == true);
  }
}
