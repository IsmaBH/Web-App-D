import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Delegacion extends HttpServlet{
	//Constructor
	public Delegacion(){
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		RequestDispatcher rd = request.getRequestDispatcher("DelegacionB");
		System.out.println("Forward al servlet DelegacionB");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		doGet(request, response);
	}
}