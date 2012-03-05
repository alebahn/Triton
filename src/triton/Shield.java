package triton;
import java.awt.*;

public class Shield extends Defense {
	private Image aura;
	private int value;
	Shield()	{}
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
