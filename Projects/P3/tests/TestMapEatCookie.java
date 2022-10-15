import java.io.*;
import junit.framework.*;

public class TestMapEatCookie extends TestCase {

  public void testMapEatCookie() throws FileNotFoundException {
    MainFrame frame = new MainFrame();
    Map m = frame.getMap();

    assertTrue(m.eatCookie("test") == null);

    PacMan pacman = frame.addPacMan(new Location(1,1));
     assertTrue(m.eatCookie("pacman") != null);
  }
}
