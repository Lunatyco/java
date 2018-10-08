/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Clientes;
import Modelo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrador
 */
@WebServlet(name = "TelefoniaServlet", urlPatterns = {"/TelefoniaServlet"})
public class TelefoniaServlet extends HttpServlet {

    List<Clientes> listaClientes = new ArrayList<>();
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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            //usuario en Administrativos
            String user = "brianburgos@telefonia.cl";
            String pass = "17667815";
            String boton = request.getParameter("bt");
             switch(boton){
               case  "Ingresar":
                //capturar valores del formulario 
                String usuario = request.getParameter("txtUsuario");
                String contrasena = request.getParameter("txtContrasena");

                //comparación 
                if (usuario.equals(user) && contrasena.equals(pass)) {
                    //cumple
                    request.getSession().setAttribute("msj", "");
                    response.sendRedirect("menu.jsp");
                } else {
                    //No cumple 
                    request.getSession().setAttribute("msj", "Usuario o Contraseña incorrecta(s)");
                    response.sendRedirect("login.jsp");
                }
                case "registrar":
                   //recuperar valores del formulario
                String rutCliente = request.getParameter("txtRutCliente");
                String dvCliente = request.getParameter("txtDvCliente");
                int numeroCelular = Integer.parseInt(request.getParameter("txtNumeroCelular")); 
                int montoPlan = Integer.parseInt(request.getParameter("txtMontoPlan"));
                String direccion = request.getParameter("txtDireccion");
                String comuna = request.getParameter("txtComuna");
                String region = request.getParameter("txtRegion");
                int renta = Integer.parseInt(request.getParameter("txtRenta"));
                
                //creo objeto y agrego a la lista
                Clientes c = new Clientes(rutCliente, dvCliente, numeroCelular, montoPlan, direccion, comuna, region, renta);
                this.listaClientes.add(c);
                
                //dejar la lista en la sesion
                request.getSession().setAttribute("listado", listaClientes);
                //llamar a listado.jsp
                response.sendRedirect("listado.jsp");
                break;

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

}
