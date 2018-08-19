<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1 style="background-color: lightgreen; color: darkgreen;">
			Liste des Produits
		</h1>
		<table cellspacing="0" cellpadding="6" border="1" width="50%">
<!-- 			<tr> -->
<!-- 				<td colspan="7" align="right"> -->
<%-- 					<a href="${pageContext.request.contextPath}/addfonctionnaireform">Ajouter un fonctionnaire</a> --%>
<!-- 				</td> -->
<!-- 			</tr> -->
			
			<tr bgcolor="grey" style="color: white;">
				<th>Identifiant</th>
				<th>Nom</th>
				<th>Prenom</th>
				<th>Fonction</th>
				<th>Departement</th>
				<th>Salaire</th>
<!-- 				<th style="color: grey;">Supprimer</th> -->
<!-- 				<th style="color: green;">Modifier</th> -->
			</tr>
			<c:forEach items="${------}" var="prod">
				<tr bgcolor="lightyellow">
					<td>${prod.idProduit}</td>
					<td>${prod.designation}</td>
					<td>${prod.description}</td>
					<td>${prod.prix}</td>
					<td>${prod.quantite}</td>
					<td><input type="checkbox" value="${prod.selectionne}"/></td>
<!-- 					<td> -->
<%-- 						<a href="${pageContext.request.contextPath}">Supprimer</a> --%>
<!-- 					</td> -->
<!-- 					<td> -->
<%-- 						<a href="${pageContext.request.contextPath}">Modifier</a> --%>
<!-- 					</td> -->
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>