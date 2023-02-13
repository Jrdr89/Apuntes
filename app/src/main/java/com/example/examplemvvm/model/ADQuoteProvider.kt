package com.example.examplemvvm.model

class ADQuoteProvider {
    companion object {
        fun random():ADQuoteModel{
            var position:Int  = (0..longitud).random()
            val aparecido = arrayListOf<Int>(ADQuoteProvider.longitud)

            if (aparecido.contains(position)) {
                position= (0..ADQuoteProvider.longitud).random()
            } else {
                aparecido.add(position)
            }
            return ADQuoteProvider.quote[position]
        }
        fun order(position: Int): ADQuoteModel{

            return ADQuoteProvider.quote[position]
        }

        private val quote = listOf<ADQuoteModel>(
            //ACCESO A DATOS
            ADQuoteModel(
                quote = "un fichero como un conjunto de bits que se pueden almacenar en un dispositivo informático.\n"+
                        "Este conjunto de bits viene organizado internamente en líneas y registros.\n" +
                        "Características:\n" +
                        "- Todo fichero viene definido por un nombre único. No puede repetirse dentro de una misma ruta\n" +
                        "- Todos los ficheros se mantienen almacenados, aunque se apague el dispositivo que lo contiene.\n" +
                        "- Los ficheros ocupan un espacio en el dispositivo al que se denomina peso\n" +
                        "- Todo fichero tiene una extensión que identifica su tipo de datos.\n",
                author = "UNIDAD 1  - Manejo de ficheros"
            ),
            ADQuoteModel(
                quote = "En el lenguaje Java, la clase que se utiliza para gestionar ficheros es File, que forma parte del paquete java.io",
                author = "UNIDAD 1  - Manejo de ficheros"
            ),
            ADQuoteModel(
                quote = "Para crear un fichero en Java se hará uso del constructor de File con las siguientes combinaciones de argumentos:\n" +
                        "   File (File padre, String hijo)\n" +
                        "Crea una nueva instancia de File a partir de un nombre de ruta abstracta principal y una cadena con la ruta secundaria.\n" +
                        "   File (String ruta)\n" +
                        "Genera una nueva instancia de File a partir de la ruta indicada en formato string.\n" +
                        "   File (String padre, String hijo)\n" +
                        "Crea una nueva instancia de File a partir de una ruta principal y una ruta secundaria.\n" +
                        "   File (URI uri)\n" +
                        "Crea una nueva instancia de File a través del URI indicado.\n",
                author = "UNIDAD 1  - Manejo de ficheros"
            ),
            ADQuoteModel(
                quote = "Existen principalmente dos maneras de poder acceder a un fichero \n"+
                        "Acceso secuencial: \n" +
                        "Cuando queremos leer un dato concreto de un fichero, necesitamos recorrer el contenido completo del mismo.\n"+
                        "Acceso aleatorio: \n" +
                        "Al contrario del acceso secuencial, con el acceso aleatorio o directo, podemos leer o escribir en cualquier punto del fichero \n"+
                        "En Java, para el acceso directo o aleatorio se utiliza la clase RamdonAccessFile",
                author = "UNIDAD 1  - Manejo de ficheros"
            ),
            ADQuoteModel(
                quote = "Acceso secuencial \n"+
                        "En Java, para leer y escribir de manera secuencial, existen las siguientes clases:\n" +
                        "- De manera binaria: FileInputStream (para escribir) y FileOutputStream (para leer).\n" +
                        "- Caracteres: FileWriter (para escribir) y FileReader (para leer).\n",
                author = "UNIDAD 1  - Manejo de ficheros"
            ),
            ADQuoteModel(
                quote = "Los ficheros de texto están formados únicamente por caracteres legibles mientras que los ficheros binarios están formados por cualquier clase de datos, desde números a lógicos.",
                author = "UNIDAD 1  - Manejo de ficheros"
            ),
            ADQuoteModel(
                quote = "Cuando queremos almacenar objetos en ficheros de tipo binario, podemos hacer uso de las clases \n" +
                        "ObjectInputStream y ObjectOutputStream de la interfaz serializable de Java para que se pueda procesar por partes.",
                author = "UNIDAD 1  - Manejo de ficheros"
            ),
            ADQuoteModel(
                quote = "RandomAccesFile es un flujo bidireccional, permite tanto la escritura como la lectura e implementa todos los métodos de DataInputStream y de DataOutputStream.",
                author = "UNIDAD 1  - Manejo de ficheros"
            ),
            ADQuoteModel(
                quote = "Cuando se trabaja con flujos de datos más complejos\n"+
                        "\n"+
                        "FileInputStream y FileOutStream. Se utilizan para leer y escribir respectivamente en ficheros con códigos binarios.\n" +
                        "DataInputStream y DataOutputStream. Para leer y escribir en ficheros mediante la transformación de bytes al tipo que indiquemos.\n" +
                        "ObjectInputStream y ObjectOutputStream. Sirven para leer y escribir objetos complejos en los ficheros. Aquí entra en juego el concepto de “serialización”.\n",
                author = "UNIDAD 1  - Manejo de ficheros"
            ),
            ADQuoteModel(
                quote = "XML (eXtended Mark-up Language) es un lenguaje de marcas que permite que humanos y máquinas puedan entenderlo mediante una serie de reglas para codificar los documentos.",
                author = "UNIDAD 1  - Manejo de ficheros"
            ),
            ADQuoteModel(
                quote = "Para leer ficheros XML se pueden usar procesadores especiales de XML llamados Parser \n"+
                        "\n"+
                        "- La clase DOM o Document Objetc Model permite leer los documentos XML, se recupera una estructura de árbol \n"+
                        "- SAX (Simple API for XML) es un analizador basado en eventos para ficheros XML. No crea una estructura de árbol, procesan los elementos y atributos en orden secuencial.\n",
                author = "UNIDAD 1  - Manejo de ficheros"
            ),
            ADQuoteModel(
                quote = "La vinculación (binding) de datos XML consiste en la representación del contenido de un documento XML como un objeto en la memoria del dispositivo, también llamado deserialización.",
                author = "UNIDAD 1  - Manejo de ficheros"
            ),
            ADQuoteModel(
                quote = "XPath (Xml Path Language) define un lenguaje para la búsqueda de información dentro de un archivo XML.\n"+
                        "Se usa para recorrer elementos y atributos de un documento XML, proporcionando diferentes tipos de expresiones para consultar información relevante del documento.",
                author = "UNIDAD 1  - Manejo de ficheros"
            ),
            ADQuoteModel(
                quote = "En las bases de datos orientadas a objetos la información se puede almacenar sin la necesidad de realizar ningún tipo de conversión.",
                author = "UNIDAD 2. Manejo de conectores"
            ),
            ADQuoteModel(
                quote = "Existen muchos tipos de protocolos, pero en esta unidad estudiaremos dos:\n" +
                        "ODBC (Open Database Connectivity): estándar de Microsoft para el acceso a bases de datos\n"+
                        "JDBC (Java Database Connectivity): conjunto de interfaces del lenguaje Java que permite conectar aplicaciones Java a bases de datos mediante una API propia",
                author = "UNIDAD 2. Manejo de conectores"
            ),
            ADQuoteModel(
                quote = "Acceso a bases de datos mediante ODBC\n"+
                        "\n"+
                        "- Configuración de la interfaz ODBC: mediante la función SQLAllocHandle()\n"+
                        "- Abrir la conexión: mediante la función SQLConnect()\n"+
                        "- Envío de datos: una vez se ha realizado la conexión, mediante la función SQLExecDirect()\n"+
                        "- Cierre de la conexión: una vez se quiera cerrar la conexión, se usará la función SQLDisconnect() ",
                author = "UNIDAD 2. Manejo de conectores"
            ),
            ADQuoteModel(
                quote = "De manera similar a ODBC, toda aplicación que use JDBC debería realizar los siguientes pasos:\n" +
                        "- Establecer la conexión con la base de datos.\n" +
                        "- Lanzar las instrucciones SQL que se quieran realizar.\n" +
                        "- Procesar los datos devueltos si se da el caso.\n" +
                        "- Desconectar y liberar recursos.\n",
                author = "UNIDAD 2. Manejo de conectores"
            ),
            ADQuoteModel(
                quote = "En una base de datos existen tres sentencias básicas en lenguaje SQL para poder definir información:\n" +
                        "Create: permite crear tanto bases de datos nuevas (CREATE DATABASE) o tablas (CREATE TABLE).\n" +
                        "Alter: permite modificar una tabla de la base de datos, como por ejemplo añadir o eliminar columnas, claves primarias, ajenas, etc.\n" +
                        "Drop: permite eliminar una base de datos (DROP DATABASE) o una tabla (DROP TABLE)\n",
                author = "UNIDAD 2. Manejo de conectores"
            ),
            ADQuoteModel(
                quote = "Las sentencias de manipulación básica de una base de datos son INSERT, UPDATE y DELETE.\n",
                author = "UNIDAD 2. Manejo de conectores"
            ),
            ADQuoteModel(
                quote = "Para poder gestionar la ejecución de sentencias, se pueden usar los siguientes métodos del objeto Statement:\n" +
                        "ExecuteQuery. Devuelve un objeto ResultSet con información sobre una consulta SELECT.\n" +
                        "ejecuteUpdate. Pensada para todas las sentencias de manipulación (INSERT, UPDATE, DELETE) y sentencias de definición de datos (CREATE, DROP, ALTER).\n" +
                        "execute. Se utiliza para cualquier tipo de sentencia devolviendo un valor booleano.\n",
                author = "UNIDAD 2. Manejo de conectores"
            ),
            ADQuoteModel(
                quote = "El mapeo objeto-relacional (ORM, Object-Relational Mapping) es una técnica de programación que permite convertir \n"+
                        "la información de un sistema de base de datos orientado a objetos a otro sistema de tipo relacional",
                author = "UNIDAD 3. Herramientas de mapeo objeto relacional"
            ),
            ADQuoteModel(
                quote ="Hibernate es una herramienta que permite mapear objetos a partir de la información de una base de datos relacional.\n"+
                        "Hibernate implementa las especificaciones de la API de persistencia de Java mediante el uso de las siguientes interfaces:\n " +
                        "* SessionFactory: \n" +
                        "* Configuration\n" +
                        "* Transacción",
                author = "UNIDAD 3. Herramientas de mapeo objeto relacional"
            ),
            ADQuoteModel(
                quote = "Las clases persistentes son clases de Java que implementan las entidades de la base de datos relacionales mediante objetos e instancias.\n" +
                        "Las clases persistentes en Hibernate siguen una serie de principios y reglas, a las que se denomina como Plain Old Java Object (POJO)\n" +
                        "- Todas las clases persistentes necesitan un constructor.\n" +
                        "- Todas las clases deberían tener un ID\n" +
                        "- Todos los atributos de las clases persistentes deben declararse como privados y deben ser accesibles mediante los métodos setXXX y getXXX.\n" +
                        "- Todas las clases persistentes sobreescriben los métodos equals() y hascode() ",
                author = "UNIDAD 3. Herramientas de mapeo objeto relacional"
            ),
            ADQuoteModel(
                quote = "Los estados que las instancias de sesiones pueden tener en un momento concreto pueden ser los siguientes:\n" +
                        "\n"+
                        "Estado transitorio (transient). Una instancia se considera transitoria cuando no está asociada a una sesión, no tiene representación en la base de datos y no tiene asociado ningún valor.\n" +
                        "Estado persistente (persistent). Una instancia se considera persistente cuando tiene representación en la base de datos, posee un valor identificador y está asociada con una sesión. \n" +
                        "Estado separado (detached). Cuando cerramos la sesión de Hibernate con el método close(), la instancia persistente se convertirá en una instancia separada \n" +
                        "Estado eliminado (removed). Cuando se use el método delete()",
                author = "UNIDAD 3. Herramientas de mapeo objeto relacional"
            ),
            ADQuoteModel(
                quote = "La carga de objetos se puede realizar mediante los métodos load() y get(). \n" +
                        "La diferencia principal entre ellos es que get devuelve un valor nulo si no se \n" +
                        "encuentra información en la sesión o la base de datos, mientras que load lanza una excepción de objeto.",
                author = "UNIDAD 3. Herramientas de mapeo objeto relacional"
            ),
            ADQuoteModel(
                quote = "HQL (Hibernate Query Language) está totalmente enfocado a trabajar con objetos persistentes y sus propiedades. \n" +
                        "Esto permite aplicar los principios de herencia, polimorfismo y asociación del paradigma de orientación a objetos",
                author = "UNIDAD 3. Herramientas de mapeo objeto relacional"
            ),
            ADQuoteModel(
                quote = "En el modelo objeto-relacional encontramos estas características principales:\n" +
                        "\n"+
                        "- Cada uno de los registros de una tabla se considera como un objeto.\n" +
                        "- Cada una de las definiciones de una tabla se puede considerar como una clase.\n" +
                        "- Gestionan tipos de datos complejos: Enumeraciones, Colecciones de objetos y Objetos de gran tamaño",
                author = "UNIDAD 4. Bases de datos relacionales y orientadas a objeto"
            ),
            ADQuoteModel(
                quote = "Las bases de datos objeto-relacionales  utilizan el paradigma de orientación a objetos y se benefician de sus principales características:\n" +
                        "- Encapsulamiento \n" +
                        "- Herencia \n" +
                        "- Polimorfismo",
                author = "UNIDAD 4. Bases de datos relacionales y orientadas a objeto"
            ),
            ADQuoteModel(
                quote = "Los arrays o colecciones son estructuras de datos que permiten almacenar atributos multivaluados.",
                author = "UNIDAD 4. Bases de datos relacionales y orientadas a objeto"
            ),
            ADQuoteModel(
                quote = "Bases de datos objeto-relacionales ventajas/ inconvenientes \n" +
                        "Ventajas: \n" +
                        "- Permiten gran cantidad de tipos de datos distintos.\n" +
                        "- Gran cantidad de posibles relaciones entre los objetos y su información.\n" +
                        "- Permiten usar objetos complejos\n" +
                        "- Tienen gran capacidad de modelado \n" +
                        "- Es ideal para sistemas distribuidos y entornos cliente - servidor.\n" +
                        "Inconvenientes:\n" +
                        "- Carecen de un modelo de datos con base teórica y globalmente aceptado.\n" +
                        "- Carecen de estándares generales.\n" +
                        "- Tienen una alta complejidad, resultan difíciles de comprender y manejar.\n" +
                        "- Tienen mucha competencia con los sistemas de bases de datos relacionales y objeto-relación.\n",
                author = "UNIDAD 4. Bases de datos relacionales y orientadas a objeto"
            ),
            ADQuoteModel(
                quote = "Un sistema de gestión de bases de datos de objetos (ODBMS, Object DataBase Management System), \n" +
                        "es un sistema de administración de bases de datos (DBMS, DataBase Management System) capaz de permitir el modelado y la creación de datos como si fueran objetos",
                author = "UNIDAD 4. Bases de datos relacionales y orientadas a objeto"
            ),
            ADQuoteModel(
                quote = "Los tipos de datos en el paradigma de la orientación a objetos se pueden dividir en dos grupos:\n" +
                        "\n" +
                        "- Atómicos, simples o básicos. No están formados por otros objetos. Algunos ejemplos de estos tipos son: boolean, char, string, double, etc.\n" +
                        "- Estructurados. A diferencia de los atómicos, sí pueden estar formados por otros objetos. ",
                author = "UNIDAD 4. Bases de datos relacionales y orientadas a objeto"
            ),
            ADQuoteModel(
                quote = "ODL (Object Definition Language) es un lenguaje de especificación que permite definir \n" +
                        "las interfaces de los distintos tipos de datos. Se encarga de especificar los atributos y las relaciones entre los tipos.",
                author = "UNIDAD 4. Bases de datos relacionales y orientadas a objeto"
            ),
            ADQuoteModel(
                quote = "Diferencias entre OQL y SQL\n" +
                        "OQL es diferente de SQL en estos tres puntos:t\n" +
                        "- Dentro de las tablas, OQL soporta el referenciado a objetos.\n" +
                        "- Todas las palabras clave de SQL no son compatibles en OQL.\n" +
                        "- OQL permite realizar cálculos matemáticos en el interior de las sentencias.\n",
                author = "UNIDAD 4. Bases de datos relacionales y orientadas a objeto"
            ),
            ADQuoteModel(
                quote = "Como su nombre indica, las bases de datos XML se caracterizan por tener un documento XML como unidad mínima de información, es decir, sólo se almacenan documentos XML.\n" +
                        "\n" +
                        "Para acceder y tratar la información se usan diferentes técnicas y tecnologías propias del lenguaje XML como XQuery, XPath y XSLT.",
                author = "UNIDAD 5. Bases de datos XML"
            ),
            ADQuoteModel(
                quote = "ventajas e inconvenientes de trabajar con bases de datos XML:\n" +
                        "Ventajas:\n" +
                        "\n" +
                        "- Permiten el acceso y almacenamiento directamente en formato XML.\n" +
                        "- Poseen un motor de búsqueda con alto rendimiento.\n" +
                        "- Resulta muy sencillo añadir nuevos documentos.\n" +
                        "- Permiten almacenar datos muy heterogéneos\n" +
                        "\n" +
                        "Inconvenientes:\n" +
                        "- Resulta complicado indexar los documentos para realizar las búsquedas.\n" +
                        "- No están contempladas funciones de agregación.\n" +
                        "- Al almacenar documentos XML es complicado crear nuevas estructuras de datos.\n",
                author = "UNIDAD 5. Bases de datos XML"
            ),
            ADQuoteModel(
                quote = "Principales diferencias de cada modelo de base de datos:\n" +
                        "\n" +
                        "- Los datos de un documento XML están relacionados entre sí mediante una jerarquía definida.\n" +
                        "- En los datos relacionales se relacionan entre sí siguiendo relaciones lógicas entre tablas.\n" +
                        "- En los documentos XML los datos se pueden describir a sí mismos mediante una codificación que explica su tipo y contenido.\n" +
                        "- En los datos relacionales, toda la información de una misma columna está definida y debe tener el mismo formato.\n" +
                        "- En los documentos XML existe un orden predefinido debido a la disposición de los elementos en el documento.\n" +
                        "- En los datos relacionales el orden de los registros solo se puede especificar mediante una cláusula específica llamada ORDER BY.\n",
                author = "UNIDAD 5. Bases de datos XML"
            ),
            ADQuoteModel(
                quote = "XPath es el lenguaje recomendado por la W3C (World Wide Web Consortium) que permite navegar a través de los elementos y atributos de un documento XML.",
                author = "UNIDAD 5. Bases de datos XML"
            ),
            ADQuoteModel(
                quote = "XQuery es un lenguaje que permite encontrar y gestionar elementos y atributos de un documento XML.\n" +
                        "\n" +
                        "Se puede utilizar para:\n" +
                        "- Extraer información para usarla en un Web Service.\n" +
                        "- Generar informes resumidos.\n" +
                        "- Transformar datos en formato XML a formato XHTML.\n" +
                        "- Buscar información en documentos Web.\n",
                author = "UNIDAD 5. Bases de datos XML"
            ),
            ADQuoteModel(
                quote = "Cuando se realiza una consulta en el lenguaje XQuery (Xml Query Language) permite leer información en uno o varios documentos XML, devolviendo la respuesta también en datos XML.\n" +
                        "\n" +
                        "Se podría decir que XQuery es a XML lo que SQL es a una base de datos tradicional.\n",
                author = "UNIDAD 5. Bases de datos XML"
            ),
            ADQuoteModel(
                quote = "En líneas generales, el concepto de componente se puede entender como la parte de software \n" +
                        "que está compuesta por partes de código que permiten solucionar una funcionalidad concreta.",
                author = "UNIDAD 6. Programación de componentes de acceso a datos"
            ),
            ADQuoteModel(
                quote = "La programación orientada a componentes (POC) tiene como objetivo principal es proporcionar a los programadores de \n" +
                        "aplicaciones la posibilidad de reutilizar código para funcionalidades concretas \n" +
                        "Características\n" +
                        "\n" +
                        "- Son independientes de la plataforma en la que se puedan utilizar, a nivel software y hardware.\n" +
                        "- Deben estar identificados para permitir su clasificación.\n" +
                        "- Deben tener contenido propio y no necesitar código externo para poder realizar su funcionalidad.\n" +
                        "- Debe ser actualizable por una versión superior o por otro componente que extienda y mejore su funcionalidad.\n" +
                        "- Sólo será accesible mediante su propia interfaz con lo que su funcionalidad no puede cambiar.\n" +
                        "- Debe estar empaquetado, es decir, debe poder distribuirse en paquetes que encapsulen todos los elementos que necesite.\n",
                author = "UNIDAD 6. Programación de componentes de acceso a datos"
            ),
            ADQuoteModel(
                quote = "Las principales ventajas del uso de componentes serían:\n" +
                        "\n" +
                        "- Pruebas simplificadas: Probando cada uno de los componentes antes de utilizar el conjunto\n" +
                        "- Mejora el mantenimiento de los sistemas\n" +
                        "- Mayor calidad de desarrollo: un componente una vez construido puede ser mejorado continuamente\n" +
                        "- Periodos de desarrollo más ajustados:Se reducen los tiempos de desarrollo.\n" +
                        "- Funcionalidades mejoradas: Permite mejorar cualquier funcionalidad poniendo el foco solo en esa parte.\n" +
                        "También existen ciertos inconvenientes de usar componentes, como son:\n" +
                        "- No siempre se encuentra la funcionalidad concreta que se pueda necesitar y que la ofrezca un componente.\n" +
                        "- Existe falta de estándares que confirmen la calidad de los productos finales.\n",
                author = "UNIDAD 6. Programación de componentes de acceso a datos"
            ),
            ADQuoteModel(
                quote = "En Java existen los llamados JavaBeans o Beans que se pueden definir como un estándar para \n" +
                        "componentes hechos en software, reutilizables y manipulables por las herramientas de programación de Java.",
                author = "UNIDAD 6. Programación de componentes de acceso a datos"
            ),
            ADQuoteModel(
                quote = "Los eventos en JavaBeans se utilizan para que dos Beans puedan comunicarse entre ellos y compartir información como sus estados.\n" +
                        "\n" +
                        "En todas las acciones de los eventos intervienen tres elementos:\n" +
                        "EventSource o Source: es el Bean que genera el evento.\n" +
                        "EventListener o Listener: es un Bean que previamente se ha registrado para que sea capaz de escuchar el evento desde el EvenSource.\n" +
                        "EventObject: objeto que encapsula información referente al evento.",
                author = "UNIDAD 6. Programación de componentes de acceso a datos"
            ),
            ADQuoteModel(
                quote = "La introspección en JavaBeans es un mecanismo para conocer y analizar el \n" +
                        "código de una clase, obteniendo información de los métodos de la clase para consultar sus propiedades y eventos.\n" +
                        "Existen dos tipos de introspección en JavaBeans:\n" +
                        "- Implícita: Mediante la interfaz java.beans.Introspector\n" +
                        "- Explícita: Mediante las clases de la interfaz java.beans.BeanInfo\n",
                author = "UNIDAD 6. Programación de componentes de acceso a datos"
            ),
            ADQuoteModel(
                quote = "El mecanismo de reflexión en JavaBeans significa que, dada cualquier clase y en tiempo de ejecución, se pueden obtener todas las propiedades y métodos de dicha clase.\n" +
                        "El mecanismo de reflexión nos proporciona las siguientes funciones principales:\n" +
                        "\n" +
                        "- Construir el objeto de una clase concreta.\n" +
                        "- Construir una instancia de una clase por su nombre.\n" +
                        "- Obtener las propiedades de cualquier objeto.\n" +
                        "- Ejecutar los métodos estáticos de una clase.\n" +
                        "- Conocer si una instancia pertenece a una clase.\n",
                author = "UNIDAD 6. Programación de componentes de acceso a datos"
            ),
            ADQuoteModel(
                quote = "En JavaBeans se entiende que un Bean es persistente cuando implementa la interfaz Serializable.\n" +
                        "\n" +
                        "Esto permite que los Beans puedan guardar y restaurar estados que pueden haberse visto modificados por personalizaciones.\n",
                author = "UNIDAD 6. Programación de componentes de acceso a datos"
            ),
            ADQuoteModel(
                quote = "El empaquetamiento y la posible distribución de JavaBeans se realiza a través de paquetes JAR, donde se pueden incluir varios Beans en un mismo paquete.\n" +
                        "\n" +
                        "En el JAR que pertenece a un Bean se deben incluir todas las clases que lo conforman:\n" +
                        "\n" +
                        "- El propio Bean.\n" +
                        "- Objetos de tipo BeanInfo.\n" +
                        "- Objetos de tipo Customizer.\n" +
                        "- Clases de uso o recursos necesitados por el Bean, etc.\n",
                author = "UNIDAD 6. Programación de componentes de acceso a datos"
            ),


            )
        var longitud:Int  = quote.size-1
        get()= field

    }


}