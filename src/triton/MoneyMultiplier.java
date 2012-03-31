package triton;

import java.awt.Image;

public class MoneyMultiplier extends Special {
	private int duration;
	private double multiplier;
	public MoneyMultiplier(int co, Image Img, String Str){
		super(co,Img,Str);
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getMultiplier() {
		return multiplier;
	}
	public void setMultiplier(double multiplier) {
		this.multiplier = multiplier;
	}
}
