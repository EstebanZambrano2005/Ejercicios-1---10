# APE_Ejercicios-1---10
## APE_TRABAJO GRUPAL_GRUPO #02
<div align="center">

<img width="100%" src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=220&section=header&text=ESTRUCTURAS%20DE%20CONTROL%20EN%20JAVA&fontSize=28&fontColor=00FFAB&animation=twinkling&fontAlignY=35&desc=Ciclos%2C%20Condicionales%20y%20L%C3%B3gica%20de%20Programaci%C3%B3n&descAlignY=55&descSize=16&stroke=00FFAB&strokeWidth=1"/>

<br/>

<img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&weight=600&size=22&duration=3000&pause=800&color=00FFAB&center=true&vCenter=true&width=550&lines=For+%2B+While+%2B+Do-While;Contadores+y+Acumuladores;Validaci%C3%B3n+de+Datos;Trabajo+en+Equipo" alt="typing"/>

</div>
<img width="100%" src="https://capsule-render.vercel.app/api?type=rect&color=0:00FFAB,100:2c5364&height=3"/>

## Integrantes

| Nombre | Rol | Usuario GitHub | Tarea |
|--------|-----|-----------------|-------|
| Kevin Garcés | Analista | @Javi2145 | Análisis del problema |
| Cristian Gómez | Programador | @Cristian-GT2006 | Diseño del algoritmo |
| Erick Cordonez | Diseñador | @Erick-100 | Diseño de diagrama de flujo |
| Esteban Zambrano | Desarrollador | @EstebanZambrano2005| Diseño de Pseudocódigo |
| Alex Cabrera | Desarrollador | @Alex2840 | Codificación |
## Objetivo

Desarrollar soluciones algorítmicas en Java integrando estructuras `for`, `while` y `do-while`, ciclos anidados, contadores, acumuladores y validación de datos, demostrando el proceso de construcción de cada solución mediante un repositorio GitHub.

## Descripción de los ejercicios

| # | Ejercicio | Descripción |
|---|-----------|-------------|
| 1 | Control de calificaciones | Ingreso y validación de notas de N estudiantes; calcula promedio, aprobados, reprobados, nota más alta y más baja. |
| 2 | Tabla de multiplicar configurable | Genera tablas de multiplicar entre un rango inicial y final definido por el usuario. |
| 3 | Serie y suma de pares | Muestra la serie de pares hasta N, su cantidad, suma y promedio. |
| 4 | Cajero automático básico | Menú con `do-while`/`switch` para consultar saldo, depositar, retirar y mostrar movimientos. |
| 5 | Estacionamiento universitario | Registro de vehículos por tipo y horas, con tarifas y reporte de recaudación. |
| 6 | Triángulo y patrones | Impresión de patrones con ciclos anidados (asterisco creciente, decreciente y numérico). |
| 7 | Ventas de cafetería | Registro de ventas por producto, con estadísticas de recaudación y producto más vendido. |
| 8 | Detector y depurador de errores | Identificación y corrección de un ciclo infinito, con tabla de trazas y ejemplo propio. |
| 9 | Estadísticas de encuesta universitaria | Cálculo de edad y horas de estudio promedio, y distribución de estudiantes por semestre. |
| 10 | Sistema integrador de parqueadero | Sistema completo que integra todas las estructuras de repetición y validaciones del curso. |

## Estructuras utilizadas

| Ejercicio | Estructura principal | Justificación |
|-----------|----------------------|----------------|
| 1 | `while` (validación) + `for` (procesamiento) | No se sabe de antemano si el dato ingresado será válido. |
| 2 | `for` anidado | Se conoce el rango de tablas y multiplicadores a generar. |
| 3 | `for` | Rango de iteración conocido (2 hasta N). |
| 4 | `do-while` + `switch` | El menú debe ejecutarse al menos una vez y ofrecer varias opciones. |
| 5 | `do-while` + `switch` | Registro repetido hasta que el usuario decide terminar. |
| 6 | `for` anidado | Relación entre ciclo exterior (filas) e interior (columnas). |
| 7 | `do-while` + `switch` | Menú interactivo con condicionales para validar productos. |
| 8 | `while` (corregido) | Se agrega el incremento faltante del contador. |
| 9 | `for` + validación por rangos | Cantidad de estudiantes conocida de antemano. |
| 10 | `for` + `while` + `do-while` + `switch` anidados | Integra todas las estructuras del curso. |


## Conclusiones

- **Ejercicio 1:** El uso de `while` para validar la entrada y `for` para procesar permitió separar claramente la etapa de control de errores de la etapa de cálculo, evitando que datos fuera de rango (notas negativas o mayores a 10) afecten los resultados.

- **Ejercicio 2:** Los ciclos `for` anidados demostraron ser la estructura ideal cuando se conoce de antemano cuántas repeticiones se necesitan (tablas y multiplicadores), simplificando la generación de múltiples tablas sin repetir código.

- **Ejercicio 3:** El manejo conjunto de contador y acumulador dentro de un mismo `for` permitió obtener en una sola pasada la cantidad, suma y promedio de los números pares, optimizando el recorrido.

- **Ejercicio 4:** El `do-while` combinado con `switch` fue clave para mantener el menú activo hasta que el usuario decidiera salir, y las validaciones de saldo evitaron estados inconsistentes en la cuenta.

- **Ejercicio 5:** Se comprobó que aplicar tarifas diferenciadas según el tipo de vehículo requiere condicionales bien definidos dentro del ciclo de registro, además de validar que las horas ingresadas sean siempre positivas.

- **Ejercicio 6:** Los ciclos anidados permitieron entender la relación entre el ciclo exterior (que controla las filas) y el interior (que controla las columnas), fundamental para construir patrones visuales.

- **Ejercicio 7:** Integrar `switch` para la selección de productos junto con contadores y acumuladores facilitó calcular estadísticas de venta y determinar el producto más vendido de forma eficiente.

- **Ejercicio 8:** Se evidenció que un ciclo sin actualización del contador provoca un bucle infinito; la tabla de trazas fue esencial para detectar el punto exacto del error y confirmar la corrección aplicada.

- **Ejercicio 9:** El uso de validaciones por rango (edad, semestre, horas de estudio) garantizó la coherencia de los datos antes de calcular promedios y clasificar a los estudiantes por semestre.

- **Ejercicio 10:** Este ejercicio integrador permitió aplicar de forma simultánea todas las estructuras de repetición vistas en el curso, reforzando la capacidad de combinar `for`, `while`, `do-while` y `switch` en un solo sistema funcional.

**Conclusión general:** El desarrollo de esta práctica permitió al equipo reforzar el manejo de estructuras de repetición, contadores, acumuladores y validación de datos en Java, además de fortalecer el trabajo colaborativo mediante commits progresivos en GitHub, lo cual facilitó documentar y verificar el proceso real de construcción de cada solución.

