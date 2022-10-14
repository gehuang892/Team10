import java.io.*;
import junit.framework.*;
import java.util.ArrayList;
import java.awt.Color;

public class TestGhostValidMoves extends TestCase {

  public void testGhostValidMoves() throws FileNotFoundException {
    MainFrame frame = new MainFrame();
    Ghost ghost1 = frame.addGhost(new Location(1, 1), "test1", Color.red);

    ArrayList<Location> result = ghost1.get_valid_moves();
    assertTrue(result.size() == 2);


    Ghost ghost2 = frame.addGhost(new Location(1, 3), "test2", Color.red);

    result = ghost2.get_valid_moves();

    assertTrue(result.size() == 3);
  }
}
