<%-- 
    Document   : menu
    Created on : 28-09-2018, 21:41:25
    Author     : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                <a href="#" class="brand-logo">Menu</a>
                <ul id="nav-mobile" class="right hide-on-med-and-down">
                    <li><a href="listado.jsp">Listado</a></li>
                    <li><a href="registrar.jsp">Clientes</a></li>
                    <li><a href="menu.jsp">Home</a></li>
                </ul>
            </div>
        </nav>

        <div class="row">
            <div class="col s3">

            </div>
            <div class="col s6">
                <div class="card-panel blue">
                    <span class="white-text"> Telefonia
                    </span>
                </div>
                <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/e/ef/Logo-telefonia-2015.jpg/600px-Logo-telefonia-2015.jpg" width="444" height="444"></img>


            </div>
            <div class="col s3">
                <br>
            </div>
        </div>

        <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script type="text/javascript" src="js/materialize.min.js"></script>
    </body>
</html>
