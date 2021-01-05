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
var fname = document.reg.fname.value;
var lname = document.reg.lname.value;
var dob = document.reg.dob.value;
var sch = document.reg.s10name.value;
var phone = document.reg.phone.value;
var email = document.reg.email.value;
var a = email.indexOf("@");
var b = email.indexOf(".");
if(fname=="")
{
alert("Your first name field is empty");
}
else if(fname.match(/[0-9]/))
{
window.alert("Type only characters");
}
if(lname=="")
{
alert("Your last name field is empty");
}
else if(lname.match(/[0-9]/))
{
window.alert("Type only characters");
}
if(!dob.match(/(\d{2}-\d{2}-\d{4})/))
{
alert("Enter valid dob");
}
if(document.reg.classs.selectedIndex<0)
{
alert("Select last completed class");
}
t("Please enter your school name");
}
if((phone=="")||(phone.length!=10)||phone.match(/[a-z]/))
{
alert("Enter valid phone number");
}
if(email=="")
{
alert("Enter your email-id");
}
else if((a==-1)&&(b==-1))
{
alert("Enter valid email-id");
}

</script>
</head>
<body>
<h1 align="center"> <div style="background: skyblue;"> New User Registeration </div></h1>
<form action="Register" name="reg">
<fieldset>
<pre>
First Name: <input type="text" name="fname"/>

Last Name: <input type="text" name="lname"/>

D.O.B: <input type="text" name="dob"/>

Last Completed: <select name="classs">

<option value="10">10th grade</option>
<option value="12">12th grade</option>
<option value="ug">Undergraduate</option>
<option value="pg">Postgraduate</option>
</select>

School studied in 10th standard: <select name="school">

<option value="aaa"> aaa school </option>
<option value="bbb"> bbb school </option>
<option value="ccc"> ccc school </option>
</select>

School code: <input type="text" name="code"/>

Phone: <input type="text" name="phone"/>

E-mail: <input type="text" name="email"/>

<input type="submit" name="Submit" value="Submit" onClick="validate()"/>       <input type="reset" name="Clear"/>

<a href="studentchoose.jsp">Return to previous page</a>
</pre>
</fieldset>
<br><br>
<table border = "2" align="left">
<tr><td> School Name </td><td> School Code </td></tr>
<tr><td> aaa school </td><td> 1001 </td></tr>
<tr><td> bbb school </td><td> 1002 </td></tr>
<tr><td> ccc school </td><td> 1003 </td></tr>

</table>
</form>
</body>
</html>