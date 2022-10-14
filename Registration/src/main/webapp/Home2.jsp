<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>

    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String userType =(String)request.getAttribute("UserType");
out.println("The User Type is : "+userType);
%>
<c:forEach items="${RegisteredUser}" var="rDetail">
<p>${rDetail}</p>
</c:forEach>

</body>
</html>