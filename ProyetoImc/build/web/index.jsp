<!DOCTYPE html>

<html>
    <head>
        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>

        <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <title>Calculo IMC</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

    </head>
    <body>
        <div class="row">
            <div class="col s3"></div>
            <div class="col s6"> 
                        <div class="card-panel teal">
                            <span class="white-text">Cálculo IMC</span>
                        </div>
                <br>
                
                <form action="Controlador.do" method="post">
                    
                <div class="input-field">
                    <input placeholder="Peso en kg" id="weight" type="text" name="txtPeso">
                    <label for="first_name">Peso</label>
                    <div class="row">
                        <div class="input-field">
                            <input placeholder="Altura en m" id="height" type="text" name="txtAltura">
                            <label for="password">Altura</label>
                        </div>
                    </div>
                    <button class="waves-effect waves-light btn">Procesar</button>
                    </div>
                    </form>
                    <div class="row">
                        <div class="input-field">
                            <input disabled id="resultado" type="text" name="txtResultado" value="${imc}">
                            <label for="resultado">Resultado</label>
                        </div>
                    </div>
                    <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
                    <script type="text/javascript" src="js/materialize.min.js"></script>
                    <script>$(document).ready(function () {
                            $('select').material_select();
                        });</script>
                    </body>
                    </html>
