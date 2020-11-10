<!DOCTYPE html>
<html>

<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
  font-family: Helvetica;
}

input[type=text], input[type=password] {
  width: 100%;
  padding: 10px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
  font-size : 10px;
}

/* Set a style for the submit button */
.registerButton {
  background-color: #ccffe6;
  color: black;
  padding: 16px 20px;
  border: none;
  width: 100%;
  font-size : 20px; 
}

hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}


</style>
</head>
<body>

<form action="myservlet">

<h2>SE2 Demonstrator: Registration</h2>
 
<hr>

    <label for="email"><b>Name</b></label>
    <input type="text" placeholder="Enter Name" name="fullName" id="email" required>
    
        <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" id="email" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="pass" id="psw" required>

    
    <button type="submit" class="registerButton" >Register</button>
 
</form>


</body>
</html>
