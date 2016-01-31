package oop;

public class DesktopPC extends Computer {
	
	private boolean waterCooled;
	private boolean allInOne;
	
	public DesktopPC(String brand, String manufacturer, String model, double price, int quantity,
			String operatingSystem, String processor, boolean videoCard, int ramMBs, int hddCapacityGBs,
			boolean waterCooled, boolean allInOne) {
		super(brand, manufacturer, model, price, quantity, operatingSystem, processor, videoCard, ramMBs, hddCapacityGBs);
		this.waterCooled = waterCooled;
		this.allInOne = allInOne;
	}
	
	public boolean isWaterCooled() {
		return waterCooled;
	}
	public boolean isAllInOne() {
		return allInOne;
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("All in one:" + this.isAllInOne() + ", Cooling System:" + this.isWaterCooled() + ", ");
	}
	
}
