import java.util.ArrayList;

public class Ghost {
  String myName;
  Location myLoc;
  Map myMap;

  public Ghost(String name, Location loc, Map map) {
    this.myLoc = loc;
    this.myName = name;
    this.myMap = map;
  }

  public ArrayList<Location> get_valid_moves() {
    return null;
  }

  public boolean move() {
    return false;
  }

  public boolean is_pacman_in_range() {
    int x = myLoc.x;
    int y = myLoc.y;

    // Possible move locations
    Location left = new Location(x - 1, y);
    Location right = new Location(x + 1, y);
    Location below = new Location(x, y - 1);
    Location above = new Location(x, y + 1);

    if (myMap.getLoc(below) != null && myMap.getLoc(below).contains(Map.Type.PACMAN)) {
      return true;
    }

    if (myMap.getLoc(above) != null && myMap.getLoc(above).contains(Map.Type.PACMAN)) {
      return true;
    }

    if (myMap.getLoc(right) != null && myMap.getLoc(right).contains(Map.Type.PACMAN)) {
      return true;
    }

    if (myMap.getLoc(left) != null && myMap.getLoc(left).contains(Map.Type.PACMAN)) {
      return true;
    }
    return false;
  }

  public boolean attack() {
    return false;
  }
}
