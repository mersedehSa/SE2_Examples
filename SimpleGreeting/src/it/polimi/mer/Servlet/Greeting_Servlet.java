package it.polimi.mer.Servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.polimi.mer.beans.StatelessGreetingBean;
import it.polimi.mer.interfaces.StatefulGreeting_Interface;

/**
 * Servlet implementation class Greeting_Servlet
 */
@WebServlet("/Greeting_Servlet")
public class Greeting_Servlet extends HttpServlet {
	
private static final long serialVersionUID = 1L;
private static StatefulGreeting_Interface mySFinterface;


@EJB 
private StatelessGreetingBean mySLb;


@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
try {
	InitialContext ic= new InitialContext();
    mySFinterface=(StatefulGreeting_Interface) ic.lookup("java:global/SimpleGreeting/StatefulGreetingBean");
		}catch(Exception e) {
			System.out.println(); }
	
	
	String yourName = request.getParameter("yourName"); 
	
	//
	 request.getSession().setAttribute("name",yourName);  
	 
	 request.getSession().setAttribute("StatelessBeanMessage",mySLb.greeting());  
	 request.getSession().setAttribute("StatelessInstanceNumber",System.identityHashCode(mySLb));  
	 request.getSession().setAttribute("StatelessCount",mySLb.getCount());  

	 request.getSession().setAttribute("StatefulBeanMessage",mySFinterface.greeting());  
	 request.getSession().setAttribute("StatefulInstanceNumber",System.identityHashCode(mySFinterface));  
	 request.getSession().setAttribute("StatefulCount",mySFinterface.getCount()); 
    
	 request.getRequestDispatcher("/greeting.jsp").forward(request, response);  
     
	 
	//
	
	/*
	PrintWriter writer = response.getWriter(); 
	writer.println("<html>"); 
	writer.println("<body>"); 
	writer.println("<h1> Hello " + yourName + "</h1>"); 
	
	writer.println("<pre>");
	writer.println(mySLb.greeting()+ " " + System.identityHashCode(mySLb));
	writer.println("</pre>");
	
	writer.println("<pre> Count: " + mySLb.getCount());
	writer.println("</pre>");
	
	
	writer.println("<pre>");
	writer.println(mySFinterface.greeting() + " " + System.identityHashCode(mySFinterface));
	writer.println("</pre>");
	
	writer.println("<pre> Count: " + mySFinterface.getCount());
	writer.println("</pre>");

	
	writer.println("</body>"); 
	writer.println("</html>"); 
	writer.close();
	*/
}


}
