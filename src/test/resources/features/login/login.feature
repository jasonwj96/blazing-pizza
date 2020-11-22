#language: es
Característica: Ordenes de clientes
  
  Escenario: Iniciar sesión con credenciales válidos
    Dado que "el usuario" inició con el email "jasonwj96@gmail.com" y la contraseña ".Jason1234"
    Entonces debería ser redireccionado a la pantalla de ordenes

  Escenario: Iniciar sesión con credenciales inválidos
    Dado que "el usuario" inició con el email "aaaaaaaaa@gmail.com" y la contraseña "password1234"
    Entonces deberia ver un mensaje con el texto Invalid login attempt.