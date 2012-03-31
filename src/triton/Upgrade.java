package triton;
import java.awt.Image;

public abstract class Upgrade {
	protected int cost;
	protected Image thumbnail;
	protected String name;
	
	public Upgrade(int Co, Image Thumb, String nm){
		cost = Co;
		thumbnail = Thumb;
		name = nm;
	}

	public boolean canBuy(Player buyer) {
		return false;
	}
}
