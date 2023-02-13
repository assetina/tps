<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Gérer les cours</title>
</head>
<body>
	<h1>Gérer les cours</h1>
	<form action="coursController" method="post">
		<input type="hidden" name="action" value="saveOrUpdate"> <input
			type="hidden" name="id" value="<c:out value="${cours.id}" />">
		<table>
			<tr>
				<td>Intitulé</td>
				<td><input type="text" name="intitule"
					value="<c:out value="${cours.intitule}" />"></td>
			</tr>
			<tr>
				<td>Date</td>
				<td><input type="text" name="date"
					value="<c:out value="${cours.date}" />"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Enregistrer"></td>
			</tr>
		</table>
	</form>
	<table>
		<tr>
			<th>Intitulé</th>
			<th>Date</th>
			<th></th>
			<th></th>
		</tr>
		<c:forEach var="cours" items="${coursList}">
			<tr>
				<td><c:out value="${cours.intitule}" /></td>
				<td><c:out value="${cours.date}" /></td>
				<td><a href="coursController?action=edit&id=<c:out value="${cours.id}" />">Modifier</a></td>
				<td><a href="coursController?action=delete&id=<c:out value="${cours.id}" />">Supprimer</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
