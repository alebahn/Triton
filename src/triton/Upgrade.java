package triton;
import java.awt.Image;

public abstract class Upgrade {
	protected int cost;
	protected Image thumbnail;
	protected String name;

	public boolean canBuy(Player buyer) {
		return false;
	}
}
