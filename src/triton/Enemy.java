package triton;

import java.awt.Image;
import java.awt.geom.Rectangle2D;

public abstract class Enemy extends Unit {
		protected int tier;
		public Enemy(int money, Image image, Rectangle2D hitBox) {
			super(money, image, hitBox);
		}
		public abstract void clear();
		public int getTier() {
			return tier;
		}
		public void setTier(int tier) {
			this.tier = tier;
		}
}
