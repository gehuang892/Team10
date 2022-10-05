import java.io.*;
import junit.framework.*;

public class TestGhostMove extends TestCase {

  public void testGhostMove() throws FileNotFoundException {
	  Map m = new Map(30);
	  m.add("ghost", new Location(9, 11), new GhostComponent (9, 11, 2), Map.Type.GHOST);
	  Ghost g = new Ghost("ghost", new Location(9, 11), m);
	  assertTrue(g.move() == false);
	  m.add("cookie", new Location(9, 12), new CookieComponent (9, 12, 2), Map.Type.COOKIE);
	  assertTrue(g.move() == true);
  }
}
