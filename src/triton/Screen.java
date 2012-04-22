package triton;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Rectangle2D;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Screen extends JPanel {
	private Field field;
	private Image border;
	private Image background;

	public Screen() {
		field = new Field();
		field.add(new Player(0,new ImageIcon("SmilieShip.png").getImage(), null));
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		for (Entity entity : field) {
			entity.draw(g2d);
		}
	}

	private void paintHud() {

	}

}
