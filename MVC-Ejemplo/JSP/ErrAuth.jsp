<!DOCTYPE html>
<html>
<head>
	<title>Error Atentificacion</title>
</head>
<body>
	<%
		//Se envia el codigo de error
		response.sendError(401, "Fallo en la autentificacion, No estas registrado");
	%>
</body>
</html>