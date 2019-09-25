import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Alcance extends HttpServlet{
	private Integer contador1 = 0;
	//Constructor
	public Alcance(){
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		Integer contador2 = 0;
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Ejemplo 5: Sesiones</h1>");
		out.println("<h2>Contador interior: "+contador2+" Contador general: "+contador1+"</h3>");
		contador2++;
		contador1++;
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		doGet(request,response);
	}
}
//Nota: En este ejemplo se observa que tanto puede modificar la peticion de los atributos 
//del servlet, se observa que el contador general siempre tiene un aumento pero el
//contador interior no, esto se debe a que la variable de clase contador 1 esta siempre
//viva dado que el servlet se instancio una vez pero el interior solo es valido para cuando
//se entra en el metodo cuando sale y vuelve a entrar el contador se reinicia a 0