package oop;

public abstract class HomeTech extends Product {
	
	private static final int MAX_POWER_CONSUMPTION = 4000;
	private int powerConsuptionInWatts;
	private boolean isBuiltIn;
	
	public HomeTech(int powerConsuptionInWatts, boolean isBuiltIn) {
		setPowerConsuptionInWatts(powerConsuptionInWatts);
		this.isBuiltIn = isBuiltIn;
	}
	
	
	public int getPowerConsuptionInWatts() {
		return powerConsuptionInWatts;
	}
	public void setPowerConsuptionInWatts(int powerConsuptionInWatts) {
		if(powerConsuptionInWatts > 0 && powerConsuptionInWatts < MAX_POWER_CONSUMPTION)
		this.powerConsuptionInWatts = powerConsuptionInWatts;
	}
	public boolean isBuiltIn() {
		return isBuiltIn;
	}
	
	
	
}
