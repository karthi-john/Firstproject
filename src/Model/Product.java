package Model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.http.Part;

public class Product {
	int id;
	String srcpath;
	int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSrcpath() {
		return srcpath;
	}
	public void setSrcpath(String srcpath) {
		this.srcpath = srcpath;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "product [id=" + id + ", srcpath=" + srcpath + ", price=" + price + "]";
	}
	
	
	public ArrayList<Product> getProducts(){
		String query="select * from products";
		ArrayList<Product> productslist=new ArrayList<Product>();
		try {
			Connection con=jdbcconnection.getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				Product p=new Product();
				p.setSrcpath(rs.getString("productsrc"));
				p.setPrice(rs.getInt("price"));
				productslist.add(p);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return productslist;
	}
	
	public void AddProduct(String srcpath,int price) {
		String query="insert into products(productsrc,price) values(?,?)";
		try {
			Connection con=jdbcconnection.getConnection();
			PreparedStatement pst=con.prepareStatement(query);
			pst.setString(1, "images/"+srcpath);
			pst.setInt(2, price);
			int count=pst.executeUpdate();
			 pst.close();
			 con.close();		
		}
		catch ( Exception e) {
			
			e.printStackTrace();
		}
	}
}
