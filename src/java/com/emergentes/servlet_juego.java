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
public class servlet_juego extends HttpServlet {

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
            int[] resultados = new int[2];
            resultados[0] = (int) (Math.random() * 6 + 1);
            resultados[1] = (int) (Math.random() * 6 + 1);
            int juego = resultados[0] + resultados[1];
            if (juego == 7 || juego == 11) {
                request.getSession().setAttribute("servletJuego", "Primer Dado <strong>" + resultados[0] + " </strong><br> "
                        + "Segundo dado <strong>" + resultados[1] + "</strong><br> "
                        + "Total <strong>" + juego + "</strong><br>"
                        + "<marquee bgcolor=\"#FFFFFF\" width=\"50%\" scrolldelay=\"100\" scrollamount=\"5\" direction=\"left\" loop=\"infinite\">"
                        + "<h1 style='color:green'><strong>Ganaste</strong></h1></marquee>");
            } else {
                request.getSession().setAttribute("servletJuego", "Primer Dado <strong>" + resultados[0] + " </strong><br> "
                        + "Segundo dado <strong>" + resultados[1] + "</strong><br> "
                        + "Total <strong>" + juego + "</strong><h1 style='color:red'><strong>Perdiste</strong></h1> ");
            }
            response.sendRedirect("/JSP-Servlets/juego.jsp");
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet servlet_juego</title>");
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet servlet_juego at " + resultados[0] +" "+ resultados[1] +" "+ juego + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
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
