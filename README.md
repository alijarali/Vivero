# Vivero

[![Gitter](https://badges.gitter.im/maria-s-garden-center/community.svg)](https://gitter.im/maria-s-garden-center/community?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

Aplicación Java que almacena los productos de un vivero, permite lo siguiente:
 - Añadir productos.
 - Modificar productos.
 - Borrar productos.
 - Listar los productos.
 
Además, cuenta con una base de datos (SQLite) en la que se puede guardar una 
copia (Sobreescribir Datos) de la lista para restaurala (Restaurar Datos) 
en cualquier momento. Los elementos de la lista se almacenan en la base de datos
parseados en JSON. Se utiliza la librería 'GSON' para pasar de objeto a JSON y de 
JSON a objeto.

Por último, también almacena los movimientos del usuario en el archivo 'Log.txt'. 

_____________________________________________________________________________________________
Enlaces a .jar que hay que incluir en el proyecto:
 - JDBC de SQLite: https://mvnrepository.com/artifact/org.xerial/sqlite-jdbc/3.27.2.1
 - GSON: https://mvnrepository.com/artifact/com.google.code.gson/gson/2.8.5
