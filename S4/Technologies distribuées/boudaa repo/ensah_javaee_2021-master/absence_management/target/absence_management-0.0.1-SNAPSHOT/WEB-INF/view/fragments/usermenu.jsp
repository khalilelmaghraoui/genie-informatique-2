<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>

<div class="collapse navbar-collapse" id="navbarNav">
	<ul class="navbar-nav">
		<li class="nav-item"><a class="nav-link active"
			aria-current="page"
			href="${pageContext.request.contextPath}/prof/showHome">Home</a></li>

		<li class="nav-item">
            <li class="nav-item"><a class="nav-link active"
               aria-current="page" href="${pageContext.request.contextPath}/prof/searchClass">absence panel</a></li>

        <li class="nav-item"><form
            action="${pageContext.request.contextPath}/prof/serachEtudiant"
            class="d-flex" method="GET">
            <input name="cne" class="form-control me-2" type="search"
                   placeholder="Saisir CNE" aria-label="Search">
            <button class="btn btn-outline-success" type="submit">Search</button>
        </form></li>

		<f:form action="${pageContext.request.contextPath}/logout" method="POST">

			<button type="submit" class="btn btn-link">logout</button>

			</f:form></li>
	</ul>
</div>
