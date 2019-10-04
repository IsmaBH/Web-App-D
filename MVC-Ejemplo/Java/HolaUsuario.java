import java.io.*;
import java.sql.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HolaUsuario extends HttpServlet {
    Connection con = null;
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try {
            boolean existeUsuario = false;
            //Guardamos los datos enviados desde index
            String usuario = request.getParameter("usuario");
            String password = request.getParameter("password");
            //Establecemos la conexion
            con = Conexion.getConexion();
            String consulta = "Select * from Usuarios where usuario=? && password=?";
            ResultSet rs = null;
            PreparedStatement pst = null;
            pst = con.prepareStatement(consulta);
            pst.setString(1, usuario);
            pst.setString(2, password);
            rs = pst.executeQuery();
 
            String nombres="";
            String apellidos="";
            while(rs.next()){
                //En caso de existir una coincidencia
                existeUsuario = true;
                //Y reemplazamos los atributos de dicho Usuario
                nombres = rs.getString("nombre");
                apellidos = rs.getString("apellidos");
            }
 
            if(existeUsuario){
                //Para el usuario existente:
                //Reemplazamos atributos que luego obtendremos desde las páginas .jsp
                request.setAttribute("nombre", nombres);
                request.setAttribute("apellidos", apellidos);
                //Mandamos estos atributos a la página bienvenida.jsp
                request.getRequestDispatcher("JSP/Bienvenida2.jsp").forward(request, response);
            }else{
                //De lo contrario vamos a la página errorLogin.jsp
                request.getRequestDispatcher("JSP/ErrLog.jsp").forward(request, response);
            }
            out.close();
        } catch (SQLException ex) {
        out.println(ex.toString());
        }
    }
 
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}