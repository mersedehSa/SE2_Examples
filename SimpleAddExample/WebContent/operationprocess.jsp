<%@page import="it.polimi.mer.interfaces.ShoppingList_Interface" %>
<%@page import="java.util.List" %>
<html>
<style>
body {
  font-family: Helvetica;
  background-color: while;
}
* {
  box-sizing: border-box;
}

.container {
  padding: 10px;
  background-color: #d6f5f5;
}

</style>
<head>
</head>
<body>
 
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
out.println("<div class= \" container \" >");
out.println("<br> your list  contains: ");
out.println("<br>");
for(String product: allPs)
{
	out.println("<br>" + product);
	
}


//here, for the sake of demostration only, I simply assumed that all products are 1 euro !
out.println("<hr>");

out.println("<br> Total Price: " + allPs.size() + " Euros");



}

%>
</body>
</html>