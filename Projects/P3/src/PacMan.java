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
		return null;
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
		return false;
	}

	public JComponent consume() {
		return null;
	}
}
