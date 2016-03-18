package emagDAO;

import java.sql.SQLException;

import emag.Client;

public interface IClientDAO {

	Client loginClient(String email, String password) throws InvalidClientException, SQLException, DBException;

}
