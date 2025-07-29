<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
    String name = request.getParameter("name");
    String password = request.getParameter("password");

    // Store values in session
    session.setAttribute("name", name);
    session.setAttribute("password", password);
%>
 <h2>Data is stored successfully</h2>
    <p><a href="Second.jsp">click here</a></p>
</body>
</html>