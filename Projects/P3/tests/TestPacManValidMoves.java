import java.io.*;
import java.util.ArrayList;

import junit.framework.*;

public class TestPacManValidMoves extends TestCase {

  public void testPacManValidMoves() throws FileNotFoundException {
    MainFrame frame = new MainFrame();
    PacMan pacMan = frame.addPacMan(new Location(1, 1));

    ArrayList<Location> result = pacMan.get_valid_moves();
    if (result.size() != 2) {
      fail("Expect 2 possible moves from this location");
    }


    PacMan pacMan2 = frame.addPacMan(new Location(1, 3));

    result = pacMan2.get_valid_moves();
    if (result.size() != 3) {
      fail("Expect 2 possible moves from this location");
    }
  }
}
