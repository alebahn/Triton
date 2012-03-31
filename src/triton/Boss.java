package triton;

import java.awt.Image;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.HashMap;

public final class Boss extends Enemy {
	private HashMap<Integer, ArrayList<Entity>> waves;

	public Boss(int money, Image image, Rectangle2D hitBox) {
		super(money, image, hitBox);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public void colide(Entity other) {
		// TODO Auto-generated method stub

	}

	@Override
	public void colisionReact(Entity other) {
		// TODO Auto-generated method stub

	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub

	}

	public ArrayList<Entity> getWave(int time) {
		if (waves.containsKey(time))
			return waves.get(time);
		else
			return null;
	}

}
