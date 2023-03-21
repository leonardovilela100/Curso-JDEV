package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.SingleConnectionBanco;
import model.ModelLogin;

public class DAOLoginRepository {
	
	private Connection connection;
	
	public DAOLoginRepository() {
		connection = SingleConnectionBanco.getConnection();
	}

	public boolean validarAutenticacao(ModelLogin modelLogin) throws Exception {
		
		String sqlString = "select * from model_login where upper(login) = upper(?) and upper(senha) = upper(?) ";
		
		PreparedStatement statement = connection.prepareStatement(sqlString);
		
		statement.setString(1, modelLogin.getLogin());
		statement.setString(2, modelLogin.getSenha());
		
		ResultSet resultSet = statement.executeQuery();
		
		if(resultSet.next()) {
			return true; // Authenticated
		}
		
		return false; // Not Authenticated
		
	}
	
}
