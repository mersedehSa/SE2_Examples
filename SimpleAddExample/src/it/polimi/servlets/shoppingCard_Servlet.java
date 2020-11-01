package it.polimi.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.polimi.mer.interfaces.ShoppingList_Interface;

/**
 * Servlet implementation class shoppingCard_Servlet
 */
@WebServlet("/shoppingCard_Servlet")
public class shoppingCard_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static ShoppingList_Interface products;
   
    public shoppingCard_Servlet() {
        super();
    }
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String theProduct = request.getParameter("pro"); 
		
		try {
			
			javax.naming.InitialContext ic = new javax.naming.InitialContext();
			products= (ShoppingList_Interface) ic.lookup("java:global/SimpleShoppingCardExample/ShoppingList_Bean");
			
			 request.getSession().setAttribute("remote",products);  
	         request.getRequestDispatcher("/operation.jsp").forward(request, response);  
	         
			}catch(Exception e) {
						System.out.println();
				}//try
			    

		/*	
	
		if(request.getParameter("addpro")!=null)
			{
		
				products.addNewProduct(theProduct);
			}
		if(request.getParameter("remPro")!=null)
			{
				products.removeProducts(theProduct);
			}
	
		PrintWriter writer = response.getWriter(); 
		
		if(products!=null) {
			
			List<String> allPs= products.getProducts();
			for(String product: allPs)
			{
				out.println("<br>" + product);
		
			}
			
		*/
	
	}//	servlet
	

	
}



