<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FORM</title>
</head>
<body>
     <%
     String name,password;
     name = request.getParameter("name");
     password = request.getParameter("password");
     out.println("Hello Mr. / Miss "+name+" ,Your password is:"+password);
     %>
</body>
</html>