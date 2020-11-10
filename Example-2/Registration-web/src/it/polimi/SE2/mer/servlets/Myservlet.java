package it.polimi.SE2.mer.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.polimi.SE2.mer.beans.Mybean;

/**
 * Servlet implementation class Myservlet
 */
@WebServlet("/myservlet")
public class Myservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	Mybean myb;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter("fullName"); 
		String userEmail = request.getParameter("email"); 
		String userPass = request.getParameter("pass"); 


		PrintWriter writer = response.getWriter(); 
		writer.println("<html>"); 
		writer.println("<body>"); 
		writer.println(myb.beanMethod(userName,userEmail,userPass)); 
		writer.println("</body>"); 
		writer.println("</html>"); 
		writer.close();
	}

}
