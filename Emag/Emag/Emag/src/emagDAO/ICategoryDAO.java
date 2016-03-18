package emagDAO;

import emag.Category;
import exceptions.EmagException;

public interface ICategoryDAO {
	
	int addCategory(Category category) throws EmagException;
}
