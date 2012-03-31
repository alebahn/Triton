package triton;

import javax.swing.JFrame;

import triton.GameMenu.MenuType;

public class Triton extends JFrame
{
	private Triton() {
		setTitle("Triton");
		setSize(800, 600);
		GameMenu startup = new GameMenu(MenuType.STARTUP, null);
		setResizable(false);
		add(startup);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Triton tritonFrame = new Triton();
		tritonFrame.setVisible(true);
	}

}
