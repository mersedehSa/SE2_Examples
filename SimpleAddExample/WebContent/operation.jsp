<%@page import="it.polimi.mer.interfaces.ShoppingList_Interface" %>
<%@page import="java.util.List" %>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> Your shopping List: </h1>

<form action="operationprocess.jsp">  

<br> Product Name: <input type="text" name='pro'> 
<input type='submit' value='Add' name='addpro'>
<input type='submit' value='Remove' name='remPro'><br>
</form>  

<%--
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

%>
 --%>

</body>
</html>
