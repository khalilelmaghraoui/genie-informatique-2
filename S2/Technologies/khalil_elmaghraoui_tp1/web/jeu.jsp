<%--
  Created by IntelliJ IDEA.
  User: KURAPIKA.dll
  Date: 4/7/2021
  Time: 6:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>jeu</h1>
<% String Context_path=request.getServletContext().getContextPath(); %>
<div class="container__jouer_page">
    <div class="elements__container">
        ${xx }
        <form method="POST" action="<%=Context_path %>/Jouer">
            <span class="span___text">Entrer le numéro du dé à lancer puis cliquer sur bouton *</span>
            <div class="form___container__">
                <div class="txt____t">Numéro du dé </div>
                <input type="number"  class="input___c" name="Number__de" max="3" min="1" required="required"/>
            </div>
            <input type="submit" value="lancer" class="submit___btn" />
        </form>
    </div>
</div>
</body>
</html>
