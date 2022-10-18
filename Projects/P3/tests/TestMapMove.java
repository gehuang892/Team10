import java.io.*;
import junit.framework.*;

public class TestMapMove extends TestCase {

  public void testMapMove() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    Map m = frame.getMap();
    Location loc = new Location(9,11);
    m.add("pacman", loc, new PacManComponent (9, 11, 2), Map.Type.PACMAN);
    m.add("wall", new Location(8, 12), new WallComponent (9, 11, 2), Map.Type.WALL);

    Location dest = new Location(9, 12);
    
    assertTrue(m.move("pacman", dest, Map.Type.PACMAN));
    assertFalse(m.move("wall", dest, Map.Type.WALL));
  }
}
