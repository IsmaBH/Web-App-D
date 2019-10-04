<%@ page import = "java.io.*,java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenida</title>
    </head>
    <body>
        <%
           //Capturamos los datos enviados desde el servlet
           String nombres = (String)request.getAttribute("nombre");
           String apellidos = (String)request.getAttribute("apellidos");
          String usuario = request.getParameter("usuario");
          out.println("<h3>Has iniciado sesion como "+usuario+"</h3>");
          out.println("<h2>Bienvenido "+nombres+" "+apellidos+"</h2>");
        %>
    </body>
</html>