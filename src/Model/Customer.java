package Model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Customer{
	int Id;
	String Name;
	String City;
	String Mobile;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	@Override
	public String toString() {
		return "Customer [Id=" + Id + ", Name=" + Name + ", City=" + City + ", Mobile=" + Mobile + "]";
	}

	public ArrayList<Customer> getCustomers() {
		ArrayList<Customer> customerdetails=new ArrayList<Customer>();
		try {
			
			String query="select * from customers";
			Connection con=jdbcconnection.getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				Customer c=new Customer();
				c.setId(rs.getInt("customerid"));
				c.setName(rs.getString("customername"));
				c.setCity(rs.getString("customercity"));
				c.setMobile(rs.getString("customermobile")); 
				customerdetails.add(c);
			}
			
			
			
		}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return customerdetails;
		
	}
	public void setCustomers(String Name,String City,String Mobile) {
		String query="insert into customers(customername,customercity,customermobile) values(?,?,?);";
		try {
			Connection con=jdbcconnection.getConnection();
			PreparedStatement pst=con.prepareStatement(query);
			pst.setString(1,Name);
			pst.setString(2,City);
			pst.setString(3,Mobile);
			int count=pst.executeUpdate();
			
			pst.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void deletecustomer(int Id) {
		String query="delete from customers where customerid="+Id;
		try {
			Connection con=jdbcconnection.getConnection();
			PreparedStatement st=con.prepareStatement(query);
			int count=st.executeUpdate();
			st.close();
			con.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
}

