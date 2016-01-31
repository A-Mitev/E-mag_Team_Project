package oop;

public abstract class Product implements IProduct{
	
	private static int countIDs = 10000;
	private double price;
	private boolean available;
	private int quantity;
	private String manufacturer;
	private String brand;
	private int productID;
	private String model;
	
	Product(String brand, String manufacturer, String model, double price, int quantity){
		setBrand(brand);
		setManufacturer(manufacturer);
		setPrice(price);
		setQuantity(quantity);
		countIDs += 1;
		productID = countIDs;
	}
	
	protected String getBrand(){
		return brand;
	}
	protected void setBrand(String brand){
		if(!brand.equals(null) && !brand.equals("")){
			this.brand = brand;
		}
	}
	
	protected double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if (price>0) {
			this.price = price;
		}
	}
	
	protected String getManufacturer(){
		return manufacturer;
	}
	protected void setManufacturer(String manufacturer){
		this.manufacturer = manufacturer;
	}

	protected String getModel(){
		return model;
	}
	protected void setModel(String model){
		this.model = model;
	}
	
	//overload :)
	protected boolean isAvailable(){
		return available;
	}
	protected void setAvailable(int quantity){
		if(quantity > 0){
			this.available = true;
		}else{
			this.available = false;
		}
	}
	
	protected void setQuantity(int quantity){
		if(quantity > 0){
			this.quantity = quantity;
			this.setAvailable(quantity);
		}else{
			this.quantity = 0;
			this.setAvailable(quantity);
		}
	}
	
	protected int getProductID(){
		return productID;
	}
	
	@Override
	public void showInfo(){
		System.out.print(this.getBrand() + " " + this.getManufacturer() + ", model:" + this.getModel() + ", price:" + this.getPrice() + " lv, available:" 
				+ this.isAvailable() + ", product number:" + this.getProductID() + ", ");
	}
	
}
