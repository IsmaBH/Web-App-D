import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DelegacionB extends HttpServlet{
	//Constructor
	public DelegacionB(){
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		PrintWriter out = response.getWriter();
		System.out.println("Atendiendo la peticion del servlet Delegacion");
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Ejemplo 6: Forward</h1>");
		out.println("<h2>Forward Exitoso!</h2>");
		out.println("</body>");
		out.println("</html>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		doGet(request, response);
	}
}