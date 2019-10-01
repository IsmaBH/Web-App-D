<%@ page import = "java.io.*,java.util.*" %>

<html>
   
   <head>
      <title>Reloj Digital</title>
   </head>
   
   <body>
      <center>
         <h2>Server Response</h2>
         <%
            // Ponemos el timer para que se recarge cada 5 segundos
            response.setIntHeader("Refresh", 5);
            
            // Obtiene la hora actual
            Calendar calendar = new GregorianCalendar();
            
            String am_pm;
            int hour = calendar.get(Calendar.HOUR);
            int minute = calendar.get(Calendar.MINUTE);
            int second = calendar.get(Calendar.SECOND);
            
            if(calendar.get(Calendar.AM_PM) == 0) 
               am_pm = "AM";
            else
               am_pm = "PM";
               String CT = hour+":"+ minute +":"+ second +" "+ am_pm;
               out.println("Current Time is: " + CT + "\n");
         %>
      </center>
   
   </body>
</html>