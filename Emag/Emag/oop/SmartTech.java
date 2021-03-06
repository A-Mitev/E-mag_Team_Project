package oop;

public abstract class SmartTech extends Product {
	
	private String mobileOS;
	private double displaySize;
	private int batteryCapacity;
	private boolean headphones;
	private boolean sdCard;
	
	SmartTech(String brand, String manufacturer, String model, double price, int quantity,
			String mobileOS, double displaySize, int batteryCapacity, boolean headphones, boolean sdCard) {
		super(brand, manufacturer, model, price, quantity);
		setMobileOS(mobileOS);
		setDisplaySize(displaySize);
		setBatteryCapacity(batteryCapacity);
		this.headphones = headphones;
		this.sdCard = sdCard;
	}

	public String getMobileOS() {
		return mobileOS;
	}
	public void setMobileOS(String mobileOS) {
		if(!mobileOS.equals(null) && !mobileOS.equals("")){
			this.mobileOS = mobileOS;
		}
	}

	public double getDisplaySize() {
		return displaySize;
	}
	public void setDisplaySize(double displaySize) {
		if(displaySize > 0){
			this.displaySize = displaySize;
		}
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(int batteryCapacity) {
		if(batteryCapacity > 0){
			this.batteryCapacity = batteryCapacity;
		}
	}

	public boolean isheadphones() {
		return headphones;
	}

	public boolean isSDCard() {
		return sdCard;
	}
	
	@Override
	public void showInfo(){
		super.showInfo();
		System.out.println("mobile operating system:" + this.getMobileOS() + ", display size:" + this.getDisplaySize() + ", battery capacity:" + this.getBatteryCapacity() + 
				", included headphones:" + this.isheadphones() + ", SD card slot:" + this.isSDCard() + ", ");
	}
	
}
