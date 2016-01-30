package oop;

public class Fridge extends HomeTech {
	private int litres;
	private int numberOfDoors;
	private int numberOfShelves;
	private boolean hasFreezer;
	protected int getLitres() {
		return litres;
	}
	protected int getNumberOfDoors() {
		return numberOfDoors;
	}
	protected int getNumberOfShelves() {
		return numberOfShelves;
	}
	protected boolean isHasFreezer() {
		return hasFreezer;
	}
	
	
}
