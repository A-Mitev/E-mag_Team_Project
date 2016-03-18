package emagDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.DBConnection;
import emag.SubCategory;
import exceptions.EmagException;

public class SubCategoryDAO implements ISubCategoryDAO{

	/**
	 * Adding new Subcategory to the database.
	 * 
	 * @param subcategory - subcategory POJO to be added.
	 * @return 
	 * 
	 * @throws EmagException when the Subcategory can not be added or is null.
	 */
	public int addSubCategory(SubCategory sub) throws EmagException{
		if(sub != null){
			try{
				Connection conn = DBConnection.getInstance().getConn();
				PreparedStatement ps = conn.prepareStatement("INSERT INTO SubCatetegory VALUES(null, ?, ?);", com.mysql.jdbc.PreparedStatement.RETURN_GENERATED_KEYS);
				ps.setInt(1, sub.getCategory().getCategoryId());
				ps.setString(2, sub.getName());
				ps.executeUpdate();	
				
				ResultSet result = ps.getGeneratedKeys();
				result.next();
				return result.getInt(1);
			}catch(SQLException e){
				throw new EmagException("Can not add that subcategory!", e);
			}
		}else{
			throw new EmagException("Can not be added a subcategory that is null");
		}
	}
	
}
