package Controller;
import Model.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
/*
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;*/


@WebServlet("/Controller/Addproduct")
@MultipartConfig
public class Addproduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Product product=new Product();
			Part part=request.getPart("file") ;
			String filename=part.getSubmittedFileName();
			part.write("/home/diligent/eclipse-workspace/firstproject/WebContent/images/"+filename);
			int price=Integer.parseInt(request.getParameter("price")); 
			product.AddProduct(filename, price);
			 response.sendRedirect("/firstproject/Products.jsp");
		
		 
	}

}
