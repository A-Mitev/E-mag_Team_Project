package oop;

public class WashingMachine extends HomeTech{
	
	private boolean slim;
	private boolean dryer;
	private int volume;
	private int rpm;
	
	public WashingMachine(String brand, String manufacturer, String model, double price, int quantity,
			int powerConsuptionInWatts, boolean builtIn, boolean slim, boolean dryer, int volume, int rpm) {
		super(brand, manufacturer, model, price, quantity, powerConsuptionInWatts, builtIn);
		this.slim = slim;
		this.dryer = dryer;
		setVolume(volume);
		setRpm(rpm);
	}
	
	public int getVolume(){
		return volume;
	}
	public void setVolume(int volume){
		if(volume > 0){
			this.volume = volume;
		}
	}
	
	public int getRpm(){
		return rpm;
	}
	public void setRpm(int rpm){
		if(rpm > 0){
			this.rpm = rpm;
		}
	}
	
	public boolean isSlim() {
		return slim;
	}

	public boolean hasDryer() {
		return dryer;
	}

	@Override
	public void showInfo(){
		super.showInfo();
		System.out.println(this.isSlim() + " " + this.hasDryer() + " " + this.getVolume() + " " + this.getRpm());
	}
}
