package servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emag.Category;
import emag.Product;
import emag.SubCategory;
import emagDAO.IProductDAO;
import emagDAO.ProductDAO;
import exceptions.EmagException;

/**
 * Servlet implementation class AddProduct
 */
@WebServlet("/AddProduct")
public class AddProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String brand = request.getParameter("Brand");
		String model = request.getParameter("Model");
		String properties = request.getParameter("Properties");
		double price = Double.parseDouble( request.getParameter("Price"));
		String subCategory = request.getParameter("SubCategory");
		String category = request.getParameter("Category");
		String photo = request.getParameter("Photo");
		
		IProductDAO dao = new ProductDAO();
		
		Category cat = new Category(1,category);
		SubCategory sub = new SubCategory(1,cat,subCategory);
		
		Product product = null;
		try {
			product = new Product(1, sub, brand, model, properties, price, photo);
		} catch (EmagException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try{
			dao.addProduct(product);
		}catch (EmagException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
