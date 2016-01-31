package oop;

public abstract class HomeTech extends Product {
	
	private static final int MAX_POWER_CONSUMPTION = 4000;
	private int powerConsuptionInWatts;
	private boolean builtIn;
	
	public HomeTech(String brand, String manufacturer, String model, double price, int quantity, int powerConsuptionInWatts, boolean builtIn) 
	{
		super(brand, manufacturer, model, price, quantity);
		setPowerConsuptionInWatts(powerConsuptionInWatts);
		this.builtIn = builtIn;
	}
	
	
	public int getPowerConsuptionInWatts() {
		return powerConsuptionInWatts;
	}
	public void setPowerConsuptionInWatts(int powerConsuptionInWatts) {
		if(powerConsuptionInWatts > 0 && powerConsuptionInWatts < MAX_POWER_CONSUMPTION)
		this.powerConsuptionInWatts = powerConsuptionInWatts;
	}
	
	public boolean isBuiltIn() {
		return builtIn;
	}
	
	@Override
	public void showInfo(){
		super.showInfo();
		System.out.print("power consuption:" + this.getPowerConsuptionInWatts() + ", can be build in:" + this.isBuiltIn() + ", ");
	}
	
}
