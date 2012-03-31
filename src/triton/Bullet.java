package triton;

import java.awt.Image;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public abstract class Bullet extends Entity {
	protected Point2D direction;
	protected double speed;
	protected int penetration;
	protected int damage;
	protected boolean active;

	public Bullet(Point2D direction, double speed, int penetration, int damage, Image image, Rectangle2D hitBox) {
		super(image, hitBox);
		this.direction = direction;
		this.speed = speed;
		this.penetration = penetration;
		this.damage = damage;
	}
	public void fire() {
		
	}
	@Override
	public void colide(Entity other) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void colisionReact(Entity other) {
		// TODO Auto-generated method stub
		
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
	public boolean isActive() {
		return active;
	}

}
