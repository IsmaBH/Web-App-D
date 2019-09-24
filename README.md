# Web-App-D
Practicas de Java web, para desarrollar aplicaciones web Full-Stack
Recodar el comando: jar cfv "nombre-del-archivo.war" /Directorio que se agrega

Tener encuenta que la estructura basica de una aplicacion web es:
Raiz
|-->Contenido web publico
|-->WEB-INF/
    |-->web.xml(opcional)
    |-->/lib
    |-->Archivos JAR de los que dependa la aplicación
    |-->/classes
    |-->Aqui se guardan los servlets o cualquier otra clase
Recordar que en el directorio /classes solo deben ir los .class y no los .java
pero por propositos de aprendizaje se anexaran en este directorio los codigos fuente
y no los .class, para probar estas practicas hay que compilar los .java que se suban