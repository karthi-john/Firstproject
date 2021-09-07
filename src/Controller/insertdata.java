package Controller;
import Model.Customer;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Controller/insertdata")
public class insertdata extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String customerName=req.getParameter("customername");
		String customerCity=req.getParameter("customercity");
		String customerMobile=req.getParameter("customermobile");
		Customer c=new Customer();
		c.setCustomers(customerName, customerCity, customerMobile);
		res.sendRedirect("/firstproject/Customers.jsp");
	}
}
