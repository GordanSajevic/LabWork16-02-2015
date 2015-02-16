import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Insert {
	
	private static Connection createConnection(String baseName) 
	{
		try {
			return DriverManager.getConnection("jdbc:sqlite:" + baseName);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return null;
		}
		
	}
	
	public static void main(String[] args) 
	{
		Connection db = null;
		db = createConnection("bitbase.db");
		if (db == null)
		{
			System.err.println("Not coonnected");
			System.exit(1);
		}
		
		String sql = "INSERT INTO users VALUES(?, 'gsajevic', '12345');";
		Statement stmt;
		try {
			stmt = db.createStatement();
			stmt.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
				
				
	}

}
