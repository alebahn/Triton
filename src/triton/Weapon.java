package triton;
import java.util.*;

public class Weapon extends Upgrade {
	private ArrayList<Bullet> bullets;
	private int rateOfFire;
	public void fire(){
		
	}
	public ArrayList<Bullet> getBullets() {
		return bullets;
	}
	public void setBullets(ArrayList<Bullet> bullets) {
		this.bullets = bullets;
	}
	public int getRateOfFire() {
		return rateOfFire;
	}
	public void setRateOfFire(int rateOfFire) {
		this.rateOfFire = rateOfFire;
	}
	
}
