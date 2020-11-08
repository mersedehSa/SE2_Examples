<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<style>
body {
  font-family: Helvetica;
  background-color: white;
}

.container {
  padding: 5px;
}

.SLbean {
  background-color: #e6ccff;
  text-align: left;
  size:10
}

.SFbean {
  background-color: #cce6ff;
  text-align: left;
  size:10
}
</style>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>Hi dear ${name} </p>
<hr>

<div class="container SLbean">
<p>${StatelessBeanMessage} </p> 
<p>Object Id is:  ${StatelessInstanceNumber} </p>
<p>${StatelessCount} other persons have used this object! </p>
</div>
<hr>

<div class="container SFbean">
<p>${StatefulBeanMessage} </p> 
<p>Object Id is:  ${StatefulInstanceNumber} </p>
<p>${StatefulCount} other persons have used this object!  </p>
</div>
<hr>
</body>
</html>