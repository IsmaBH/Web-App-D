<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP-Login</title>
    </head>
    <body>
       
        <h2>Inicio de Sesion</h2>
 
        <form action="<%=request.getContextPath()%>/HolaUsuario" method="POST">
            Usuario: <input type="text" name="usuario" value="" size="15" />
            Contraseña: <input type="password" name="password" value="" size="15" />
 
            <input type="submit" value="Enviar" name="botonEnviar" />
            <input type="reset" value="Limpiar" name="botonLimpiar" />
        </form>
    </body>
</html>