<%-- 
    Document   : header
    Created on : 14-sep-2020, 23:17:41
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!--<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.5.2/minty/bootstrap.min.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">-->
    </head>
    <body>
        <div class="navbar navbar-expand-lg navbar-dark bg-primary">
            <div class="container">
                <a class="navbar-brand" href="#">JSP - Servlet Practica 01</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto">

                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Menu
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="/JSP-Servlets/edad.jsp">Calcular Edad</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="/JSP-Servlets/cambio.jsp">Cambio de moneda</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="/JSP-Servlets/operadores.jsp">Calculadora</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="/JSP-Servlets/juego.jsp">Juego Dados</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="/JSP-Servlets/matriz.jsp">Generar matriz caracol</a>
                            </div>
                        </li>

                    </ul>
                  
                </div>
            </div>
        </div>
        <div class="container" style="padding-top: 55px"></div>
