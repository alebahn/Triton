package triton;
import java.awt.Image;

public class ScreenClear extends Special {
	private Image effect;
	public ScreenClear(int co, Image Img, String Str){
		super(co,Img,Str);
	}
	public Image getEffect() {
		return effect;
	}
	public void setEffect(Image effect) {
		this.effect = effect;
	}
	
}
