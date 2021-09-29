<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: KURAPIKA.dll
  Date: 6/15/2021
  Time: 9:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="../fragments/userheader.jsp" />

<div class="container">

    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">

            <jsp:include page="../fragments/usermenu.jsp" />

        </div>
    </nav>

    <div>
        <h3>absence history</h3>
    </div>

    <div>
<div>
        <table class="table">
            <thead class="thead-dark">
            <tr>
                <th scope="col">#idInscription</th>
                <th scope="col">nom et prenom</th>
                <th scope="col">dateHeureDebutAbsence</th>
                <th scope="col">dateHeureDebutAbsence</th>
                <th scope="col">Matiere</th>
                <th scope="col">idTypeSeance</th>
                <th scope="col">etat de l'absence</th>
                <th scope="col">update absence</th>

            </tr>
            </thead>
            <tbody>
            <c:forEach items="${absModel}" var="p">
            <tr>
                <th scope="row">${p.inscription.idInscription}</th>
                <td>${p.inscription.etudiant.nom} ${p.inscription.etudiant.nom}</td>
                <td>${p.dateHeureDebutAbsence}</td>
                <td>${p.dateHeureFinAbsence}</td>
                <td>${p.matiere.nom}</td>
                <td>${p.typeSeance.intitule}</td>
                <td>${p.etat}</td>
               <td><a class="btn btn-primary" href="${pageContext.request.contextPath}/prof/updateAbsence/${p.inscription.idInscription}"
                      role="button">update absence</a></td>
                <td><a class="btn btn-primary" href="${pageContext.request.contextPath}/prof/justifications/${p.idAbsence}"
                      role="button">piece justifications</a></td>

            </tr>
            </c:forEach>

            </tbody>
        </table>
</div>

