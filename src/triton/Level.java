package triton;

import java.util.HashMap;

public class Level {
	private HashMap<Integer, Wave> waves;
	private Boss boss;
	private int number;

	public Level() {
	}

	public Wave getWave(int time) {
		if (waves.containsKey(time))
			return waves.get(time);
		else
			return null;
	}

	public Boss getBoss() {
		return boss;
	}

	public int getLevelNumber() {
		return number;
	}
}
