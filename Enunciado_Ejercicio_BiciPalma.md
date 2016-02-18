#Estación de BiciPalma
EL objetivo es construir un prototipo de la aplicación que gestiona una estación donde se anclan las bicicletas del servicio BiciPalma.

###Clase Estación
####Atributos
* __id__ = identificador de la estación.
* __direccion__ = dirección de la estación.
* __numeroAnclajes__ = número de anclajes de la estación.
* __anclajes[numeroAnclajes]__= array donde almacenarás las bicicletas que se anclen en la estación.

####Métodos
* __consultarEstacion()__  muestra un mensaje con id, direccion y numeroAnclajes.
* __anclajesLibres()__ devuelve la cantidad de anclajes libres.
* __consultarAnclajes()__  recorre el array anclajes y muestra el id de la bici anclada o si está libre.
* __anclarBicicleta(bicicleta)__  inserta el objeto bicicleta en el primer registro libre del array anclajes y llama a mostrarAnclaje()
* __mostrarAnclaje(bicicleta, numeroAnclaje)__ muestra un mensaje con el id de la bicicleta anclada y en qué anclaje se ha anclado
* __leerTarjetaUsuario(tarjetaUsuario)__ comprueba si la tarjeta de usuario está activada
* __retirarBicicleta(tarjetaUsuario)__
    * si la tarjeta de usuario está activada retira una bici del anclaje y muestra su información en pantalla llamando a __mostrarBicicleta(bicicleta, numeroAnclaje)__
    * para simular que un usuario/a del servicio ancla una bici, debes generar una posición al azar entre los anclajes y eliminar esa bici con el método __generarAnclaje()__
    * para eliminar una bici del array debes poner esa posicion del __array__ a __null__.
* __mostrarBicicleta(bicicleta, numeroAnclaje)__ muestra un mensaje con el id de la bici y el número de anclaje donde estaba.
* __generarAnclaje()__ devuelve una posición al azar entre el número de anclajes. Utiliza __ThreadLocalRandom.current()__


###Clase Bicicleta
####Atributos
* __id__ = identificador d ela bicicleta: un número de tres dígitos.

###Clase TarjetaUsuario
####Atributos
* __id__ = identificador de la tarjeta: un número de nueve dígitos.
* __activada__ = valor lógico que indica si la tarjeta está activada o no.




