<%-- 
    Document   : juego
    Created on : 14-sep-2020, 23:47:05
    Author     : PC
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="layout/header.jsp"></jsp:include>
<% String msg = (String) session.getAttribute("servletJuego"); %>
<div class="container">
    <div class="card" >
        <div class="card-header">
            <h1>Juego de Dados</h1>
        </div>
        <div class="card-body">
            <div class="row">
                <div class="col-md-6">    
                    <form action="servlet_juego" method="GET">
                        <button type="submit" class="btn btn-secondary btn-lg float-center">Lanzar dados</button>
                    </form>
                </div>
                <div class="col-md-6">
                    <% if (msg != null) {%>
                    <div class="toast show" role="alert" aria-live="assertive" aria-atomic="true">
                        <div class="toast-header">
                            <strong class="mr-auto">Resultado</strong>
                        </div>
                        <div class="toast-body">
                            <%= msg%>
                        </div>
                    </div>
                    <%}%>
                </div>    
            </div>
        </div>
    </div>
</div>
<jsp:include page="layout/footer.jsp"></jsp:include>