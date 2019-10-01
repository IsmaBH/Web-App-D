import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LogFilter implements Filter{
	//Inicializador
	public void init(FilterConfig config){
		//Se obtiene el parametro de init
		String testParam = config.getInitParameter("test-param");
		//Imprimimos el parametro
		System.out.println("Test Param: "+testParam);
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
	throws java.io.IOException, ServletException{
		//Obtenemos la IP del cliente
		String ipAddr = request.getRemoteAddr();
		//Imprimimos la IP y la hora actual
		System.out.println("IP: "+ipAddr+"Hora: "+new Date().toString());
		//Se pasa la peticion  a la cadena del filtro
		chain.doFilter(request,response);
	}
	public void destroy(){
		System.out.println("Filtro Finalizado");
	}
}