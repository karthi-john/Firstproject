package Controller;
import Model.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;


@WebServlet("/Controller/Customers")
public class Customers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Customer c=new Customer();
		ArrayList<Customer> customers=c.getCustomers();
		Gson gson = new GsonBuilder().create();
		JsonArray myCustomArray = gson.toJsonTree(customers).getAsJsonArray();
		  PrintWriter out=response.getWriter();
			out.print(myCustomArray.toString());
	}
}
