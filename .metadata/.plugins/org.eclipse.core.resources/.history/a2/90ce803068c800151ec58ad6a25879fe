package oop;

public class Fridge extends HomeTech {

	private static final int MAX_NUMBERS_OF_SHELVES = 10;
	private static final int MAX_NUMBER_OF_DOORS = 5;
	private static final int MAX_FRIDGE_CAPACITY = 500;
	private int litres;
	private int numberOfDoors;
	private int numberOfShelves;
	private boolean freezer;

	public Fridge(String brand, String manufacturer, String model, double price, int quantity, 
			int powerConsuptionInWatts, boolean builtIn, int liters, int numberOfDoors, int numberOfShelves, boolean freezer) 
	{
		super(brand, manufacturer, model, price, quantity, powerConsuptionInWatts, builtIn);
		setLitres(liters);
		setNumberOfDoors(numberOfDoors);
		setNumberOfShelves(numberOfShelves);
		this.freezer = freezer;
	}

	public int getLitres() {
		return litres;
	}

	public void setLitres(int litres) {
		if (litres > 0 && litres < MAX_FRIDGE_CAPACITY)
			this.litres = litres;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		if (numberOfDoors > 0 && numberOfDoors < MAX_NUMBER_OF_DOORS)
			this.numberOfDoors = numberOfDoors;
	}

	public int getNumberOfShelves() {
		return numberOfShelves;
	}

	public void setNumberOfShelves(int numberOfShelves) {
		if (numberOfShelves > 0 && numberOfShelves < MAX_NUMBERS_OF_SHELVES)
			this.numberOfShelves = numberOfShelves;
	}

	public boolean hasFreezer() {
		return freezer;
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println(this.getNumberOfDoors() + " " + this.getLitres() + " " + this.getNumberOfShelves() + " " + this.hasFreezer());
	}
}
