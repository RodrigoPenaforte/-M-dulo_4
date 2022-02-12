package dao;

import java.util.List;
import model.login_cadastro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import db.MySqlConnection;


public class login_crud {
	
	
	private static Connection connection = MySqlConnection.createConnection();
	private static String sql;

	
	public static void create(login_cadastro login) {
		String sql = "INSERT INTO login (nome, cpf)" + "VALUES(?,?)";
		
		try {
			 PreparedStatement preparedStatement = connection.prepareStatement(sql);
			 
			 preparedStatement.setString(1, login.getNome());
			 preparedStatement.setString(2, login.getCpf());
	
			 preparedStatement.executeUpdate();
			 
			 System.out.println("--correct insert on database");
			 
		 } catch(SQLException e) {
			 System.out.println("--incorrect insert on database. " + e.getMessage());
		 }
	}
		
	
	
	
	public static void delete(int login_cadastroId) {
		
		sql = "DELETE FROM login WHERE id = ?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, login_cadastroId);
			preparedStatement.executeUpdate();
			
			System.out.println("--correct delete on login");
			
		} catch (SQLException e) {
			System.out.println("--incorrect delete on login. " + e.getMessage());
		}
	};
	
	
	
	
	
	public static List<login_cadastro> find(String Search){sql = String.format("SELECT * FROM login WHERE nome like '%s%%' OR cpf LIKE '%s%%' ", Search, Search);
	List<login_cadastro> login = new ArrayList<login_cadastro>();
	
	try {
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		
		while (resultSet.next()) {
			
			login_cadastro login1 = new login_cadastro();
			
			login1.setId(resultSet.getInt("id"));
			login1.setNome(resultSet.getString("nome"));
			login1.setCpf(resultSet.getString("cpf"));
			
			
			login1.add(login);
			
		}
		
		System.out.println("--correct find login");
		return login;
		
	} catch(SQLException e) {
		System.out.println("--incorrect find login. " + e.getMessage());
		return null;
	}
	
	
}
	
	
	
	
	
	public static login_cadastro findByPk(int login_cadastroId) {
		
		sql = String.format("SELECT * FROM login WHERE id = %d ", login_cadastroId);
		
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			login_cadastro login = new login_cadastro();
			
			while (resultSet.next()) {
				login.setId(resultSet.getInt("id"));
				login.setNome(resultSet.getString("nome"));
				login.setCpf(resultSet.getString("cpf"));
				
			}
			
			System.out.println("--correct find by pk login");
			return login;
			
	} catch(SQLException e) {
		
			System.out.println("--incorrect find by pk login. " + e.getMessage());
			return null;}
		
		
	}
		
	
	
	public static void update(login_cadastro login) {
		
		
		sql = "UPDATE clientes SET nome=?, cpf=?, nascimento=?, situacao=? WHERE id=?";
		 
		 try {
			 PreparedStatement preparedStatement = connection.prepareStatement(sql);
			 
			 preparedStatement.setString(1, login.getNome());
			 preparedStatement.setString(2, login.getCpf());
			 preparedStatement.setInt(3, login.getId());
			 
			 preparedStatement.executeUpdate();
			 
			 System.out.println("--correct update on database");
			 
		 } catch(SQLException e) {
			 System.out.println("--incorrect update on database. " + e.getMessage());
		 }
	}
		
		
		
		
};