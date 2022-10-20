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
		Product Name: <input type ="text" name="pname"/><br><br>
		Price: <input type = "text" name = "price"/><br><br>
		<input type = submit value = "submit"/>
	</form><br><br>
<form action="/findId" method="post">
		FindByProductId: <input type="text" name ="pid" id ="pid"/> 
		<input type="submit" value="Get">
</form><br><br>
<form action="/findAll" method="post">
		FindAllProductData: <input type="submit" value="GetAll">
</form><br><br>
<form action="/deleteById" method="post">
		DeleteByProductId: <input type="text" name ="DelId" id ="DelId"/> 
		<input type="submit" value="Delete">
</form>
</body>
</html>