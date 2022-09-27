import java.util.ArrayList;
import javax.swing.JComponent;

public class PacMan {
  String myName;
  Location myLoc;
  Map myMap;
  Location shift;

  public PacMan(String name, Location loc, Map map) {
    this.myLoc = loc;
    this.myName = name;
    this.myMap = map;
  }

  public ArrayList<Location> get_valid_moves() {
    ArrayList<Location> validMoves = new ArrayList<>();
    int x = myLoc.x;
    int y = myLoc.y;

    Location left = new Location(x - 1, y);
    Location right = new Location(x + 1, y);
    Location below = new Location(x, y - 1);
    Location above = new Location(x, y + 1);

    if (myMap.getLoc(below) != null && !myMap.getLoc(below).contains(Map.Type.WALL)) {
      validMoves.add(below);
    }

    if (myMap.getLoc(above) != null && !myMap.getLoc(above).contains(Map.Type.WALL)) {
      validMoves.add(above);
    }

    if (myMap.getLoc(right) != null && !myMap.getLoc(right).contains(Map.Type.WALL)) {
      validMoves.add(right);
    }

    if (myMap.getLoc(left) != null && !myMap.getLoc(left).contains(Map.Type.WALL)) {
      validMoves.add(left);
    }

    return validMoves;
  }

  public boolean move() {
    return false;
  }

  public boolean is_ghost_in_range() {
    return false;
  }

  public JComponent consume() {
    return null;
  }
}
