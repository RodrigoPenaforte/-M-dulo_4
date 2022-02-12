package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import db.MySqlConnection;
import model.escolha_voo;

public class escolha_voo_crud {
	
	private static Connection connection = MySqlConnection.createConnection();
	private static String sql;
	
	
	
	public void create(escolha_voo escolha) {
		String sql = "INSERT INTO login (embarque, desembarque, horario, datavoo)" + "VALUES(?,?,?,?)";
		
		try {
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			 preparedStatement.setString(1, escolha.getEmbarque());
			 preparedStatement.setString(2, escolha.getDesembarque());
			 preparedStatement.setString(3,escolha.getHorario());
			 preparedStatement.setDate(4, (java.sql.Date) new Date(escolha.getDatavoo().getTime()));
			 
			 preparedStatement.executeUpdate();
			 
			 System.out.println("--correct insert on database");
			
		}catch(SQLException e) {
			
			 System.out.println("--incorrect insert on database. " + e.getMessage());
		}
		
	}
	
	public void delete(int escolha) {
		
		sql = "DELETE FROM escolha WHERE id = ?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, escolha);
			preparedStatement.executeUpdate();
			
			System.out.println("--correct delete on escolha");
			
		} catch (SQLException e) {
			System.out.println("--incorrect delete on escolha. " + e.getMessage());
		}
		
		
		
	}
	
	
	public static escolha_voo findByPk(int escolha_vooId) {
		
		sql = String.format("SELECT * FROM login WHERE id = %d ", escolha_vooId);
		
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			escolha_voo escolha = new escolha_voo();
			
			while (resultSet.next()) {
				escolha.setId(resultSet.getInt("id"));
				escolha.setEmbarque(resultSet.getString("embarque"));
				escolha.setDesembarque(resultSet.getString("desembarque"));
				escolha.setHorario(resultSet.getString("horario"));
				
				
			}
			
			System.out.println("--correct find by pk escolha");
			return escolha;
			
	} catch(SQLException e) {
		
			System.out.println("--incorrect find by pk escolha. " + e.getMessage());
			return null;}
		
		
	}


	public static void update(escolha_voo escolha) {
	
	
	sql = "UPDATE clientes SET embarque=?, desembarque=?, horario=?, datavoo=? WHERE id=?";
	 
	 try {
		 PreparedStatement preparedStatement = connection.prepareStatement(sql);
		 
		 preparedStatement.setString(1, escolha.getEmbarque());
		 preparedStatement.setString(2, escolha.getDesembarque());
		 preparedStatement.setString(3, escolha.getHorario());
		 preparedStatement.setDate(4, (java.sql.Date) new Date(escolha.getDatavoo().getTime()));
		 
		 preparedStatement.setInt(5, escolha.getId());
		 
		 preparedStatement.executeUpdate();
		 
		 System.out.println("--correct update on database");
		 
	 } catch(SQLException e) {
		 System.out.println("--incorrect update on database. " + e.getMessage());
	 }
	}
	
	
	
};
		
	
	
	
	

	
	