# Descripción del proyecto
Sistema de automatización de prueba (SAP) el cual verifica tres funcionalidades de la pagina de la pagina https://demoqa.com/

1. Alertas
2. Tablas de elementos
3. Seleccion de fechas


# Pre-requisitos 📋
Tener instalado :
- [Maven](https://maven.apache.org/download.cgi) como gestor de dependencias 
- [Java 11](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html) para una correcta ejecución del proyecto

## Comenzando 🚀

Para realizar la administración de este proyecto

# Ejecutar casos de prueba ⚙️
 El SAP encuentra configurado para ejecutarse en cualquier S.O (Windows, Linux, Mac os con procesador intel) con el navegador de su preferencia, por defecto se ejecutarán las pruebas en el navegador **chrome**; sin embargo, podrá utilizar el navegador de su preferencia lanzando alguno de los siguientes comandos desde este archivo readme o desde una terminal de comandos:
   
-  **Google chrome** `mvn clean verify -Dtest=*Runner`
-  **Mozilla firefox** `mvn clean verify -Dtest=*Runner -D"webdriver.driver"=firefox`
-  **Microsoft edge** `mvn clean verify -Dtest=*Runner -D"webdriver.driver"=egde`


 Si desea validar las funcionalidades de manera independiente lo puede realizar también con los siguientes comandos :

   - **Tablas de elementos**:  `mvn clean verify -Dtest=ElementsWebTablesRunner`
   - **Seleccion de fechas**: `mvn clean verify -Dtest=widgetsDatePickerRunner`
   - **Alertas:** `mvn clean verify -Dtest=AlertsRunner`
  

- Otra opción puede ser ejecutar puntualmente uno o un conjunto de casos de prueba mediante el uso de tags, para ello ejecute el siguiente comando

      mvn clean verify -Dcucumber.filter.tags="@Eliminacion"  --> para MacOs y Linux
      mvn clean verify -D"cucumber.filter.tags"="@Eliminacion"  --> para Windows
  
  donde **@Eliminacion** corresponde al tag asigando a nuestro escenario en el archivo **.feature**

# Visualizar reportes
Para acceder a los reportes puede realizarlo dirigiendose al apartado de SERENITY REPORTS el cual podra visualizar en consola al terminar la ejecucion. Serenity proporciona dos tipos de reporte, uno completo y uno resumido

- **Reporte completo**: target/site/serenity/index.html
- **Reporte resumido:** target/site/serenity/serenity-summary.html