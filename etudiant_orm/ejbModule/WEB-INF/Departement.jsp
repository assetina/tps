<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Gestion des départements</title>
</head>
<body>
	<h2>Gestion des départements</h2>
	<%
		String message = (String) request.getAttribute("message");
		if (message != null) {
	%>
		<p><%= message %></p>
	<%
		}
	%>
	<form action="departmentServlet" method="post">
		<input type="hidden" name="action" value="create"> <input type="text"
			name="nom" placeholder="Nom" required="required"> <input type="text"
			name="adresseWeb" placeholder="Adresse web" required="required">
		<input type="submit" value="Ajouter">
	</form>

	<table>
		<tr>
			<th>ID</th>
			<th>Nom</th>
			<th>Adresse web</th>
			<th>Actions</th>
		</tr>
		<%
			List<Departement> departments = (List<Departement>) request.getAttribute("departments");
			for (Departement department : departments) {
		%>
			<tr>
				<td><%= department.getId() %></td>
				<td><%= department.getNom() %></td>
				<td><%= department.getAdresseWeb() %></td>
				<td>
					<form action="departmentServlet" method="post">
						<input type="hidden" name="action" value="update"> <input
							type="hidden" name="id" value="<%= department.getId() %>">
						<input type="text" name="nom" value="<%= department.getNom() %>" required="required">
						<input type="text" name="adresseWeb" value="<%= department.getAdresseWeb() %>" required="required">
						<input type="submit" value="Modifier">
					</form>
					<form action="departmentServlet" method="post">
						<input type="hidden" name="action" value="delete"> <input
							type="hidden" name="id" value="<%= department.getId() %>">
						<input type="submit" value="Supprimer">
					</form>
				</td>
			</tr>
	
