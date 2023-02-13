<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulaire de Professeur</title>
</head>
<body>
	<h1>Formulaire de Professeur</h1>
	<form action="saveProfessor" method="post">
		<table>
			<tr>
				<td>Nom :</td>
				<td><input type="text" name="name" required></td>
			</tr>
			<tr>
				<td>Prénom :</td>
				<td><input type="text" name="firstName" required></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><input type="email" name="email" required></td>
			</tr>
			<tr>
				<td>Grade :</td>
				<td><input type="text" name="grade" required></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="Enregistrer">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
