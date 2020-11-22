package it.polimi.SE2.mer.ws;


import javax.ws.rs.GET;
import javax.ws.rs.Path;


import org.jboss.resteasy.annotations.jaxrs.QueryParam;

@Path("/SimpleArithmetic")
public class SimpleArithmeticService{
	
	
	@GET
	@Path("/add")
	public Integer add(@QueryParam("n1") Integer n1, @QueryParam("n2") Integer n2) {
		return n1+n2;
	}
	
	@GET
	@Path("/sub")
	public Integer subs(@QueryParam("n1") Integer n1, @QueryParam("n2") Integer n2) {
		return n1-n2;
	}
	
	@GET
	@Path("/multip")
	public Integer multip(@QueryParam("n1") Integer n1, @QueryParam("n2") Integer n2) {
		return n1*n2;
	}
	
	

}
