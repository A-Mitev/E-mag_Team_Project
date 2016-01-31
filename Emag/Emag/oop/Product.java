package oop;

public abstract class Product implements IProduct{
	private double price;
	private boolean isAvailable;
	private int quantity;
	private String manufacturer;
	private String brand;
	private int productID;//dobavih product ID
	private String model;//dobavih model
	
	protected double getPrice() {
		return price;
	}
	protected void setPrice(double price) {
		if (price>0) {
			this.price = price;
		}
	}
	
	protected String getBrand(){
		return brand;
	}
	
	protected String getManufaturer(){
		return manufacturer;
	}

}
