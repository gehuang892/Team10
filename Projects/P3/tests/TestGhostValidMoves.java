import java.io.*;
import junit.framework.*;

public class TestGhostValidMoves extends TestCase {

  public void testGhostValidMoves() throws FileNotFoundException {
    Mainframe frame = new MainFrame();
    Ghost ghost1 = frame.addGhost(new Location(1, 1), "test1", Color.red);

    ArrayList<Location> result = ghost.get_valid_moves();
    if (result.size() != 2) {
      fail("Expect 2 possible moves from this location");
    }


    Ghost ghost2 = frame.addGhost(new Location(1, 3), "test2", Color.red);

    result = ghost2.get_valid_moves();
    if (result.size() != 3) {
      fail("Expect 2 possible moves from this location");
    }
  }
}
