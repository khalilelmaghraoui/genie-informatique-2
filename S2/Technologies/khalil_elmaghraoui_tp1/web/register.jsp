<%--
  Created by IntelliJ IDEA.
  User: KURAPIKA.dll
  Date: 4/6/2021
  Time: 8:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
          <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
          <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
  </head>
  <body>
  <%
  String contextPath = request.getServletContext().getContextPath();
  %>
  <div class="container">
      <p>register</p>
      <div class="col-4">
          <form action="<%=contextPath%>/RegisterServlet" method="post">

              <div class="form-group">
                  <label>username</label>
                  <input type="text" name="username" id="username" class="form-control" placeholder="enter username">

              </div>
              <div class="form-group">
                  <label for="email">Email address</label>
                  <input type="email" id="email" class="form-control" name="email" aria-describedby="email" placeholder="Enter email">
                  <small id="ff" class="form-text text-muted">We'll never share your email with anyone else.</small>
              </div>
              <div class="form-group">
                  <label for="password">Password</label>
                  <input type="password" class="form-control"  id="password" name="password" placeholder="Password">
              </div>
              <button type="submit" class="btn btn-primary">Submit</button>
          </form>
      </div>
  </div>
  <a href="login.jsp">login</a>



  </body>

</html>
