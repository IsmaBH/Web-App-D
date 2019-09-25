import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RedireccionA extends HttpServlet{
	public RedireccionA(){
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
		out.println("<h2>Redireccionamiento en proceso</h2>");
		out.println("</body>");
		out.println("</html>");
		System.out.println("Paso por el servlet RedireccionA");
		response.sendRedirect("RedireccionB");
	}
}