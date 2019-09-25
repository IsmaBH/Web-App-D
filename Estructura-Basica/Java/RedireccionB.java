import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RedireccionB extends HttpServlet{
	public RedireccionB(){
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Ejemplo 3: Redireccionamiento</h1>");
		out.println("<h2>Redireccionamiento exitoso</h2>");
		out.println("</body>");
		out.println("</html>");
	}
}