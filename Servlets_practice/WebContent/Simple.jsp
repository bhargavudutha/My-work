<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<HTML>
 <HEAD>
  <TITLE>Using the for Statement</TITLE>
 </HEAD>

 

 <BODY>
 <c:set var="count" value="4,3,2,1"/>
 <c:ForEach items="${count}" var="item"begin="2" end ="3" varStatus="status">
 <c:out value="${status.count}"/>
 </c:ForEach>
  </BODY>
 <%-- <BODY>
  <H1>Using the for Statement</H1>
  <%
    int array[] = {1, 2, 3, 4, 5}, sum = 0;

 

    for (int loopIndex = 0;loopIndex < array.length;sum += array[loopIndex++]);

 

    out.println("The average = " + sum / array.length);
  %>
 </BODY>--%>
 <%--  <BODY>
  <H1>Finding Average Grades</H1>
  <%
    double grades[] = {88, 98, 73, 56, 86, 64};
    double sum1=0, average;
    for (int loopIndex = 0; loopIndex < grades.length; loopIndex++) {
      sum1 += grades[loopIndex];
    }
    average = sum1 / grades.length;
    out.println("Average grade = " + average);
  %>
  <%-- <BODY>
  <H1>Using the break Statement</H1>
  <%
    double array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int sum = 0;
    for(int loopIndex = 0; loopIndex <
      array.length; loopIndex++) {
      sum += array[loopIndex];
      if (sum > 12) break;
      out.println("Looping...<BR>");
    }
    out.println("The sum exceeded the maximum allowed value.");
  %>
 </BODY>--%>
 
 </HTML>