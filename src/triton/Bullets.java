package triton;

import java.awt.geom.Point2D;

public abstract class Bullets extends Entity {
	protected Point2D direction;
	protected double speed;
	protected int penetration;
	protected int damage;
	protected double range;
	protected boolean active;

	public Bullets() {
		// TODO Auto-generated constructor stub
	}
	public void fire() {
		
	}
	public Point2D getDirection() {
		return direction;
	}
	public double getSpeed() {
		return speed;
	}
	public int getPenetration() {
		return penetration;
	}
	public int getDamage() {
		return damage;
	}
	public double getRange() {
		return range;
	}
	public boolean isActive() {
		return active;
	}

}
