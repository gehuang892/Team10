import java.io.*;
import junit.framework.*;
import java.util.ArrayList;
import java.awt.Color;

public class TestGhostValidMoves extends TestCase {

  public void testGhostValidMoves() throws FileNotFoundException {
    NoFrame frame = new NoFrame();

    // Based on the preset map values, if we start the ghost at position (1,1),
    // the ghost can only move one step to the right or down based on the preset wall values. 
    Ghost ghost1 = frame.addGhost(new Location(1, 1), "test1", Color.red);

    ArrayList<Location> result = ghost1.get_valid_moves();
    assertTrue(result.size() == 2);


    // Similarly to the last assertion, the ghost at this postion can move up, down, or right.
    Ghost ghost2 = frame.addGhost(new Location(1, 3), "test2", Color.red);

    result = ghost2.get_valid_moves();

    assertTrue(result.size() == 3);

    // At position 0,0, the ghost is surrounded by walls (up, down, left, right) thus no valid moves.
    Ghost ghost3 = frame.addGhost(new Location(0, 0), "test3", Color.red);

    result = ghost3.get_valid_moves();

    assertTrue(result.size() == 0);
  }
}
