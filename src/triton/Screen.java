package triton;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Screen extends JPanel {
	private Field field;
	private Image border;
	private Image background;

	public Screen() {
		field = new Field();
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("img/SmilieShip.png"));
		} catch (IOException e) {
			throw new RuntimeException("Player Ship Image Didn't Load");
		}
		field.add(new Player(0, img, null));
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
