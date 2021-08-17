<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
.tablepro
{border-collapse:collapse;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hcl Technologies</title>
</head>
<body>
<table border="1" class="tablepro">
<tr><th>Id</th><th>Username</th><th>Country</th><th>Gender</th><th>Languages</th><th>Edit</th><th>Delete</th></tr>
<c:forEach var="emp" items="${listOfUsers}">  
   <tr>
<td>${emp.id}</td>
<td>${emp.username}</td>
<td>${emp.country}</td>
<td>${emp.gender}</td>
<td>${emp.languages}</td>
<td><a href="EditUser?id=<c:out value='${emp.id}'/>">Edit</a></td>
<td><a href="/DeleteUser">Delete</a></td>
</tr> 
   </c:forEach>
</table> 
</body>
</html>