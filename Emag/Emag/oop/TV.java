package oop;

public class TV extends AudioVisual {
	
	private static final double MIN_TV_INCHES = 21;
	private static final double MAX_TV_INCES = 91;
	private double size;
	private boolean led;
	private boolean smart;
	private boolean fullHD;
	
	public TV(String brand, String manufacturer, String model, double price, int quantity, int audioOutputPower,
			boolean wifiCapable, boolean remoteControl, boolean aVCablesBundled, double size, boolean led,
			boolean smart, boolean fullHD) {
		super(brand, manufacturer, model, price, quantity, audioOutputPower, wifiCapable, remoteControl,
				aVCablesBundled);
		setSize(size);
		this.led = led;
		this.smart = smart;
		this.fullHD = fullHD;
	}

	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		if(size > MIN_TV_INCHES && size < MAX_TV_INCES){
			this.size = size;
		}
	}
	
	public boolean isLed() {
		return led;
	}

	public boolean isSmart() {
		return smart;
	}

	public boolean isFullHD() {
		return fullHD;
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("size:" + this.getSize() + ", LED:" + this.isLed() + ", SmartTV:" + this.isSmart() + ", FullHD:" + this.isFullHD());
	}
	
}
