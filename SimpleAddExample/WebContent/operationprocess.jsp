<%@page import="it.polimi.mer.interfaces.ShoppingList_Interface" %>
<%@page import="java.util.List" %>

<% 

ShoppingList_Interface ProductsRemote=(ShoppingList_Interface)session.getAttribute("remote"); 

if(request.getParameter("addpro")!=null)
{
	String p = request.getParameter("pro");
	ProductsRemote.addNewProduct(p);
}
if(request.getParameter("remPro")!=null)
{
	String p = request.getParameter("pro");
	ProductsRemote.removeProducts(p);
}

if(ProductsRemote!=null) {
	
List<String> allPs= ProductsRemote.getProducts();
for(String product: allPs)
{
	out.println("<br>" + product);
	
}

out.println("<br> total Products:" + allPs.size());

}

%> <hr/> <jsp:include page="operation.jsp"></jsp:include>