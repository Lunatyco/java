<%-- 
    Document   : login
    Created on : 28-09-2018, 21:00:22
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
        <div class="row">
            <div class="col s3"></div>
            <div class="col s6">

                <div class="card-panel blue">
                    <span class="white-text"> Login
                    </span>
                </div>
                <br>
                <form action="TelefoniaServlet" method="post">
                    <div class="input-field">
                        <input id="user" type="text" name="txtUsuario" class="validate">
                        <label for="user">Usuario</label>
                    </div> 
                    <div class="input-field ">
                        <input id="clave" type="password" name="txtContrasena" class="validate">
                        <label for="clave">Clave</label>
                    </div>

                    <button class="btn waves-effect waves-light blue" type="submit" name="bt" value="Ingresar">Ingresar
                    </button> 
                </form>
                <div class="input-field">
                    <input disabled id="msj" type="text" name="txtMsj" value="${msj}" class="red-text">
                    <label for="msj"></label>
                </div>
            </div>
            <div class="col s3">
                <br>

            </div>
        </div>

        <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script type="text/javascript" src="js/materialize.min.js"></script>
    </body>
</html>
