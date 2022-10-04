import java.awt.*;
import java.io.*;
import junit.framework.*;

public class TestPacManInRange extends TestCase {

  public void testPacManInRange() throws FileNotFoundException {
    NoFrame frame = new NoFrame();

    Ghost ghost = frame.addGhost(new Location(5, 6), "name", Color.red);

    // Expect no ghost in range -> false
    if (ghost.is_pacman_in_range() == true) {
      fail("Expected false since a PacMan should not be within range");
    }

    PacMan pacman = frame.addPacMan(new Location(5, 5));

    // Expect for a ghost to be in range -> true
    if (ghost.is_pacman_in_range() == false) {
      fail("Expected true since a PacMan should be within range");
    }
  }
}
