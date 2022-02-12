package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import db.MySqlConnection;


public class pagamento_voo{
	
	
	private static Connection connection = MySqlConnection.createConnection();
	private static String sql;
	private String getPreco_Viagem;

	
	public static void create(pagamento_voo pagamento) {
		String sql = "INSERT INTO pagamento (cartao,parcela, pix, preco_viagem )" + "VALUES(?,?,?,?)";
		
		try {
			 PreparedStatement preparedStatement = connection.prepareStatement(sql);
			 
			 preparedStatement.setInt(1, pagamento.getCartao());
			 preparedStatement.setString(2, pagamento.getParcela());
			 preparedStatement.setInt(3, pagamento.getPix());
			 preparedStatement.setInt(4, pagamento.getPreco_Viagem());
			 
			 System.out.println("--correct insert on database");
			 
		 } catch(SQLException e) {
			 System.out.println("--incorrect insert on database. " + e.getMessage());
		 }
	}
		
	
	
	


	private int getPreco_Viagem() {
		// TODO Auto-generated method stub
		return 0;
	}






	private int getPix() {
		// TODO Auto-generated method stub
		return 0;
	}






	private String getParcela() {
		// TODO Auto-generated method stub
		return null;
	}






	private int getCartao() {
		// TODO Auto-generated method stub
		return 0;
	}






	public static void delete(int pagamento_vooId) {
		
		sql = "DELETE FROM pagamento WHERE id = ?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, pagamento_vooId);
			preparedStatement.executeUpdate();
			
			System.out.println("--correct delete on pagamento");
			
		} catch (SQLException e) {
			System.out.println("--incorrect delete on pagamento. " + e.getMessage());
		}
	};
	
	
	
	
	
	public static pagamento_voo findByPk(int pagamento_vooId) {
		
		
		sql = String.format("SELECT * FROM pagamento WHERE id = %d ", pagamento_vooId);
		
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			pagamento_voo pagamento = new pagamento_voo();
			
			while (resultSet.next()) {
				pagamento.setId(resultSet.getInt("id"));
				pagamento.setCartao(resultSet.getString("cartao"));
				pagamento.setParcela(resultSet.getString("parcela"));
				pagamento.setPix(resultSet.getString("pix"));
				pagamento.setPreco_viagem(resultSet.getString("preco_viagem"));

				
			}
			
			System.out.println("--correct find by pk pagamento");
			return pagamento;
			
	} catch(SQLException e) {
		
			System.out.println("--incorrect find by pk pagamento. " + e.getMessage());
			return null;}
		
		
	}
		
	
	
	private void setPreco_viagem(String string) {
		// TODO Auto-generated method stub
		
	}






	private void setPix(String string) {
		// TODO Auto-generated method stub
		
	}






	private void setParcela(String string) {
		// TODO Auto-generated method stub
		
	}






	private void setCartao(String string) {
		// TODO Auto-generated method stub
		
	}






	private void setId(int int1) {
		// TODO Auto-generated method stub
		
	}






	public static void update(pagamento_voo pagamento) {
		
		
		sql = "UPDATE clientes SET cartao=?, parcela=?, pix=?, preco_viagem=? WHERE id=?";
		 
		 try {
			 PreparedStatement preparedStatement = connection.prepareStatement(sql);
			 
			 preparedStatement.setInt(1, pagamento.getCartao());
			 preparedStatement.setString(2, pagamento.getParcela());
			 preparedStatement.setInt(3, pagamento.getPix());
			 preparedStatement.setInt(4, pagamento.getPreco_Viagem());
			 
			 preparedStatement.executeUpdate();
			 
			 System.out.println("--correct update on database");
			 
		 } catch(SQLException e) {
			 System.out.println("--incorrect update on database. " + e.getMessage());
		 }
	}
	
}
		
		