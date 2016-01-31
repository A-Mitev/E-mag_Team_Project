package oop;

public class GSM extends SmartTech {
	private boolean dualSim;
	private boolean touchScreen;

	public boolean isDualSim() {
		return dualSim;
	}

	public boolean isTouchSreen() {
		return touchScreen;
	}

	public void showInfo() {
		System.out.println(this.getBrand() + " " + this.getManufaturer() + " " + this.getPrice());
		System.out.println(this.isDualSim() + " " + this.isTouchSreen());
	}

}
