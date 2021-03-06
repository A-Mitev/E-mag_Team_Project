package oop;

public class Admin extends User{
	
	private static final boolean ADMIN_RIGHTS = true;
	public Admin(String name, String email, String gsm, WareHouse warehouse) {
		super(name, email, gsm, warehouse);
		this.setAdminRights(ADMIN_RIGHTS);
	}
	
	//dobavq product v warehouse inventory
	public void addNewProductInStore(Product product) {
		if(!product.equals(null)){
			this.warehouse.addProduct(product);
		}
	}
	
	//premahva product v warehouse inventory
	public void deleteProductFromStore(Product product){
		this.warehouse.deleteProduct(product);
	}
}
