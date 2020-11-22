#language: es
Característica: Ordenes de clientes

  @ordenar_1
  Escenario: Ordenar una pizza
    Dado que "el usuario" inició con el email "jasonwj96@gmail.com" y la contraseña ".Jason1234"
    Dado que "el usuario" se encuentra en la página de ordenes de pizza
    Cuando ordena una pizza "Buffalo Chicken"
    Cuando confirma las ordenes de pizza
    Cuando llena el campo "nombre" del destinatario con el valor "Jason Wedderburn"
    Cuando llena el campo "linea 1" del destinatario con el valor "Punta pacifica"
    Cuando llena el campo "linea 2" del destinatario con el valor "Calle Este"
    Cuando llena el campo "ciudad" del destinatario con el valor "Panama"
    Cuando llena el campo "region" del destinatario con el valor "Panama"
    Cuando llena el campo "codigo postal" del destinatario con el valor "54323"
    Cuando confirma el envio de las ordenes de pizza
    Entonces deberia ver la orden realizada correctamente

  @ordenar_2
  Escenario: Ordenar una pizza sin haber iniciado sesión
    Dado que "el usuario" se encuentra en la página de ordenes de pizza
    Cuando ordena una pizza "buffalo chicken"
    Cuando confirma las ordenes de pizza
    Entonces debería ser redireccionado a la pantalla de inicio de sesión