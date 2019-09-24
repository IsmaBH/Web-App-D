import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ExtParam extends HttpServlet{
	//Constructor por defecto
	public ExtParam(){
		super();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		String c = request.getParameter("c");
		out.println("<html>");
		out.println("<head>");
		out.println("</head");
		out.println("<body>");
		out.println("<h1>Ejemplo 2: Extraccion de parametros de la peticion</h1>");
		out.println("<ol>");
		out.println("<li>a = "+a+"</li>");
		out.println("<li>b = "+b+"</li>");
		out.println("<li>c = "+c+"</li>");
		out.println("</ol>");
		out.println("</body>");
		out.println("</html>");
	}
}
//Compilacion mediante el comando:
//javac -classpath ~/servlet-api.jar Servlet.java