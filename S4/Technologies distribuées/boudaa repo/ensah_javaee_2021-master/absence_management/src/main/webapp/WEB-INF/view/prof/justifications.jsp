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
        <h1>justifications</h1>
    </div>
<f:form action="absenceForm" method="post"  modelAttribute="justificativesPieces">



    <div>
        <table class="table">
            <thead class="thead-dark">
            <tr>
                <th scope="col">#idabsence</th>
                <th scope="col">idPieceJustification</th>
                <th scope="col">text</th>

            </tr>
            </thead>
            <tbody>
            <c:forEach items="${justificativesPieces}" var="p">
                <tr>
                    <th scope="row">${p.idAsence}</th>
                    <td>${p.idPieceJustification}</td>
                    <td>${p.text}</td>

                    <td>
                        <ul>
                            <li><a
                                href="${pageContext.request.contextPath}/prof/acceptJustif/?idAbsence=${p.idAsence}">accept </a></li>

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
