#language:es
@Alertas
Característica: Interaccion con alertas
  Como un usuario la pagina ToolsQa
  Quiero seleccionar cada una de las diferentes alertas disponibles
  Para interactuar con cada una de ellas

  Antecedentes:
    Dado que el usuario ingresa a la pagina demoqa para interactuar con las diferentes alertas

  @AlertaUno
  Escenario: seleccion de primera alerta
    Entonces el puede abrir y cerrar la alerta basica

  @AlertaDos
  Escenario: seleccion de segunda alerta
    Entonces el puede abrir y cerrar la alerta de tiempo

  @AlertaTres
  Escenario: seleccion de tercera alerta
    Entonces el puede abrir y cerrar la alerta de confirmacion

  @AlertaCuatro
  Escenario: seleccion de cuarta alerta
    Entonces el puede abrir y cerrar la alerta con el nombre de santiago
