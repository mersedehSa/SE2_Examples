<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
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
 
  padding: 2px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: 1;
  background: #ebfafa;
  font-size : 15px;
}

.btn {
  background-color: #29a3a3;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  width: 100%;
  font-size : 15px;
  cursor: pointer;
  
}

.dropbtn {
  background-color: #29a3a3;
  color: white;
  padding: 16px;
  font-size: 16px;
  border: none;
  cursor: pointer;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  z-index: 1;
}

.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
}

.dropdown:hover .dropdown-content {
  display: block;
}

input[type=submit]:hover {
  background-color: #00ace6;
}
</style>
<head>
</head>
<body>


<form  action="MyServ" method="get">
<br>Student ID: <input type="text" placeholder="Enter ID"  name="sid"> 
<br>
  <label for="deps">Department:</label>
  <select name="deps" id="deps" class="dropbtn">
    <option value="deib">DEIB</option>
    <option value="dpis">DPIS</option>
  </select>
  <br><br>
  <input type="submit"  class="btn" value="Submit" name='submitId'>
</form>

</body>

</html>
