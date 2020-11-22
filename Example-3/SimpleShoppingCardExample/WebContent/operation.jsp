<%@page import="it.polimi.SE2.mer.interfaces.ShoppingList_Interface" %>
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

input[type=text] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #ebfafa;
  font-size : 20px;
}

.btn {
  background-color: #29a3a3;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  width: 100%;
  font-size : 20px;
  
}
</style>
<head>
<meta charset="UTF-8">
<title>SE2 Shopping List</title>
</head>
<body>
<h1> Manage your Shopping List: </h1>
<hr>
<form action="operationprocess.jsp">  
<div class="container">
<br>Product Name: <input type="text" placeholder="Enter Product Name"  name='pro'> 
<input type='submit' class="btn" value='Add' name='addpro'>
<input type='submit' class="btn" value='Remove' name='remPro'><br>
</div>
</form>  


</body>
</html>
