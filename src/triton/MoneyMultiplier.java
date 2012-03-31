package triton;

public class MoneyMultiplier extends Special {
	private int duration;
	private double multiplier;
	public MoneyMultiplier()	{}
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
