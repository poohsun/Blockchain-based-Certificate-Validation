<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Certificate Validation System </title>
<script>
function validate()
{
var uname = document.login.uname.value;
var pwd = document.login.value;

if(uname=="")
{
alert("Your first name field is empty");
}
if(pwd=="")
{
alert("Your last name field is empty");
}
</script>
</head>
<body>
<h1 align="center"> <div style="background: skyblue;"> Student Login Page </div></h1>
<form action="Login" name="login">
<pre>
Username : <input type="text" name="uname"/>

Password : <input type="text" name="pwd"/>

<input type="submit" name="Submit" onClick="validate()"/></td>       <input type="reset" name="Clear"/>

<a href="studentchoose.jsp">Return to previous page</a>

<a href="forgotpwd.jsp">Forgot Password? Reset here.....</a>
</pre>
</form>
</body>