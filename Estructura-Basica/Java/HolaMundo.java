import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HolaMundo extends HttpServlet{
	//Constructor
	public HolaMundo(){
		super();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Ejemplo 1:Hola Mundo</h1>");
		out.println("<h2>Mi primer servlet</h2>");
		out.println("</body>");
		out.println("</html>");
	}
}
//Compilacion mediante el comando:
//javac -classpath ~/servlet-api.jar HolaMundo.java