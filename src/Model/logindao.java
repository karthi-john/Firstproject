package Model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServlet;

public class logindao {
	public boolean logincheck(String username,String password){
		String query="select username,password from users where username=? and password=?;";
		Connection con;
		try {
			con = jdbcconnection.getConnection();
			PreparedStatement pst=con.prepareStatement(query);
			pst.setString(1, username);
			pst.setString(2,password);
			ResultSet rs= pst.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch (Exception e) {
						e.printStackTrace();
		}
		
		return false;
	}

}
