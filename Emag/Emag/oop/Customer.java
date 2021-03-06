package oop;

import java.util.ArrayList;

public class Customer extends User implements IStore{
	
	private static final boolean ADMIN_RIGHTS = false;
	private Cart cart;
	private String address;
	private ArrayList<Product> likedProducts;
	
	public Customer(String name, String email, String gsm, String address, WareHouse warehouse) {
		super(name, email, gsm, warehouse);
		this.setAddress(address);
		this.setAdminRights(ADMIN_RIGHTS);
	}
	
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		if(!address.equals(null) && !address.equals("")){
			this.address = address;
		}
	}

	//dobavq product v kolichkata chrez izvikvane na metoda na kolichakta dobavi
	@Override
	public void addProduct(Product product) {
		if(!product.equals(null)){
			cart.addProduct(product);
		}
	}

	//premahva product v kolichkata chrez izvikvane na metoda na kolichkata dobavi
	@Override
	public void removeProduct(Product product) {
		cart.removeProduct(product);
	}
	
}
