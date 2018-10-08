<%-- 
    Document   : registro
    Created on : 28-09-2018, 21:17:08
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
                    <span class="white-text"> Registrar Clientes
                    </span>
                </div>
                <br>
                <form action="TelefoniaServlet" method="post">
                    <div class="input-field">
                        <input id="rutCliente" type="text" name="txtRutCliente" class="validate">
                        <label for="rutCliente">Rut</label>
                    </div> 
                    <div class="input-field">
                        <input id="dvCliente" type="text" name="txtDvCliente" class="validate">
                        <label for="dvCliente">Digito Verificador</label>
                    </div>
                    <div class="input-field">
                        <input id="numeroCelular" type="text" name="txtNumeroCelular" class="validate">
                        <label for="numeroCelular">Numero Celular</label>
                    </div>
                    <div class="input-field">
                        <input id="montoPlan" type="text" name="txtMontoPlan" class="validate">
                        <label for="montoPlan">Monto del Plan</label>
                    </div>
                    <div class="input-field">
                        <input id="direccion" type="text" name="txtDireccion" class="validate">
                        <label for="direccion">Direccion</label>
                    </div>
                    <div class="input-field">
                        <select name="txtComuna">
                            <option value="" disabled selected>Seleccione</option>
                            <option value="La Florida">La Florida</option>
                            <option value="Macul">Macul</option>
                            <option value="San Joaquin">San Joaquin</option>
                            <option value="Puente Alto">Puente Alto</option>
                            <option value="La Granja">La Granja</option>
                        </select>
                        <label>Comuna</label>
                    </div>
                    <div class="input-field">
                        <select name="txtRegion">
                            <option value="" disabled selected>Seleccione</option>
                            <option value="Metropolitana">Metropolitana</option>
                            <option value="Maule">Maule</option>
                            <option value="Rancagua">Rancagua</option>
                            <option value="Valparaiso">Valparaiso</option>
                            <option value="La Serena">La Serena</option>
                        </select>
                        <label>Region</label>
                    </div>
                    <div class="input-field">
                        <input id="renta" type="text" name="txtRenta" class="validate">
                        <label for="renta">Renta</label>
                    </div>
                    <button class="btn waves-effect waves-light blue" type="submit" name="bt" value="registrar">Registrar
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
