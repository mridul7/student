// hello
package connection;

import java.sql.*;

public class DbConnection {
	private static Connection connection = null;
	private DbConnection()
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
	public static Connection getConnection()
	{
		try {
			if(connection==null|| connection.isClosed())
			{
				new DbConnection();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

}
