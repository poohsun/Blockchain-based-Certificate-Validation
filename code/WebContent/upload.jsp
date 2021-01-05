<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Certificate Validation System </title>
</head>
<body>
<h1 align="center"> <div style="background: skyblue;"> Certificate Hash Upload Page </div></h1>
<form action="" name="upload">
<pre>
<a href= "https://hash.online-convert.com/sha256-generator">Click here to convert certificate to hash value</a>




Username : <input type="text" name="uname"/>

Hash value of certificate : <input type="text" name="pwd"/>

<input type="submit" name="Submit" onClick="validate()"/></td>       <input type="reset" name="Clear"/>

<a href="login.jsp">Logout</a>


</pre>
</form>
</body>
</html>