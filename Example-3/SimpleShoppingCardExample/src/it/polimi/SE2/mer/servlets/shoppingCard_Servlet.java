package it.polimi.SE2.mer.servlets;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.polimi.SE2.mer.interfaces.ShoppingList_Interface;

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
				}
	
	}
	

	
}



