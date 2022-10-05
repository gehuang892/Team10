import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JComponent;

public class Map {

	public enum Type {
		EMPTY, PACMAN, GHOST, WALL, COOKIE
	}

	private HashMap<Location, HashSet<Type>> field;
	private boolean gameOver;
	private int dim;

	private HashMap<String, Location> locations;
	private HashMap<String, JComponent> components;
	private HashSet<Type> emptySet;
	private HashSet<Type> wallSet;

	private int cookies = 0;

	public Map(int dim) {
		gameOver = false;
		locations = new HashMap<String, Location>();
		components = new HashMap<String, JComponent>();
		field = new HashMap<Location, HashSet<Type>>();

		emptySet = new HashSet<Type>();
		wallSet = new HashSet<Type>();
		emptySet.add(Type.EMPTY);
		wallSet.add(Type.WALL);
		this.dim = dim;
	}

	public void add(String name, Location loc, JComponent comp, Type type) {
		locations.put(name, loc);
		components.put(name, comp);
		if (!field.containsKey(loc))
			field.put(loc, new HashSet<Type>());
		field.get(loc).add(type);
	}

	public int getCookies() {
		return cookies;
	}

	public boolean isGameOver() {
		return gameOver;
	}

  public boolean move(String name, Location loc, Type type) {
    // update locations, components, and field
    // use the setLocation method for the component to move it to the new location
    if ((type == Map.Type.PACMAN) || (type == Map.Type.GHOST)) {
      int x = loc.x;
      int y = loc.y;
      if (getLoc(loc) != null && !getLoc(loc).contains(Map.Type.WALL)) {
        components.get(name).setLocation(x, y);
        locations.put(name, loc);
        if (!field.containsKey(loc)) field.put(loc, new HashSet<Type>());
        field.get(loc).add(type);
        return true;
      }
    }
    return false;
  }

	public HashSet<Type> getLoc(Location loc) {
		// wallSet and emptySet will help you write this method
		return field.get(loc);
	}

  public boolean attack(String Name) {
    Location loc = locations.remove(Name);

    // Check is location is null
    if (loc == null) {
      return false;
    }

    int x = loc.x;
    int y = loc.y;
    
    // Possible locations of pacman
    Location left = new Location(x - 1, y);
    Location right = new Location(x + 1, y);
    Location below = new Location(x, y - 1);
    Location above = new Location(x, y + 1);

    // attack pacman by removing and update gameOver
    
    if (field.get(left) != null && field.get(left).contains(Map.Type.PACMAN)) {
      field.get(loc).remove(Map.Type.PACMAN);
      components.remove(Name);
      gameOver = true;
      return true;
    
    } else if (field.get(right) != null && field.get(right).contains(Map.Type.PACMAN)) {
      field.get(loc).remove(Map.Type.PACMAN);
      components.remove(Name);
      gameOver = true;
      return true;
    
    } else if (field.get(below) != null && field.get(below).contains(Map.Type.PACMAN)) {
      field.get(loc).remove(Map.Type.PACMAN);
      components.remove(Name);
      gameOver = true;
      return true;
    
    } else if (field.get(above) != null && field.get(above).contains(Map.Type.PACMAN)) {
      field.get(loc).remove(Map.Type.PACMAN);
      components.remove(Name);
      gameOver = true;
      return true;
    }

    
    return false;
  }

	public JComponent eatCookie(String name) {
		// update locations, components, field, and cookies
		// the id for a cookie at (10, 1) is tok_x10_y1
		return null;
	}
}
