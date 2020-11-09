/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.mx.controlador;

import com.ipn.mx.modelo.dao.EventoDAO;
import com.ipn.mx.modelo.dto.Evento;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author root
 */
public class EventoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion.equals("listaDeEventos")){
            listaDeEventos(request,response);
        }else{
            if (accion.equals("nuevo")){
                nuevoEvento(request,response);
            }else{
                if (accion.equals("eliminar")){
                    eliminarEvento(request,response);
                }else{
                    if(accion.equals("actualizar")){
                        actualizarEvento(request,response);
                    }else{
                        if(accion.equals("guardar")){
                            almacenarEvento(request,response);
                        }else{
                            if(accion.equals("ver")){
                                mostrarEvento(request,response);
                            }
                        }
                    }
                }
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void listaDeEventos(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Lista de Eventos</title>");
            out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='container'>");
            out.println("<h1> Lista de Eventos</h1>");
            
            out.println("<div class='table-responsive'>");
            out.println("<table class='table table-striped table-dark'>");
            out.println("<tr>");
            out.println("<th>");
            out.println("Clave de evento");
            out.println("</th>");
            out.println("<th>");
            out.println("Nombre del evento");
            out.println("</th>");
            out.println("<th>");
            out.println("Sede");
            out.println("</th>");
            out.println("<th>");
            out.println("Fecha de inicio");
            out.println("</th>");
            out.println("<th>");
            out.println("Fecha de termino");
            out.println("</th>");
            out.println("<th>");
            out.println("Acciones");
            out.println("</th>");
            out.println("</tr>");
            
            int idEvento;
            String nombreEvento;
            String sede;
            Date fechaInicio;
            Date fechaTermino;
            
            EventoDAO dao = new EventoDAO();
            try{
                List lista = dao.readALL();
                for (int i = 0; i < lista.size(); i++) {
                    Evento e = (Evento)lista.get(i);
                    idEvento = e.getIdEvento();
                    nombreEvento = e.getNombreEvento();
                    sede = e.getSede();
                    fechaInicio = e.getFechaInicio();
                    fechaTermino = e.getFechaTermino();
                    out.println("<tr>");
                    out.println("<td>"+idEvento+"</td>");
                    out.println("<td>"+nombreEvento+"</td>");
                    out.println("<td>"+sede+"</td>");
                    out.println("<td>"+fechaInicio+"</td>");
                    out.println("<td>"+fechaTermino+"</td>");
                    out.println("<td>Eliminar | Actualizar</td>");
                    out.println("</tr>");
                }
            }catch(SQLException e){}
            
            out.println("</table>");
            out.println("</div>");
            
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    private void nuevoEvento(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.sendRedirect("eventosForm.html");

            //RequestDispatcher vista = request.getRequestDispatcher("eventosForm.html");
            //vista.forward(request, response);
        } catch (IOException ex) {
            Logger.getLogger(EventoServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void eliminarEvento(HttpServletRequest request, HttpServletResponse response) {
        Evento e = new Evento();
        EventoDAO dao = new EventoDAO();
        try {
            e.setIdEvento(Integer.parseInt(request.getParameter("id")));
            dao.delete(e);
            //listaDeEventos(request, response);

            response.sendRedirect("EventoServlet?accion=listaDeEventos");
            
            //RequestDispatcher rd = request.getRequestDispatcher("EventoServlet?accion=listaDeEventos");
            //rd.forward(request, response);
            
        } catch (SQLException | IOException ex) {
            Logger.getLogger(EventoServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void actualizarEvento(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void almacenarEvento(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Evento e = new Evento();
        EventoDAO dao = new EventoDAO();
        if (request.getParameter("id") == null || request.getParameter("id").isEmpty()) {

            e.setNombreEvento(request.getParameter("nombreEvento"));
            e.setSede(request.getParameter("sede"));
            e.setFechaInicio(Date.valueOf(request.getParameter("fechaInicio")));
            e.setFechaTermino(Date.valueOf(request.getParameter("fechaTermino")));

            try {
                dao.create(e);

                try (PrintWriter out = response.getWriter()) {

                    out.println("<h1> Registro satisfactorio</h1>");
                    out.println("<a href='EventoServlet?accion=listaDeEventos'>Lista</a>");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } else {
            e.setIdEvento(Integer.parseInt(request.getParameter("id")));
            e.setNombreEvento(request.getParameter("nombreEvento"));
            e.setSede(request.getParameter("sede"));
            e.setFechaInicio(Date.valueOf(request.getParameter("fechaInicio")));
            e.setFechaTermino(Date.valueOf(request.getParameter("fechaTermino")));

            try {
                dao.update(e);

                try (PrintWriter out = response.getWriter()) {

                    out.println("<h1> Actualización satisfactorio</h1>");
                    out.println("<a href='EventoServlet?accion=listaDeEventos'>Lista</a>");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void mostrarEvento(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Lista De Eventos </title>");
            out.println("<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css' >");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='container'>");
            out.println("<div class='card border-success mb-3' >");
            out.println("<div class='card-header'>Datos del Evento</div>");
            out.println("<div class='card-body text-success'>");

            EventoDAO dao = new EventoDAO();
            Evento e = new Evento();

            try {
                e.setIdEvento(Integer.parseInt(request.getParameter("id")));
                e = dao.read(e);

                out.println("Id Evento : " + e.getIdEvento());
                out.println("<br/> Nombre Evento : " + e.getNombreEvento());
                out.println("<br/> Sede Evento : " + e.getSede());
                out.println("<br/> Fecha Inicio Evento : " + e.getFechaInicio());
                out.println("<br/> Fecha Termino Evento : " + e.getFechaTermino());

            } catch (SQLException ex) {
                Logger.getLogger(EventoServlet.class.getName()).log(Level.SEVERE, null, ex);
            }

            out.println(" </div>");
            out.println(" </div>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");

        }
    }

}
