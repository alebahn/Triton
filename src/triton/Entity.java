package triton;

import java.awt.Image;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Entity
{
	protected Image image; 
	protected Rectangle2D hitBox;
	protected Point2D	location;
	//protected Field field

	public Entity() {}
	public void tick() {}
	public void move(Point2D destination) {}
	public void colide(Entity other) {}
	public void colisionReact(Entity other) {}
}