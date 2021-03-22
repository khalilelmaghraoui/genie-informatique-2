<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>info</title>
</head>
<body>
	<%
	        String nom = request.getParameter("nom");
	        String prenom = request.getParameter("prenom");
	        String email = request.getParameter("email");
	        String telephone = request.getParameter("telephone");
	        Date dateNaissance = new Date(request.getParameter("date").replace("-", "/"));
	        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	        String date = sdf.format(dateNaissance);
	        String sexe = "";
	        if (request.getParameter("sexe").equals("Masculin")) {
            	sexe = "Homme";
	        } else {
	            sexe = "Femme";
	        }
	        String pays = request.getParameter("pays");
	        String[] langauges = request.getParameterValues("langage");
	        StringBuffer s = new StringBuffer();
	        for (String st : langauges) {
	            s.append(st + ",");
	        }
	    %>
	    
	    <body>
	        <fieldset>
	            <legend>Informations</legend>
	            <table border="2">
	                <tr>
	                    <td>Nom : </td>
	                    <td><%= nom%></td>
	                </tr>
	                <tr>
	                    <td>Prénom : </td>
	                    <td><%= prenom%></td>
	                </tr>
	                <tr>
	                    <td>Email : </td>
	                    <td><%= email%></td>
	                </tr>
	                <tr>
	                    <td>Date de naissance : </td>
	                    <td><%= date%></td>
	                </tr>
	                <tr>
	                    <td>Téléphone : </td>
	                    <td><%= telephone%></td>
	                </tr>
	                <tr>
	                    <td>Sexe : </td>
	                    <td><%= sexe%></td>
	                </tr>
	                <tr>
	                    <td>Pays : </td>
	                    <td><%= pays%></td>
	                </tr>
	                <tr>
	                    <td>Languages préférés : </td>
	                    <td>
	                        <%= s.substring(0, s.length() - 1)%>
	                    </td>
	                </tr>
	            </table>
	 
	        </fieldset>
</body>
</html>