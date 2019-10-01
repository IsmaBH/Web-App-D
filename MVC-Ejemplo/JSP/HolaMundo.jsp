<html>
<head>
	<title>Mi primer JSP</title>
</head>
<body>
	<h1>Hola mundo desde un JSP</h1>
	<%-- Esto es un comentario --%>
	<%--Lo que sigue es una declaracion--%>
	<%! int i = 0; %>
	<%-- La siguiente linea es un scriptlet --%>
	<% out.println("Tu IP es: "+request.getRemoteAddr()); %>
	<%-- La siguiente linea es una expresion --%>
	<p>La fecha de hoy es: <%= (new java.util.Date()).toLocaleString() %></p>
</body>
</html>