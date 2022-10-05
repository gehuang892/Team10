import java.io.*;
import junit.framework.*;

public class TestGhostInRange extends TestCase {

  public void testGhostInRange() throws FileNotFoundException {
    
    NoFrame frame = new NoFrame();

    PacMan pacman = frame.addPacMan(new Location(5, 6));

    // Expect no ghost in range -> false
    assertTrue(pacman.is_ghost_in_range());

    Ghost ghost = frame.addGhost(new Location(5, 5), "name", Color.red);

    // Expect for a ghost to be in range -> true
    assertFalse(pacman.is_ghost_in_range());

  }
}
