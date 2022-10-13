<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ page import="com.training.web.Login" %>
     <%@ page import="com.training.web.Course" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:forEach items="${courseDetail}" var="course">
<p>${course}</p>
</c:forEach>


<%-->String userName =(String)request.getAttribute("user");
String password =(String)request.getAttribute("pass");<--%>
<%-- 
<%
List<Login> login=(ArrayList<Login>)request.getAttribute("logIn");
%>
--%>

<%-- 
 <table>
<% for(Login ln: login){
	%>
	<tr>
	<td><% out.println(ln);%></td>
	</tr>
	<%} %>

</table>
<% for(Login ln: login){
	out.println(ln);
	}
%>
--%>



</body>
</html>