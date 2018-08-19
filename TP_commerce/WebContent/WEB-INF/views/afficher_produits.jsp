<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>page afficher</title>
</head>
<body>
	<div align="left">
		<table>
			<form:form modelAttribute="ProduitCommand" action="Produit/add" method="post">
				<tr>
					<td><form:label path="IdProduit">Identifiantt</form:label></td>
					<td></td>
				</tr>
				<tr>
					<td><form:label path="categorie">Categorie : </form:label></td>
					<td>
<%-- 						<form:select path="categorie" items="${ListCategorieNom}"/> --%>
					</td>
				</tr>
				<tr>
					<td><form:label path="designation">Designation : </form:label></td>
					<td><form:input path="designation"/></td>
				</tr>
				<tr>
					<td><form:label path="description">Description : </form:label></td>
					<td><form:input path="description"/></td>
				</tr>
				<tr>
					<td><form:label path="prix">Prix : </form:label></td>
					<td><form:input path="prix"/></td>
				</tr>
				<tr>
					<td><form:label path="selectionne">Selectionne : </form:label></td>
					<td><form:checkbox path="selectionne"/></td>
				</tr>
				<tr>
					<td><form:label path="quantite">Quantite : </form:label></td>
					<td><form:input path="quantite"/></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Ajouter"/></td>
				</tr>
			</form:form>
		</table>
	</div>



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
				<th>Designation</th>
				<th>Description</th>
				<th>Prix</th>
				<th>Quantite</th>
				<th>Selectionne</th>
<!-- 				<th style="color: grey;">Supprimer</th> -->
<!-- 				<th style="color: green;">Modifier</th> -->
			</tr>
			<c:forEach items="${ListeProduits}" var="prod">
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