package oop;

import java.util.ArrayList;

public class Cart {
	ArrayList<Product> products;
	private double totalPrice;
	
	void addProduct(Product p) {
		products.add(p);
		this.totalPrice+=p.getPrice();
	}
	
	void removeProduct(Product p) {
		this.totalPrice -= p.getPrice();
		products.remove(p);
	}
	
	void submitOrder() {
		
	}
	

}
