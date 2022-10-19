<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action = "/save" method ="post">
		Username: <input type ="text" name="uname"/><br><br>
		Salary: <input type = "text" name = "sal"/><br>
		<input type = submit value = "submit"/>
	</form><br><br>
<form action="/findId" method="post">
		FindId: <input type="text" name ="uid" id ="uid"/> 
		<input type="submit" value="GetId">
</form><br><br>
<form action="/findAll" method="post">
		FindAll: <input type="submit" value="GetAllData">
</form><br><br>
<form action="/deleteById" method="post">
		Delete Id: <input type="text" name ="DelId" id ="DelId"/> 
		<input type="submit" value="DeleteById">
</form>
</body>
</html>