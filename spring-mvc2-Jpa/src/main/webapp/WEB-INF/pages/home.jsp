<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${msg}</h1><br>

<form action="${pageContext.request.contextPath}/save" method="post">
		UserName: <input type="text" name ="uname" id ="uname"/> 
		<input type="submit" value="Submit">
</form><br><br>
<form action="${pageContext.request.contextPath}/findId" method="post">
		FindId: <input type="text" name ="uid" id ="uid"/> 
		<input type="submit" value="GetId">
</form><br><br>
<form action="${pageContext.request.contextPath}/findAll" method="post">
		FindAll: <input type="submit" value="GetAllData">
</form><br><br>
<form action="${pageContext.request.contextPath}/deleteById" method="post">
		Delete Id: <input type="text" name ="DelId" id ="DelId"/> 
		<input type="submit" value="DeleteById">
</form>

</body>
</html>