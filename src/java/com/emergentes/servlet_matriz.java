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
public class servlet_matriz extends HttpServlet {

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
            int filas = Integer.parseInt(request.getParameter("matriz"));
            int columnas = Integer.parseInt(request.getParameter("matriz"));
            boolean derecha = true, izquierda = false, abajo = false;
            int[][] matrizc = new int[filas][columnas];
            int x = 0, y = -1;
            for (int k = 1; k <= columnas * filas; k++) {
                if (izquierda) {
                    y--;
                    if (y == -1) {
                        y = 0;
                        x--;
                        izquierda = false;
                    } else if (matrizc[x][y] != 0) {
                        y++;
                        x--;
                        izquierda = false;
                    }
                } else if (derecha) {
                    y++;
                    if (y == columnas) {
                        y = columnas - 1;
                        x++;
                        derecha = false;
                        abajo = true;
                    } else if (matrizc[x][y] != 0) {
                        y--;
                        x++;
                        derecha = false;
                        abajo = true;
                    }
                } else if (abajo) {
                    x++;
                    if (x == filas) {
                        x = filas - 1;
                        y--;
                        abajo = false;
                        izquierda = true;
                    } else if (matrizc[x][y] != 0) {
                        y--;
                        x--;
                        abajo = false;
                        izquierda = true;
                    }
                } else {
                    x--;
                    if (x == -1 || matrizc[x][y] != 0) {
                        x++;
                        y++;
                        derecha = true;
                    }
                }
                matrizc[x][y] = k;
            }
            String salto = " ";
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    String vars = " | ";
                    out.print(matrizc[i][j] + vars);
                    salto += (matrizc[i][j] + vars);
                }
                out.println();
                out.println("<br>");
                salto += ("<br>");
            }

            String info = "Matriz caracol ";
            String vals = ("[" + info + " contiene " + " " + columnas * filas + " elementos]");

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet servlet_matriz</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<br>");
            out.println("<a class'btn btn-success' href='/JSP-Servlets/matriz.jsp'>Volver</a>");
            out.println("<h1>" + vals + "</h1>");
            out.println("<h1>" + salto + " </h1><br>");
            out.println("</body>");
            out.println("</html>");
            request.getSession().setAttribute("servletMatriz", "<h5>" + vals + "</h5><br><p>" + salto + " </p><br>");
            response.sendRedirect("/JSP-Servlets/matriz.jsp");
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
