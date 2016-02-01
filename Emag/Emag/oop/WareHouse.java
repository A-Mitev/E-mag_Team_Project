package oop;

import java.util.ArrayList;

public class WareHouse {
	
	private ArrayList<Product> inventory;
	
	WareHouse(int capacity){
		this.inventory.ensureCapacity(capacity);
	}
	
//	Product getProduct(){
//		
//	}
	
	//dobavqne na nov product v inventory-to
	protected void addProduct(Product product){
		inventory.add(product);
	}
	
	//premahvane na product ot inventory-to
	public void deleteProduct(Product product){
		inventory.remove(product);
	}
}
