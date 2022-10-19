import java.util.ArrayList;
import javax.swing.JComponent;

public class PacMan {
	String myName;
	Location myLoc;
	Map myMap;
	Location shift;


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
  
	public PacMan(String name, Location loc, Map map) {
		this.myLoc = loc;
		this.myName = name;
		this.myMap = map;
	}

	public boolean move() {
		ArrayList<Location> moves = get_valid_moves();
		if (!moves.isEmpty()) {
			myLoc.x = moves.get(0).x;
			myLoc.y = moves.get(0).y;
			return true;
		}
		return false;
	}
  


  public boolean is_ghost_in_range() {
    
    int x = myLoc.x;
    int y = myLoc.y;

    // Possible move locations
    Location left = new Location(x - 1, y);
    Location right = new Location(x + 1, y);
    Location below = new Location(x, y - 1);
    Location above = new Location(x, y + 1);
    
    if (myMap.getLoc(below) != null && myMap.getLoc(below).contains(Map.Type.GHOST) == true) {
      return true;
    }

    if (myMap.getLoc(above) != null && myMap.getLoc(above).contains(Map.Type.GHOST) == true) {
      return true;
    }    

    if (myMap.getLoc(right) != null && myMap.getLoc(right).contains(Map.Type.GHOST) == true) {
      return true;
    }

    if (myMap.getLoc(left) != null && myMap.getLoc(left).contains(Map.Type.GHOST) == true) {
      return true;
    }
    return false;
  }

  public JComponent consume() {
    int x = myLoc.x;
    int y = myLoc.y;
    Location curr = new Location(x, y);
     
    if (myMap.getLoc(curr).contains(Map.Type.PACMAN)) {
    	return myMap.eatCookie(myName);
    }
    
    return null;
  }

}
