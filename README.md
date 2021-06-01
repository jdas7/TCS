# TCS

### H.U-1
> “Como ProducOwner quiero realizar las pruebas funcionales del portal
https://www.demoblaze.com/ de las funcionalidades de registro de usuario, logueo de
usuario, adición de productos a la cesta de compras y formulario de contacto para garantizar
el correcto funcionamiento del aplicativo en el ambiente de certificación.”

***1. Indicar cuál sería el procedimiento y documentación a realizar para una correcta implementación de estrategia de pruebas.***
##### Procedimiento
---------------
- El proceso de pruebas inicia desde las definición de los requerimientos, BDD nos brinda una serie de herramientas de las cuales podemos hacer uso en la definición de requerimientos en conjunto como equipo, la reunión de 3 amigos, Podemos hacer uso de esta reunion para poder fomentar la colaboración en el equipo y de esta manera podamos plantear una estrategia de pruebas en la que inicialmente y en conjunto con el equipo se planifiquen y refinen las HU a trabajar, la idea es que trabajemos las HU en un espacio en que el PO, DEV y QA puedan entender las historias a nivel funcional y escribir los criterios de aceptación con ejemplos usando el lenguaje ubicuo Gherkin. BDD también nos da herramientas como el example mapping para mapear, ordenar y definir mejor las HU que trabajaremos.
- Es importante resaltar que al momento de definir las HU como QA tenemos que preguntar ¿que pasaria si cambiamos variables que afecten las funcionalidades a desarrollar?, esto ayuda a que desde la definición de los requerimientos estesmos encontrando posibles bug o errores de definición que se veran representados en soluciones tempranas que no afectaran los tiempos de entrega del proyecto ni sobrecostos, ya que entre mas temprana sea la etapa en que se encuentra el bug menor costo tendra.
- Al tener definida la HU, podemos verificar que cumpla con los principios INVEST, que cuente con criterios de aceptación escritos en gherkin y podremos iniciar a trabajarla.
  - Diseño de los casos de prueba con gherkin, es importante que los casos esten escritos con este lenguaje y cubran todos los posibles escenarios de pruebas, y tipos de prueba a realizar, ademas si la prueba es candidata a regresión marcarla o agregarla a dicha regresión.
  - Si se trabajan con mocks o data preproductiva se debe generar dicha data con anterioridad para poder ejecutar las pruebas
  - Contar con un ambiente de certificación donde se despligue la ultima versión desarrollada, si se maneja un repositorio con git que este artefacto provenga de la rama STG, o el nombre del ambiente de certificación, es importante verificar que se cumpla con una cobertura de pruebas unitarias definida con anterioridad, se puede hacer uso de una herramienta como sonar cloud. Si no culmple con la cobertura de pruebas unitarias definida no se deberia desplegar en el ambiente de certificación.
  - Despues de realizar el despliegue del desarrollo de nuestra HU en el ambiente con las consideraciones de cobertura de pruebas y generación de data, podemos iniciar con la ejecución de pruebas, estas pruebas deben estar documentadas en la herramienta de gestión que estemos usando ya sea Jira, TestRai, Azuer, ect. y con su respectiva evidencia y estado.
  - Si una preuba no pasa por que se presenta un bug, se debe reportan en la herramienta el bug, atar el bug a la HU que se estaba trabajando y priorizar el bug junto al PO y DEV, validando que se pueda dar una solución pronta o generar un inpedimento. Las HU no deben cerrarce con bugs abiertos, y el QA debe gestionar el incidente para que se solucione y poder cerrar la HU.
- Despues de cerficar la funcionalidad de la HU y generar una versión para producción se debe realizar una Regresión completa de la aplicación, certificando que los ultimos cambios no afectan otras funcionalidades ya desarrolladas; se da un visto bueno y se certifica el producto para desplegar a producción.

***2. Realizar la documentación correspondiente que permita conocer y analizar la estrategia de certificación de la H.U-1.***
##### Documentación
---------------
>  H.U-1.
>  
>  **yo como** ProducOwner
>  
>  **quiero** realizar las pruebas funcionales del portal https://www.demoblaze.com/
>  
>  **para** certificar las funcionalidades de  de registro de usuario, logueo de usuario, adición de productos a la cesta de compras y formulario de contacto
>
> **Criterios de aceptación:**
> ----------
> **Caracteristica:** registro de usuario
> 
> **Para** realizar el registro de un usuario en demoblaze
> 
> **Como** cliente de la aplicación
>  
> **Quiero** Contar con la funcionalidad de registro
> 
> > **Escenario 1:** Realizar registro
> > 
> > **Dado** que soy un cliente nuevo de la página demoblaze
> > 
> > **Cuando** realizo un registro exitoso
> > 
> > **Entonces** visualizar mi estado, ordenes de pago y productos de la tienta para comprar
> > 
> > ---------------
> > **Escenario 2:** Realizar registro con usuario existente
> > 
> > **Dado** que soy un cliente nuevo de la página demoblaze
> > 
> > **Cuando** realizo un registro con un nombre de usuario que ya existe
> > 
> > **Entonces** visualizar un mensaje de error indicando que ya esxiste el usuario
> -------------
> **Caracteristica:** logueo de usuario
> 
> **Para** realizar el login de un usuario en advantageonlineshopping
> 
> **Como** cliente de la aplicación
>  
> **Quiero** Contar con un formulario de login
> 
> > **Escenario 1:** Realizar login exitoso
> > 
> > **Dado** que soy un cliente que ya se registro en la página demoblaze
> > 
> > **Cuando** realizo un login
> > 
> > **Entonces** ingreso a la aplicación y visualizo mis ordenes de pago
> > 
> > -----------------
> > **Escenario 2:** Realizar login con contraseña incorrecta
> > 
> > **Dado** que soy un cliente que ya se registro en la página demoblaze
> > 
> > **Cuando** realizo un login con contraseña incorrecta
> > 
> > **Entonces** visualizo un mensaje de error indicando que mi contraseña es incorrecta
> > 
> > -----------------
> > **Escenario 3:** Realizar login con usuario no registrado
> > 
> > **Dado** que soy un cliente que no ha realizado el registro en la página demoblaze
> > 
> > **Cuando** realizo un login
> > 
> > **Entonces** visualizo un mensaje de error indicando que el usuario no existe
> > 
> -------------
> **Caracteristica:** adición de productos a la cesta de compras
> 
> **Para** realizar una compra en demoblaze
> 
> **Como** cliente de la aplicación
>  
> **Quiero** Visualizar los productos que estan a la venta y poderlos añadir al carrito de compras
> 
> > **Escenario:** Adición de productos a la cesta de compras
> > 
> > **Dado** que soy un cliente de la página demoblaze
> > 
> > **Cuando** visualizo los productos que estan a la venta
> > 
> > **Entonces** puedo añadir los productos al carrito de compras
> -------------
> **Caracteristica:** formulario de contacto
> 
> **Para** contar con mi información de contacto en la página demoblaze
> 
> **Como** cliente de la aplicación
>  
> **Quiero** Visualizar un formulario de actualización de mi información
> 
> > **Escenario:** Registro de información de contacto
> > 
> > **Dado** que soy un cliente de la página demoblaze
> > 
> > **Cuando** ingreso a contanto
> > 
> > **Entonces** puedo editar mi información de contacto

***3. Proponga la plantillas adecuadas para la documentación de plan de pruebas y diseños de pruebas.***

>  **yo como** Actor
>  
>  **quiero** funcionalidades
>  
>  **para** realizar una acción en mi aplicación
>
> **Criterios de aceptación:**
> ----------
> **Caracteristica:** descripción de la prueba 
> 
> **Para** lograr un beneficio
> 
> **Como** rol
>  
> **Quiero** realizar una funcionalidad
> 
> > **Escenario 1:** descripción del caso de prueba
> > 
> > **Dado** precondiciones, definir el actor
> > 
> > **Cuando** ocurre el evento, objeto de prueba
> > 
> > **Entonces** resultado esperado
> > 
> > ---------------
> > **Escenario 2:** descripción del caso de prueba
> > 
> > **Dado** precondiciones, definir el actor
> > 
> > **Cuando** ocurre el evento, objeto de prueba
> > 
> > **Entonces** resultado esperado
> -------------

### H.U-2

> “Como Product-Owner quiero realizar las pruebas de regresión de forma automatizada del
portal https://www.demoblaze.com/ a través del Browser Chrome con el respectivo informe
de evidencias y ruta crítica planteada, implementando métodos y herramientas de
automatización para agilizar y garantizar el correcto funcionamiento del aplicativo.”

***1. Indicar cuál sería el procedimiento y documentación a realizar para una correcta implementación de estrategia de pruebas automatizadas.***

##### Procedimiento
-------------
-	Luego de tener las HU redactadas con criterios de aceptación y que es lo que quiere negocio podemos iniciar a escribir nuestras pruebas de aceptación, la idea es definir los escenarios de prueba con gherkin que se convertirá en el insumo para la automatización de los features. Podemos definir cuales escenarios son los que irán a la regresión y de todos los escenarios que se contemplen en la regresión, tomaremos los escenarios que son automatizables ("repetitivos") y los iremos sumando a nuestra regresión automatizada.
-	Al tener los escenarios de prueba automatizados podemos ejecutar las pruebas que diseñamos para la HU que se refino en conjunto con el equipo, aquí podemos ejecutar las pruebas automatizadas verificando que la implementación de ese nuevo feature no impacta en funcionalidades anteriormente desarrolladas y que el nuevo feature funciona de manera correcta, adicional si dejamos pruebas manuales las podemos ejecutar para dar el visto bueno de nuestro producto.
-	Es importante que como QA estemos presentes desde la definición de HU y requerimientos con el equipo, ya que es el momento donde más bug's se pueden presentar por una mala definición, las HU deben ser comprendidas y no generar dudas dentro del equipo, tiene que tener criterios de aceptación que no generen ambigüedades en la HU y debemos preguntarnos siempre ¿qué pasaría si, llego a cambiar algún valor que modifique mi prueba?, ¿la aplicación podrá manejarlo y contara con esos caminos de excepción que se puedan presentar?.
- con esta estrategia de pruebas podemos entregar valor de manera continua en equipos que manejan metodologías agiles como SCRUM. además, podemos ver el valor de encontrar bugs de manera anticipada en las fases de desarrollo, es mucho más económico encontrar un bug en definición que ya cuando pasa a un ambiente de certificación.
> 1. Definición de HU (criterios de aceptación "Gherkin", que este refinada), contar con los insumos de UX si es una historia front.
> 
> 2. Diseñar los escenarios de pruebas con gherkin, y agregar a la regresión los escenarios que consideremos que aplican para verificar la ruta crítica del producto. Si se trabaja con mocks, tener los mocks definidos para las pruebas.
> 
> 3. Contar con un ambiente de certificación donde se desligue la última versión de la aplicación.
> 
> 4. Automatizar nuestros escenarios de pruebas que están agregados como candidatos de regresión.
> 
> 5. Realizar las pruebas de certificación del producto, ejecutando las pruebas automatizadas y manuales que corresponden al feature, si se descubre un bug se reporta en la herramienta de gestión del proyecto, y se hace seguimiento para que se solucione o generar el impedimento ya que no se certifica el producto con bug reportado.
> 
> 6. se entregan las evidencias en la herramienta de gestión del producto, reporte generado e imágenes de las pruebas realizadas.
> 
> 7. Si se va a entregar una versión para producción se realiza una regresión completa, ejecutando las pruebas automatizadas que pasen al 100% y pruebas manuales que estén en la regresión. Luego se entrega reporte de pruebas y se documentan las evidencias de las pruebas realizadas.

##### Documentación
---------------

> ***Living Documentation whit serenity BDD.***
> 
> Documentación que es producida a partir de las especificaciones ejecutables, la cual es expresada en un lenguaje ubicuo para los usuarios.
> 
> Esta documentación siempre estará actualizada ya que se genera a partir de la última versión del sistema.
> 
> En la documentación podemos encontrar información técnica como de negocio y sirve como manual de nuestra aplicación.
>


***2. Realizar la documentación correspondiente que permita conocer y analizar la
estrategia de automatización solicitada en la H.U-2.
Se deben diseñar y automatizar mínimo 4 escenarios de las pruebas de regresión
de las siguientes funcionalidades: registro de usuario, login de usuario, registro de
formulario de contacto y adición del producto MacBook Pro de la sección de
Laptops***


- Del portal https://www.demoblaze.com/, La automatización deberá ser desarrollada con las siguientes herramientas y complementos:
- [ ] Java
- [ ] Selenium
- [ ] Cucumber
- [ ] Gerkhin
- [ ] ScreenPlay
- [ ] Serenity-BDD
- [ ] Principios SOLID
- [ ] Programación orientada a objetos
- [ ] Maven
- [ ] El mapeo de objetos de deberá realizar a travez de la función de xpath.
