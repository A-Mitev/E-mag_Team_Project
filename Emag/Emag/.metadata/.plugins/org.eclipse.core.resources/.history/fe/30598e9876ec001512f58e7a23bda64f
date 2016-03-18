package emagDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.DBConnection;
import emag.Category;
import exceptions.EmagException;

public class CategoryDAO implements ICategoryDAO{

	/**
	 * 
	 */
	@Override
	public int addCategory(Category category) throws EmagException {
		if(category != null){
			try{
				Connection conn = DBConnection.getInstance().getConn();
				PreparedStatement ps = conn.prepareStatement("INSERT INTO category VALUES(null, ?);", com.mysql.jdbc.PreparedStatement.RETURN_GENERATED_KEYS);
				ps.setString(1, category.getName());
				ps.executeUpdate();
				
				ResultSet result = ps.getGeneratedKeys();
				result.next();
				return result.getInt(1);
			}catch(SQLException e){
				throw new EmagException("Can not add that category!", e);
			}
		}else{
			throw new EmagException("Can not be added a category that is null");
		}
		
	}

}
