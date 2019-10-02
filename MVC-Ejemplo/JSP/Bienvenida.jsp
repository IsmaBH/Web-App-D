<%@ page import = "java.io.*,java.util.*" %>

<html>
   <head>
      <title>Bienvenida</title>
   </head>

   <body>
      <center>
         <h2>Bienvenid@</h2>
         <% 
            String usuario = request.getParameter("uname");
            out.println("<h3>Has iniciado sesion como "+usuario+"</h3>"); 
         %>
         </table>
      </center>
   </body>
</html>