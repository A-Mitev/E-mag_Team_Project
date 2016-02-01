package oop;

import java.util.ArrayList;

public class Cart implements IStore{
	
	WareHouse warehouse;
	private ArrayList<Product> products;
	private double totalPrice;
	
	Cart(){
		products.ensureCapacity(30);
	}
	
	//dobavq product v kolichkata
	@Override
	public void addProduct(Product product) {
		products.add(product);
		this.totalPrice+=product.getPrice();
	}
	
	//premahva product v kolichkata
	@Override
	public void removeProduct(Product product) {
		this.totalPrice -= product.getPrice();
		products.remove(product);
	}
	
	void submitOrder() {
		
	}
	

}
