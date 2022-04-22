#language:es
@WebTables
Característica: Configuración de Web Tables
  Como un usuario la pagina ToolsQa
  Quiero configurar registros de personas en una tabla web
  Para mantener mi informacion organizada

  Antecedentes:
    Dado que el usuario ingresa a la pagina demoqa para interactuar con una tabla web

  @Registro
  Escenario: Agregar registro con datos correctos en la tabla web
    Cuando  el registra informacion solicitada en la tabla
    Entonces el deberia poder agregar el registro

  @Eliminacion
  Escenario: Eliminar registro en la tabla web
    Cuando el selecciona el registro a eliminar
    Entonces el deberia poder eliminar el registro
