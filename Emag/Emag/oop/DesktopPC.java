package oop;

public class DesktopPC extends Computer {
	
	private boolean isWaterCooled;
	private boolean isAllInOne;
	
	protected boolean isWaterCooled() {
		return isWaterCooled;
	}
	protected boolean isAllInOne() {
		return isAllInOne;
	}
	@Override
	public void showInfo() {
		System.out.println(this.getBrand() + " " + this.getManufaturer() + " " + this.getPrice());
		System.out.println(this.isAllInOne() + " " + this.isWaterCooled());
	}
	
}
