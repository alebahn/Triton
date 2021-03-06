package triton;
import java.util.ArrayList;
import java.util.Iterator;

public class Field implements Iterable<Entity> {
	private ArrayList<Entity> occupants;

	public Field() {
		occupants = new ArrayList<Entity>();
	}
	
	@Override
	public Iterator<Entity> iterator() {
		return occupants.iterator();
	}
	
	public void add(Entity objectToAdd){
		occupants.add(objectToAdd);
	}
	
	/*	
	 * 		public void remove(Entity objectToRemove){
	 *		occupants.remove(objectToRemove);
	 *		}
	 */
}
