package com.example.examplemvvm.model

import kotlin.collections.ArrayList as ArrayList1

class PSQuoteProvider {
    companion object {
        fun random(): PSQuoteModel {
            var position: Int = (0..PSQuoteProvider.longitud).random()
            val aparecido = arrayListOf<Int>(PSQuoteProvider.longitud)

            if (aparecido.contains(position)) {
                position= (0..PSQuoteProvider.longitud).random()
            } else {
                aparecido.add(position)
            }
            return PSQuoteProvider.quote[position]
        }
        fun order(position: Int): PSQuoteModel{

            return PSQuoteProvider.quote[position]
        }

        val quote = listOf<PSQuoteModel>(
            PSQuoteModel(
                quote = "Los cuatro conceptos básicos de la programación multiprocesos son los siguientes:\n" +
                        "\n" +
                        "Programas: Los programas son conjuntos de instrucciones que se ejecutan de manera secuencial y que están escritas en un lenguaje de programación concreto.\n" +
                        "Ejecutables: Los ejecutables son ficheros binarios que contienen instrucciones que son interpretadas por un ordenador como si fueran un programa.\n" +
                        "Procesos:  Un proceso es cualquier programa que se está ejecutando.\n" +
                        "Servicios:  Un servicio es un tipo de proceso que no puede interactuar mediante una interfaz con el usuario.\n" ,
                author ="UNIDAD 1: Programación multiproceso"
            ),
            PSQuoteModel(
                quote = "Cada proceso tiene una estructura de datos en la que se almacena la información asociada a la \n"+
                        "ejecución del proceso. Esta zona se llama Bloque de Control de Proceso (BCP).",
                author = "UNIDAD 1: Programación multiproceso"
            ),
            PSQuoteModel(
                quote = "Los elementos de todo proceso son los siguientes:\n" +
                        "\n" +
                        "- Identificador. Como su nombre indica, identifica de manera inequívoca a cada proceso.\n" +
                        "- Nombre. Nombre explicativo asociado al proceso.\n" +
                        "- Terminal. Terminal desde donde se ejecuta el proceso.\n" +
                        "- Usuario. Usuario que ejecuta el proceso.\n" +
                        "- PPID. Identificador del padre del proceso.\n" +
                        "- Uso de CPU. Porcentaje de uso de la CPU por parte del proceso.\n" +
                        "- Tiempo. Hora de inicio del proceso.",
                author = "UNIDAD 1: Programación multiproceso"
            ),
            PSQuoteModel(
                quote = "A medida que un proceso evoluciona en su ciclo de vida, puede ir cambiando de estados según lo necesite.\n" +
                        "Cada proceso puede tener cualquiera de estos estados básicos:\n" +
                        "\n" +
                        "- Nuevo (new)\n" +
                        "- Preparado(ready)\n" +
                        "- En ejecución\n" +
                        "- Bloqueado\n" +
                        "- Terminado\n",
                author = "UNIDAD 1: Programación multiproceso"
            ),
            PSQuoteModel(
                quote = "La planificación de procesos se puede entender como un conjunto de protocolos o políticas que deciden el orden en el que se van a ejecutar los procesos.",
                author = "UNIDAD 1: Programación multiproceso"
            ),
            PSQuoteModel(
                quote = "Los hilos, a diferencia de los procesos, comparten memoria y si un hilo modifica una variable del proceso, el resto de hilos podrá ver la modificación cuando acceda a dicha variable.",
                author = "UNIDAD 1: Programación multiproceso"
            ),
            PSQuoteModel(
                quote = "Los procesos se llaman entidades pesadas porque se alojan en espacios de direccionamiento de memoria independientes, \n"+
                        "y su creación y comunicación entre ellos consume gran cantidad de recursos del procesador. Los hilos a menudo son conocidos o llamados procesos ligeros.",
                author = "UNIDAD 1: Programación multiproceso"
            ),
            PSQuoteModel(
                quote = "Para hilos de un mismo proceso, el sistema operativo mantiene los mismos datos en memoria. Mientras que para hilos de diferentes procesos, se necesitan datos independientes.\n",
                author = "UNIDAD 1: Programación multiproceso"
            ),
            PSQuoteModel(
                quote = "Un hilo es una secuencia de código en ejecución dentro del contexto de un proceso.\n" +
                        "\n" +
                        "• Los hilos no pueden ejecutarse ellos solos.\n" +
                        "• Requieren la supervisión de un proceso padre para correr.\n" +
                        "• Dentro de cada proceso hay un hilo o varios hilos ejecutándose\n",
                author = "UNIDAD 1: Programación multiproceso"
            ),
            PSQuoteModel(
                quote = "Ventajas de hilos\n" +
                        "\n" +
                        "• La ventaja que proporcionan los hilos es la capacidad de tener máscde un camino de ejecución en un mismo programa.\n" +
                        "• Multihilos en aplicaciones Cliente-Servidor\n" +
                        "• Agilizar los tiempos de retraso de la comunicación cliente-servidor.\n",
                author = "UNIDAD 1: Programación multiproceso"
            ),
            PSQuoteModel(
                quote = "Podemos entender el concepto de concurrencia como la ejecución de varios procesos al mismo tiempo.",
                author = "UNIDAD 1: Programación multiproceso"
            ),
            PSQuoteModel(
                quote = "- En un sistema monoprocesador todos los procesos utilizan el mismo espacio de memoria. \n "+
                        "- En los sistemas multiprocesador podemos repartir los procesos en los múltiples procesadores disponibles",
                author = "UNIDAD 1: Programación multiproceso"
            ),
            PSQuoteModel(
                quote = "Los sistemas distribuidos son aquellos cuyos componentes hardware o software, \n"+
                        "disponibles en ordenadores unidos mediante una red, se comunican mediante el envío y recepción de mensajes.",
                author = "UNIDAD 1: Programación multiproceso"
            ),
            PSQuoteModel(
                quote = "La sincronización entre procesos permite que procesos cuya ejecución se realiza al mismo tiempo se puedan comunicar, pudiendo detener \n"+
                        "la ejecución de los que vayan más avanzados hasta que se cumplan las condiciones óptimas y se confirme que los resultados finales serán los deseados.",
                author = "UNIDAD 1: Programación multiproceso"
            ),
            PSQuoteModel(
                quote = "Los semáforos son componentes de bajo nivel de abstracción que permiten ejercer como árbitros en los accesos a un recurso compartido en la programación concurrente. \n"+
                        "Existen dos tipos de semáforos:\n" +
                        "\n" +
                        "- Binarios. Sus valores solo pueden ser 0 ó 1.\n" +
                        "- Generales. Sus valores pueden ser cualquier valor entero no negativo.",
                author = "UNIDAD 1: Programación multiproceso"
            ),
            PSQuoteModel(
                quote = "Los monitores son componentes de alto nivel de abstracción diseñados para gestionar recursos que van a ser accedidos de forma concurrente.\n",
                author = "UNIDAD 1: Programación multiproceso"
            ),
            PSQuoteModel(
                quote = "El paso de mensajes es una técnica de programación concurrente que no necesita memoria compartida y permite sincronizar procesos \n"+
                        "y la exclusión mutua, de forma parecida a como se hace con los semáforos, monitores, etc.",
                author = "UNIDAD 1: Programación multiproceso"
            ),
            PSQuoteModel(
                quote = "La inanición es una situación que se produce cuando un proceso no puede seguir con su ejecución por falta de recursos",
                author = "UNIDAD 1: Programación multiproceso"
            ),
            PSQuoteModel(
                quote = "Los estados principales de cualquier hilo pueden ser:\n" +
                        "\n" +
                        "- En ejecución: En este estado el hilo está activo y está usando el recurso que le ha sido asignado\n" +
                        "- Preparado: En este estado el hilo está listo para que se le asigne un recurso\n" +
                        "- Bloqueado: En este estado el hilo está a la espera que otro hilo libere el bloqueo\n",
                author = "UNIDAD 2. Programación multihilo"
            ),
            PSQuoteModel(
                quote = "- Un hilo se encuentra en el estado new la primera vez que se crea y hasta que el método start es llamado.\n"+
                        "- Cuando se llama al método start de un hilo nuevo, el método run es invocado y el hilo entra en el estado running.\n"+
                        "- El estado not running se aplica a todos los hilos que están parados por alguna razón. \n"+
                        "- Un hilo entra en estado dead cuando ya no es un objeto necesario",
                author = "UNIDAD 2. Programación multihilo. (ampliado internet)"
            ),
            PSQuoteModel(
                quote = "Ventajas y desventajas de la programación concurrente\n"+
                        "\n" +
                        "como beneficio de este mecanismo destaca su aumento en la velocidad de respuesta, mientras que, \n"+
                        "como elemento en contra, aparece la no claridad con respecto al orden de ejecución",
                author = "UNIDAD 2. Programación multihilo. (ampliado internet)"
            ),
            PSQuoteModel(
                quote = "Los hilos de usuario se implementan mediante alguna librería y es esta quien gestiona el hilo sin el soporte del sistema operativo. \n" +
                         "Los hilos de sistema o kernel los crea, gestiona y planifica el propio sistema operativo. \n"+
                        "\n" +
                        "Existen tres modelos para relacionar hilos de usuario con hilos de sistema:\n" +
                        "- Mx1 (muchos a uno)\n" +
                        "- 1x1(uno a uno)\n" +
                        "- MxN(muchos a muchos)\n",
                author = "UNIDAD 2. Programación multihilo"
            ),
            PSQuoteModel(
                quote = "La planificación de hilos se refiere a la política a seguir en la decisión sobre qué hilo toma el control \n" +
                        "del procesador y en qué momento, y también cuándo debe dejar de ejecutarse.\n"+
                        "\n" +
                        "Las características de la planificación de hilos son las siguientes:\n" +
                        "- Todos los hilos tienen una prioridad asignada y aquellos con la prioridad más elevada tendrán preferencia.\n" +
                        "- Todos los hilos se deben ejecutar en algún momento.\n" +
                        "- El tiempo que tiene cada hilo para usar el procesador se puede aplicar o no dependiendo del sistema operativo\n",
                author = "UNIDAD 2. Programación multihilo"
            ),
            PSQuoteModel(
                quote = "La manera más directa para crear un programa multihilo en Java es heredar de la clase Thread redefiniendo su método run().",
                author = "UNIDAD 2. Programación multihilo"
            ),
            PSQuoteModel(
                quote = "La interface Runnable se usa en aquellos casos en los que no se puede hacer que la clase extienda la clase Thread.",
                author = "UNIDAD 2. Programación multihilo"
            ),
            PSQuoteModel(
                quote = "Existen dos formas de crear un hilo en Java:\n" +
                        "- Heredar de la clase Thread.\n" +
                        "- Implementar la interfaz Runnable.\n",
                author = "UNIDAD 2. Programación multihilo"
            ),
            PSQuoteModel(
                quote = "La exclusión mutua en Java se consigue con el uso de la palabra reservada synchronized. Se puede aplicar en bloques de código dentro de métodos y también en métodos enteros.",
                author = "UNIDAD 2. Programación multihilo"
            ),
            PSQuoteModel(
                quote = "Para sincronizar y comunicar entre sí los hilos, se pueden utilizar diferentes mecanismos que proporciona el lenguaje Java. \n"+
                        "\n" +
                        "- Un semáforo se puede entender como un candado con una única llave.\n" +
                        "Esta llave solo la tendrá el cliente que la coge primero y ningún otro puede cogerla hasta que la deje.\n"+
                        "\n" +
                        "- Un monitor es una estructura de alto nivel que permite gestionar la concurrencia, de forma que sólo permite a un único hilo tomar \n"+
                        "el monitor y contiene una lista de hilos en espera para gestionar su acceso.",
                author = "UNIDAD 2. Programación multihilo"
            ),
            PSQuoteModel(
                quote = "En el paso de mensajes en los hilos se suele hacer uso de una cola sincronizada.\n" +
                        "\n" +
                        "Java proporciona la interfaz BlockingQueue para colas con operaciones de bloqueo.\n" +
                        "\n" +
                        "add(e): añade el elemento “e” al final de la cola\n" +
                        "remove(): ELimina y devuelve el elemento al principio de la cola o lanza una excepción si la cola está vacía\n",
                author = "UNIDAD 2. Programación multihilo"
            ),
            PSQuoteModel(
                quote = "Cuando se crea un hilo, antes de llamar al método start() se puede indicar que el hilo \n"+
                        "será ejecutado como un demonio (daemon en inglés). Esto hará que el hilo se ejecute en segundo plano. \n"+
                        "Los hilos demonio tienen la prioridad más baja y si crean otros hilos, también serán demonios. Se encuentran automáticamente en el estado de preparado.\n"+
                        "Para conocer si un hilo es un demonio se usa el método isDaemon(), que devolverá un booleano",
                author = "UNIDAD 2. Programación multihilo"
            ),
            PSQuoteModel(
                quote = "El protocolo TCP/IP se basa en un conjunto de protocolos agrupados en diferentes niveles o capas:\n" +
                        "\n" +
                        "- Capa de aplicación (HTTP, FTP, Telnet): se encuentran las aplicaciones disponibles para los usuarios. \n" +
                        "- Capa de transporte (TCP y UDP): proporciona a las aplicaciones un servicio de comunicaciones de extremo a extremo.  Dos tipos de protocolos\n" +
                        "   -> TCP (Transmission Control Protocol)\n" +
                        "   -> UDP (User Datagram Protocol).\n" +
                        "- Capa de Internet (IP).: permite seleccionar la mejor ruta para enviar los paquetes a través de la red.\n" +
                        "- Capa de acceso a la red (Ethernet). hace de interfaz con la red real, recibiendo los datagramas y transmitiéndolos al hardware de red.\n",
                author = "UNIDAD 3. Utilización de librerías multimedia integradas"
            ),
            PSQuoteModel(
                quote = "IP (Internet Protocol): IP es un protocolo de comunicación de información digital que se clasifica de manera funcional en la capa \n"+
                        "de red según el modelo internacional OSI. Su función es transferir información de manera bidireccional tanto en origen como en destino mediante \n"+
                        "un protocolo no orientado a la conexión. Transfiere paquetes agrupados (conmutados) de datos a través de diferentes redes.",
                author = "UNIDAD 3. Utilización de librerías multimedia integradas"
            ),
            PSQuoteModel(
                quote = "TCP (Transmission Control Protocol): TCP es un protocolo ampliamente usado en Internet para transferir información de manera fiable y bidireccional.\n" +
                        "En los protocolos TCP/IP, TCP se puede entender como la capa intermedia entre la capa de aplicación y la de red (IP)",
                author = "UNIDAD 3. Utilización de librerías multimedia integradas"
            ),
            PSQuoteModel(
                quote = "UDP ( User Datagram Protocol): Es un protocolo del nivel de transporte que se basa en el intercambio de datagramas a través de la red sin necesidad de \n"+
                        "establecer previamente una conexión. Al igual que TCP, también se encuentra entre las capas de aplicación y de red. Aunque a diferencia de TCP, no utiliza \n"+
                        "ningún mecanismo de control sobre la recepción de los datagramas, ni establece previamente ninguna comunicación entre el emisor y el receptor.",
                author = "UNIDAD 3. Utilización de librerías multimedia integradas"
            ),
            PSQuoteModel(
                quote = "La arquitectura cliente/servidor se utiliza para mantener la comunicación de la información \n"+
                        "entre diferentes elementos de una red mediante protocolos y sistemas de almacenaje de los datos.\n"+
                        "\n"+
                        "Está formada por dos partes diferenciadas: la parte del servidor y la parte de cliente"
                ,
                author = "UNIDAD 3. Utilización de librerías multimedia integradas"
            ),
            PSQuoteModel(
                quote = "- Ventajas del modelo cliente/servidor:\n" +
                        "Control centralizado. El servidor se encarga de gestionar los accesos, recursos e información. \n" +
                        "Escalabilidad. Tanto los clientes como los servidores se pueden ampliar de manera independiente para cubrir las necesidades.\n" +
                        "Mantenimiento sencillo. Gracias a que las funciones y gestiones están distribuidas, el sistema general se puede mantener de una manera fácil y a menor coste.\n" +
                        "- Desventajas\n" +
                        "Posibles caídas del servidor por exceso de peticiones. Esto provoca que los clientes no vean respondidas sus solicitudes.\n" +
                        "El servidor necesita un software y un hardware específico, con el consecuente incremento del coste.\n",
                author = "UNIDAD 3. Utilización de librerías multimedia integradas"
            ),
            PSQuoteModel(
                quote = "Actualmente muchas aplicaciones siguen modelos mixtos en los que los dispositivos pueden hacer de clientes y servidores a la vez. En estos casos, \n"+
                        "los roles de servidor y cliente conviven en un mismo dispositivo, a menudo como procesos independientes ejecutados a la vez.",
                author = "UNIDAD 3. Utilización de librerías multimedia integradas"
            ),
            PSQuoteModel(
                quote = "Para la gestión de los sockets, Java utiliza la clase Socket.\n" +
                        "El cliente crea una instancia de socket, que dispondrá de los recursos propios del protocolo TCP, \n"+
                        "ya que las instancias de Socket se suelen crear indicando la dirección y el puerto con el que será necesario comunicarse.",
                author = "UNIDAD 3. Utilización de librerías multimedia integradas"
            ),
            PSQuoteModel(
                quote = "Los sockets son una Interfaz de Programación de Aplicaciones (API, Application Programming Interface) \n"+
                        "que proporciona a dos aplicaciones la posibilidad de intercambiar información, aunque se ejecuten en dispositivos diferentes. \n"+
                        "\n"+
                        "Se pueden entender como la puerta de entrada y salida a la red, constituyendo la base de cualquier aplicación distribuida. \n"+
                        "La documentación oficial de Java define los sockets como el punto final de la comunicación bidireccional entre dos aplicaciones que se ejecutan en red.",
                author = "UNIDAD 3. Utilización de librerías multimedia integradas"
            ),
            PSQuoteModel(
                quote = "Los sockets se sitúan en la capa de transmisión y son el punto de acceso de las aplicaciones a las capas inferiores del sistema.\n" +
                        "\n" +
                        "El lenguaje Java no dispone de otro elemento que pueda trabajar de manera directa en las capas inferiores, con lo que los sockets son la utilidad de programación de más bajo nivel de Java.\n" +
                        "\n" +
                        "Los sockets se encuentran asociados a una IP y a un puerto lo que permite dirigir información a través de la red usando alguno de los protocolos sobre IP disponibles (TCP o UDP).\n",
                author = "UNIDAD 3. Utilización de librerías multimedia integradas"
            ),
            PSQuoteModel(
                quote = "Existen dos tipos de sockets:\n" +
                        "\n" +
                        "- Los sockets orientados a conexión, utilizan el protocolo TCP, permite gestionar los acuses de recibo de los mensajes. \n"+
                        "- Los sockets no orientados a conexión, que usan el protocolo UDP , son más sencillos y eficientes que los TCP, aunque no se garantiza la entrega de paquetes porque se usa el protocolo UDP",
                author = "UNIDAD 3. Utilización de librerías multimedia integradas"
            ),
            PSQuoteModel(
                quote = "Para la creación de sockets en Java se necesita una dirección IP y un puerto para establecer la conexión.",
                author = "UNIDAD 3. Utilización de librerías multimedia integradas"
            ),
            PSQuoteModel(
                quote = "Para poder enlazar y establecer conexiones mediante los sockets en Java se utiliza el método connect()\n "+
                        "Puede que se produzca una excepción del tipo IOException",
                author = "UNIDAD 3. Utilización de librerías multimedia integradas"
            ),
            PSQuoteModel(
                quote = "Un socket de servidor siempre se encuentra esperando que lleguen solicitudes a través de la red. Cuando recibe una petición, \n"+
                        "realiza la operación necesaria para esa solicitud y posteriormente puede devolver un resultado al solicitante",
                author = "UNIDAD 3. Utilización de librerías multimedia integradas"
            ),  PSQuoteModel(
                quote = "La clase Socket contiene los métodos getInputStream y getOutputSream que permiten recoger flujos de entrada y salida orientados a bytes.\n" +
                        "\n" +
                        "Los pasos que se siguen para transmitir y recibir información usando sockets son los siguientes:\n" +
                        "\n" +
                        "- El socket cliente pide conexión en la dirección del servidor y al puerto que se encuentra escuchando una instancia de ServerSocket del servidor.\n" +
                        "\n" +
                        "- ServerSocket acepta la conexión y crea un socket en la parte del servidor con dos canales: uno de entrada y uno de salida.\n" +
                        "\n" +
                        "- El InputStream (flujo de entrada) del socket cliente se encuentra conectado al OutputStream (flujo de salida) del socket servidor, es decir, su flujo de entrada conecta con el flujo de salida del socket cliente.\n" +
                        "\n" +
                        "- Esto permite que la comunicación en ambas direcciones se realice con la calidad que exige el protocolo TCP.\n",
                author = "UNIDAD 3. Utilización de librerías multimedia integradas"
            ),
            PSQuoteModel(
                quote = "La clase Socket contiene los métodos getInputStream y getOutputSream que permiten recoger flujos de entrada y salida orientados a bytes.",
                author = "UNIDAD 3. Utilización de librerías multimedia integradas"
            ),
            PSQuoteModel(
                quote = "Los pasos que se siguen para transmitir y recibir información usando sockets son los siguientes:\n" +
                        "\n" +
                        "El socket cliente pide conexión en la dirección del servidor y al puerto que se encuentra escuchando una instancia de ServerSocket del servidor.\n" +
                        "\n" +
                        "ServerSocket acepta la conexión y crea un socket en la parte del servidor con dos canales: uno de entrada y uno de salida.\n" +
                        "\n" +
                        "El InputStream (flujo de entrada) del socket cliente se encuentra conectado al OutputStream (flujo de salida) del socket servidor,\n" +
                        "es decir, su flujo de entrada conecta con el flujo de salida del socket cliente."+
                        "\n" +
                        "Esto permite que la comunicación en ambas direcciones se realice con la calidad que exige el protocolo TCP.\n",
                author = "UNIDAD 3. Utilización de librerías multimedia integradas"
            ),
            PSQuoteModel(
                quote = "Los protocolos a nivel de aplicación son los de más alto nivel y permiten comunicarse con aplicaciones que se ejecutan \n"+
                        "en diferentes hosts a través de Internet.\n"+
                        "\n" +
                        "- El protocolo telnet (Telecommunication Network) Actualmente en desuso.\n"+
                        "- FTP (File Transfer Protocol) se basa en un modelo cliente-servidor,permitirán al cliente gestionar un sistema de ficheros de manera remota.\n"+
                        "- El protocolo HTTP (Hypertext Transfer Protocol) es el estándar utilizado para la comunicación entre clientes y servidores de un servicio web.\n"+
                        "- POP3 (Post Office Protocol version 3) es un protocolo que permite descargar información desde un servidor de correo a un ordenador cliente\n"+
                        "- El protocolo SMTP (Simple Mail Transfer Protocol) está diseñado específicamente para el envío de correos",
                author = "UNIDAD 4. Generación de servicios en red"
            ),
            PSQuoteModel(
                quote = "El protocolo HTTP define que la comunicación se divide en dos fases: la petición y la respuesta \n"+
                        "Las peticiones y las respuestas son mensajes de texto estructurados en dos bloques y separados entre sí por un salto de línea:\n" +
                        "\n" +
                        "Al primer bloque se le denomina cabecera y es obligatoria.\n" +
                        "El segundo bloque es opcional y se llama cuerpo.\n",
                author = "UNIDAD 4. Generación de servicios en red"
            ),
            PSQuoteModel(
                quote = "POP3 Es un sistema unidireccional, la comunicación se basa en que el servidor descarga los\n"+
                        " mensajes directamente al cliente y, una vez los datos de los mensajes se han descargado, se eliminan del servidor y no se pueden consultar de nuevo.",
                author = "UNIDAD 4. Generación de servicios en red"
            ),
            PSQuoteModel(
                quote = "Existen parámetros obligatorios y opcionales de FTP (File Transfer Protocol): \n "+
                        "\n" +
                        "->Los parámetros obligatorios:\n" +
                        "·Servidor. El servidor al que se quiere conectar.\n" +
                        " ·Usuario. El usuario autorizado para la conexión.\n" +
                        " ·Contraseña. La contraseña asociada al usuario.\n" +
                        " ->Los parámetros opcionales :\n" +
                        " ·Carpeta destino. Se puede indicar una carpeta destino si se conoce.\n" +
                        " ·Modo. FTP tiene dos modos de uso según quien inicie la conexión:\n",
                author = "UNIDAD 4. Generación de servicios en red"
            ),
            PSQuoteModel(
                quote = "Normalmente, cada usuario de Internet usa un único servidor SMTP que coincide con el proveedor que le suministra el buzón de correo electrónico.",
                author = "UNIDAD 4. Generación de servicios en red"
            ),
            PSQuoteModel(
                quote = "Otra librería interesante es Apache Commons Email, que proporciona una API para el envío de correos electrónicos construida sobre la API de correo de Java.\n",
                author = "UNIDAD 4. Generación de servicios en red"
            ),
            PSQuoteModel(
                quote = "Las clases de la jerarquía Transport tienen la función principal de enviar mensajes siguiendo el protocolo que soporten y utilizando una instancia abierta de Session.",
                author = "UNIDAD 4. Generación de servicios en red"
            ),
            PSQuoteModel(
                quote = "SOAP (Simple Object Access Protocol) es un protocolo estándar que permite la comunicación entre dos objetos \n" +
                        "de diferentes procesos mediante el intercambio de información en formato XML.\n"+
                        "\n" +
                        "Tiene tres partes bien diferenciadas:\n" +
                        "- Sobre: Define qué contiene el mensaje y cómo se puede procesar.\n" +
                        "- Reglas de codificación: Para codificar instancias de tipos de datos.\n" +
                        "- Convención: Para gestionar las llamadas a métodos y sus respuestas.\n",
                author = "UNIDAD 4. Generación de servicios en red"
            ),
            PSQuoteModel(
                quote = "Las características de SOAP son:\n" +
                        "\n" +
                        "Extensibilidad del desarrollo.\n" +
                        "Neutralidad en el uso de protocolos de aplicación.\n" +
                        "Independencia de los modelos de programación.\n",
                author = "UNIDAD 4. Generación de servicios en red"
            ),
            PSQuoteModel(
                quote = "WSDL (Web Services Description Language) es un formato de XML usado para describir servicios web.  \n"+
                        "WSDL describe los requisitos del protocolo y los formatos de los mensajes que se necesitan para comunicarse con los servicios disponibles en un servidor.",
                author = "UNIDAD 4. Generación de servicios en red"
            ),
            PSQuoteModel(
                quote = "La invocación a métodos remotos RMI (Remote Method Invocation) permite comunicar objetos que se encuentran en redes diferentes.\n"+
                        "Existen diversos parámetros para realizar una invocación con RMI:\n" +
                        "\n" +
                        "- Objeto servidor o remoto\n" +
                        "- Objeto cliente\n" +
                        "- Método invocado\n" +
                        "- Valor de retorno\n",
                author = "UNIDAD 4. Generación de servicios en red"
            ),
            PSQuoteModel(
                quote = "Con un concepto parecido a RMI, RPC (Remote Procedure Call) permite realizar programación estructurada. \n"+
                        "En este caso, el cliente realiza una petición de manera directa al método del servidor sin necesidad \n" +
                        "de preocuparse del resto de comunicaciones entre ambas partes, pareciendo que se ejecuta de manera local. \n"+
                        "RPC también ofrece diferentes maneras de asegurar la entrega de los mensajes",
                author = "UNIDAD 4. Generación de servicios en red"
            ),
            PSQuoteModel(
                quote = "Los servicios web son técnicas de comunicación estándares para cualquier tipo de comunicación entre cliente y servidor. La mayoría de los servicios web basan su comunicación mediante los protocolos SOAP y REST:\n" +
                        "- El protocolo SOAP (Simple Object Access Protocol) define cómo dos objetos se pueden comunicar usando el lenguaje XML\n" +
                        "- El protocolo REST (Representational State Transfer) son servicios sin obligación de usar XML como lenguaje. Permiten otros como JSON cuyo uso está muy extendido\n",
                author = "UNIDAD 4. Generación de servicios en red"
            ),
            PSQuoteModel(
                quote = "Prácticas de programación segura: \n"+
                        "- Información: La mejor manera de evitar errores es estudiar y comprender los fallos \n"+
                        "- Precaución en la gestión de la información: Muchas aplicaciones aceptan la entrada de datos de diversas fuentes, con lo que se debería comprobar cada entrada\n"+
                        "- Es muy recomendable reutilizar software que ha sido verificado y probado, \n"+
                        "- Siempre es conveniente realizar una revisión de los fallos de seguridad en el código\n"+
                        "- Las listas de control pueden ser muy útiles para confirmar que se han cumplido con todas las fases de seguridad\n "+
                        "- Mantener el código fuente en buen estado es de vital importancia para confirmar la seguridad del software.",
                author = "UNIDAD 5. Utilización de técnicas de programación segura"
            ),
            PSQuoteModel(
                quote = "La criptografía de clave pública permite que emisor y receptor puedan acordar una clave en común para canales inseguros.\n"+
                        "Se denomina también criptografía asimétrica ya que las claves que se usan para encriptar y desencriptar la información son diferentes \n"+
                        "\n" +
                        "La criptografía de clave privada utiliza una clave secreta sólo conocida por su emisor y receptor para encriptar la información",
                author = "UNIDAD 5. Utilización de técnicas de programación segura"
            ),
            PSQuoteModel(
                quote = "Características de la criptografía de clave pública:\n" +
                        "\n" +
                        "- Cada parte tiene una pareja de claves: una pública conocida por todos, y su inversa privada que solo la conoce quien la posee.\n" +
                        "- Cada pareja de claves es complementaria, es decir, lo que cifra una de ellas solo puede ser descifrado por su inversa.\n" +
                        "- La pareja de claves sólo se genera una vez, con lo que no es posible que dos personas hayan obtenido la misma\n" +
                        "- Conociendo la clave pública no se puede obtener ninguna información sobre la clave privada, ni descifrar el texto cifrado.\n",
                author = "UNIDAD 5. Utilización de técnicas de programación segura"
            ),
            PSQuoteModel(
                quote = "Características de la criptografía de clave privada:\n" +
                        "\n" +
                        "- Como la clave es privada o secreta, solo la conocen las partes que intervienen en la comunicación.\n" +
                        "- Como se utiliza la misma clave para el cifrado y descifrado, cuando el emisor envía información \n"+
                        "al receptor se usa la clave privada para cifrar el mensaje, que solo podrá descifrar el receptor si también conoce la clave.",
                author = "UNIDAD 5. Utilización de técnicas de programación segura"
            ),
            PSQuoteModel(
                quote = "Cuando se combina la criptografía con tecnologías de comunicación en red, surgen los llamados protocolos criptográficos o protocolos seguros de comunicaciones.\n"+
                        "- SSL:Protocolo que permite una comunicación segura en una conexión cliente/servidor ante posibles ataques en la red \n "+
                        "- TLS: Evolución del protocolo SSL que amplía y mejora los algoritmos criptográficos que puede utilizar. ",
                author = "UNIDAD 5. Utilización de técnicas de programación segura"
            ),
            PSQuoteModel(
                quote = "Tanto SSL como TLS son protocolos ejecutables en una capa intermedia entre un protocolo de aplicación y un protocolo de transporte como TCP o UDP. \n"+
                        "Por esto, se pueden utilizar para cifrar protocolos de aplicación como Telnet, FTP, SMTP, IMAP o HTTP.",
                author = "UNIDAD 5. Utilización de técnicas de programación segura"
            ),
            PSQuoteModel(
                quote = "Cuando protocolos como HTTP o Telnet se ejecutan sobre un protocolo criptográfico como SSL o TLS se les conoce como versión segura de dicho protocolo.\n" +
                        "\n" +
                        "Algunos de estos protocolos seguros son:\n" +
                        "\n" +
                        "SSH: Protocolo usado como reemplazo de Telnet para comunicaciones seguras.\n" +
                        "HTTPS: Protocolo usado solo para comunicaciones seguras de HTTP.\n",
                author = "UNIDAD 5. Utilización de técnicas de programación segura"
            ),
            PSQuoteModel(
                quote = "Un algoritmo de hash es una transformación criptográfica que se puede aplicar a un conjunto de información para que cumpla siempre una serie de condiciones.\n"+
                        "El más utilizado hoy en día, considerado un estándar, es el algoritmo SHA-1 (Secure Hash Algoritm, o Algoritmo Seguro de Hash)\n"+
                        "Existe una versión mejorada y más segura conocida como el SHA-256",
                author = "UNIDAD 5. Utilización de técnicas de programación segura"
            ),
            PSQuoteModel(
                quote = "La firma digital es un mecanismo criptográfico que transfiere todas las propiedades de la firma manuscrita del mundo físico.\n"+
                        "Los sistemas de firma digital se suelen basar en un esquema de claves asimétricas en el que se invierten los roles de clave pública y privada.\n",
                author = "UNIDAD 5. Utilización de técnicas de programación segura"
            ),
            PSQuoteModel(
                quote = "Un certificado digital es un documento electrónico que identifica al propietario de una clave pública.",
                author = "UNIDAD 5. Utilización de técnicas de programación segura"
            ),
            PSQuoteModel(
                quote = "Una autoridad de certificación (o CA, del inglés Certification Authority) es una entidad que ejerce como notario digital, \n"+
                        "con lo que todos los implicados en el intercambio de claves bajo su autoridad confían en que nunca emitirá un certificado incorrecto.",
                author ="UNIDAD 5. Utilización de técnicas de programación segura"
            ),
            PSQuoteModel(
                quote = "Un gestor de seguridad, o security manager en inglés, es una clase que permite establecer una política de seguridad sobre una aplicación cuando se ejecute,\n"+
                        "es decir, indicar qué conjunto de acciones tiene permitido o no realizar.",
                author = "UNIDAD 5. Utilización de técnicas de programación segura"
            ),
            PSQuoteModel(
                quote = "Un socket seguro es un socket basado en el protocolo SSL, con lo que proporciona una comunicación autenticada, íntegra y confidencial de la información transmitida.\n",
                author = "UNIDAD 5. Utilización de técnicas de programación segura"
            ),

            )
        val longitud = quote.size
        get() = field
    }
}