package triton;
import java.util.ArrayList;
import java.util.Iterator;

public class Field {
	private ArrayList<Entity> occupants;

	public Field() {
	}
	public Iterator<Entity> GetOccupantsIterator() {
		return occupants.iterator();
	}
}
