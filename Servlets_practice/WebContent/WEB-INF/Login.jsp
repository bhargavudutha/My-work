<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
#username
{
width:100%;
}
#petshop
{
background-color:black;
color:white;

 

}
#signup
{
float:right;
color:white;
} 
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="LoginServlet" method="post">
<div id="petshop">
PetShop

 

<a href="Register.jsp"><span id="signup">Signup</span></a>
</div>
<h2>Login</h2>
Username:<br/>
<input id="username" type="text" name="username"><br/><br/>
Password:<br/>
<input  id="username" type="password" name="password"><br/><br/>
<input type="submit" value="Submit"/>
</form>
</body>
</html>