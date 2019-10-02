import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LogSBD extends HttpServlet{
	//Constructor
	public LogSBD(){
		super();
	}
	//Este servlet va a hacer el papel de la capa de controlador para el login
	//Como todavia no hay una conexion a base de datos solo simulara este comportamiento
	//con datos estaticos.
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		String usuario = (String) request.getParameter("uname");
		String password = (String) request.getParameter("psswd");
		String defaultUser = "David01";
		String defaultPassword = "test123";
		//Aqui se estan usando dos tipos diferentes de operaciones por los siguientes motivos
		//Cuando se hace la validacion de que el usuario exista se utiliza un Forward debido
		//a que el jsp destino necesita saber la peticion original(request)
		if (defaultUser.equals(usuario)) {
			if (defaultPassword.equals(password)) {
				RequestDispatcher rd = request.getRequestDispatcher("JSP/Bienvenida.jsp");
				System.out.println("Forward al jsp");
				rd.forward(request, response);
			}
		}else{
			//Mientras que aqui se utiliza un sendRedirect debido a que si el usuario
			//directamente no existe es mas practico enviarlo a una pagina de error
			//O bien podria devolversele a la pantalla de log in
			response.sendRedirect("JSP/ErrAuth.jsp");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		doGet(request,response);
	}
}