import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Inclusion extends HttpServlet{
	//Constructor
	public Inclusion(){
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
		out.println("<h1>Ejemplo 7: Include con atributos</h1>");
		RequestDispatcher rd = request.getRequestDispatcher("InclusionB");
		Integer x = 27;
		Integer y = 12;
		String cadena = "Hola mundo de atributos";
		Persona persona = new Persona(1,"Rodrigo","Paddington","Casas",31);
		request.setAttribute("x",x);
		y = 34;
		request.setAttribute("y",y);
		request.setAttribute("cadena",cadena);
		request.setAttribute("persona",persona);
		rd.include(request,response);
		out.println("</body>");
		out.println("</html>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		doGet(request,response);
	}
}