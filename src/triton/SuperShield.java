package triton;
import java.awt.Image;
public class SuperShield extends Special {
	private Image Aura;
	public SuperShield(int co, Image Img, String Str){
		super(co,Img,Str);
	}
	public Image getAura() {
		return Aura;
	}

	public void setAura(Image aura) {
		Aura = aura;
	}
}
