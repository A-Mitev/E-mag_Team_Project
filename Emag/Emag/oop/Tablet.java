package oop;

public class Tablet extends SmartTech {
	
	private boolean sim;
	private boolean gps;
	private boolean webCam;
	
	Tablet(String brand, String manufacturer, String model, double price, int quantity,
			String mobileOS, double displaySize, int batteryCapacity, boolean headphones, boolean sdCard,
			boolean sim, boolean gps, boolean webCam) {
		super(brand, manufacturer, model, price, quantity, mobileOS, displaySize, batteryCapacity, webCam, webCam);
		this.sim = sim;
		this.gps = gps;
		this.webCam = webCam;
	}

	public boolean isSim() {
		return sim;
	}

	public boolean isGps() {
		return gps;
	}

	public boolean isWebCam() {
		return webCam;
	}
	
	@Override
	public void showInfo(){
		super.showInfo();
		System.out.println("SD card slot:" + this.isSim() + ", has gps:" + this.isGps() + ", has webcam:" + this.isWebCam());
	}
}
