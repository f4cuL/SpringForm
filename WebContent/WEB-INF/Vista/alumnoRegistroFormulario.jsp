<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario de registro</title>
</head>
<body>
	<form:form action="procesarFormulario" modelAttribute="alumno1">
	
	 	Nombre : <form:input path="nombre"/>
	 	
	 	<br><br><br>
	 	
	 	Apellido : <form:input path="apellido"/>
	 	
	 	<br><br><br>
	 	
	 	Asignaturas optativas: <br>
	 	
	 	<form:select path="optativa" multiple="true"> 
	 	
	 		<form:option value="Dise�o" label="Dise�o"/>
	 		
	 		<form:option value="Karate" label="Karate"/>
	 		
	 		<form:option value="Comercio" label="Comercio"/>
	 		
	 		<form:option value="Danza" label="Danza"/>
	 		
	 	</form:select>
	 	
	 	<br><br><br>
	 	
	 	 Barcelona <form:radiobutton path="ciudadEstudio" value="Barcelona"/><br>
	 	 Madrid <form:radiobutton path="ciudadEstudio" value="Madrid"/><br>
	 	 Valencia <form:radiobutton path="ciudadEstudio" value="Valencia"/><br>
	 	 Bilbao <form:radiobutton path="ciudadEstudio" value="Bilbao"/><br>
	 	 
	 	
	 	<br><br><br>
	 	 
	 	 Ingl�s <form:checkbox path="idioma" value="Ingl�s"/><br>
	 	 Franc�s <form:checkbox path="idioma" value="Franc�s"/><br>
	 	 Alem�n <form:checkbox path="idioma" value="Alem�n"/><br>
	 	 Chino <form:checkbox path="idioma" value="Chino"/><br>
	 	 
	 	<br><br><br>	
	 	 	
	 	<input type="submit" value="Enviar">
	
	</form:form>
</body>
</html>