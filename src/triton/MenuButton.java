package triton;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JOptionPane;

public class MenuButton {
	private String label;
	private Rectangle2D activeRegion;
	private boolean hover, pressed;
	private MenuButtonListener buttonListener;
	public MenuButton(String label, Point2D location, MenuButtonListener buttonListener) {
		this.label = label;
		this.activeRegion = new Rectangle2D.Double(location.getX(), location.getY(), 300, 62);
		this.buttonListener = buttonListener;
		hover=false;
	}
	
	public Rectangle2D getActiveRegion() {
		return activeRegion;
	}
	
	public void setHover(boolean hover) {
		this.hover=hover;
	}

	public void setPressed(boolean pressed) {
		this.pressed = pressed;
	}
	
	public void click() {
		buttonListener.ButtonClicked(this);
	}

	public void Draw(Graphics2D g2d) {
		g2d.setFont(new Font("Comic Sans", Font.BOLD, pressed?35:40));
		FontMetrics fm = g2d.getFontMetrics();
		Rectangle2D textSizeMono = fm.getStringBounds(label, g2d);
		g2d.drawString(label, Math.round(activeRegion.getCenterX()-textSizeMono.getCenterX()), Math.round(activeRegion.getCenterY()-textSizeMono.getCenterY()));
		if(hover)
			g2d.draw(activeRegion);
	}

	public boolean isPressed() {
		return pressed;
	}
}
