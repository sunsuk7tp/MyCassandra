import java.sql.*;

public class DBInstance {
	Connection conn;
	
	public DBInstance() {
		conn = new DBConfigure().connect();
	}
	
	int Insert(String Table, String Value) throws SQLException {
		try {
			String sPrepareSQL = "INSERT INTO "+Table+" (val) VALUES (?)";
			PreparedStatement pst = conn.prepareStatement(sPrepareSQL);
			
			pst.setString(1, Value);
			
			return pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println("データベース接続エラー　"+ e);
			return -1;
		}
	}
	
	int Update(String Table, int key, String Value) throws SQLException {
		try {
			String sPrepareSQL = "UPDATE "+Table+" SET val = ? Where id = ?";
			PreparedStatement pst = conn.prepareStatement(sPrepareSQL);
			
			pst.setString(1, Value);
			pst.setInt(2, key);
			
			return pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println("データベース接続エラー　"+ e);
			return -1;
		}
	}
	
	int Delete(String Table, String columnName, String columnValue) throws SQLException {
		try {
			String sPrepareSQL = "DELETE FROM "+Table+" Where "+columnName+" = ?";
			PreparedStatement pst = conn.prepareStatement(sPrepareSQL);
			
			pst.setString(1, columnValue);
			
			return pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println("データベース接続エラー　"+ e);
			return -1;
		}
	}
	
	ResultSet Select(String Table, String columnName, String columnValue) throws SQLException {
		try {
			String sPrepareSQL = "SELECT * FROM "+Table;
			if(columnName != null) sPrepareSQL += " Where "+columnName+" = ?";
			
			PreparedStatement pst = conn.prepareStatement(sPrepareSQL);
			if(columnName != null) pst.setString(1, columnValue);
			
			return pst.executeQuery();
		} catch (SQLException e) {
			System.out.println("データベース接続エラー　"+ e);
			return null;
		}		
	}
}
