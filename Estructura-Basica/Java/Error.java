import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Error extends HttpServlet{
	//Constructor
	public Error(){
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		response.sendError(404,"Lo siento no hemos encontrado lo que buscabas");
	}
}
//Nota: con este servlet se podria hacer una pagina de error 404 personalizada
//pero se utiliza la default por el bien de no escribir codigo innecesario