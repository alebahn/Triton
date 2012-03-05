package triton;
import java.awt.*;

public abstract class Upgrade {
	protected int cost;
	protected Image thumbnail;
	protected String name;
	public boolean buy(Player buyer){
		return true;
	}
}
