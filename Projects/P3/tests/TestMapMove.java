import java.io.*;
import junit.framework.*;

public class TestMapMove extends TestCase {

  public void testMapMove() throws FileNotFoundException {
    MainFrame frame = new MainFrame();
    Map m = frame.getMap();

    Location loc = new Location(1,1);
    assertTrue(m.move("pacman", loc, Map.Type.PACMAN));
    assertFalse(m.move("wall", loc, Map.Type.PACMAN));
  }
}
