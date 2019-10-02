<%@ page import = "java.io.*,java.util.*" %>
<%
   // Get session creation time.
   Date createTime = new Date(session.getCreationTime());
   
   // Get last access time of this Webpage.
   Date lastAccessTime = new Date(session.getLastAccessedTime());

   String title = "Bienvenido de vuelta";
   Integer visitCount = new Integer(0);
   String visitCountKey = new String("visitCount");
   String userIDKey = new String("userID");
   String userID = new String("ABCD");

   // Check if this is new comer on your Webpage.
   if (session.isNew() ){
      title = "Bienvenido";
      session.setAttribute(userIDKey, userID);
      session.setAttribute(visitCountKey,  visitCount);
   } 
   visitCount = (Integer)session.getAttribute(visitCountKey);
   visitCount = visitCount + 1;
   userID = (String)session.getAttribute(userIDKey);
   session.setAttribute(visitCountKey,  visitCount);
%>

<html>
   <head>
      <title>Sesiones</title>
   </head>
   
   <body>
      <center>
         <h1>Sesiones con JSP</h1>
      </center>
      
      <table border = "1" align = "center"> 
         <tr bgcolor = "#949494">
            <th>Info de sesion</th>
            <th>Valor</th>
         </tr> 
         <tr>
            <td>id</td>
            <td><% out.print( session.getId()); %></td>
         </tr> 
         <tr>
            <td>Hora de creacion</td>
            <td><% out.print(createTime); %></td>
         </tr> 
         <tr>
            <td>Ultimo acceso</td>
            <td><% out.print(lastAccessTime); %></td>
         </tr> 
         <tr>
            <td>User ID</td>
            <td><% out.print(userID); %></td>
         </tr> 
         <tr>
            <td>Numero de visitas</td>
            <td><% out.print(visitCount); %></td>
         </tr> 
      </table> 
   
   </body>
</html>