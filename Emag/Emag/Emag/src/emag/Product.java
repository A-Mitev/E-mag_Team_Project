package emag;
import java.util.Map;

import exceptions.EmagException;

public class Product {
	
	private int id;
	private String brand;
	private String model;
	private long productId;
	private String properties;
	private double price;
	private SubCategory subCat;
	
	public Product(){
		
	}
	public Product(int id, SubCategory subCat, String brand, String model, String properties, double price) throws EmagException {
		this.subCat = subCat;
		this.brand = brand;
		this.model = model;
		this.setProperties(properties);
		this.price = price;
		this.setId(id);
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setSubCat(SubCategory subCat) {
		this.subCat = subCat;
	}
	public double getPrice() {
		return price;
	}

	public SubCategory getSubCat() {
		return subCat;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (productId ^ (productId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (productId != other.productId)
			return false;
		return true;
	}

	public String getModel() {
		return model;
	}

	public long getProductId() {
		return productId;
	}

	public String getProperties() {
		return properties;
	}
	
	public void setProperties(String properties) throws EmagException {
		if(properties != null && !properties.isEmpty()) {
			this.properties = properties;
		}
		else {
			throw new EmagException("Incorrectly specified properties - empty description!");
		}	
	}
	
	@Override
	public String toString() {
		return "Product [brand=" + brand + ", model=" + model + ", productId=" + productId + "]";
	}
	
	
}
