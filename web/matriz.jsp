<%-- 
    Document   : matriz
    Created on : 14-sep-2020, 23:55:21
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="layout/header.jsp"></jsp:include>
<%
    String msg = (String) session.getAttribute("servletMatriz");
%>
<div class="container">
    <div class="card" >
        <div class="card-header">
            <h1>Matriz</h1>
        </div>
        <div class="card-body">
            <div class="row">
                <div class="col-md-4">    
                    <form action="servlet_matriz" method="POST">
                        <div class="form-group">
                            <label for="exampleInputEmail1" class="date" >Valor a procesar</label>
                            <input required type="number" name="matriz" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                            <!--<small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>-->
                        </div>
                        <button type="submit" class="btn btn-secondary float-right">Procesar</button>
                    </form>
                </div>
                <div class="col-md-8">
                    <% if (msg != null) {%>
                    <div class="card show" role="alert" aria-live="assertive" aria-atomic="true">
                        <div class="card-header">
                            <strong class="mr-auto">Resultado</strong>
                        </div>
                        <div align="center" class="card-body">
                            <table class="table">
                                <tbody>
                                    
                                        <%= msg%>                                            
                                    

                                </tbody>
                            </table>
                        </div>
                    </div>
                    <%}%>
                </div>    
            </div>
        </div>
    </div>
</div>
<jsp:include page="layout/footer.jsp"></jsp:include>