<%@ page import = "java.io.*,java.util.*" %>

<html>
   <head>
      <title>Parametros de formulario</title>
   </head>

   <body>
      <center>
         <h2>Parametros de la peticion de formulario</h2>
         <table width = "100%" border = "1" align = "center">
            <tr bgcolor = "#949494">
               <th>Param Name</th>
               <th>Param Value(s)</th>
            </tr>
            <%
               Enumeration paramNames = request.getParameterNames();
               while(paramNames.hasMoreElements()) {
                  String paramName = (String)paramNames.nextElement();
                  out.print("<tr><td>" + paramName + "</td>\n");
                  String paramValue = request.getParameter(paramName);
                  out.println("<td> " + paramValue + "</td></tr>\n");
               }
            %>
         </table>
      </center>
   
   </body>
</html>
<%-- Nota: aun que un jsp es un servlet en escencia, no se debe poner  informcion sensible--%>
<%--       ni metodos como el acceso a base de datos o bien la validacion de datos--%>