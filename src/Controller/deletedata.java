package Controller;
import java.io.IOException;
import Model.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Controller/deletedata")
public class deletedata extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			int customerId=Integer.parseInt(request.getParameter("customerid"));
			Customer c=new Customer();
			c.deletecustomer(customerId);
			 response.sendRedirect("/firstproject/Customers.jsp"); 
	}

}
