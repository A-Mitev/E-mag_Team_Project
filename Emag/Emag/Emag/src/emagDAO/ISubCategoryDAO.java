package emagDAO;

import emag.SubCategory;
import exceptions.EmagException;

public interface ISubCategoryDAO {
	
	int addSubCategory(SubCategory sub) throws EmagException;
	
}
