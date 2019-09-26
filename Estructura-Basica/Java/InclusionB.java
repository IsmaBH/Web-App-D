import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class InclusionB extends HttpServlet{
	//Constructor
	public InclusionB(){
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		Integer x = (Integer) request.getAttribute("x");
		Integer y = (Integer) request.getAttribute("y");
		String cadena = (String) request.getAttribute("cadena");
		Persona persona = (Persona) request.getAttribute("persona");
		out.println("<ul>");
		out.println("<li>"+x+"</li>");
		out.println("<li>"+y+"</li>");
		out.println("<li>"+cadena+"</li>");
		out.println("<li>Persona:");
		out.println("<ul>");
		out.println("<li>"+persona.getId()+"</li>");
		out.println("<li>"+persona.getNombre()+"</li>");
		out.println("<li>"+persona.getPrimerApellido()+"</li>");
		out.println("<li>"+persona.getSegundoApellido()+"</li>");
		out.println("<li>"+persona.getEdad()+"</li>");
		out.println("</ul>");
		out.println("</li>");
		out.println("</ul>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		doGet(request,response);
	}
}