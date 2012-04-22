package triton;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D.Float;

public abstract class Entity {
	protected Image image;
	protected Rectangle2D hitBox;
	protected Point2D location;
	// protected Field field

	public Entity(Image image, Rectangle2D hitBox) {
		this.image = image;
		this.hitBox = hitBox;
		location = new Point2D.Float(0,0);
	}
	public abstract void tick();
	public void move(Point2D destination) {
	}
	public abstract void colide(Entity other);
	public abstract void colisionReact(Entity other);

	public Point2D getLocation() {
		return location;
	}
	public Image getImage() {
		return null;
	}
	public boolean isCollidingWith(Entity other) {
		return false;
	}
	public void draw(Graphics2D g) {
		g.drawImage(image, (int)Math.round(location.getX()), (int)Math.round(location.getY()), null);
	}

}