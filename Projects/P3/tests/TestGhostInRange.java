import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestGhostInRange extends TestCase {

  public void testGhostInRange() throws FileNotFoundException {
    
    NoFrame frame = new NoFrame();

    PacMan pacman = frame.addPacMan(new Location(5, 6));

    // With an empty frame and no ghosts initialized, we should expect no ghost nearby.
    assertFalse(pacman.is_ghost_in_range());

    // After adding a ghost 
    Ghost ghost = frame.addGhost(new Location(5, 5), "name", Color.red);

    // Expect for a ghost to be in range -> true
    assertTrue(pacman.is_ghost_in_range());

  }
}
