Code test para ITERIAM

Sencilla calculadora con un controlador el cual tiene un endpoint encargado de hacer una operación básica, suma y resta en este caso pero escalable a más operaciones básicas (división y multiplicación)

Se han añadido utilidades:

- Lombok: Librería con anotaciones encargadas de eliminar el boilerplate de POJOs, haciendo del código más limpio. https://projectlombok.org/ https://www.adictosaltrabajo.com/2016/02/03/como-reducir-el-codigo-repetitivo-con-lombok/
- Swagger: En concreto swagger-ui para la documentación de APIs.

Para la instalación tan sólo tendremos que hacer:

- git clone de este repositorio
- Desde la raíz del proyecto ejecutar mvn clean install.  Nos dejará el compilado .jar por defecto en la carpeta target dentro de la raíz del proyecto.

- Para levantar el servicio en local y probar el endpoint creado nos basta con ejecutar en un terminal mvn spring-boot:run. Esto nos levantará el servicio y accediendo a la url http://localhost:8080/swagger-ui.html podremos probarlo.

