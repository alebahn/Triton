package triton;
import java.util.*;

public class Field {
		private ArrayList<Entity> occupants;
		
		public Iterator<Entity> GetOccupantsIterator(){
			return occupants.iterator();
		}
}
