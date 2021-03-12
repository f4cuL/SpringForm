<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	El alumno con nombre <strong>${alumno1.nombre} </strong> y apellido <strong> ${alumno1.apellido} </strong> y edad<strong> ${alumno1.edad}</strong> se ha registrado con éxito. <br>
	La asignatura es: <strong> ${alumno1.optativa} </strong> en la ciudad <strong> ${alumno1.ciudadEstudio} </strong> CP <strong> ${alumno1.codigoPostal}</strong>
	Los idiomas elegidos son: <strong>${alumno1.idioma} </strong>
	El email es: <strong>${alumno1.email}</strong>
</body>
</html>