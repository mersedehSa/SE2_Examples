<%@page import="it.polimi.mer.interfaces.ShoppingList_Interface" %>

<%@page import="it.polimi.mer.beans.ShoppingList_Bean" %> 

<%@page import="javax.ejb.EJB" %> 

<%@page import="java.util.List" %>

 <%@page contentType="text/html" pageEncoding="UTF-8"%>   
<!DOCTYPE html>
<%! 
private static ShoppingList_Interface products;


public void jspInit()
	{
	
	try {
		
		javax.naming.InitialContext ic = new javax.naming.InitialContext();
		products= (ShoppingList_Interface) ic.lookup("java:global/SimpleShoppingCardExample/ShoppingList_Bean");
		}catch(Exception e) {
					System.out.println();
			}
		}
%>
<%
if(request.getParameter("addpro")!=null)
{
	String p = request.getParameter("pro");
	products.addNewProduct(p);
}
if(request.getParameter("remPro")!=null)
{
	String p = request.getParameter("pro");
	products.removeProducts(p);
}
%>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> Your shopping List: </h1>
<form  name="myform" method="post"> 
<br> Product Name: <input type="text" name='pro'> 
<input type='submit' value='Add' name='addpro'>
<input type='submit' value='Remove' name='remPro'><br>

<% 
 		if(products!=null) {
	
	List<String> allPs= products.getProducts();
	for(String product: allPs)
	{
		out.println("<br>" + product);
		
	}
	
	out.println("<br> total Products:" + allPs.size());

	}
%>
 

</body>
</html>