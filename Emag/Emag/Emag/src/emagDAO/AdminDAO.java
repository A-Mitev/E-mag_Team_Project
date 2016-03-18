package emagDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.DBConnection;
import emag.Admin;
import emag.Client;

public class AdminDAO implements IAdminDAO{
	
	private static IAdminDAO instance;
	
	private AdminDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public synchronized static IAdminDAO getInstance() {
		if (instance == null) {
			instance = new AdminDAO();
		}
		return instance;
	}
	
	@Override
	public Admin loginAdmin(String email, String password) throws InvalidClientException, SQLException, DBException{
		Connection conn = null;
		try{
			conn = DBConnection.getInstance().getConn();
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM Admin WHERE email = ? AND password = ?");
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet result = ps.executeQuery();
			
			if(result.next() == false){
				throw new InvalidClientException("ARE BEGAI WE!! TI NE SI ADMIN!!");
			}
			
			return new Admin(result.getInt(1), result.getString(3), result.getString(2), result.getString(4));
			
		}catch(InvalidClientException e){
			throw new InvalidClientException("ARE BEGAI WE!! TI NE SI ADMIN!!", e);
		}catch(Exception e){
			e.printStackTrace();
			throw new DBException("Can not connect to the datebase right now. Sorry for the problems.", e);
		}
		
	}
	
}
