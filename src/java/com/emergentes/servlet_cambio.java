/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PC
 */
public class servlet_cambio extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            int a = Integer.parseInt(request.getParameter("moneda"));
            int b = Integer.parseInt(request.getParameter("x"));
            int calculo = 0;
            String tipo = "";
            String actual = "";
            if (b == 1) {
                calculo = (int) (a / 6.97);
                tipo = "Dolares";
                actual = "Bolivianos";
            } else if (b == 2) {
                calculo = (int) (a * 6.95);
                tipo = "Bolivianos";
                actual = "Dolares";
            }
            request.getSession().setAttribute("servletCambio", "El tipo de cambio obtenido de <strong>"+a+" "+ actual+"</strong>  es de <strong> " + calculo + " " + tipo + "</strong>");

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet servlet_cambio</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<a class'btn btn-success' href='/JSP-Servlets/cambio.jsp'>Volver</a>");
            out.println("<h1>El tipo de cambio obtenido de <strong>"+a+" "+ actual+"</strong>  es de <strong> " + calculo + " " + tipo + "</strong></h1>");
            out.println("</body>");
            out.println("</html>");
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
