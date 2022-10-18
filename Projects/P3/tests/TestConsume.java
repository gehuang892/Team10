import java.io.*;
import junit.framework.*;

public class TestConsume extends TestCase {

  public void testConsume() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    Map m = frame.getMap();

	  PacMan pacman = frame.addPacMan(new Location(0,0));
  
    // Cookie exists but is not in pacman's current coordinates
    assertTrue(pacman.consume() == null);

    // Cookie exists and is in pacman's current coordinates
    PacMan pacman2 = frame.addPacMan(new Location(1, 1));
   
    assertTrue(m.getLoc(new Location(1, 1)).contains(Map.Type.COOKIE));
    assertTrue(pacman2.consume() != null);
  }
}
