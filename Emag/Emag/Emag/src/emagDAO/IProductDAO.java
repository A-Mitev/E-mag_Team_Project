package emagDAO;

import java.sql.SQLException;
import java.util.List;

import emag.Product;
import exceptions.EmagException;

public interface IProductDAO {

	void addProduct(Product p) throws EmagException;

	void updateProduct(Product p, double price) throws EmagException;

	void removeProduct(Product p);

	List<Product> getAllProducts() throws EmagException, SQLException;

	List<Product> getSelectedProducts(String brand) throws SQLException, EmagException;

}