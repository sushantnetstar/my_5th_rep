import java.sql.*;
public class db {
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			String server = "ANALYTICS";
			int port = 1433;
			String user = "sa";
			String password = "sa";
			String database = "CarWale_Com";
			
			String jdbcUrl = "jdbc:sqlserver://"+server+":"+port+";user="+user+";password="+password+";databasename="+database;
			Connection con = DriverManager.getConnection(jdbcUrl);
			con.close();
			
		}
		catch(SQLException e)
		{
			
		}
		catch(ClassNotFoundException e)
		{
			
		}
	}
}
