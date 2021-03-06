package oop;

public class Oven extends HomeTech {
	private boolean gasPowered;
	private boolean airFunction;
	private boolean timer;
	
	Oven(String brand, String manufacturer, String model, double price, int quantity, int powerConsuptionInWatts, boolean builtIn,
			boolean gasPowered, boolean airFunction, boolean timer)
	{
		super(brand, manufacturer, model, price, quantity, powerConsuptionInWatts, builtIn);
		this.gasPowered = gasPowered;
		this.airFunction = airFunction;
		this.timer = timer;
	}
	
	public boolean isGasPowered(){
		return gasPowered;
	}
	
	public boolean hasAirFunction(){
		return airFunction;
	}
	
	public boolean hasTimer(){
		return timer;
	}
	
	@Override
	public void showInfo(){
		super.showInfo();
		System.out.println("can be gas powered:" + this.isGasPowered() + ", has air function:" + this.hasAirFunction() + ", has timer:" + this.hasTimer());
	}
}
