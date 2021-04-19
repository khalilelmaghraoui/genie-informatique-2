<%--
  Created by IntelliJ IDEA.
  User: KURAPIKA.dll
  Date: 4/7/2021
  Time: 5:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<%
    String contextPath = request.getServletContext().getContextPath();


%>


<h1>Login</h1>
<form action="<%=contextPath%>/Servlet">
    <label for="username" id="username">email: </label>
    <input name="username" type="text" required>
    <label for="password" id="password">password: </label>
    <input name="password" type="password" required>
    <input type="submit" value="">
</form>

<a href="register.jsp">register</a>

</body>
</html>
