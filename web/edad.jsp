<%-- 
    Document   : edad
    Created on : 14-sep-2020, 23:25:37
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="layout/header.jsp"></jsp:include>
<%
    String msg = (String) session.getAttribute("servletEdad");
%>
<div class="container">
    <div class="card" >
        <div class="card-header">
            <h1>Calcular edad!</h1>
        </div>
        <div class="card-body">
            <div class="row">
                <div class="col-md-6">    
                    <form action="servlet_edad" method="GET">
                        <div class="form-group">
                            <label for="exampleInputEmail1" class="date" >Ingresar fecha de nacimiento</label>
                            <input required type="text" class="form-control" id="exampleInputEmail1" name="fecha">
                        </div>
                        <button type="submit" class="btn btn-secondary float-right">Calcular edad</button>
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