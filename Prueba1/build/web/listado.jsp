<%-- 
    Document   : listado
    Created on : 28-09-2018, 21:57:14
    Author     : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>

        <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

    </head>
    <body>
        <nav>
            <div class="nav-wrapper blue">
                <a href="#" class="brand-logo">Listado</a>
                <ul id="nav-mobile" class="right hide-on-med-and-down">
                    <li><a href="registrar.jsp">Clientes</a></li>
                    <li><a href="listado.jsp">Listado</a></li>
                </ul>
            </div>
        </nav>
        <div class="row">
            <div class="col s3"></div>
            <div class="col s6">

                <div class="card-panel blue">
                    <span class="white-text"> Listado de Clientes
                    </span>
                </div>
                <br>
                <table class="striped">
                    <thead>
                        <tr>
                            <th>Rut</th>
                            <th>Digito Verificador</th>
                            <th>Numero Celular</th>
                            <th>Monto del Plan</th>
                            <th>Direccion</th>
                            <th>Categoria</th>                            
                            <th>Campaña</th>
                        </tr>
                    </thead>

                    <tbody>
                        <c:forEach items="${listado}" var="item">
                            <tr>
                                <td>${item.rutCliente}</td>
                                <td>${item.dvCliente}</td>
                                <td>${item.numeroCelular}</td>
                                <td>${item.montoPlan}</td>
                                <td>${item.direccion}</td>
                                <td>${item.obtenerCategoriaCliente()}</td>
                                <td>${item.clienteTieneCampana()}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>

            </div>

        </div>

        <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script type="text/javascript" src="js/materialize.min.js"></script>

        <script>
            $(document).ready(function () {
                $('select').material_select();
            });</script>
        <script>
            $(document).ready(function () {
                $('.datepicker').datepicker();
            });
        </script>
    </body>
</html>
