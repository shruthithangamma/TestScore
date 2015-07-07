<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
</head>
<body>
	<h2>Welcome to Test Score average calculator!!</h2>
	<form  action="/TestScoreAvg/ScoreServlet" method="post">
	Score: <input type="text" name="score"><br>
	<input type="hidden" id="action" name="action" value="add">
	<input  type="submit" value="Next"> &nbsp;<div style="float:left;"></div>
	</form>
	
	
	<form  action="/TestScoreAvg/DisplayServlet" method="post">
	<input type="hidden" id="action2" name="action2" value="display">
	<input type="submit" value="Submit">
	
	</form>

</body>
</html>