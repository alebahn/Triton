package triton;

import javax.swing.JFrame;
import javax.swing.JPanel;

import triton.GameMenu.MenuType;

public class Triton extends JFrame
{
	private static Triton current = new Triton();
	private Triton() {
		setTitle("Triton");
		setSize(800, 600);
		GameMenu startup = new GameMenu(MenuType.STARTUP, null);
		setResizable(false);
		add(startup);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void switchPanel(JPanel switchToFrame){
		remove(0);
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
