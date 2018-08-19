<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ajouter des produits au panier</title>
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
				<th>Designation</th>
				<th>Description</th>
				<th>Prix</th>
				<th>Quantite</th>
				<th>Ajouter au panier</th>
			</tr>
			<c:forEach items="${ListeProduits}" var="prod">
				<tr bgcolor="lightyellow">
					<td>${prod.designation}</td>
					<td>${prod.description}</td>
					<td>${prod.prix}</td>
					<td>${prod.quantite}</td>
					<td><a href="${pageContext.request.contextPath}/ajouterpanier/${prod.idProduit}">+</a></td>
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