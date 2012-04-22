package triton;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GameMenu extends JPanel {
	public enum MenuType { STARTUP };
	private String title;
	private ArrayList<MenuButton> buttons;
	private Image background;
	
	class MenuMouseListener implements MouseMotionListener, MouseListener {

		@Override
		public void mouseDragged(MouseEvent e) {
			Point2D mouseLocation = e.getPoint();
			for(MenuButton button: buttons) {
				if(!button.getActiveRegion().contains(mouseLocation))
					button.setPressed(false);
				button.setHover(button.getActiveRegion().contains(mouseLocation));
				repaint();
			}
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			Point2D mouseLocation = e.getPoint();
			for(MenuButton button: buttons) {
				button.setHover(button.getActiveRegion().contains(mouseLocation));
				repaint();
			}
		}

		@Override
		public void mouseClicked(MouseEvent e) {}

		@Override
		public void mouseEntered(MouseEvent e) {}

		@Override
		public void mouseExited(MouseEvent e) {}

		@Override
		public void mousePressed(MouseEvent e) {
			Point2D mouseLocation = e.getPoint();
			for(MenuButton button: buttons) {
				if(button.getActiveRegion().contains(mouseLocation))
					button.setPressed(true);
				repaint();
			}
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			Point2D mouseLocation = e.getPoint();
			for(MenuButton button: buttons) {
				if(button.getActiveRegion().contains(mouseLocation)) {
					boolean wasPressed = button.isPressed();
					button.setPressed(false);
					repaint();
					if(wasPressed)
						button.click();
				}
			}
			
		}
		
	};
	
	public GameMenu(MenuType menuType, Image background) {
		this.background = background;
		switch (menuType) {
			case STARTUP:
				title="Triton";
				buttons = new ArrayList<MenuButton>(5);
				MenuButtonListener mbl = new MenuButtonListener() {
					
					@Override
					public void ButtonClicked(MenuButton button) {
						String buttonText = button.getText();
						if(buttonText.equals("quit")) {
							System.exit(0);
						}
						else {
							JOptionPane.showMessageDialog(null, "Click!");
						}
					}
				};
				buttons.add(new MenuButton("start", new Point2D.Double(100, 200), mbl));
				buttons.add(new MenuButton("load", new Point2D.Double(400, 200), mbl));
				buttons.add(new MenuButton("options", new Point2D.Double(100, 262), mbl));
				buttons.add(new MenuButton("tutorial", new Point2D.Double(400, 262), mbl));
				buttons.add(new MenuButton("quit", new Point2D.Double(250, 324), mbl));
		}
		MenuMouseListener mml = new MenuMouseListener();
		addMouseMotionListener(mml);
		addMouseListener(mml);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		Graphics2D g2d = (Graphics2D)g;
		g2d.setFont(new Font("Comic Sans", Font.BOLD, 80));
		FontMetrics fm = g2d.getFontMetrics();
		Rectangle2D textSizeMono = fm.getStringBounds(title, g2d);
		g2d.drawString(title, Math.round(400-textSizeMono.getCenterX()), Math.round(100-textSizeMono.getCenterY()));
		
		for(MenuButton button : buttons) {
			button.Draw(g2d);
		}
	}
	

}
