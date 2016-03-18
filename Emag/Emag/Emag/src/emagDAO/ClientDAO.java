package emagDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.DBConnection;
import emag.Client;

public class ClientDAO implements IClientDAO{
	private static IClientDAO instance;
	
	private ClientDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public synchronized static IClientDAO getInstance() {
		if (instance == null) {
			instance = new ClientDAO();
		}
		return instance;
	}
	
	
	@Override
	public Client loginClient(String email, String password) throws InvalidClientException, SQLException, DBException{
		Connection conn = null;
		try{
			conn = DBConnection.getInstance().getConn();
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM Client WHERE email = ? AND password = ?");
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet result = ps.executeQuery();
			
			if(result.next() == false){
				throw new InvalidClientException("There is no such client.");
			}
			
			return new Client(result.getInt(1), result.getString(3), result.getString(2), result.getString(4));
			
		}catch(InvalidClientException e){
			throw new InvalidClientException("There is no such client.", e);
		}catch(Exception e){
			e.printStackTrace();
			throw new DBException("Can not connect to the datebase right now. Sorry for the problems.", e);
		}
		
	}
}
