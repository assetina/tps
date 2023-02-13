<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulaire d'étudiant</title>
</head>
<body>
	<h2>Formulaire d'étudiant</h2>
	<form action="student" method="post">
		<label for="firstName">Prénom :</label> <input type="text"
			id="firstName" name="firstName" required><br> <label
			for="lastName">Nom :</label> <input type="text" id="lastName"
			name="lastName" required><br> <label for="email">Email :</label> <input
			type="email" id="email" name="email" required><br> <label
			for="address">Adresse :</label> <input type="text" id="address"
			name="address" required><br> <label for="phone">Numéro de
			téléphone :</label> <input type="tel" id="phone" name="phone"
			required><br>
		<input type="submit" value="Soumettre">
	</form>
</body>
</html>
