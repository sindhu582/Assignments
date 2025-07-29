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
    String name = (String) session.getAttribute("name");
    String password = (String) session.getAttribute("password");
    out.println("Hello Mr. / Miss "+name+" ,Your password is:"+password);
%>

</body>
</html>