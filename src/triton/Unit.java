package triton;

import java.awt.Image;
import java.awt.geom.Rectangle2D;

public abstract class Unit extends Entity{
		protected int health;
		protected int money;
		public Unit(int money, Image image, Rectangle2D hitBox) {
			super(image, hitBox);
			this.money = money;
		}
		public int getmoney(){
			return money;
		}
}
