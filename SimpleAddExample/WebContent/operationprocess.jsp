<%@page import="it.polimi.mer.interfaces.ShoppingList_Interface" %>
<%@page import="java.util.List" %>
 <hr/> <jsp:include page="operation.jsp"></jsp:include>
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
//here, for the sake of demostration only, I simply assumed that all products are 1 euro !
out.println("<br>");

out.println("<br> Total Products Price: " + allPs.size() + " Euros");



}

%>