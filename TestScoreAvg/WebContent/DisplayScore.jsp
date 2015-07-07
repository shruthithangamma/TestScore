<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="javax.servlet.ServletContext" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="javax.servlet.RequestDispatcher" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>hello!!<p>
<table>
	<tr>
		<th>Id</th>
		<th></th>
		<th>Score</th>
		<th></th>
		<th>Score Date</th>
		<th></th>
		<th>Score Time</th>
	</tr>
    <c:forEach var="score" items="${scoreList}">
		<tr>
			<td><c:out value="${score.id}" /></td>
			<td></td>
			<td><c:out value="${score.testscore}"/></td>
			<td></td>
			<td><c:out value="${score.scoredate}" /></td>
			<td></td>
			<td><c:out value="${score.scoretime}" /></td>
		</tr>		
	</c:forEach>
		
</table>
	
Total: <c:out value="${total}"/><br>
Average:	<c:out value="${average}"/>
   </body>
</html>