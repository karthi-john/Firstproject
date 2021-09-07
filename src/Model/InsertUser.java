package Model;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertUser {
		public Boolean SetUser(String username,String password) {
			String query="insert into users(username,password) values(?,?);";
			try {
				Connection con=jdbcconnection.getConnection();
				PreparedStatement pst=con.prepareStatement(query);
				pst.setString(1, username);
				pst.setString(2, password);
				int count=pst.executeUpdate();
				pst.close();
				con.close();
				return true;
			} catch (Exception e) {
				return false;
			}
			
		}
}
