import java.sql.*;

public class DBConnection {
	
	public static void main(String[] args) 
	{
		Connection c = null;
		try {
			c = DriverManager.getConnection("jdbc:sqlite:bitbase.db");
			System.out.println("Connected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
