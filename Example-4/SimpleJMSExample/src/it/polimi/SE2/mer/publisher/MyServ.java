package it.polimi.SE2.mer.publisher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.jms.JMSDestinationDefinition;
import javax.jms.JMSDestinationDefinitions;
import javax.jms.Topic;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * This is a Servelt that acts as a Publisher to Topics : "TopicDFIS" and "TopicDEIB". 
 */
@JMSDestinationDefinitions(
	    value = {
	        @JMSDestinationDefinition(
	            name = "java:/topic/TopicDFIS",
	            interfaceName = "javax.jms.Topic",
	            destinationName = "TopicDFIS"
	        ),
	      @JMSDestinationDefinition(
	    	            name = "java:/topic/TopicDEIB",
	    	            interfaceName = "javax.jms.Topic",
	    	            destinationName = "TopicDEIB"
	    	        )
	    }) 
@WebServlet("/MyServ")
public class MyServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public MyServ() {
        super(); }
   
    @Inject
    private JMSContext context;
    
    @Resource(lookup = "java:/topic/TopicDFIS")
    private Topic topicDFIS; 
    
    @Resource(lookup = "java:/topic/TopicDEIB")
    private Topic topicDEIB; 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		final Destination destinationA = topicDFIS;
		final Destination destinationDEIB = topicDEIB;
		
		String messg = request.getParameter("sid");
		String dep = request.getParameter("deps");
	   
	   PrintWriter writer = response.getWriter(); 
		writer.println("<html>"); 
		writer.println("<body>"); 
		
		 if(dep.equals("deib")) {
				writer.println("dear"+ messg +  "Registration on "+  dep + " Quest Successful!"); 
				context.createProducer().send(destinationDEIB, messg); }
		   else {	
			   writer.println("Registration on "+  dep + " Quest Successful!"); 
			   context.createProducer().send(destinationA, messg); }
		 
	    writer.println("<br>"); 

		writer.println("Check your Server Console to track the Messages"); 

		
		writer.println("</body>"); 
		writer.println("</html>"); 
		writer.close();
	}

}
