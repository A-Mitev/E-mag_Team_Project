package oop;

public class GSM extends SmartTech {
	
	private boolean dualSim;
	private boolean touchScreen;

	GSM(String brand, String manufacturer, String model, double price, int quantity,
			String mobileOS, double displaySize, int batteryCapacity, boolean headphones, boolean sdCard,
			boolean dualSim, boolean touchScreen) {
		super(brand, manufacturer, model, price, quantity, mobileOS, displaySize, batteryCapacity, touchScreen, touchScreen);
		this.dualSim = dualSim;
		this.touchScreen = touchScreen;
	}
	
	public boolean isDualSim() {
		return dualSim;
	}

	public boolean isTouchSreen() {
		return touchScreen;
	}
	
	@Override
	public void showInfo(){
		super.showInfo();
		System.out.println("is dual sim:" + this.isDualSim() + ", is touchscreen:" + this.isTouchSreen());
	}
}
