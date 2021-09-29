<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/security/tags"%>


<jsp:include page="../fragments/userheader.jsp" />
<div class="container">

    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">

            <jsp:include page="../fragments/usermenu.jsp" />

        </div>
    </nav>
    <div>
        <h3>Prof home page</h3>
        <p>Hello and welcome to your application</p>

    </div>

    <f:form action="absenceForm" method="post"  modelAttribute="absenceModel">



    <div>
        <table class="table">
            <thead class="thead-dark">
            <tr>
                <th scope="col">#idInscription</th>
                <th scope="col">nom</th>
                <th scope="col">prenom</th>
                <th scope="col">cne</th>
                <th scope="col">photo</th>
                <th scope="col">set Absence</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${inscriptions}" var="p">
                <tr>
                    <th scope="row">${p.idInscription}</th>
                    <td>${p.etudiant.nom}</td>
                    <td>${p.etudiant.prenom}</td>
                    <td>${p.etudiant.cne}</td>
                    <td>${p.etudiant.photo}</td>
<td>
                    <ul>
                        <li><a
                            href="${pageContext.request.contextPath}/prof/absenceForm/?idInscription=${p.idInscription}">set absence </a></li>

                    </ul>
</td>
                </tr>
            </c:forEach>

            </tbody>
        </table>
    </div>

    <td> <div style="text-align: right">
        <button type="submit" class="btn btn-primary">Enregistrer</button>
        <button type="reset" class="btn btn-secondary">Annuler</button>
    </div></td>

    </f:form>


    <jsp:include page="../fragments/userfooter.jsp" />
