<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrar Cliente</title>
</head>
<body>
<h1 align="center">Registrar Cliente</h1>
<form action="ControladorCliente" method="post">
<table align="center">
<tr>
<td>nombre</td>
<td> <input type="text" name="nombre">></td>
</tr>
<tr>
<td>apellido</td>
<td> <input type="text" name="apellido">></td>
</tr>
<tr>
<td>dni</td>
<td> <input type="text" name="dni">></td>
</tr>
<tr>
<td>email</td>
<td> <input type="text" name="email">></td>
</tr>
<tr>
<td>Telefono</td>
<td> <input type="text" name="telefono">></td>
</tr>
<tr>
<td>sexo</td>
<td> <input type="text" name="sexo">></td>
</tr>
<tr>
<td>nacionalidad</td>
<td> <input type="text" name="nacionalidad">></td>
</tr>
<tr>
<td  colspan="2" style="text-align:center">
<input type="submit" value="Registrar">
</td>
</tr>
</table>
</form>
</body>
</html>