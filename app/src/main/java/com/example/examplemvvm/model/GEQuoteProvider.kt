package com.example.examplemvvm.model

class GEQuoteProvider {

    companion object {
        fun random():GEQuoteModel{
            var position:Int  = (0..GEQuoteProvider.longitud).random()
            val aparecido = arrayListOf<Int>(GEQuoteProvider.longitud)

            if (aparecido.contains(position)) {
                position= (0..GEQuoteProvider.longitud).random()
            } else {
                aparecido.add(position)
            }
            return GEQuoteProvider.quote[position]
        }
        fun order(position: Int): GEQuoteModel{

            return GEQuoteProvider.quote[position]
        }

        private val quote = listOf<GEQuoteModel>(
            //ACCESO A DATOS
            GEQuoteModel(
                quote = "Se puede entender un sistema de gestión empresarial como un conjunto de recursos enfocados a mejorar los procesos y tratamiento de la información considerada importante para el correcto funcionamiento de un negocio.\n" +
                        "Un aspecto importante en la organización de cualquier empresa es la especialización del trabajo ya que puede variar mucho de una empresa a otra.",
                author = "UNIDAD 1. Identificación de sistemas ERP-CRM"
            ),
            GEQuoteModel(
                quote = "La arquitectura a nivel técnico de los sistemas ERP-CRM se basa en las principales características:\n" +
                        "- Modelo cliente-servidor. En estos sistemas, normalmente uno o varios servidores dan servicio a los clientes a través de la red.\n" +
                        "- En la actualidad, la mayoría de ERPs implementan los clientes mediante navegadores web que se comunican con el servidor a través del protocolo HTTP.\n" +
                        "- Bases de datos. Se trata de una base de datos centralizada en el equipo que hace de servidor, facilitando así la integración de la información.\n" +
                        "Normalmente se utilizan tecnologías de bases de datos de modelo relacional como MySQL u Oracle.\n" +
                        "- Lenguaje de programación. El lenguaje de programación condiciona el uso o elección del sistema según la infraestructura donde se vaya a implementar.\n" +
                        "- Sistema operativo. En la actualidad, muchos sistemas ERP-CRM son multiplataforma",
                author = "UNIDAD 1. Identificación de sistemas ERP-CRM "
            ),
            GEQuoteModel(
                quote = "Los sistemas de planificación de recursos empresariales o ERP (del inglés Enterprise Resource Planning) se pueden entender como programas de software modulares que permiten gestionar toda la información de una empresa.\n",
                author = "UNIDAD 1. Identificación de sistemas ERP-CR"
            ),
            GEQuoteModel(
                quote = "Características típicas de los sistemas ERP-CRM son las siguientes:\n" +
                        "- Modular. Este tipo de sistemas se pueden dividir , encargándose cada uno de ellos de unas tareas concretas\n" +
                        "  En un sistema ERP-CRM existen tres tipos de módulos principalmente:\n" +
                        "   * Básicos. Son módulos que se encargan de las funciones mínimas necesarias.\n" +
                        "   * Opcionales. Son módulos que realizan funciones complementarias como, por ejemplo, el uso de un TPV.\n" +
                        "   * Específicos. Son módulos que se pueden desarrollar fuera del sistema por defecto para realizar alguna tarea muy concreta y a medida.\n" +
                        "- Flexible. Siempre se podrán adaptar ciertas funcionalidades concretas para poder atender necesidades concretas del negocio.\n" +
                        "Abierto. Permite una primera implantación rápida y sin costes elevados.",
                author = "UNIDAD 1. Identificación de sistemas ERP-CRM"
            ),
            GEQuoteModel(
                quote = "Objetivos de los ERP\n" +
                        "\n" +
                        "Entre los diversos objetivos de un ERP podemos destacar los siguientes:\n" +
                        "\n" +
                        "- Planificación y automatización de procesos y tareas habituales de una organización.\n" +
                        "- Centralizar toda la información en un único lugar para su acceso rápido y fácil, y compartirla entre diferentes departamentos.\n" +
                        "- Ofrecer un mayor control y gestión de la actividad tanto interna como externa a la dirección.\n" +
                        "- Gestión de las distintas áreas de una organización, como finanzas y contabilidad, área comercial, logística, producción, entre otras.\n",
                author = "UNIDAD 1. Identificación de sistemas ERP-CR"
            ),
            GEQuoteModel(
                quote = "Características de los ERP\n" +
                        "\n" +
                        "- Integración. Los sistemas ERP permiten integrar la gran mayoría de los departamentos de una empresa\n" +
                        "\n" +
                        "- Modularidad. Cada uno de los módulos que componen un sistema ERP gestiona un área concreta de la empresa. \n" +
                        "\n" +
                        "- Adaptabilidad. Si se juntan las características de integración y modularidad, un ERP se puede adaptar a las necesidades y requisitos concretos de cualquier empresa\n" +
                        "\n",
                author = "UNIDAD 1. Identificación de sistemas ERP-CR"
            ),
            GEQuoteModel(
                quote = "Los ERPs libres se caracterizan por utilizar una licencia que permite el acceso al código fuente para su posible adaptación y modificación.\n" +
                        "Los ERPs propietarios tienen como característica principal que para usarlos se necesita pagar una licencia que normalmente depende de la cantidad de usuarios que utilicen el ERP.\n",
                author = "UNIDAD 1. Identificación de sistemas ERP-CR"
            ),
            GEQuoteModel(
                quote = "Los sistemas de gestión de relaciones con el cliente o sistemas CRM (del inglés Customer Relationship Management) se centran en la gestión de las relaciones y respuestas de una empresa hacia sus clientes a través de un sistema de información.\n",
                author = "UNIDAD 1. Identificación de sistemas ERP-CR"
            ),
            GEQuoteModel(
                quote = "Uno de los objetivos de todo CRM es conseguir mejorar todos los procesos enfocados en los clientes, consiguiendo que estos tengan la mejor experiencia con la empresa, promoviendo así su fidelización",
                author = "UNIDAD 1. Identificación de sistemas ERP-CR"
            ),
            GEQuoteModel(
                quote = "Hoy en día existen multitud de sistemas CRM que se pueden dividir en:\n" +
                        "\n" +
                        "Sistemas CRM independientes: Los CRM independientes se refieren a aquellos que no forman parte directa de un ERP. Un ejemplo de CRM independiente puede ser SugarCRM.\n" +
                        "Sistemas CRM integrados en ERPs o sistemas dependientes de los sistemas ERP.",
                author = "UNIDAD 1. Identificación de sistemas ERP-CR"
            ),
            GEQuoteModel(
                quote = "Las características de los sistemas ERP-CRM permiten distinguirlos de otros tipos de sistemas. A continuación, se comentan en detalle las tres características principales de estos sistemas:\n" +
                        "\n" +
                        "- Integridad.\n" +
                        "- Modularidad.\n" +
                        "- Adaptabilidad.\n",
                author = "UNIDAD 1. Identificación de sistemas ERP-CR"
            ),
            GEQuoteModel(
                quote = "Uno de los principales problemas para implementar un “data warehouse” reside en los diferentes orígenes de donde provienen los datos a integrar, con lo que se necesita diseñar un proceso que filtre, restructure y solucione posibles inconsistencias de los datos",
                author = "UNIDAD 1. Identificación de sistemas ERP-CR"
            ),
            GEQuoteModel(
                quote = "Para configurar correctamente un almacén de datos se necesita seguir una serie de fases. Son las siguientes:\n" +
                        "- Definición de los objetivos\n" +
                        "- Definición de requerimientos de información.\n" +
                        "- Diseño y modelización.\n" +
                        "- Implementación.\n" +
                        "- Revisión ",
                author = "UNIDAD 1. Identificación de sistemas ERP-CR"
            ),
            GEQuoteModel(
                quote = "La implantación de estos sistemas se entiende como el proceso global que tiene como objetivo final la puesta en marcha\n" +
                        "En este proceso intervienen varias fases: análisis de requisitos, estudio de posibles soluciones, decisión de un producto concreto, instalación y configuración, migración de datos si fuera necesaria, formación de los usuarios y realización de adaptaciones si se diera el caso.\n",
                author = "UNIDAD 2. Instalación y configuración de sistemas ERP-CRM"
            ),
            GEQuoteModel(
                quote = "Una de las características de los sistemas ERP-CRM es la adaptabilidad.\n" +
                        "Atendiendo a esta adaptabilidad, encontramos:\n" +
                        "\n" +
                        "Sistemas cerrados.\n" +
                        "Sistemas parametrizables.\n" +
                        "Sistemas programables.\n",
                author = "UNIDAD 2. Instalación y configuración de sistemas ERP-CRM"
            ),
            GEQuoteModel(
                quote = "El término programable en los sistemas ERP-CRM hace referencia a la capacidad de desarrollar procesos extras a los que ya tiene el propio sistema.\n" +
                        "\n" +
                        "Muchos sistemas, sobre todo de código abierto, permiten generar módulos adaptables a ciertas funciones que necesitan las empresas para que los ERPs y CRMs puedan llevar a cabo procesos nuevos o adaptar los ya existentes.",
                author = "UNIDAD 2. Instalación y configuración de sistemas ERP-CRM"
            ), GEQuoteModel(
                quote = "Las licencias también se pueden clasificar por su coste económico, es decir, lo que se puede llegar a pagar por poder utilizarlas.\n" +
                        "\n" +
                        "Freeware. El programa o software es de uso totalmente gratuito, sin ningún coste añadido.\n" +
                        "Payware. Para utilizar estos programas, los usuarios deben pagar cierta cantidad económica.\n" +
                        "Shareware. En este tipo de software, el usuario puede hacer uso del mismo durante un tiempo concreto.\n",
                author = "UNIDAD 2. Instalación y configuración de sistemas ERP-CRM"
            ),
            GEQuoteModel(
                quote = "Esta auditoría inicial se divide en cuatro fases o procesos para definir las necesidades iniciales previas a la instalación del sistema.\n" +
                        "\n" +
                        "Estas fases se dividen en las siguientes definiciones:\n" +
                        "\n" +
                        "Definición de los resultados a obtener con la implantación de un ERP. \n" +
                        "Definición del modelo de negocio. No todos los modelos de negocio son iguales ni necesitan las mismas funcionalidades.\n" +
                        "Definición del modelo de gestión. Cuantos más datos se vayan a almacenar en el sistema, más fácil será que se puedan producir duplicidades o errores\n" +
                        "Definición de la estrategia de implantación. Se debe definir una correcta estrategia para implantar el sistema ERP-CRM de manera correcta.\n",
                author = "UNIDAD 2. Instalación y configuración de sistemas ERP-CRM"
            ),
            GEQuoteModel(
                quote = "Para realizar esta implantación se pueden seguir las siguientes operaciones imprescindibles:\n" +
                        "\n" +
                        "Instalar el software bajo un hardware y sistema operativo concretos siguiendo las instrucciones\n" +
                        "Instalar los módulos adicionales que se necesiten \n" +
                        "Configurar el software siguiendo las necesidades y parámetros establecidos.\n" +
                        "Verificar el correcto funcionamiento del sistema\n" +
                        "Documentar todas las operaciones realizadas y las incidencias que puedan darse junto con su posible resolución.\n",
                author = "UNIDAD 2. Instalación y configuración de sistemas ERP-CRM"
            ),
            GEQuoteModel(
                quote = "El acceso físico tiene como característica principal que se accede a la información de manera directa en un sistema. Mientras que la característica principal del acceso lógico es que no se tiene constancia de donde reside la información, pudiendo estar en un sistema al que no se tiene un acceso físico directo.",
                author = "UNIDAD 2. Instalación y configuración de sistemas ERP-CRM"
            ),
            GEQuoteModel(
                quote = "La base de datos es el pilar fundamental de todo sistema ERP-CRM. Es el soporte donde se almacena toda la información que se necesite en el día a día de cualquier empresa.\n" +
                        "\n" +
                        "Normalmente estas bases de datos son relacionales",
                author = "UNIDAD 3. Organización y consulta de la información"
            ),
            GEQuoteModel(
                quote = "Las bases de datos relacionales tienen una serie de propiedades que las hacen especialmente útiles en los sistemas ERP-CRM, como son las siguientes:\n" +
                        "\n" +
                        "Integridad. Los datos deben guardar coherencia entre ellos y no tener redundancia.\n" +
                        "Compartición. El sistema debe permitir que la información se pueda compartir entre usuarios diferentes.\n" +
                        "Seguridad. Se debe controlar los accesos de los usuarios al sistema, manteniendo las normas de seguridad que se hayan establecido.\n" +
                        "Protección contra errores. Se debe asegurar que la información se mantenga sin fallos durante la vida de los diferentes procesos del sistema.\n",
                author = "UNIDAD 3. Organización y consulta de la información"
            ),
            GEQuoteModel(
                quote = "Los procedimientos almacenados de servidor son un conjunto de una o varias instrucciones con las siguientes características:\n" +
                        "- Pueden aceptar una serie de parámetros de entrada, devolviendo valores en forma de parámetros de salida.\n" +
                        "- Contienen instrucciones de programación en lenguaje SQL que permiten ejecutar una serie de operaciones en la base de datos.\n" +
                        "- Pueden retornar un valor de estado para que otro programa que realiza la llamada pueda saber si la operación se ha realizado de manera correcta,\n",
                author = "UNIDAD 3. Organización y consulta de la información"
            ),
            GEQuoteModel(
                quote = "Ventajas del uso de procedimientos almacenados en una base de datos\n" +
                        "Reducción del tráfico entre cliente y servidor. Gracias a que los comandos de un procedimiento se lanzan en un único código\n" +
                        "Mayor seguridad. Los procedimientos permiten controlar los accesos y operaciones a la base de datos\n" +
                        "Como las llamadas al procedimiento se realizan a través de la red, los objetos no son visibles \n" +
                        "Pueden proteger frente a ataques por inyección de código SQL.\n" +
                        "Reutilización del código. Con los procedimientos se puede encapsular el código y reutilizarlo\n" +
                        "Tareas de mantenimiento más sencillas.\n" +
                        "Mayor rendimiento. El proceso de compilación de los procedimientos sólo se produce la primera vez que se ejecutan",
                author = "UNIDAD 3. Organización y consulta de la información"
            ),
            GEQuoteModel(
                quote = "En general, dependiendo de su uso, existen tres tipos de albaranes:\n" +
                        "\n" +
                        "- De entrada. Usado para recibir mercancías.\n" +
                        "- De salida. Usado para controlar el envío de los productos desde un almacén.\n" +
                        "- Externo. Se utiliza para controlar los movimientos entre varios almacenes o entre las posibles localizaciones de un único almacén.\n",
                author = "UNIDAD 3. Organización y consulta de la información"
            ),
            GEQuoteModel(
                quote = "La trazabilidad en los sistemas ERP-CRM se refiere a la posibilidad de seguir todo el ciclo de vida de un producto, desde los materiales necesarios para fabricarlo hasta su distribución por parte de la empresa.",
                author = "UNIDAD 3. Organización y consulta de la información"
            ),
            GEQuoteModel(
                quote = "En muchos de los sistemas ERP-CRM actuales se incluyen ciertas herramientas que permiten monitorizar el comportamiento general de los procesos \n" +
                        "Los objetivos principales de los procesos de monitorización son los siguientes:\n" +
                        "- Detectar posibles fallos del sistema.\n" +
                        "- Asegurarse que el sistema funciona de manera correcta\n" +
                        "Su misión principal es conocer los tiempos de ejecución",
                author = "UNIDAD 3. Organización y consulta de la información"
            ),
            GEQuoteModel(
                quote = "En los sistemas informáticos, los logs se utilizan para almacenar en formato texto todas las acciones que ocurren en un sistema concreto\n" +
                        "Permite dejar reflejado en formato texto la entrada y salida de los usuarios en un sistema ERP-CRM.\n",
                author = "UNIDAD 3. Organización y consulta de la información"
            ),
            GEQuoteModel(
                quote = "Toda la información que se encuentra almacenada en las bases de datos de los sistemas ERP-CRM se puede mostrar a los usuarios a través de vistas que recogen los datos de las tablas correspondientes.\n" +
                        "\n" +
                        "Por lo tanto, pueden existir dos tipos de interfaces diferentes:\n" +
                        "Estáticas. Creadas en el interior del código sin posibilidad de ser modificadas.\n" +
                        "Dinámicas. Se pueden modificar por el usuario, guardando la descripción de la vista en un lenguaje de descripción de datos como XML",
                author = "UNIDAD 4. Implantación de sistemas ERP-CRM en una empresa"
            ),
            GEQuoteModel(
                quote = "El Modelo-Vista-Controlador (MVC) es un tipo de arquitectura en el mundo del software que permite la separación entre la información (datos) y la forma en que se puede representar.\n" +
                        "\n" +
                        "El Modelo permite representar la información que se almacena en el sistema.\n" +
                        "La Vista permite mostrar la información que se quiera al usuario y gestionar la interacción con él.\n" +
                        "El Controlador gestiona cómo se debe transformar la información para que Modelo y Vista se puedan comunicar entre ellos.\n",
                author = "UNIDAD 4. Implantación de sistemas ERP-CRM en una empresa"
            ),
            GEQuoteModel(
                quote = "Los informes personalizados son una manera muy eficaz de organizar y manejar la información, y mediante los tableros se pueden agrupar varios informes al mismo tiempo para intentar mejorar los procesos de la empresa.",
                author = "UNIDAD 4. Implantación de sistemas ERP-CRM en una empresa"
            ),
            GEQuoteModel(
                quote = "Uno de los tipos gráficos más habituales en los mandos de control es el llamado gráfico Gauge, ya que permiten mostrar la información sobre el progreso de un objetivo de manera clara y muy visual.",
                author = "UNIDAD 4. Implantación de sistemas ERP-CRM en una empresa"
            ),
            GEQuoteModel(
                quote = "En todos los sistemas ERP-CRM actuales se pueden realizar desarrollos personalizados de componentes para dar respuesta a particularidades propias de cada empresa que haga uso de estos sistemas.",
                author = "UNIDAD 5. Desarrollo de componentes"
            ),
            GEQuoteModel(
                quote = "Para desarrollar módulos en Odoo, los equipos de programación deberán tener en mente los siguientes puntos o fases:\n" +
                        "\n" +
                        "- Generar un entorno de desarrollo haciendo uso del IDE PyCharm.\n" +
                        "- Crear un diagrama de modelos con el lenguaje UML que representa el módulo que se quiera desarrollar.\n" +
                        "- Estudiar la estructura interna de los módulos de Odoo.",
                author = "UNIDAD 5. Desarrollo de componentes"
            ),
            GEQuoteModel(
                quote = "Un módulo en Odoo contiene todos los elementos del patrón Modelo-Vista-Controlador (MVC), componente básico de la programación en Odoo.\n" +
                        "\n" +
                        "- Los datos de la aplicación, que es el modelo en Odoo.\n" +
                        "- La interfaz del usuario, la vista en Odoo.\n" +
                        "- El controlador, que define la manera en que la interfaz y el usuario se comunican, los formularios en Odoo",
                author = "UNIDAD 5. Desarrollo de componentes"
            ),
            GEQuoteModel(
                quote = "A la hora de la creación de nuevos módulos, se debe tener en cuenta que el componente vital de todo sistema ERP-CRM es la información almacenada en una base de datos.\n" +
                        "Será necesario aplicar ciertas técnicas que permitan mejorar estos tiempos de respuesta.\n" +
                        "Diseño de tablas. Asegurar que no existe duplicidad de información\n" +
                        "Campos: ajustar lo máximo posible el espacio que pueden ocupar los campos\n" +
                        "Índices. Utilizar índices para poder realizar búsquedas con una velocidad ampliamente superior.\n" +
                        "Optimización de sentencias SQL: Optimizar el lenguaje de consulta y modificar los datos almacenados.\n" +
                        "Optimización de la base de datos: conectarse a la base de datos a través de comando y lanzar sentencias de optimización a los datos\n",
                author = "UNIDAD 5. Desarrollo de componentes"
            ),
            GEQuoteModel(
                quote = "En el caso de Odoo, está programado en el lenguaje Python, es un lenguaje interpretado, orientado a objetos y multiplataforma. Convierte su código fuente en objeto la primera vez que se ejecuta, consiguiendo la flexibilidad de los lenguajes script y la velocidad de un lenguaje ya compilado.\n",
                author = "UNIDAD 5. Desarrollo de componentes"
            ),
            GEQuoteModel(
                quote = "En Python no existe ningún elemento para indicar la finalización de un bloque, así que se establece el contenido a través del sangrado, poniendo el mismo número de espacios en todas las líneas que lo formen.",
                author = "UNIDAD 5. Desarrollo de componentes"
            ),
            GEQuoteModel(
                quote = "Las tuplas en Python actúan como listas que no se pueden modificar. Una característica importante de las tuplas es que pueden usar diferentes índices para seleccionar un elemento concreto o un rango de valores.",
                author = "UNIDAD 5. Desarrollo de componentes"
            ),
            GEQuoteModel(
                quote = "Las variables en Python no se tienen que definir para usarse, con lo que solo se necesitará asignar un valor y ya estará accesible.\n" +
                        "Existen dos tipos de variables en Python según el ámbito en el que vayan a ser visibles:\n" +
                        "\n" +
                        "- Globales. Mantienen un valor a lo largo de todo el código, incluidos los diferentes métodos y clases.\n" +
                        "- Locales. Solo tienen efecto dentro del bloque donde se inicializan\n",
                author = "UNIDAD 5. Desarrollo de componentes"
            ),
            GEQuoteModel(
                quote = "La función para mostrar por pantalla una información es print, que tendrá como parámetro la cadena que determinará la manera en la que se imprimirán las variables.",
                author = "UNIDAD 5. Desarrollo de componentes"
            ),
            GEQuoteModel(
                quote = "En el ERP de Odoo, normalmente se suele realizar una carga inicial de datos. Para ello, y debido a la amplia cantidad de módulos diferentes que pueden trabajar al mismo tiempo en Odoo, para la inserción masiva de datos se suele utilizar ficheros en formato XML.",
                author = "UNIDAD 5. Desarrollo de componentes"
            ),
            GEQuoteModel(
                quote = "Para el apartado de formularios la mejor opción para su creación es utilizar archivos XML, que contienen la información necesaria para importarlos al sistema\n" +
                        "En cuanto a los informes, en Odoo se pueden generar prácticamente de cualquier modelo que se tenga instalado en el sistema.\n",
                author = "UNIDAD 5. Desarrollo de componentes"
            ),
            GEQuoteModel(
                quote = "Los procesos batch input son procesos que se ejecutan en segundo plano y que permiten la simulación de inserción de datos en alguna transacción concreta. Este tipo de programación de un proceso “batch input” se usa ampliamente para la carga masiva de datos en diferentes sistemas ERP-CRM",
                author = "UNIDAD 5. Desarrollo de componentes"
            ),
            GEQuoteModel(
                quote = "Debido a su vital importancia, estos sistemas permiten la posibilidad de extraer e importar datos en cualquier momento. \n" +
                        "Los sistemas ERP-CRM ofrecen diferentes formatos\n" +
                        "\n" +
                        "CSV. Archivos en texto plano donde la información se separa mediante comas.\n" +
                        "Ficheros Excel.\n" +
                        "Ficheros PDF.\n" +
                        "Todos estos formatos permiten estandarizar los procesos de migración a diferentes entornos externos al sistema ERP",
                author = "UNIDAD 5. Desarrollo de componentes"
            ),
            GEQuoteModel(
                quote = "Librerías API\n" +
                        "En Python, al igual que ocurre con otros lenguajes de programación, hay implementados ciertos repositorios con funciones ya establecidas. Estas agrupaciones de funciones ofrecen toda una serie de métodos que permiten implementar nuevas características",
                author = "UNIDAD 5. Desarrollo de componentes"
            ),
            GEQuoteModel(
                quote = "Python utiliza la sentencia try (como en lenguajes de programación como Java) para la captura de posibles excepciones que puedan ocurrir en el código que contenga dicha sentencia.",
                author = "UNIDAD 5. Desarrollo de componentes"
            ),
        )

        var longitud:Int  = GEQuoteProvider.quote.size-1
            get()= field

    }


}