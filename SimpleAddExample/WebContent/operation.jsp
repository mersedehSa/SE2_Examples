<%@page import="it.polimi.mer.interfaces.ShoppingList_Interface" %>
<%@page import="java.util.List" %>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> Your Shopping List: </h1>

<form action="operationprocess.jsp">  

<br> Product Name: <input type="text" name='pro'> 
<input type='submit' value='Add' name='addpro'>
<input type='submit' value='Remove' name='remPro'><br>
</form>  


</body>
</html>
