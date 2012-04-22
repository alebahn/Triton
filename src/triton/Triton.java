package triton;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import triton.GameMenu.MenuType;

public class Triton extends JFrame
{
	private Options currentOptions;
	
	public class Options{
		private Dimension resolution;
		private int volume;
		
		public Options(){
			setResolution(new Dimension(800,600));
			setVolume(50);
		}

		public Dimension getResolution() {
			return resolution;
		}

		public void setResolution(Dimension resolution) {
			this.resolution = resolution;
		}

		public int getVolume() {
			return volume;
		}

		public void setVolume(int volume) {
			this.volume = volume;
		}
	}
	
	private static Triton current = new Triton();
	private Triton() {
		setTitle("Triton");
		setSize(800, 600);
		currentOptions = new Options();
		GameMenu startup = new GameMenu(MenuType.STARTUP);
		setResizable(false);
		add(startup);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void switchPanel(JPanel oldFrame, JPanel switchToFrame){
		remove(oldFrame);
		add(switchToFrame);
		validate();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Triton tritonFrame = current;
		tritonFrame.setVisible(true);
	}
	public static Triton getTriton(){
		return current;
	}

}
