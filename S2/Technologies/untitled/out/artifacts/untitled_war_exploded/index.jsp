<%--
  Created by IntelliJ IDEA.
  User: KURAPIKA.dll
  Date: 4/3/2021
  Time: 12:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
        // on recupere le path du context de l'application dynamiquement
    String contextPath = request.getServletContext().getContextPath();
    // le contexte peut etre egalement avec $(pageContext.request.getContextPath)
    // la deuxieme methode et prefere


%>
<html>
  <head>
    <title>hello</title>
  </head>
  <body>
  <h1>Admin Form </h1>
  <form action="<%=contextPath%>/Servlet" method="post">
    nome :   <input type="text"><br>
    password :   <input type="password"><br>
      <input type="submit" name="button"  value="envoyer">
  </form>
  </body>
</html>
