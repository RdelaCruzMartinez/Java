#Expresiones Regulares

###Objetivo
Validación de DNI y NIE mediante __expresiones regulares__.

###Requisitos funcionales
La solución que programamos hace unos días para chequear si un __DNI__ era válido sólo
funciona correctamente para “españoles con documento nacional de identidad (DNI)
asignado por el Ministerio del Interior”.

Nos encargan ahora que extendamos el programa para que valide también el NIE o
número de identidad extranjero, documento para “extranjeros residentes en España e
identificados por la Policía”.

El formato del NIE es:

* Letra X + 7 números + dígito de control

* Letra Y + 7 números + dígito de control

* Letra Z + 7 números + dígito de control

##Tu Programa

###Parte I: validación de la sintaxis de DNI y NIE.

Escribe un programa Java que, utilizando una (o varias) expresión regular que diseñes,
valide si la sintáxis de un DNI o un NIE es correcta. Es decir, has de chequear que:

* El DNI posee 8 dígitos y una letra mayúscula que no sea una I Ñ O U.


* El NIE posee una letra inicial X, Y o Z seguida de 7 dígitos, y una letra final que no
sea una I Ñ O U.

1.Utiliza estos casos test DNI correctos (testéalos):
"78484464T","72376173A","01817200Q","95882054E","63587725Q",
"26861694V","21616083Q","26868974Y","40135330P","89044648X",

2.Genera de manera automática 10 casos test DNI incorrectos y testéalos.

3.Genera de manera automática 10 casos test NIE correctos y testéalos.

4.Genera de manera automática 10 casos test NIE incorrectos y testéalos.

###Parte II: validación de la letra del DNI/NIE.

Si dispones de tiempo, refactoriza la clase __DniCif__ del programa __DNI__ en mi [GitHub](https://github.com/dfleta/Java/tree/master/DNI) utilizando
lo que has aprendido sobre expresiones regulares, para validar tanto la sintáxis de un
DNI /NIE como el dígito de control que le corresponde.

Las reglas de validación del dígito de control de un NIE se encuetran explicadas en el
artículo [Número de Identificación Fiscal en la Wikipedia](https://es.wikipedia.org/wiki/N%C3%BAmero_de_identificaci%C3%B3n_fiscal).

Reutiliza la clase __TablaAsignacion__ así como el código que necesites de los casos test en la
clase __Main__.

