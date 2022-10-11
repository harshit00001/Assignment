<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
     <%@ page import="Day16.com.training.web.Login" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%-->String userName =(String)request.getAttribute("user");
String password =(String)request.getAttribute("pass");<--%>
<%
List<Login> login=(ArrayList<Login>)request.getAttribute("logIn");
%>
<h1>Welcome</h1>
<%--<% for(Login ln: login){
	out.println(ln);
	}
--%>

 <table>
<% for(Login ln: login){
	%>
	<tr>
	<td><% out.println(ln);%></td>
	</tr>
	<%} %>

</table>


</body>
</html>