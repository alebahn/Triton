package triton;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.JPanel;

public class Screen extends JPanel {
	private Field field;
	private Image border;
	private Image background;
	public Screen() {
		field = new Field();
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		Graphics2D g2d = (Graphics2D)g;
		for(Entity entity : field) {
			entity.draw(g2d);
		}
	}
	private void paintHud() {

	}

}
