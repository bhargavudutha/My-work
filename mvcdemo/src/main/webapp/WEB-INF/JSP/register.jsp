<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.main_container{
width:50%;
margin-left:25%;
margin-top:5%;
background-color:#FFF8DC;
text-align:center;
padding:20px;
border:solid 5px black;
}

.error_message{
color:red;
}
</style>
</head>
<body>

<div class="main_container">
	<h1>Register page</h1><hr>
	<form:form modelAttribute="register" action="saveRegister">
	Username :
	<form:input path="username"/><br/>
	<form:errors path="username" cssClass="error_message" /><br/>
	Password :<form:password path="password"/><br/>
	<form:errors path="password" cssClass="error_message" /><br/><br/>
	Languages :
	<form:checkbox path="languages" value="C"/> C
	<form:checkbox path="languages" value="C++"/> C++
	<form:checkbox path="languages" value="Java"/> Java<br/>
	<form:errors path="languages" cssClass="error_message" /><br/>
	Male : <form:radiobutton path="gender" value="Male"/>
	Female : <form:radiobutton path="gender" value="Female"/><br/>
	<form:errors path="gender" cssClass="error_message" /><br/>
	Country : <form:select path="country">
	<form:option value="" path="country">--Select--</form:option>
	<form:option value="India" path="country">India</form:option>
	<form:option value="France" path="country">France</form:option>
	<form:option value="USA" path="country">USA</form:option>
	</form:select><br/>
	<form:errors path="country" cssClass="error_message" /><br/>
	<br/>
	Date of Birth : <form:input type="date" path="dob"/><br>
	<form:errors path="dob" cssClass="error_message" /><br/>
	<input type="submit" value="Submit" /><br/>
	</form:form>
<hr>
</div>

</body>
</html>