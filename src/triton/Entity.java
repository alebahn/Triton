package triton;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

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
		location = destination;
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
		g.translate(location.getX(), location.getY());
		g.drawImage(image, -image.getWidth(null)/2, -image.getHeight(null)/2, null);
		g.setColor(Color.RED);
		g.draw(hitBox);
	}

}