package triton;

public abstract class Enemy extends Unit {
		protected int tier;
		Enemy() {}
		public abstract void clear();
		public int getTier() {
			return tier;
		}
		public void setTier(int tier) {
			this.tier = tier;
		}
}
