package triton;

import java.util.ArrayList;
import java.util.Iterator;

public class Wave {
	private ArrayList<Enemy> enemies;
	
	public Wave() {
	}
	
	public Iterator<Enemy> getEnemiesIterator() {
		return enemies.iterator();
	}

}
