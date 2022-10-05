import java.io.*;
import junit.framework.*;

public class TestMapGetLoc extends TestCase {

  public void testMapGetLoc() throws FileNotFoundException {
	  Map m = new Map(30);
	  assertTrue(m.getLoc(new Location(9, 11)) == null);
	  m.add("cookie", new Location(9, 11), new CookieComponent (9, 11, 2), Map.Type.COOKIE);
	  assertTrue(m.getLoc(new Location(9, 11)).toString().equals("[COOKIE]"));
	  m.add("wall", new Location(9, 12), new WallComponent (9, 12, 2), Map.Type.WALL);
	  assertTrue(m.getLoc(new Location(9, 12)).toString().equals("[WALL]"));
  }
}
