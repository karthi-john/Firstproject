package Model;

import java.sql.*;

public class jdbcconnection{
	
	public static Connection getConnection() throws Exception {
		String url="jdbc:mysql:// localhost:3306/store";
		String user="root";
		String password="Dsquad@123";
		Connection con=null;
	Class.forName("com.mysql.jdbc.Driver");
	 con=DriverManager.getConnection(url,user,password);
	return con;
	}
}