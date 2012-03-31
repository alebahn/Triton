package triton;

public abstract class Unit extends Entity{
		protected int health;
		protected int money;
		public Unit(int money) {
			this.money = money;
		}
		public int getmoney(){
			return money;
		}
}
