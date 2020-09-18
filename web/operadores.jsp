<%-- 
    Document   : operadores
    Created on : 14-sep-2020, 23:25:07
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="layout/header.jsp"></jsp:include>
<% String msg = (String) session.getAttribute("servletMsg"); %>
<div class="container">
    <div class="card" >
        <div class="card-header">
            <h1>Calculadora</h1>
        </div>
        <div class="card-body">
            <div class="row">
                <div class="col-md-6">    
                    <form action="servlet_operadores" method="POST">
                        <div class="form-group">
                            <label for="exampleInputEmail1" class="date" >Primer nro</label>
                            <input required type="number" class="form-control" id="exampleInputEmail1" name="a">
                        </div>
                        <div class="form-group">
                            <label for="exampleInputEmail1" class="date" >Segundo nro</label>
                            <input required type="number" class="form-control" id="exampleInputEmail1" name="b">
                        </div>
                        <div class="form-group">
                            <label for="exampleInputEmail1" class="date" >Ingresar fecha de nacimiento</label>
                            <select required class="form-control" id="exampleSelect1" name="x">
                                <option selected disabled> Seleccionar Operador</option>
                                <option value="1" >Suma</option>
                                <option value="2" >Resta</option>
                                <option value="3" >Multiplicacion</option>
                                <option value="4" >Division</option>
                            </select>
                        </div>
                        <hr>
                        <button type="submit" class="btn btn-secondary float-right">Procesar</button>
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