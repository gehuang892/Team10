import java.io.*;
import junit.framework.*;

public class TestGhostInRange extends TestCase {

  public void testGhostInRange() throws FileNotFoundException {
    
    NoFrame frame = new NoFrame();

    PacMan pacman = frame.addPacMan(new Location(5, 6));

    // Expect no ghost in range -> false
    if (pacman.is_ghost_in_range() == true) {
      fail("Expected false since a ghost should not be within range");
    }

    Ghost ghost = frame.addGhost(new Location(5, 5), "name", Color.red);

    // Expect for a ghost to be in range -> true
    if (pacman.is_ghost_in_range() == false) {
     fail("Expected true since a ghost should be within range");
    }
  }
}
