package it.polimi.SE2.mer.ws;

import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.annotations.jaxrs.QueryParam;

import java.util.List;
import java.util.Objects;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

import it.polimi.SE2.mer.POJO.BookPOJO;
import it.polimi.SE2.mer.controller.BookController;

@Path("/bookExample")
public class BookService {
	
    
	@Inject
	BookController BC;
    
	@GET
	@Path("/bookByname")
    @Produces("application/json")
	public Response getBookByName(@QueryParam("BookName") String name) {
		BookPOJO theBook=BC.getBookByName(name);
		if (Objects.nonNull(theBook)) {
			
			return Response.ok(theBook).build();		
		}
		else
	    return Response.status(404).build();

	}
	
	@GET
	@Path("/books")
    @Produces("application/json")
	public List<BookPOJO> getBooks() {
		return BC.findAllbooks();
	}
	
	
	@POST
	@Path("/books")
	@Consumes("application/json")
	public Response postBook(BookPOJO newBook) {
		
	    BC.insertBook(newBook);
	
			return Response.ok().build();
		
	}
	
	@PUT
	@Path("/books")
	@Consumes("application/json")
	public Response putBook(BookPOJO newBook) {
		
	    BC.updateBook(newBook);
	
			return Response.ok().build();
		
	}
	
	@DELETE
	@Path("/books")
	@Consumes("application/json")
	public Response deleteBook(@QueryParam("BookName") String name) {
		Boolean theAcknowledgment;
		theAcknowledgment= BC.removeBookByName(name);
	    
		if (theAcknowledgment)
	      {return Response.ok().build(); }
	    
	    else return Response.status(404).build();
		
	}
	
	


}
