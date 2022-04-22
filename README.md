# Prueba Tecnica
Proyecto maven el cual contiene tres flujos de prueba automatizados en java bajo el framework de Serenity BDD con cucumber utilizando patron de diseño ScreenPlay.
Para la obtencion de los datos se utilizaron archivos JSON.


# Pre-requisitos 📋
Tener instalado :
- Maven version 3.6.3
- Java version 11

# Ejecutar casos de prueba ⚙️
- El proyecto se encuentra configurado para ejecutarse en cualquier S.O (Windows, Linux, Mac os con procesador intel) con el navegador chrome (version 100.0.4896.127)
  En caso de requerir ejecutar el proyecto bajo otro navegador, se debe agregar los respectivos WebDriver en la carpeta correspondiente que se encuentra dentro de **"src/test/resources/webdriver"**
- Para ejecutar los tres flujos basta con abrir una terminal de comandos, ubicarse en la carpeta donde haya alojado el proyecto y posterior a ello ejecutar el comando :
  
       mvn clean verify -Dtest=*Runner

- Si desea ejecutar los flujos de manera independiente lo puede realizar tambien con los siguientes comandos

   - **Primer flujo**:  `mvn clean verify -Dtest=ElementsWebTablesRunner`
   - **Segundo flujo**: `mvn clean verify -Dtest=widgetsDatePickerRunner`
   - **Tercer flujo:** `mvn clean verify -Dtest=AlertsRunner`
  

- Otra opción puede ser ejecutar puntualmente uno o un conjunto de casos de prueba mediante el uso de tags, para ello ejecute el siguiente comando

      mvn clean verify -Dcucumber.filter.tags="@Eliminacion"  --> para MacOs y Linux
      mvn clean verify -D"cucumber.filter.tags"="@Eliminacion"  --> para Windows
  
  donde **@Eliminacion** corresponde al tag asigando a nuestro escenario en el archivo **.feature**

# Visualizar reportes
Para acceder a los reportes puede realizarlo dirigiendose al apartado de SERENITY REPORTS el cual podra visualizar en consola al terminar la ejecucion. Serenity proporciona dos tipos de reporte, uno completo y uno resumido

- **Reporte completo**: target/site/serenity/index.html
- **Reporte resumido:** target/site/serenity/serenity-summary.html