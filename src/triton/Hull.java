package triton;
import java.awt.Image;

public class Hull extends Defense {
	private Image ship;
	private int value;
	public Hull(int co, Image Img, String Str){
		super(co,Img,Str);
	}
	public Image getShip() {
		return ship;
	}
	public void setShip(Image ship) {
		this.ship = ship;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}
