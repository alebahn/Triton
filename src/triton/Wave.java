package triton;

import java.util.ArrayList;
import java.util.Iterator;

public class Wave implements Iterable<Enemy> {
	private ArrayList<Enemy> enemies;
	
	public Wave() {
	}

	@Override
	public Iterator<Enemy> iterator() {
		return enemies.iterator();
	}

}
