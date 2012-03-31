package triton;
import java.awt.Image;
import java.util.ArrayList;

public class Weapon extends Upgrade {
	private ArrayList<Bullet> bullets;
	private int rateOfFire;
	public void fire(){
		
	}
	public Weapon(int co, Image Img, String Str){
		super(co,Img,Str);
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
