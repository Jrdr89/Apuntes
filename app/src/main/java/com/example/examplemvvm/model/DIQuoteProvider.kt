package com.example.examplemvvm.model

class DIQuoteProvider {

    companion object {
        fun random():DIQuoteModel{
            var position:Int  = (0..longitud).random()
            val aparecido = arrayListOf<Int>(longitud)

            if (aparecido.contains(position)) {
                position= (0..longitud).random()
            } else {
                aparecido.add(position)
            }
            return DIQuoteProvider.quote[position]
        }
        fun order(position: Int): DIQuoteModel{

            return DIQuoteProvider.quote[position]
        }

        private val quote = listOf<DIQuoteModel>(
            DIQuoteModel(
                quote = "En el lenguaje Java encontramos las llamadas Java Foundation Classes (JFC) que incluyen librerías para generar interfaces. \n"+
                        "AWT: considerada la primera librería perteneciente a Java \n"+
                        "Swing: deriva de AWT pero al no estar hecha en código nativo, se puede usar en modo multiplataforma",
                author = "UNIDAD 1: CONFECCION DE INTERFACES"
            ),
            DIQuoteModel(
                quote = "Existen librerías específicas para el lenguaje XML que permiten generar las interfaces y trasladarlas a múltiples lenguajes de programación",
                author = "UNIDAD 1: CONFECCION DE INTERFACES"
            ),
            DIQuoteModel(
                quote = "Para crear los formularios se puede hacer uso de un contenedor Java, un componente que permite contener otros componentes \n"+
                        "Los contenedores de nivel superior de un formulario pueden ser de tres tipos: ventanas, diálogos y applets",
                author = "UNIDAD 1: CONFECCION DE INTERFACES"
            ),
            DIQuoteModel(
                quote = "Todo componente se puede reconocer por dos características principales: su clase, \n" +
                        "que define su aspecto y funcionalidad y por su nombre, que lo identifica dentro de la aplicación.",
                author = "UNIDAD 1: CONFECCION DE INTERFACES"
            ),
            DIQuoteModel(
                quote = "La ubicación en Java donde se pueden colocar los controles se llama Layout.\n",
                author = "UNIDAD 1: CONFECCION DE INTERFACES"
            ),
            DIQuoteModel(
                quote = "JFrame es la ventana principal de la aplicación mientras que JDialog es una  \n"+
                       "ventana de diálogo para poder interactuar con el usuario de la aplicación." ,
                author = "UNIDAD 1: CONFECCION DE INTERFACES"
            ),
            DIQuoteModel(
                quote ="Un enlace de datos es el mecanismo que proporcionan las plataformas y que permite enlazar \n"+
                        "los controles de los formularios con los objetos contenedores de datos",
                author = "UNIDAD 1: CONFECCION DE INTERFACES"
            ),
            DIQuoteModel(
                quote = "ADO.NET se puede entender como un conjunto de clases del framework .NET para manipular servicios de acceso a datos.",
                author = "UNIDAD 1: CONFECCION DE INTERFACES"
            ),
            DIQuoteModel(
                quote = "La forma que tiene Java de gestionar los eventos \n"+
                        "Event sources: Se encargan de registrar aquellos objetos que serán los encargados de gestionarlos, llamados event listeners \n "+
                        "Los métodos de los event listeners se invocarán de manera automática cuando se produzca el evento",
                author = "UNIDAD 1: CONFECCION DE INTERFACES"
            ),
            DIQuoteModel(
                quote = "Existen dos tipos de cuadro de diálogos \n"+
                        "- Un cuadro de diálogo es modal cuando la aplicación o el elemento que la ha invocado no puede recibir \n "+
                        "ningún otro tipo de evento hasta que se haya cerrado \n "+
                        "- Un cuadro de diálogo es no modal cuando la aparición del cuadro de diálogo no impide al usuario de la aplicación interactuar",
                author = "UNIDAD 1: CONFECCION DE INTERFACES"
            ),
            DIQuoteModel(
                quote = "Para desarrollar interfaces gráficas de usuario con Java, existen clases que pertenecen al Java Foundation Clases.",
                author = "UNIDAD 1: CONFECCION DE INTERFACES"
            ),
            DIQuoteModel(
                quote = "Normalmente se crea el contenido visual y el diseño de la interfaz gráfica a partir de formularios que contendrán controles y componentes \n"+
                        "A estas acciones se les conoce como diseño estático de una interfaz \n" +
                        "El diseño dinámico de una interfaz gráfica de usuario consiste en crear dichas interfaces en tiempo de ejecución",
                author = "UNIDAD 2. Generación de interfaces a partir de documentos XML."
            ),
            DIQuoteModel(
                quote = "XAML (eXtensible Application Markup Language) es un lenguaje de marcas usado para la creación de interfaces \n" +
                        "XUL (eXtensible User Interface Language) es un lenguaje de marcas basado en XML que permite crear interfaces complejas de usuario.\n"+
                        "UIML (User Interface Markup Language) se utiliza para generar interfaces independientes de la plataforma y el lenguaje que se use.\n"+
                        "SVG (Scalable Vector Graphics) permite insertar gráficos dentro de una página web o un documento \n"+
                        "MXML (Macromedia eXtensible Markup Language) es un lenguaje de generación de interfaces gráficas basado en XML.",
                author = "UNIDAD 2. Generación de interfaces a partir de documentos XML"
            ),DIQuoteModel(
                quote = "Todas las herramientas para la creación de interfaces tienen en común que usan \n"+
                        "un sistema de ventanas que permiten dividir la pantalla en diferentes regiones rectangulares",
                author = "UNIDAD 2. Generación de interfaces a partir de documentos XML"
            ),
            DIQuoteModel(
                quote = "Un contenedor se puede entender como una clase de tipo colección usada para gestionar y administrar \n"+
                        "cómo interaccionan los componentes entre sí y con el exterior",
                author = "UNIDAD 2. Generación de interfaces a partir de documentos XML"
            ),
            DIQuoteModel(
                quote = "La posición de un componente en una interfaz de usuario puede ser absoluta o relativa a otros componentes.",
                author = "UNIDAD 2. Generación de interfaces a partir de documentos XML"
            ),
            DIQuoteModel(
                quote = "Al existir varios tipos de eventos diferentes, cada vez que ocurre un evento se hace necesario utilizar un controlador de eventos",
                author = "UNIDAD 2. Generación de interfaces a partir de documentos XML"
            ),
            DIQuoteModel(
                quote = "Glade es una herramienta libre que ayuda a la creación de interfaces gráficas de usuario. \n" +
                        "Este proceso se lleva a cabo generando archivos en formato XML y no a través de código.",
                author ="UNIDAD 2. Generación de interfaces a partir de documentos XML"
            ),
            DIQuoteModel(
                quote = "Un componente visual una vez empaquetado se podría:\n" +
                        "Utilizar en proyectos futuros.\n" +
                        "Compartir con otros desarrolladores del mismo proyecto que necesiten herramientas similares.\n" +
                        "Compartir sin ánimo de lucro con el resto de la comunidad de desarrolladores de todo el mundo.\n",
                author = "UNIDAD 3. Creación de componentes visuales"
            ),
            DIQuoteModel(
                quote = "El concepto de componente en el mundo del software es una clase creada para ser reutilizada \n"+
                        "y que puede ser utilizada por una herramienta de desarrollo de aplicaciones visuales. \n"+
                        "El comportamiento de los componentes se define por los eventos ante los que responde y los métodos que ejecuta para dichos eventos",
                author = "UNIDAD 3. Creación de componentes visuales"
            ),DIQuoteModel(
                quote = "La interfaz del componente se puede entender como un subconjunto de los atributos y los métodos de dicho componente.",
                author = "UNIDAD 3. Creación de componentes visuales"
            ),
            DIQuoteModel(
                quote = "Para que una clase pueda ser considerada un componente debe cumplir las siguientes normas:\n" +
                        "- Debe poder adaptarse a la aplicación en la que se integra.\n" +
                        "- Debe ser capaz de almacenar el estado de sus propiedades cuando se vean modificadas. A este concepto se le conoce como persistencia.\n" +
                        "- Debe permitir que cualquier IDE pueda reconocer ciertos elementos de diseño como los nombres de \n" +
                        "las funciones miembros o métodos y definiciones de las clases, y comunicar esa información. A este concepto se le conoce como introspección.\n"+
                        "Debe tener la capacidad de gestionar eventos.\n",
                author = "UNIDAD 3. Creación de componentes visuales"
            ),
            DIQuoteModel(
                quote = "Estos atributos los podemos entender como variables definidas por su nombre y su tipo de datos que adquieren valores concretos.\n" +
                        "Las propiedades se pueden entender como un tipo concreto de atributo. \n"+
                        "Ofrecen ciertas características propias de un componente y pueden afectar tanto a su comportamiento como a su apariencia.",
                author = "UNIDAD 3. Creación de componentes visuales"
            ),
            DIQuoteModel(
                quote = "Una propiedad compartida permite notificar a otros objetos de la misma clase si su valor ha sido modificado. \n"+
                        "Una propiedad restringida es similar a la compartida salvo que, en este caso, los objetos oyentes pueden \n"+
                        "denegar que el cambio de valor de la propiedad se produzca.",
                author = "UNIDAD 3. Creación de componentes visuales"
            ),
            DIQuoteModel(
                quote = "Un evento se puede entender como un mensaje o notificación que un objeto de una clase puede lanzar cuando algo ha ocurrido.",
                author = "UNIDAD 3. Creación de componentes visuales"
            ),
            DIQuoteModel(
                quote = "En líneas generales, la funcionalidad de un componente viene definida por las acciones que puede realizar y que están definidas en sus métodos.",
                author = "UNIDAD 3. Creación de componentes visuales"
            ),
            DIQuoteModel(
                quote = "En ocasiones es necesario almacenar el estado de una clase para que se pueda consultar con posterioridad. Es lo que se denomina persistencia. \n"+
                        "El mecanismo que nos permite implementar la persistencia se denomina serialización.\n" +
                        "La serialización automática de un componente se implementa mediante la interfaz Serializable.",
                author = "UNIDAD 3. Creación de componentes visuales"
            ),
            DIQuoteModel(
                quote = "En todo momento podremos añadir componentes ya creados previamente para desarrollar nuestras interfaces.\n" +
                        "Si el componente está desarrollado por nosotros, se puede usar la función “Limpiar y construir” para así generar el fichero .jar con el componente.\n" +
                        "Desde el inspector de proyectos lo podremos añadir con la opción “Herramientas > Añadir a la paleta”.\n" +
                        "Si el componente pertenece a otro programador, podremos añadir el .jar correspondiente a nuestra paleta desde su Administrador.\n",
                author = "UNIDAD 3. Creación de componentes visuales"
            ),
            DIQuoteModel(
                quote = "Para empaquetar componentes, se necesitará generar un archivo .jar con todas las clases que forman parte del componente, como pueden ser:\n" +
                        "El propio componente.\n" +
                        "Objetos de tipo BeanInfo.\n" +
                        "Objetos de tipo Customizer.\n" +
                        "Clases necesarias o útiles para el correcto funcionamiento del componente\n" +
                         "Todo paquete jar deberá contener un fichero de manifiesto con extensión .mf que permite conocer la descripción de su contenido",
                author = "UNIDAD 3. Creación de componentes visuales"
            ),
            DIQuoteModel(
                quote = "La usabilidad se puede definir como la disciplina que investiga \n" +
                        "la manera en que se pueden diseñar páginas web y aplicaciones para que los usuarios que \n"+
                        "vayan a interactuar con ellas lo puedan hacer de manera fácil, intuitiva y cómoda",
                author = "UNIDAD 4: Usabilidad"
            ),
            DIQuoteModel(
                quote = "Las características que una interfaz debe tener para que pueda ser considerada usable son las siguientes:\n" +
                        "- Útil. Debe ser capaz de realizar de manera correcta las tareas para las que ha sido diseñada.\n" +
                        "- Fácil de usar. Debe ser eficiente, libre de errores y veloz.\n" +
                        "- Fácil de aprender. No debe necesitar mucho tiempo para aprender su funcionamiento y será fácil de recordar en futuros usos.\n" +
                        "- Con un diseño elegante. Esta característica mejorará la percepción del usuario y empatizará mejor con sus emociones.\n" +
                        "- Retroalimentación. Es muy importante que la interfaz pueda comunicar en todo momento al usuario el progreso de las acciones o si se produce algún error.\n" +
                        "- Simplicidad. No debemos recargar en exceso para evitar perder la atención del usuario y hacerle más fácil su trabajo con la interfaz.\n",
                author = "UNIDAD 4: Usabilidad"
            ),  DIQuoteModel(
                quote = "En usabilidad se pueden definir cinco atributos que todo desarrollo debe tener:\n" +
                        "Facilidad de aprendizaje. La interfaz debe ser fácil de aprender.\n" +
                        "Eficiencia. Una vez que el usuario sepa usar la aplicación, debe conseguir un alto nivel de productividad.\n" +
                        "Recuerdo de uso. El uso de la interfaz debe ser fácil de recordar en el tiempo.\n" +
                        "Tasas de error. Cantidad de errores que comete el usuario por unidad de tiempo.\n" +
                        "Satisfacción. El grado de satisfacción que tiene la aplicación cuando el usuario la utiliza.\n",
                author ="UNIDAD 4: Usabilidad"
            ),
            DIQuoteModel(
                quote = "La interacción humano-ordenador (HCI) es un campo de estudio de \n"+
                        "múltiples disciplinas que se centra en el diseño de tecnología de índole informática para la interacción entre usuario y ordenador.",
                author ="UNIDAD 4: Usabilidad"
            ),
            DIQuoteModel(
                quote = "Podemos enumerar varios objetivos que tiene la usabilidad:\n" +
                        "Reducir el proceso de aprendizaje del usuario y servirle de ayuda.\n" +
                        "Optimizar el coste de diseño y mantenimiento de las aplicaciones.\n" +
                        "Disminuir la tasa de errores que se pueden cometer en el uso diario de las aplicaciones.\n" +
                        "Mejorar la satisfacción del usuario y la calidad de la marca.",
                author ="UNIDAD 4: Usabilidad"
            ),
            DIQuoteModel(
                quote = "Las pruebas con expertos pueden ser una forma de bajo coste y rápida. \n"+
                        "El objetivo principal de estas pruebas es poder detectar elementos de diseño de la interfaz que puedan confundir al usuario final y quitar calidad y efectividad a la aplicación.\n"+
                        "Evaluación heurística: Dar respuesta a un conjunto de diseños que se han definido previamente\n" +
                        "Revisión de normas: Revisar que la interfaz cumple con las normas establecidas\n" +
                        "Inspección de consistencia: Inspección con un conjunto de interfaces que forman parte de la aplicación \n" +
                        "Inspección formal de usabilidad. \n",
                author = "UNIDAD 4: Usabilidad"
            ),
            DIQuoteModel(
                quote = "Pruebas con usuarios; cuestionarios\n"+
                        "Existen varias metodologías:\n" +
                        "Reunión\n" +
                        "Entrevistas y cuestionarios\n" +
                        "Diseño de escenarios\n" +
                        "Diseño participativo\n",
                author = "UNIDAD 4: Usabilidad"
            ),
            DIQuoteModel(
                quote = "Para el diseño de la estructura de las interfaces de usuario son necesarias las siguientes pautas:\n" +
                        "Familiaridad del usuario. Debemos tener en cuenta que el ordenador, la interfaz y el entorno de trabajo estarán al servicio del usuario.\n" +
                        "Consistencia. Esto significa que operaciones parecidas deberán activarse de la misma manera.\n" +
                        "Legibilidad. En la interfaz, la información mostrada debe ser fácil de leer y ubicar.\n" +
                        "Mínima sorpresa. El comportamiento de la interfaz no puede provocar ninguna sorpresa a los usuarios.\n" +
                        "Recuperabilidad. La interfaz debe tener la posibilidad de permitir a los usuarios poder recuperarse de los errores.\n" +
                        "Coherencia. El usuario tiene que poder interactuar con la aplicación\n",
                author = "UNIDAD 4: Usabilidad"
            ),
            DIQuoteModel(
                quote = "- Un informe incrustado es un informe previamente importado al proyecto o directamente creado en él. \n" +
                        "Al crear un informe de este tipo se genera también una clase con funciones de contenedor para ese informe, formando parte del proyecto. \n"+
                         "Un informe no incrustado se ha generado mediante una herramienta específica fuera del proyecto"   ,
                author = "UNIDAD  5. Confección de informe"
            ),
            DIQuoteModel(
                quote = "Herramientas gráficas que permiten generar informes.\n" +
                        "- Crystal Reports\n"+
                        "- JasperReports \n"+
                        "- ReportLab",
                author = "UNIDAD  5. Confección de informe"
            ),
            DIQuoteModel(
                quote = "Un subinforme es un informe que está incluido dentro de otro informe",
                author = "UNIDAD  5. Confección de informe"
            ),
            DIQuoteModel(
                quote = "Los parámetros en un informe se utilizan para generar diferentes resultados a partir de un mismo archivo de diseño. \n" +
                        "Según su tipo, podemos encontrar los siguientes parámetros:\n" +
                        "Parámetros integrados. Disponibles de manera predeterminada conteniendo información en tiempo de ejecución. No pueden ser modificados ni eliminados.\n" +
                        "Parámetros de usuario. Como desarrolladores podemos establecer su nombre, clase y valor.\n",
                author = "UNIDAD  5. Confección de informe"
            ),
            DIQuoteModel(
                quote = "La ayuda genérica y sensible al contexto es la información relevante que proporciona una aplicación y se basa en la actividad del usuario. \n"+
                        "Factores a considerar: \n"+
                        "- Los mecanismos de activación son los medios con los que el usuario puede solicitar ayuda. Por ejemplo, un caso típico es la tecla F1.\n" +
                        "- La interfaz de usuario se puede presentar como ventanas emergentes, sugerencias sobre herramientas o una pantalla de opción múltiple con preguntas \n" +
                        "- El contenido es un factor crítico para el correcto funcionamiento de la ayuda.\n" +
                        "- Las opciones de personalización permiten, por ejemplo, desactivar funciones innecesarias o molestas para el usuario.\n",
                author = "UNIDAD 6. Documentación de aplicaciones"
            ),DIQuoteModel(
                quote = "Las tablas de contenido permiten clasificar la información por temas para facilitar la búsqueda por parte del usuario",
                author = "UNIDAD 6. Documentación de aplicaciones"
            ),
            DIQuoteModel(
                quote = "Existen numerosas herramientas para realizar tutoriales interactivos y simulaciones con fines formativos.\n" +
                        "Nimbus. Permite capturar diferentes partes o fragmentos de una página web para posteriormente trabajar sobre la parte correspondiente.\n" +
                        "Jing (TechSmith Capture). Permite realizar tutoriales y simulaciones de una manera muy sencilla y también compartirlos con otros usuarios.\n" +
                        "ActivePresenter. Herramienta que permite grabar capturas de vídeo, gestionar los vídeos y realizar simulaciones muy sofisticadas.\n",
                author = "UNIDAD 6. Documentación de aplicaciones"
            ),
            DIQuoteModel(
                quote = "El concepto de componente en el mundo del desarrollo de software se puede entender como\n "+
                        "la parte o funcionalidad de una aplicación que está compuesta por partes de código que permiten solucionar una tarea concreta.",
                author = "UNIDAD 7. Distribución de aplicaciones"
            ),
            DIQuoteModel(
                quote = "Veamos a continuación las principales características de un componente:\n" +
                        "- Es independiente de la plataforma en la que se pueda utilizar, a nivel software y hardware.\n" +
                        "- Debe estar identificado para permitir su clasificación.\n" +
                        "- Debe tener contenido propio y no necesitar código externo para poder realizar su funcionalidad.\n" +
                        "- Debe ser actualizable por una versión superior o por otro componente que extienda y mejore su funcionalidad.\n" +
                        "- Sólo será accesible mediante su propia interfaz, con lo que su funcionalidad no puede cambiar.\n" +
                        "- Debe estar empaquetado, es decir, debe poder distribuirse en paquetes que encapsulan todos los elementos que necesite.",
                author = "UNIDAD 7. Distribución de aplicaciones"
            ),
            DIQuoteModel(
                quote = "Cuando se utiliza un paquete autoinstalable, empaquetamos la aplicación en un único archivo que contendrá todos los archivos y directorios que conforman la aplicación.",
                author = "UNIDAD 7. Distribución de aplicaciones"
            ),
            DIQuoteModel(
                quote = "Una firma digital es un esquema matemático diseñado para verificar y corroborar la autenticidad de un fichero digital.\n" +
                        "Una firma digital válida ofrece la garantía de que el archivo ha sido generado por una empresa o autor conocido y que no ha sido modificado durante su transferencia.\n" +
                        "Cuando se distribuye un software, la firma digital se utiliza para garantizar la autenticidad del fichero, del autor y que no ha sufrido ningún tipo de alteración.\n",
                author = "UNIDAD 7. Distribución de aplicaciones"
            ),
            DIQuoteModel(
                quote = "El objetivo principal de las pruebas de software es tratar de encontrar la mayor cantidad posible de errores en el código.\n" +
                        "El objetivo inmediato es evitar que los defectos se propaguen a \n"+
                        "fases posteriores del desarrollo y que pongan en riesgo el correcto funcionamiento de la aplicación en estado de producción.",
                author = "UNIDAD  8. Realización de pruebas"
            ),
            DIQuoteModel(
                quote = "El objetivo de la estrategia es concretar los tipos de pruebas a realizar, el calendario de ejecución, los responsables, los recursos asignados y el alcance de las pruebas.",
                author = "UNIDAD  8. Realización de pruebas"
            ),
            DIQuoteModel(
                quote = "Las pruebas unitarias permiten probar ciertas partes del código de forma independiente. .\n"+
                        "Las pruebas de integración consisten en verificar que el software cumple su objetivo y se realiza sobre el conjunto de todos los elementos que lo componen al mismo tiempo",
                author = "UNIDAD  8. Realización de pruebas"
            ),
            DIQuoteModel(
                quote = "- Las pruebas de integración ascendentes consisten en comenzar por módulos de bajo nivel hasta llegar a la aplicación final. \n" +
                        "- Las pruebas de integración descendentes comienzan por la aplicación general y va bajando por los módulos inferiores.",
                author = "UNIDAD  8. Realización de pruebas"
            ),
            DIQuoteModel(
                quote = "Las pruebas de sistema buscan verificar el correcto comportamiento del sistema en su conjunto.\n" +
                        "En concreto, se comprueban los requisitos no funcionales del programa, como los siguientes:\n" +
                        "Seguridad.\n" +
                        "Velocidad.\n" +
                        "Exactitud.\n" +
                        "Fiabilidad.\n",
                author = "UNIDAD  8. Realización de pruebas"
            ),
            DIQuoteModel(
                quote = "Las pruebas de configuración verifican la instalación de la aplicación en el entorno destino y comprueban \n"+
                        "la respuesta del sistema frente a los requisitos de configuración, así como para diferentes usuarios.",
                author = "UNIDAD  8. Realización de pruebas"
            ),
            DIQuoteModel(
                quote = "Las pruebas de recuperación son pruebas de sistema que fuerzan el fallo del software de muchas formas y verifican que la recuperación se lleva a cabo de forma satisfactoria.",
                author = "UNIDAD  8. Realización de pruebas"
            ),
            DIQuoteModel(
                quote = "Las pruebas de regresión son la repetición selectiva de pruebas que detectan posibles fallos introducidos durante la modificación de una aplicación o alguno de sus componentes.",
                author ="UNIDAD  8. Realización de pruebas"
            ),
            DIQuoteModel(
                quote = "Las pruebas funcionales, también conocidas como pruebas de conformidad, validan si \n"+
                        "el comportamiento de la aplicación desarrollada cumple las especificaciones (requisitos funcionales) para la que fue diseñada",
                author = "UNIDAD  8. Realización de pruebas"
            ),
            DIQuoteModel(
                quote = "Dentro de las pruebas funcionales, encontramos tres tipos:\n" +
                        "- Análisis de valores límite. Se seleccionan como entradas los valores que se encuentran en el límite de validez de la aplicación.\n" +
                        "- Particiones equivalentes. Se selecciona como entradas un conjunto representativo de todas las posibles.\n" +
                        "- Pruebas aleatorias. Se selecciona como entradas una muestra al azar. Son pruebas específicas para aplicaciones interactivas.\n",
                author ="UNIDAD  8. Realización de pruebas"
            ),
            DIQuoteModel(
                quote = "Las pruebas de capacidad, también conocidas como pruebas de resistencia o estrés, buscan conocer hasta dónde un sistema es capaz de soportar determinadas condiciones extremas.",
                author = "UNIDAD  8. Realización de pruebas"
            ),
            DIQuoteModel(
                quote = "Las pruebas de rendimiento buscan conocer el rendimiento del software en tiempo de ejecución.",
                author = "UNIDAD  8. Realización de pruebas"
            ),
            DIQuoteModel(
                quote = "Las pruebas de uso de recursos, utilizan un conjunto de técnicas que puedan garantizar el uso eficiente de los recursos",
                author = "UNIDAD  8. Realización de pruebas"
            ),
            DIQuoteModel(
                quote = "Las pruebas de seguridad o de integridad intentan verificar que los elementos de protección añadidos en el sistema pueden protegerlo de accesos no autorizados.",
                author = "UNIDAD  8. Realización de pruebas"
            ),
            DIQuoteModel(
                quote = "La prueba de usuario o de usabilidad consiste en verificar que la interfaz de usuario de la aplicación sea amigable, intuitiva y que funcione de manera correcta.",
                author = "UNIDAD  8. Realización de pruebas"
            ),
            DIQuoteModel(
                quote = "En las pruebas de aceptación se pueden ejecutar dos técnicas: pruebas alfa y pruebas beta.\n" +
                        "Prueba alfa:  Las lleva a cabo el cliente estando presente el desarrollador y en el sitio donde se ha desarrollado la aplicación. \n" +
                        "Pruebas beta: Las pruebas beta las lleva a cabo el cliente, pero esta vez en su lugar de trabajo directamente y sin la presencia del desarrollador.\n",
                author = "UNIDAD  8. Realización de pruebas"
            ),
            DIQuoteModel(
                quote = "Algunas herramientas para generación de informes pueden ejecutar consultas SQL.",
                author = "Simulacro examen"
            ),
            DIQuoteModel(
                quote = "Uno de los atributos que definen la usabilidad de una aplicación es la tasa de error. \n"+
                        "Esta es la cantidad de errores que comete el usuario por unidad de tiempo ",
                author = "Simulacro examen"
            ),
            DIQuoteModel(
                quote = "Al hacer un instalador de nuestra aplicación es posible cofigurar los botones para aceptar acuerdos de licencia",
                author = "Simulacro examen"
            ),
            DIQuoteModel(
                quote = "Cuando realizamos interfaces basadas en XML, está separado el diseño gráfico del procesamiento ",
                author = "Simulacro examen"
            ),
            DIQuoteModel(
                quote = "En un IDE, la paleta de componentes es la zona donde tengo todos los componentes para poder seleccionarlos ",
                author = "Simulacro examen"
            ),
            DIQuoteModel(
                quote = "EL ButtonGroup NO es un elemento visual de Swing",
                author = "Simulacro examen"
            ),
            DIQuoteModel(
                quote = "Los dialogos pueden ser modales o no modales",
                author = "Simulacro examen"
            ),
            DIQuoteModel(
                quote = "Los autoinstaladores de windows tienen extension .Exe",
                author = "Simulacro examen"
            ),
            DIQuoteModel(
                quote = "Los tests de aceptación de usuario las realiza el cliente",
                author = "Simulacro examen"
            ),
            DIQuoteModel(
                quote = "XML es un formato de salida posible para un informe",
                author = "Simulacro examen"
            ),
            DIQuoteModel(
                quote = "Para poder firmar digitalmente una distribución, y que posteriormente un usuario pueda verificar la firma, necesitamos\n"+
                        "Clave privada, clave publica, certificado digital ",
                author = "Simulacro examen"
            ),
            DIQuoteModel(
                quote = "Un instalador puede verificar la compatibilidad del sistema",
                author = "Simulacro examen"
            ),
            DIQuoteModel(
                quote = "Los mecanismos de activación de la ayuda sensible al contexto son Los medios que tiene el usuario para solicitar ayuda, por ejemplo pulsar F1",
                author = "Simulacro examen"
            ),
            DIQuoteModel(
                quote = "Los eventos son acciones que detecta un programa",
                author = "Simulacro examen"
            ),
            DIQuoteModel(
                quote = "El ComboBox de swing se puede usar como combinación de campo de texto y lista. Se usa para desplegar opciones y seleccionar una de ellas",
                author = "Simulacro examen"
            ),
            DIQuoteModel(
                quote = "Reducir el proceso de aprendizaje y optimizar el coste de diseño y desarrollo, son objetivos de la usabilidad",
                author = "Simulacro examen"
            ),
            DIQuoteModel(
                quote = "Para que un usuario pueda añadir listener al componetente que estamos diseñando, debe incluir en dicho componente los métodos para registrar y borrar listener",
                author = "Simulacro examen"
            ),
            DIQuoteModel(
                quote = "La capacidad de que cualquier IDE pueda reconocer ciertos elementos de su diseño se llama Introspección ",
                author = "Simulacro examen"
            ),
            DIQuoteModel(
                quote = "El manual de administración de una aplicación tiene como objetivo, indicar todo lo que debe saber el usuario administrador",
                author = "Simulacro examen"
            ),
            DIQuoteModel(
                quote = "Cuando nuestra aplicación realiza acciones que pueden demorarse en el tiempo, es conveniente, es conveniente informar al usuario del progreso de la operación",
                author = "Simulacro examen"
            ),

            )

        var longitud:Int  = DIQuoteProvider.quote.size-1
        get() = field
    }


}