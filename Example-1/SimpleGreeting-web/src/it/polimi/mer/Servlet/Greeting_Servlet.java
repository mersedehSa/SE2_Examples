package it.polimi.mer.Servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.polimi.SE2.mer.beans.StatefulGreeting_Interface;
import it.polimi.SE2.mer.interfaces.StatelessGreetingBean;

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
    mySFinterface=(StatefulGreeting_Interface) ic.lookup("java:global/SimpleGreetingEA/SimpleGreetingEJB/StatefulGreetingBean!it.polimi.SE2.mer.beans.StatefulGreeting_Interface");
		}catch(Exception e) {
			System.out.println(); }
	
	
	String yourName = request.getParameter("yourName"); 
	
	//
	 request.getSession().setAttribute("name",yourName);  
	 
	 request.getSession().setAttribute("StatelessBeanMessage",mySLb.greeting()); 
	 request.getSession().setAttribute("StatelessCount",mySLb.getCount());  
	 request.getSession().setAttribute("StatelessInstanceNumber",System.identityHashCode(mySLb));  

	 request.getSession().setAttribute("StatefulBeanMessage",mySFinterface.greeting());  
	 request.getSession().setAttribute("StatefulInstanceNumber",System.identityHashCode(mySFinterface));  
	 request.getSession().setAttribute("StatefulCount",mySFinterface.getCount()); 
    
	 request.getRequestDispatcher("/greeting.jsp").forward(request, response);  
     
	
}


}
