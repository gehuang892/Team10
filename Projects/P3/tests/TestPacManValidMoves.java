import java.io.*;
import java.util.ArrayList;

import junit.framework.*;

public class TestPacManValidMoves extends TestCase {

  public void testPacManValidMoves() throws FileNotFoundException {
    NoFrame frame = new NoFrame();

    PacMan pacMan = frame.addPacMan(new Location(1, 1));
    ArrayList<Location> result = pacMan.get_valid_moves();
    assertTrue(result.size() == 2);


    PacMan pacMan2 = frame.addPacMan(new Location(1, 3));
    result = pacMan2.get_valid_moves();
    assertTrue(result.size() == 3);

    PacMan pacMan3 = frame.addPacMan(new Location(0, 0));
    result = pacMan3.get_valid_moves();
    assertTrue(result.size() == 0);
  }
}
