package test.emag;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import connection.DBConnection;
import emag.Category;
import emag.Product;
import emag.SubCategory;
import emagDAO.CategoryDAO;
import emagDAO.ProductDAO;
import emagDAO.SubCategoryDAO;
import exceptions.EmagException;

public class TestEmagDAO {

//	@Test
//	public void testConnection() {
//		assertNotNull(DBConnection.getInstance().getConn());
//	}
//	
//	@Test
//	public void testAddCategory() throws EmagException{
//		CategoryDAO catDao = new CategoryDAO();
//		int result = catDao.addCategory(new Category(1, "dyra-byra"));
//		System.out.println(result);
//	}
//	
//	@Test
//	public void testAddSubCategory() throws EmagException{
//		SubCategoryDAO subDao = new SubCategoryDAO();
//		int result = subDao.addSubCategory(new SubCategory(1, new Category(1,"na spas"), "Malenkov"));
//		System.out.println(result);
//	}
//	
//	@Test
//	public void testAddProduct() throws EmagException{
//		ProductDAO dao = new ProductDAO();
//		int result = dao.addProduct(new Product(1, new SubCategory(1, new Category(1,"na spas"), "Malenkov") , "Apple", "iPhone 6S SILVER", "15MP CAMERA, 5MP FRONT CAMERA, 128GB, FINGER PRINT", 1789.0));
//		System.out.println(result);
//	}
	
//	@Test
//	public void testSearchProduct() throws SQLException, EmagException{
//		ProductDAO dao = new ProductDAO();
//		List<Product> result = dao.getSelectedProducts("samsung");
//		for(Product p : result){
//			System.out.println(p.getModel() + " " + p.getPrice());
//		}
//	}
	
}
