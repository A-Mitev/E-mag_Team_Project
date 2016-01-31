package oop;

public class Multimedia extends Product {
	
	private boolean over18;

	public Multimedia(String brand, String manufacturer, String model, double price, int quantity, boolean over18) {
		super(brand, manufacturer, model, price, quantity);
		this.over18 = over18;
	}

	public boolean isOver18() {
		return over18;
	}
	
	@Override
	public void showInfo(){
		super.showInfo();
		System.out.print("restriction:" + this.isOver18() + ", ");
	}
}
