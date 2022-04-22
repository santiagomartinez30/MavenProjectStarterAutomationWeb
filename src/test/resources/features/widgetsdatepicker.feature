#language:es

Característica: Interaccion con selector de fechas
  Como un usuario la pagina ToolsQa
  Quiero interactuar con un componente para seleccion de fechas
  Para seleccionar una fecha especificada

  @Fechas
  Esquema del escenario: Interactuar con elementos de tipo fecha
    Dado que el usuario ingresa a la pagina demoqa para interactuar con elementos de tipo fecha
    Cuando el realiza la interacción con una fecha <tipo>
    Entonces el puede seleccionar la fecha correctamente

    Ejemplos:
      | tipo   |
      | futura |
      | pasada |