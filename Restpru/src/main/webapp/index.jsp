<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <link rel="stylesheet" href="estilos.css">
  <title>Formulario Registro</title>
</head>
<body>
  <section class="form-register">
    <h4>Formulario Registro</h4>
 <form action="RegistrarUsuario" method="post">
    <input class="controls" type="text" name="nombres" id="nombres" placeholder="Ingrese su Nombre">
    <input class="controls" type="text" name="apellidos" id="apellidos" placeholder="Ingrese su Apellido">
     <input class="controls" type="text" name="Ciudad" id="Ciudad" placeholder="Ingrese su Ciudad">
     <input class="controls" type="text" name="Pais" id="Pais" placeholder="Ingrese su País">
     <input class="controls" type="text" name="Ntel" id="Ntel" placeholder="Ingrese su Número de teléfono">
    <input class="controls" type="email" name="correo" id="correo" placeholder="Ingrese su Correo">
    <input class="controls" type="password" name="password" id="password" placeholder="Ingrese su Contraseña">
    <p>Estoy de acuerdo con <a href="#">Terminos y Condiciones</a></p>
    <input class="botons"name="regsitrar "type="submit" value="Registrar">
    <p><a href="login.jsp">¿Ya tengo Cuenta? Ingrese Por favor</a></p>
  </form>
  </section>

</body>
</html>