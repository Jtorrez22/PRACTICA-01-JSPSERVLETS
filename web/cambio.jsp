<%-- 
    Document   : cambio
    Created on : 14-sep-2020, 23:25:15
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="layout/header.jsp"></jsp:include>
<%
    String cambio = (String) session.getAttribute("servletCambio");
%>
<div class="container">
    <div class="card" >
        <div class="card-header">
            <h1>Cambio de moneda</h1>
        </div>
        <div class="card-body">
            <div class="row">
                <div class="col-md-6">    
                    <form action="servlet_cambio" method="POST">
                        <div class="form-group">
                            <label for="exampleInputEmail1" class="date" >Valor a convertir</label>
                            <input type="number" class="form-control" id="exampleInputEmail1" name="moneda">
                        </div>
                        <div class="form-group">
                            <label for="exampleInputEmail1" class="date" >Cambio</label>
                            <select required class="form-control" id="exampleSelect1" name="x">
                                <option selected disabled> Seleccionar Moneda</option>
                                <option value="1" >Convertir a Dolar USD</option>
                                <option value="2" >Convertir a Bolivianos</option>
                            </select>
                        </div>
                        <hr>
                        <button type="submit" class="btn btn-secondary float-right">Convertir moneda</button>
                    </form>
                </div>
                <div class="col-md-6">
                    <% if (cambio != null) {%>
                    <div class="toast show" role="alert" aria-live="assertive" aria-atomic="true">
                        <div class="toast-header">
                            <strong class="mr-auto">Resultado Cambio </strong>
                        </div>
                        <div class="toast-body">
                            <%= cambio%>
                        </div>
                    </div>
                    <%}%>
                </div>    
            </div>
        </div>
    </div>
</div>
<jsp:include page="layout/footer.jsp"></jsp:include>