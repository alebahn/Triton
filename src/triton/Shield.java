package triton;
import java.awt.Image;

public class Shield extends Defense {
	private Image aura;
	private int value;
	public Shield(int co, Image Img, String Str){
		super(co,Img,Str);
	}
	public Image getAura() {
		return aura;
	}
	public void setAura(Image aura) {
		this.aura = aura;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}
