<%@ page import = "java.io.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
	<title>Http Request</title>
</head>
<body>
	<center>
		<h2>Cabecera Http de la peticion</h2>
		<table width="100%" border="1" align="center">
			<tr bgcolor="#949494">
				<th>Header Name</th>
				<th>Header Value</th>
			</tr>
			<%
				Enumeration headerNames = request.getHeaderNames();
				while(headerNames.hasMoreElements()){
					String paramName = (String) headerNames.nextElement();
					out.println("<tr><td>"+paramName+"</td>\n");
					String paramValue = request.getHeader(paramName);
					out.println("<td>"+paramValue+"</td></tr>\n");
				}
			%>
		</table>
	</center>
</body>
</html>