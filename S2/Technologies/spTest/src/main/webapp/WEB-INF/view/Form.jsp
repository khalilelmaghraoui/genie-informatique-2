<%--
  Created by IntelliJ IDEA.
  User: KURAPIKA.dll
  Date: 4/19/2021
  Time: 12:03 AM
  To change this template use File | Settings | File Templates.
--%>


<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>
    <link
        href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
        rel="stylesheet"
        integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
        crossorigin="anonymous">
</head>

<body>

<f:form method="POST" action="addStudent" modelAttribute="student_Model" >

    <label>First name</label>	<br>
    <f:input path="firstName" /><br>
    <label>Last name</label><br>
    <f:input path="lastName" /><br>

    <label>Email</label><br>
    <f:input path="email" /><br>
<%--    <label>Birth date</label><br>--%>
<%--    <f:input type="date" path="birthDate" /><br>--%>
    <label>Contact Number</label><br>
    <f:input path="contactNumber" /><br>
    <input type="submit" value="Submit" /><br>

</f:form>


</body>
</html>
