import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DelegacionAttr extends HttpServlet{
	//Constructor
	public DelegacionAttr(){
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
		out.println("<h1>Ejemplo 6: Forward con atributos</h1>");
		RequestDispatcher rd = request.getRequestDispatcher("AttrB");
		Integer x = 27;
		String cadena = "Hola mundo de atributos";
		Persona persona = new Persona(1,"Ruben","Valdez","Delgado",31);
		request.setAttribute("x", x);
		x = 34;
		request.setAttribute("y", x);
		x = null;
		request.setAttribute("x", x);
		request.setAttribute("cadena", cadena);
		request.setAttribute("persona", persona);
		out.println("<h2>Aqui empieza el codigo de retorno</h2>");
		rd.forward(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		doGet(request, response);
	}
}