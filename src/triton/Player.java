package triton;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D.Double;
import java.util.ArrayList;

public class Player extends Unit {
	private int shield;
	private int energy;
	private Image portrait;
	private int charges;
	private int rechargeRate;
	private ArrayList<Upgrade> boughtUpgrades;
	private ArrayList<Upgrade> activeUpgrades;
	// no getters and setters for these yet
	public Player(int money, Image image, Rectangle2D hitBox) {
		super(money, image, hitBox);
		Dimension resolution = Triton.getTriton().getOptions().getResolution();
		move( new Point2D.Double(resolution.getWidth()/2, resolution.getHeight()/2));
	}
	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}
	public int getShield() {
		return shield;
	}
	public void setShield(int shield) {
		this.shield = shield;
	}
	public int getEnergy() {
		return energy;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	public Image getPortrait() {
		return portrait;
	}
	public void setPortrait(Image portrait) {
		this.portrait = portrait;
	}
	public int getCharges() {
		return charges;
	}
	public void setCharges(int charges) {
		this.charges = charges;
	}
	public int getRechargeRate() {
		return rechargeRate;
	}
	public void setRechargeRate(int rechargeRate) {
		this.rechargeRate = rechargeRate;
	}
	@Override
	public void colide(Entity other) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void colisionReact(Entity other) {
		// TODO Auto-generated method stub
		
	}
	
}
