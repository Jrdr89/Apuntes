package com.example.examplemvvm.model

class PMQuoteProvider {

    companion object {
        fun random():PMQuoteModel{
            var position:Int  = (0..PMQuoteProvider.longitud).random()
            val aparecido = arrayListOf<Int>(PMQuoteProvider.longitud)

            if (aparecido.contains(position)) {
                position= (0..PMQuoteProvider.longitud).random()
            } else {
                aparecido.add(position)
            }
            return PMQuoteProvider.quote[position]
        }
        fun order(position: Int): PMQuoteModel{

            return PMQuoteProvider.quote[position]
        }

        private val quote = listOf<PMQuoteModel>(
        //MULTIMEDIA
            PMQuoteModel(
                quote = "En general, los procesadores de estos dispositivos tienen una capacidad de cómputo más reducida\n" +
                        "También su capacidad para mejorar las prestaciones a nivel de hardware es mucho más limitada\n" +
                        "Suelen tener una frecuencia de reloj baja debido a la necesidad de ahorrar energía.",
                author = "UNIDAD 1. Análisis de tecnologías para aplicaciones en dispositivos móviles"
            ),
            PMQuoteModel(
                quote = "Algunas de las limitaciones que pueden darse en los dispositivos móviles son las siguientes:\n" +
                        "Desconexión\n" +
                        "Seguridad\n" +
                        "Memoria\n" +
                        "Consumo bateria\n" +
                        "Almacenamiento\n",
                author = "UNIDAD 1. Análisis de tecnologías para aplicaciones en dispositivos móviles"
            ),
            PMQuoteModel(
                quote = "La mayor parte de los entornos de desarrollo hacen uso de emuladores para simular el funcionamiento de la aplicación que se está desarrollando, sin necesidad de usar un dispositivo móvil.",
                author = "UNIDAD 1. Análisis de tecnologías para aplicaciones en dispositivos móviles"
            ),
            PMQuoteModel(
                quote = "Existen varios tipos de perfiles con arquitectura y requisitos determinados.\n" +
                        "\n" +
                        "- Mobile Information Device Profile (MIDP): En este perfil es importante introducir el concepto de MIDlet, que es cualquier aplicación desarrollada en Java y que hace uso de MIDP para dispositivos embebidos.\n" +
                        "- Foundation Profile: Es el perfil de más bajo nivel asociado a CDC, formado por capas añadidas para ofrecer funcionalidades a diferentes dispositivos.\n" +
                        "- Personal profile: Perfil diseñado para dispositivos con una interfaz gráfica completa y que permite ejecutar applets.\n",
                author = "UNIDAD 1. Análisis de tecnologías para aplicaciones en dispositivos móviles"
            ),
            PMQuoteModel(
                quote = "CLDC (del inglés Connected Limited Device Configuration) se utiliza en dispositivos móviles con el hardware más limitado.\n",
                author = "UNIDAD 1. Análisis de tecnologías para aplicaciones en dispositivos móviles"
            ),
            PMQuoteModel(
                quote = "Para desarrollar aplicaciones para dispositivos móviles con SO de Android, se debe instalar el Android SDK (del inglés Software Development Kit) y preparar el entorno de desarrollo.\n" +
                        "\n" +
                        "Pueden desarrollarse aplicaciones para dispositivos móviles con Android desde cualquier sistema operativo actual como, por ejemplo, GNU/Linux, MacOS o MS Windows.\n",
                author = "UNIDAD 1. Análisis de tecnologías para aplicaciones en dispositivos móviles"
            ),
            PMQuoteModel(
                quote = "Actualmente, en los teléfonos inteligentes predominan dos sistemas operativos: Android e iOS. También existen otros menos extendidos como Windows Phone, Symbian, Blackberry OS, entre otros.\n" +
                        "En cuanto a las plataformas de desarrollo disponibles y los lenguajes de programación que se puedan usar, dependerán del SO y del tipo de aplicación.",
                author = "UNIDAD 1. Análisis de tecnologías para aplicaciones en dispositivos móviles"
            ),
            PMQuoteModel(
                quote = "El entorno de desarrollo oficial y más popular en el desarrollo de aplicaciones para dispositivos móviles es el Android Studio, aunque también se pueden desarrollar aplicaciones en otros entornos como Eclipse y Netbeans.",
                author = "UNIDAD 1. Análisis de tecnologías para aplicaciones en dispositivos móviles"
            ),
            PMQuoteModel(
                quote = "También existen otros entornos de trabajo que permiten crear aplicaciones para Android utilizando otros lenguajes de programación como: C#, Python y una combinación de HTML5, CSS y JavaScript.\n" +
                        "\n" +
                        "Algunos ejemplos de estos IDEs son:\n" +
                        "bullet\n" +
                        "Xamarin\n" +
                        "bullet\n" +
                        "Phonegap\n" +
                        "bullet\n" +
                        "dot42\n" +
                        "bullet\n" +
                        "Kivy",
                author = "UNIDAD 1. Análisis de tecnologías para aplicaciones en dispositivos móviles"
            ),
            PMQuoteModel(
                quote = "PhoneGap es un “framework open source” que permite desarrollar aplicaciones multiplataforma haciendo uso de HTML5, CSS y JavaScript.",
                author = "UNIDAD 1. Análisis de tecnologías para aplicaciones en dispositivos móviles"
            ),
            PMQuoteModel(
                quote = "BlueStacks 5\n" +
                        "\n" +
                        "Es el emulador de Android con mejor rendimiento y mayor compatibilidad disponible para sistemas Windows y Macintosh.",
                author = "UNIDAD 1. Análisis de tecnologías para aplicaciones en dispositivos móviles"
            ),
            PMQuoteModel(
                quote = "Los perfiles tienen como objetivo ofrecer un completo entorno de ejecución concreto para cada categoría o tipo de dispositivo\n" +
                        "Estos perfiles también permiten definir:\n" +
                        "- El modelo de ciclo de vida de la aplicación.\n" +
                        "- El interfaz de usuario que se quiera utilizar.\n" +
                        "- El acceso a las propiedades específicas de cada dispositivo.",
                author = "UNIDAD 1. Análisis de tecnologías para aplicaciones en dispositivos móviles"
            ),
            PMQuoteModel(
                quote = "Existen varios tipos de perfiles con arquitectura y requisitos determinados. A continuación, se comentan algunos de ellos:\n" +
                        "- Mobile Information Device Profile (MIDP): Es el perfil más utilizado en la actualidad, incluye la interfaz de usuario, conectividades de red, almacenamiento local de datos y gestión de aplicaciones.\n" +
                        "- Fundation profile (FP): Es el perfil de más bajo nivel asociado a CDC, formado por capas añadidas para ofrecer funcionalidades a diferentes dispositivos.\n" +
                        "- Personal profile (PP): Perfil diseñado para dispositivos con una interfaz gráfica completa y que permite ejecutar applets",
                author = "UNIDAD 1. Análisis de tecnologías para aplicaciones en dispositivos móviles"
            ),
            PMQuoteModel(
                quote = "El perfil MIDP define tres estados en los que se puede encontrar una aplicación MIDlet cuando está en ejecución: activo, pausa y destruido.\n" +
                        "- Activo: Un MIDlet está en estado activo cuando ejecuta su método startApp\n" +
                        "- Pausa: Un MIDlet está en estado pausa cuando acaba de iniciarse y todavía no ha ejecutado su método startApp, o ejecuta los métodos pauseApp o applyPaused.\n" +
                        "- Destruido: Un MIDlet se considera en el estado destruido cuando retorna de los métodos destroyApp o notificarDestroyed sin que pueda volver a entrar en cualquier otro estado ",
                author = "UNIDAD 1. Análisis de tecnologías para aplicaciones en dispositivos móviles"
            ),
            PMQuoteModel(
                quote = "El tiempo de ejecución de Android (ART) es un tiempo de ejecución administrado que usan las aplicaciones y algunos servicios internos del sistema en Android.",
                author = "UNIDAD 1. Análisis de tecnologías para aplicaciones en dispositivos móviles"
            ),
            PMQuoteModel(
                quote = "El tiempo de ejecución de Android (ART) es un tiempo de ejecución administrado que usan las aplicaciones y algunos servicios internos del sistema en Android.",
                author = "UNIDAD 1. Análisis de tecnologías para aplicaciones en dispositivos móviles"
            ),
            PMQuoteModel(
                quote = "Las fases de construcción en un proyecto Android son las siguientes:\n" +
                        "\n" +
                        "Creación del proyecto.\n" +
                        "Manifiesto:  permite recoger los componentes que conformarán la aplicación en un archivo de formato XML.\n\n" +
                        "Creación del AVD: del inglés Android Virtual Device, Dispositivo Virtual de Android) para poder probar una aplicación en un emulador del mundo real.\n",
                author = "UNIDAD 2. Programación de aplicaciones para dispositivos móviles"
            ),
            PMQuoteModel(
                quote = "Botones:\n" +
                        "Compilación :Cuando se selecciona la opción Run o el icono de flecha verde,  el compilador revisará el código y comprobará que no tenga errores.\n" +
                        "Preverificación: Al mismo tiempo que se codifica la aplicación, se pueden realizar pruebas unitarias e instrumentales\n" +
                        "Empaquetado: El menú Build de Android Studio dispone de dos opciones para generar el empaquetado:\n" +
                        "\n" +
                        "- Build Bundle(s) / APK(s): genera un Bundle o APK con el “build variant” activo en ese momento.\n" +
                        "- Generate Signed Bundle / APK: obtiene el paquete que queremos después de seguir una serie de pasos.",
                author = "UNIDAD 2. Programación de aplicaciones para dispositivos móviles"
            ),
            PMQuoteModel(
                quote = "El entorno Eclipse permite añadir puntos de interrupción, consultar la información del logCat y depurar.\n" +
                        "El DDMS (del inglés Dalvik Debug Monitor Service) permite monitorizar y gestionar el emulador y el estado del dispositivo.\n" +
                        "Podemos depurar la app con varias alternativas: \n" +
                        "\n"+
                        "- Ejecutando la opción Run > Debug app o hacer clic en el icono debug.\n" +
                        "- Ejecutar la app sin modo de depuración, pero añadiendo mensajes en puntos clave del código.",
                author = "UNIDAD 2. Programación de aplicaciones para dispositivos móviles"
            ),
            PMQuoteModel(
                quote = "El SDK de Android contiene componentes y widgets que permiten el diseño para la interfaz de usuario, la comunicación e interacción\n" +
                        "- View, contienen interfaces y clases usadas para dibujar en la pantalla\n" +
                        "- Los widgets representan clases dentro de ese paquete y contienen casi cualquier elemento que se quiera representar\n" +
                        "- Layout: Se trata de un widget particular contenido en el paquete android.widget, un objeto View que no dibuja nada en la pantalla, pero se puede comportar como un contenedor ",
                author = "UNIDAD 2. Programación de aplicaciones para dispositivos móviles"
            ),
            PMQuoteModel(
                quote = "Los eventos de teclado se acompañan por un código de tecla getKeyCode(), un código de escaneo getScanCode() y un meta estado getMetaState().\n" +
                        "Los métodos que pueden gestionar estas llamadas son:\n" +
                        "\n" +
                        "Para los botones físicos: onKeyUp(), onKeyDown(), onKeyLongPress().\n" +
                        "Para responder al trackball (si existe): onTrackBallEvent().\n" +
                        "Para responder a un efecto de toque en la pantalla: onTouchEvent().\n" +
                        "Para responder a la gestión del enfoque: onFocusChanged().\n",
                author = "UNIDAD 2. Programación de aplicaciones para dispositivos móviles"
            ),
            PMQuoteModel(
                quote = "Los componentes principales de una aplicación, como las actividades y fragmentos, tienen un ciclo de vida que depende de la manera en la que el usuario interactúa con ella.\n" +
                        "\n" +
                        "Los servicios son componentes que pueden llevar a cabo tareas con una duración elevada en segundo plano \n" +
                        "No se debe confundir la ejecución en segundo plano con la ejecución en paralelo",
                author = "UNIDAD 2. Programación de aplicaciones para dispositivos móviles"
            ),
            PMQuoteModel(
                quote = "Existen diferentes tipos de servicios para usar en una app:\n" +
                        "Foreground o primer plano: Puede llevar a cabo tareas de larga duración mostrando un indicador para que el usuario sepa que está activo.\n" +
                        "Background o segundo plano: Se realiza una tarea sobre la que el usuario no puede tener ningún control.\n" +
                        "Bound o enlazado: Un servicio está enlazado cuando un componente de la aplicación llama a bindservice para establecer una conexión con él, ofreciendo una interfaz cliente servidor que permite una comunicación directa con el servicio desde la app.\n",
                author = "UNIDAD 2. Programación de aplicaciones para dispositivos móviles"
            ),
            PMQuoteModel(
                quote = "Android pone a disposición de los desarrolladores de aplicaciones la base de datos SQLite, que integra la interfaz de SQL con prestaciones adaptadas a dispositivos con limitaciones de hardware.\n" +
                        "El uso de SQLite se recomienda en los siguientes casos:\n" +
                        "Base de datos para internet de las cosas\n" +
                        "Formato de archivo de la aplicación\n" +
                        "Base de datos del sitio web\n" +
                        "Sustituto de un RDBMS de empresa\n",
                author = "UNIDAD 2. Programación de aplicaciones para dispositivos móviles"
            ),
            PMQuoteModel(
                quote = "En Android se puede utilizar una simple interfaz con algunos pocos métodos para poder hacer persistentes los datos.\n" +
                        "\n" +
                        "Se puede crear un nuevo archivo de preferencias compartidas o acceder a uno que ya existe mediante uno de estos dos métodos:\n" +
                        "- getSharedPreferences():Este método se usa cuando se necesitan varios archivos de preferencias compartidas identificados por su nombre, que se especifica con el primer parámetro.\n" +
                        "- getPreferences(): Este método se puede usar desde una instancia de Activity si se necesita usar un solo archivo de preferencias compartidas para la actividad\n",
                author = "UNIDAD 2. Programación de aplicaciones para dispositivos móviles"
            ),
            PMQuoteModel(
                quote = "En Android, al iniciar un nuevo componente de la aplicación sin que exista otro ejecutándose, el sistema arranca un nuevo proceso en Linux para la app y con un único subproceso de ejecución.\n" +
                        "El problema reside en que conforme aumente la complejidad de las operaciones, este código puede complicarse y requerir un tiempo de mantenimiento elevado.\n" +
                        "En este momento entra en juego la clase Handler de Android que permite gestionar interacciones más complejas con un subproceso de trabajo.\n" +
                        "Para comunicarse con la clase Handler de Android existen dos opciones:\n" +
                        "\t\t- Mensajes.\n" +
                        "\t\t- Objetos de tipo Runnable.",
                author = "UNIDAD 2. Programación de aplicaciones para dispositivos móviles"
            ),
            PMQuoteModel(
                quote = "La interfaz Runnable debe implementarse por aquellas clases que tengan instancias ejecutables por un subproceso. Para ello, la clase debe definir un método sin argumentos llamado run().\n" +
                        "Se pueden crear hilos propios y comunicarse con el subproceso principal de la aplicación a través de un objeto Handler. Esto se puede hacer invocando a los métodos post o sendMessage, pero desde el nuevo hilo.",
                author = "UNIDAD 2. Programación de aplicaciones para dispositivos móviles"
            ),
            PMQuoteModel(
                quote = "En cualquier tipo de comunicación inalámbrica se debe tener presentes ciertos inconvenientes comunes a la hora de desarrollar las funcionalidades de una aplicación para dispositivos móviles.\n" +
                        "Posibles problemas en las comunicaciones de este tipo:\n" +
                        "Estabilidad\n" +
                        "Seguridad\n" +
                        "Eficiencia\n" +
                        "Existe la función de descubrimiento de servicios de red (NSD) que permite a las aplicaciones buscar un dispositivo cercano con el que puedan comunicarse.",
                author = "UNIDAD 2. Programación de aplicaciones para dispositivos móviles"
            ),
            PMQuoteModel(
                quote = "Para gestionar la seguridad y los permisos es necesario modificar los accesos necesarios en el archivo manifest de la aplicación",
                author = "UNIDAD 2. Programación de aplicaciones para dispositivos móviles"
            ),
            PMQuoteModel(
                quote = "Los mensajes multimedia hacen uso del lenguaje sincronizado multimedia o SMIL (Synchronized Multimedia Integration Language), un estándar diseñado para organizar y sincronizar los tiempos en que deben reproducirse los diferentes tipos de contenido en la pantalla del dispositivo",
                author = "UNIDAD 2. Programación de aplicaciones para dispositivos móviles"
            ),
            PMQuoteModel(
                quote = "Para la gestión de navegadores en los dispositivos móviles, se puede utilizar el estándar Android Browser perteneciente a la librería androidx.browser\n" +
                        "complementos de navegadores más importantes:\n" +
                        "\t\t- Opera Mini: Su principal característica es que soporta pestañas abiertas ilimitadas\n" +
                        "\t\t- Dolphin Browser HD: Considerado uno de los mejores navegadores para Android\n" +
                        "\t\t- XScope: Conjunto de herramientas para diseñadores gráficos que permiten conocer las dimensiones de cualquier objeto que aparezca en pantalla",
                author = "UNIDAD 2. Programación de aplicaciones para dispositivos móviles"
            ),
            PMQuoteModel(
                quote = "Las pruebas son necesarias tanto durante la duración como al finalizar cualquier desarrollo de software.\n" +
                        "En Android existen básicamente dos tipos de pruebas:\n" +
                        "\n" +
                        "\t-Las pruebas unitarias (unit tests), enfocadas a probar módulos puros de lenguaje sobre la máquina virtual sin llamadas al sistema de Android.\n" +
                        "\t-Las pruebas instrumentales (instrumental tests), que testean módulos más complejos con llamadas al sistema operativo y que tienen que ejecutarse sobre un dispositivo, físico o emulado",
                author = "UNIDAD 2. Programación de aplicaciones para dispositivos móviles"
            ),
            PMQuoteModel(
                quote = "Se puede entender que un objeto o sistema es multimedia cuando utiliza múltiples maneras de expresión, tanto si estos medios son físicos como digitales, con la intención de mostrar información\n" +
                        "“Hiper” hace referencia a la navegación, dando lugar a términos como hipertexto o navegación entre textos, e hipermedia o navegación entre medios.",
                author = "UNIDAD 3. Utilización de librerías multimedia integradas "
            ),
            PMQuoteModel(
                quote = "En los contenidos multimedia existen diferentes tipos de información que se gestiona y que pueden ser los siguientes:\n" +
                        "- Texto \n" +
                        "- Graficos\n" +
                        "- Imágenes\n" +
                        "- Animación\n",
                author = "UNIDAD 3. Utilización de librerías multimedia integradas"
            ),
            PMQuoteModel(
                quote = "El framework multimedia de Android permite capturar y reproducir audio, vídeo e imágenes en multitud de formatos de diferentes tipos y añadirlos en la aplicación que se está desarrollando\n" +
                        "con una arquitectura formada por múltiples paquetes que se componen de cuatro clases principales:\n" +
                        "- MediaPlayer y JetPlayer: Permiten reproducir contenidos multimedia\n" +
                        "- MediaRecorder y Camera:Garbar audio y video con el hardware del dispositivo",
                author = "UNIDAD 3. Utilización de librerías multimedia integradas"
            ),
            PMQuoteModel(
                quote = "La librería para gestionar y manejar contenidos multimedia se organiza en tres paquetes principalmente:\n" +
                        "\n" +
                        "android.media: Contiene las clases que permiten reproducir y grabar contenidos multimedia de audio y vídeo.\n" +
                        "android.media.autofix: Contiene un conjunto de clases para gestionar principalmente efectos de audio.\n" +
                        "android.media.effect: Proporciona diversas clases para aplicar una variedad de efectos visuales a imágenes y vídeos.\n",
                author = "UNIDAD 3. Utilización de librerías multimedia integradas"
            ),
            PMQuoteModel(
                quote = "El sistema Android contiene directorios dentro del almacenamiento interno donde las aplicaciones pueden organizar sus archivos.\n" +
                        "Para acceder a archivos y almacenarlos, se puede usar la API de la clase File.",
                author = "UNIDAD 3. Utilización de librerías multimedia integradas"
            ),
            PMQuoteModel(
                quote = "La captura de imágenes fijas puede ser más o menos rápida. Pero en la captación de audio o vídeo es necesario que el proceso sea lo suficiente veloz, de lo contrario, se pueden perder datos y la captura carecerá de la calidad suficiente",
                author = "UNIDAD 3. Utilización de librerías multimedia integradas"
            ),
            PMQuoteModel(
                quote = "Los clips de audio son archivos con formato específico que se pueden almacenar en el dispositivo y pueden ser reproducidos por aplicaciones o programas.\n\n" +
                        "Existen varios formatos de audio:\n" +
                        "- Formatos de audio sin compresión: se almacena la información de audio sin ningún algoritmo para comprimirlos (WAV, AIFF, AU)\n" +
                        "- Formatos de audio sin pérdida: se comprime en el fichero mediante algoritmos, pudiéndose recuperar el contenido sin pérdida( FLAC, Monkey´s Audio, WavPack)\n" +
                        "- Formatos de audio con pérdida: se comprime y codifica usando la cantidad mínima de información posible (MP3, Vorbis, Musepack, AAC)\n",
                author = "UNIDAD 3. Utilización de librerías multimedia integradas"
            ),
            PMQuoteModel(
                quote = "Un archivo MIDI contiene instrucciones que cuando se interpretan por un sintetizador, generan sonidos",
                author = "UNIDAD 3. Utilización de librerías multimedia integradas"
            ),
            PMQuoteModel(
                quote = "Un vídeoclip también se puede entender como un conjunto de imágenes que están mezcladas con sonido\n" +
                        "El formato MPEG se utiliza para comprimir datos con pérdida y se usa ampliamente para varios tipos de contenido\n" +
                        "Los formatos MOV y AVI son los más comunes para vídeo",
                author = "UNIDAD 3. Utilización de librerías multimedia integradas"
            ),
            PMQuoteModel(
                quote = "La grabación de objetos multimedia en Android se puede llevar a cabo a través de la clase MediaRecorder del paquete android.media, siguiendo un ciclo de vida predefinido.\n" +
                        "- Initial: Se usa el método setAudioSource(int audio_source), o setVideoSource para la grabación de vídeo\n" +
                        "- DataSourceCoinfigured: A través de la llamada al método setOutputFormat(int audio_source) se pasa al estado DataSourceConfigured, definiendo así el formato del fichero de salida  \n" +
                        "- Prepared: Con la llamada al método prepare() \n" +
                        "- Recording: Una vez que el objeto está preparado, se lanza el método start() ",
                author = "UNIDAD 3. Utilización de librerías multimedia integradas"
            ),
            PMQuoteModel(
                quote = "A menudo las aplicaciones necesitan registrar eventos a nivel de información y errores, para poder recibir notificaciones sobre alguna actualización interna o posibles errores en tiempo de ejecución durante la grabación\n" +
                        "El registro de dichos eventos se realiza configurando los listener (oyentes) apropiados mediante llamadas a métodos como:\n" +
                        "\n" +
                        "setOnInfoListener\n" +
                        "setOnErrorListene\n",
                author = "UNIDAD 3. Utilización de librerías multimedia integradas"
            ),
            PMQuoteModel(
                quote = "Android proporciona en su API multimedia la clase MediaPlayer para el manejo y gestión de contenidos multimedia desde la aplicación.\n" +
                        "es una clase perteneciente al paquete android.media que permite manejar vídeo y audio desde diferentes fuentes:\n" +
                        "\n" +
                        "- Desde la Web\n" +
                        "- Desde un archivo local\n" +
                        "- Desde una tarjeta SD\n",
                author = "UNIDAD 3. Utilización de librerías multimedia integradas"
            ),
            PMQuoteModel(
                quote = "Un objeto de tipo MediaPlayer se rige por un ciclo de vida definido mediante un conjunto de estados y transiciones entre ellos.\n\n" +
                        "IDLE: Mediante el uso de new (o después de haberse llamado al método reset())\n" +
                        "INITIALIZED: Una vez el objeto está creado, se ejecutará el método setDataSource() para indicar la fuente multimedia\n" +
                        "PREPARED: A continuación se invoca el método prepare(), dejando al objeto en estado Prepared. \n" +
                        "- start()\n" +
                        "- pause()\n" +
                        "- stop()\n" +
                        "END: En cualquier momento, cuando se ejecuta el método release(), el ciclo de vida del objeto finaliza\n",
                author = "UNIDAD 3. Utilización de librerías multimedia integradas"
            ),
            PMQuoteModel(
                quote = "Para la reproducción de vídeo en Android, se hace uso de la clase VideoView que permite la visualización de un fichero de vídeo.\n" +
                        "\n" +
                        "Con el método setVideoURI se establece la fuente que contendrá el vídeo que se quiere reproducir, pasándole como parámetro un objeto de tipo Uri.\n" +
                        "\n" +
                        "La clase MediaController proporciona los botones típicos de play, pausa, rebobinado y avance rápido, que se sincronizan con el estado del objeto que se use para la reproducción del vídeo.",
                author = "UNIDAD 3. Utilización de librerías multimedia integradas"
            ),
            PMQuoteModel(
                quote = "El protocolo RTP (del inglés Real-time Transport Protocol), protocolo de nivel de sesión publicado en 1996, constituye un estándar de transmisión y se utiliza principalmente para intercambiar información en tiempo real. \n" +
                        "El protocolo RTP se suele utilizar en diferentes aplicaciones o escenarios, como streaming, videoconferencias o aplicaciones de tipo VoIP \n" +
                        "Existe un perfil de RTP, llamado SRTP, que se puede utilizar para mejorar y extender algunas características relacionadas con la seguridad.",
                author = "UNIDAD 3. Utilización de librerías multimedia integradas"
            ),
            PMQuoteModel(
                quote = "Para la transmisión de un archivo, tanto si es de vídeo como de audio, las aplicaciones de streaming funcionan siguiendo los siguientes pasos:\n" +
                        "- El cliente se conecta a un servidor que se encarga de enviar el fichero. El cliente, una vez empieza a recibir el fichero, crea un buffer donde va almacenando la información \n" +
                        "- Cuando el buffer contiene información almacenada, el cliente ya puede empezar a leer el fichero",
                author = "UNIDAD 3. Utilización de librerías multimedia integradas"
            ),
            PMQuoteModel(
                quote = "Las pruebas en la utilización de las librerías multimedia integradas son idénticas tanto en duración como al finalizar cualquier desarrollo de software.\n" +
                        "\n" +
                        "En Android existen básicamente dos tipos de pruebas:\n" +
                        "\n" +
                        "Las pruebas unitarias (unit tests)\n" +
                        "Las pruebas instrumentales (instrumental tests)\n",
                author = "UNIDAD 3. Utilización de librerías multimedia integradas"
            ),
            PMQuoteModel(
                quote = "Podemos entender una animación como el cambio de una o varias propiedades de un objeto que lo hacen percibir con un aspecto diferente conforme pasa el tiempo.\n" +
                        "Android ofrece una lista de elementos diseñados específicamente para la creación de animaciones para objetos tanto 2D como 3D:\n" +
                        "Canvas: Plantilla utilizada para definir un control a nivel de interfaz de usuario en las aplicaciones.\n" +
                        "Animadores (animators): Propiedad que permite insertar a cualquier objeto una animación específica a través del uso de propiedades o estilos de programación.\n" +
                        "Dibujos animados: Permite la carga de un conjunto de recursos de tipo “drawable” para generar una animación.\n" +
                        "OpenGL: Es una librería diseñada para elementos gráficos de alto rendimiento 2D y 3D.\n",
                author = "UNIDAD 4. Análisis de motores de juegos"
            ),
            PMQuoteModel(
                quote = "En la actualidad, existe una amplia variedad de motores gráficos, como Ogre, Doom Engine, Quake Engine, Unity, Source Engine, Unreal Engine, Game Maker, entre otros.\n" +
                        "\n" +
                        "Estos motores proporcionan los siguientes elementos:\n" +
                        "- API y SDK: Para el desarrollo de los juegos\n" +
                        "- Mecanismos implementados:  Mediante algunos motores se pueden crear juegos sin necesidad de escribir código, simplemente haciendo uso de mecanismos implementados\n" +
                        "- Herramientas: Conjunto de herramientas para editar ciertas funciones.\n" +
                        "- Herramientas de edición:  Permiten la creación de elementos visuales\n",
                author = "UNIDAD 4. Análisis de motores de juegos"
            ),
            PMQuoteModel(
                quote = "Los tipos de motores de juegos diferenciados mediante las siguientes opciones:\n" +
                        "\n" +
                        "- Según las facilidades\n" +
                        " --Librerías gráficas que facilitan el desarrollo y uso.\n" +
                        " --Motores que ya contienen un desarrollo visual completo o necesitan scripts de programación para la utilización de elementos visuales.\n" +
                        " --Herramientas especializadas de creación. Algunos motores están desarrollados orientados exclusivamente en su finalidad, como pueden ser videojuegos u otros tipos\n" +
                        "-Según la licencia\n" +
                        " --Motores privados (aunque algunos tienen licencia gratuita).\n" +
                        " --Motores “open source” (de código abierto).\n",
                author = "UNIDAD 4. Análisis de motores de juegos"
            ),
            PMQuoteModel(
                quote = "La elección y uso de librerías gráficas para desarrollar juegos permite realizar determinadas animaciones sobre objetos de una manera más fácil.\n" +
                        "\n" +
                        "Estas librerías se clasifican según las áreas de especialización y dependiendo de su funcionalidad:\n" +
                        "\n" +
                        "- Renderizados y efectos: OpenGL, Direct3D, GKS, entre otras.\n" +
                        "- Basadas en gráficos de escena: OpenGL Performer, Open Inventor, PHIGS+, entre otras.\n" +
                        "- Librerías de herramientas gráficas: World Toolkit, AVANGO, Game Engines, etc.",
                author = "UNIDAD 4. Análisis de motores de juegos"
            ),
            PMQuoteModel(
                quote = "Algunas de las librerías utilizadas durante el desarrollo de juegos son las siguientes:\n" +
                        "- Gosu\n" +
                        "- SDL\n" +
                        "- libgdx\n" +
                        "- OpenGL\n" +
                        "- Direct3D\n",
                author = "UNIDAD 4. Análisis de motores de juegos"
            ),
            PMQuoteModel(
                quote = "Un motor de juegos es la parte del código de programación de un juego que se encarga de la mayoría de los aspectos gráficos en un videojuego.\n" +
                        "A continuación, se muestran los componentes principales de un motor de juegos:\n" +
                        "\n" +
                        "- Librerías: Usadas para el desarrollo de figuras\n" +
                        "- Motor físico: Gestiona todo lo relacionado con la física del juego\n" +
                        "- Motor de renderizado: Su función es renderizar todas las texturas del juego.\n",
                author = "UNIDAD 4. Análisis de motores de juegos"
            ),
            PMQuoteModel(
                quote = " los componentes principales de un motor de juegos recogen de forma global todos aquellos elementos existentes dentro de un juego\n" +
                        "- Assets: Contiene todos los elementos que forman parte del juego\n" +
                        "- Renderizado :Contiene las texturas y materiales que utilizan los recursos diseñados\n" +
                        "- Sonidos: Se necesita configurar dentro del motor las pistas de audio.\n" +
                        "- Inteligencia artificial: Permite añadir estímulos al juego de tal manera que el desarrollo del mismo siga según la toma de decisiones definida por un conjunto de reglas.\n" +
                        "- Scripts visuales: Permiten ejecutar tanto porciones de código definidas en el juego como ejecutar código en tiempo real dentro del aspecto gráfico del juego.\n" +
                        "- Sombreados y luces.: El motor gráfico puede gestionar los colores y sombras asociados a cada uno de los vértices que forman la escena.\n",
                author = "UNIDAD 4. Análisis de motores de juegos"
            ),
            PMQuoteModel(
                quote = "Las animaciones en los juegos 2D se pueden llevar a cabo cambiando el dibujo del sprite de manera rápida para que existan pequeñas diferencias entre uno y otro, dando la sensación de continuidad al jugador.\n",
                author = "UNIDAD 4. Análisis de motores de juegos"
            ),
            PMQuoteModel(
                quote = "Los motores gráficos 3D simplifican el trabajo con los objetos tridimensionales, realizando operaciones de manera independiente del hardware utilizado. Algunas de estas operaciones son mover, escalar, rotar, deformar, animar, etc.\n" +
                        "\n" +
                        "Todos los objetos de este mundo virtual, incluyendo otros elementos como las cámaras, las luces y demás, forman la escena, que de manera interna se suele almacenar mediante el llamado grafo de escena",
                author = "UNIDAD 4. Análisis de motores de juegos"
            ),
            PMQuoteModel(
                quote = "Un grafo de escena es un grafo de nodos dirigido de manera acíclica, donde se almacena la información necesaria para definir un escenario virtual y controlar cómo se lleva a cabo su dibujado.",
                author = "UNIDAD 4. Análisis de motores de juegos"
            ),
            PMQuoteModel(
                quote = "Un grafo de escena tiene las siguientes funciones:\n" +
                        "Contribuye a organizar la escena de manera lógica.\n" +
                        "Permite que diferentes sistemas de referencia puedan depender unos de otros.\n" +
                        "Posibilita seleccionar entre los diferentes niveles de detalle.\n" +
                        "Hace posible el proceso de Culling.\n" +
                        "Facilita el acceso a librerías gráficas como OpenGL.\n",
                author = "UNIDAD 4. Análisis de motores de juegos"
            ),
            PMQuoteModel(
                quote = "Los detectores de colisiones en el mundo de los juegos permiten gestionar ciertas funcionalidades sobre los sprites para controlar su relación con los límites de las pantallas, su relación entre dos sprites por si se produce un choque entre ellos, o cómo se relacionan estos elementos si se acercan a elementos supuestamente de carácter sólido.\n",
                author = "UNIDAD 4. Análisis de motores de juegos"
            ),
            PMQuoteModel(
                quote = "Para la detección de colisiones se pueden seguir dos pasos principalmente:\n" +
                        "\n" +
                        "1 - Averiguar si dos elementos tienen una alta probabilidad de chocar entre ellos, también conocida como la fase de detección de colisión gruesa.\n" +
                        "2 - Averiguar el posible resultado de la colisión de los elementos del paso anterior, también conocida como la fase de colisión fina.",
                author = "UNIDAD 4. Análisis de motores de juegos"
            ),
            PMQuoteModel(
                quote = "Movimientos rapidos:\n" +
                        "Un problema habitual que nos podemos encontrar en el cálculo de colisiones se produce cuando dos objetos se acercan a gran velocidad pudiendo chocar entre ellos.\n" +
                        "El cambio de coordenadas se produzca tan rápido que ambos elementos se salten en lugar de chocar. Existen dos posibles soluciones:\n" +
                        "- Colision con test de barrido: se busca encontrar mediante barridos el punto de origen y el punto final del sprite\n" +
                        "- Sobre muestreo: se incrementa el tiempo en cada actualización de movimiento, lo que permite aumentar la posibilidad de detectar choques.",
                author = "UNIDAD 4. Análisis de motores de juegos"
            ),
            PMQuoteModel(
                quote = "Colision fina:\n" +
                        "La forma de detección de las colisiones se basa en conceptos matemáticos de trigonometría y álgebra.\n" +
                        "\n" +
                        "Para calcular las colisiones se pueden usar, por ejemplo, conceptos como la intersección entre rectas, entre rectas y planos o entre curvas y rectas, pertenencias de puntos a una recta, de puntos a un plano, entre otras muchas.",
                author = "UNIDAD 4. Análisis de motores de juegos"
            ),
            PMQuoteModel(
                quote = "Colision gruesa:\n" +
                        "Se puede definir una malla de celdas cuadradas, donde cada elemento pertenece a la celda que contiene su centro.\n" +
                        "De esta manera, si dos elementos pertenecen a la misma celda o a las cuatro limítrofes, cumplirán el paso 1 con mucha probabilidad.",
                author = "UNIDAD 4. Análisis de motores de juegos"
            ),
            PMQuoteModel(
                quote = "Módulo de colisiones\n" +
                        "Este módulo se usa para gestionar los posibles choques o colisiones que puedan ocurrir entre los diferentes sprites que componen el juego.\n" +
                        "\n" +
                        "Algunas de las características que puede manejar este módulo son:\n" +
                        "- Conjuntos de colisiones.\n" +
                        "- Gestión de formas geométricas.\n" +
                        "- Composición de figuras.\n",
                author = "UNIDAD 4. Análisis de motores de juegos"
            ),
            PMQuoteModel(
                quote = "Módulo de simulación dinámica\n" +
                        "Este módulo permite el uso de acciones simuladas por parte de los sprites del juego en tiempo real. De esta manera se intenta transmitir al jugador la sensación de un comportamiento acorde al mundo real de una manera básica.\n" +
                        "\n" +
                        "Algunas características que puede gestionar este módulo son:\n" +
                        "Simulación de roturas de objetos.\n" +
                        "Comportamientos derivados de contactos entre objetos.\n",
                author = "UNIDAD 4. Análisis de motores de juegos"
            ),
            PMQuoteModel(
                quote = "Módulo donde se almacenan los posibles comportamientos asociados a cada elemento del juego para su posterior representación en el mismo.\n" +
                        "\n" +
                        "El llamado efecto de física ragdoll es un proceso muy utilizado por el motor de física que permite simular la muerte o el estado inerte de un objeto en los videojuegos",
                author = "UNIDAD 4. Análisis de motores de juegos"
            ),
            PMQuoteModel(
                quote = "La inteligencia artificial se relaciona con los juegos para generar la apariencia de cierta inteligencia en la manera de interactuar de los diferentes elementos que componen un juego, normalmente aquellos que no son el jugador.\n" +
                        "\n" +
                        "Un motor de inteligencia artificial en los juegos actuales suele contener tres partes: \n" +
                        "Percepción\n" +
                        "Toma de decisiones simples y complejas\n" +
                        "Acción\n",
                author = "UNIDAD 4. Análisis de motores de juegos"
            ),
            PMQuoteModel(
                quote = "Oboe es una biblioteca desarrollada en el lenguaje de programación C++, de código abierto y diseñada para ayudar en la creación de aplicaciones de audio de alto rendimiento en Android. Proporciona los siguientes beneficios en el desarrollo de juegos:\n" +
                        "Permite conseguir una latencia más baja\n" +
                        "Permite usar la biblioteca nativa óptima\n" +
                        "Permite eliminar posibles errores de audio\n",
                author = "UNIDAD 4. Análisis de motores de juegos"
            ),
            PMQuoteModel(
                quote = "Librerías que proporcionan las funciones básicas de un motor 2D/3D\n"+
                        "Las librerías proporcionan al desarrollador una abstracción del ámbito más complejo sobre los elementos visuales, y mediante funciones específicas se aplicarán efectos o comportamientos para objetos que participan en el juego.\n" +
                        "\n" +
                        "- La librería Surface Manager de Android permite renderizar ventanas y superficies donde se puede dibujar en la pantalla de los dispositivos.\n" +
                        "- La librería SGL (del inglés Skia Graphics Library) se puede utilizar para dibujar texto, figuras geométricas e imágenes en 2D\n" +
                        "- La librería OpenGL (del inglés Open Graphics Library) son un conjunto de herramientas diseñadas específicamente para dispositivos móviles y que permiten mostrar gráficos animados de alta gama\n",
                author = "UNIDAD 4. Análisis de motores de juegos"
            ),
            PMQuoteModel(
                quote = "APIs gráficos 3D\n" +
                        "Las API de OpenGL ES (OpenGL for Embedded Systems) que ofrece el framework de Android son un conjunto de herramientas diseñadas específicamente para dispositivos móviles y que permiten mostrar gráficos animados de alta gama para las aplicaciones y funcionalidades más exigentes.",
                author = "UNIDAD 4. Análisis de motores de juegos"
            ),
            PMQuoteModel(
                quote = "Definición de formas con OpenGL ES\n" +
                        "El primer paso para la creación de gráficos complejos y en 3D es definir aquellas formas que se quieren dibujar en el contexto de una vista de OpenGL\n" +
                        "\n" +
                        "Dibujo de formas con OpenGL ES\n" +
                        "El siguiente paso es proceder a dibujar las formas que se hayan definido anteriormente.\n" +
                        "\n" +
                        "INICIALIZAR LAS FORMAS: Las formas elegidas para dibujar se deben cargar e inicializar usando el método onSurfaceCreated (GL10 gl, EGLConfig config),\n" +
                        "TRAZAR LAS FORMAS:\n" +
                        "- Es el momento de ejecutar el proceso completo para dibujar las formas. Se necesita definir los siguientes conceptos para ello:\n" +
                        "- Sombreador de vértices.\n" +
                        "- Sombreador de fragmentos.\n" +
                        "- Programa. Son objetos OpenGL ES que almacenan los sombreadores para el dibujo de las formas.\n",
                author = "UNIDAD 4. Análisis de motores de juegos"
            ),
            PMQuoteModel(
                quote = "A través de Android Studio se puede cargar un juego ya existente a través de dos posibles acciones:\n" +
                        "\n" +
                        "Si se dispone del código fuente del juego, se podrá crear un proyecto donde se encuentre su código fuente.\n" +
                        "Si el juego ya está empaquetado en un fichero apk.\n" +
                        "\n" +
                        "Apktool es una herramienta para realizar ingeniería inversa de aplicaciones de Android binarias, cerradas y de terceros.",
                author = "UNIDAD 4. Análisis de motores de juegos"
            ),
            PMQuoteModel(
                quote = "Entornos de desarrollo para juegos 2D\n" +
                        "Si se necesita programar juegos sencillos sin grandes necesidades gráficas, se pueden usarlos siguientes entornos:\n" +
                        "\n" +
                        "GAMEMAKER \n" +
                        "STENCYL \n" +
                        "Entornos de desarrollo para juegos 3D\n" +
                        "Para juegos más complejos y con necesidades gráficas más completas, se necesita que los entornos también sean más completos, como los siguientes:\n" +
                        "\n" +
                        "UNITY3D\n" +
                        "UNREAL ENGINE",
                author = "UNIDAD 5. Desarrollo de juegos 2D y 3D"
            ),
            PMQuoteModel(
                quote = "Conviene destacar que muchas veces la diferencia entre entornos de desarrollo y motores de juegos es prácticamente nula, ya que los motores de juegos forman parte en muchas ocasiones de los entornos de desarrollo.\n" +
                        "\n" +
                        "Motores comerciales\n" +
                        "- UNITY\n" +
                        "- UNREAL ENGINE\n" +
                        "Motores Open Source\n" +
                        "- AndEngine\n" +
                        "- LibGDX\n" +
                        "- Godot Game Engine\n",
                author = "UNIDAD 5. Desarrollo de juegos 2D y 3D"
            ),
            PMQuoteModel(
                quote = "LibGDX contiene una herramienta que permite crear una estructura de directorios para su posterior importación de ese proyecto en Eclipse.\n" +
                        "\n" +
                        "Veamos a continuación las fases de esta integración.\n" +
                        "- Crear proyecto en libGDX\n" +
                        "- Configurar el entorno de desarrollo Eclipse y libGDX\n" +
                        "- Importación de los proyectos libGDX al IDE Eclipse\n",
                author = "UNIDAD 5. Desarrollo de juegos 2D y 3D"
            ),
            PMQuoteModel(
                quote = "Conceptos avanzados de programación 3D\n" +
                        "Movimientos: En la programación 3D existen multitud de elementos que pueden estar animados y se necesita poder simular ciertos movimientos en ellos.\n" +
                        "Físicas: Permiten dar realismo a los diferentes elementos de un juego, determinando también cómo se pueden comportar con su entorno y entre otros elementos.\n" +
                        "Colisiones: las colisiones gestionan los comportamientos de los actores de un juego entre sí y entre otros elementos.\n" +
                        "Inteligencia artificial: interactuar con otros personajes o con su entorno de una manera lógica\n",
                author = "UNIDAD 5. Desarrollo de juegos 2D y 3D"
            ),
            PMQuoteModel(
                quote = "Al tratarse de escenarios en tres dimensiones, los sistemas de coordenadas son esenciales para poder gestionar las ubicaciones y movimientos de los personajes y los objetos.\n" +
                        "La geometría de un View se considera como un rectángulo, tiene una ubicación representada como un par de coordenadas izquierda y superior, y dos dimensiones, ancho y alto.\n" +
                        "\n" +
                        "Con los métodos getLeft() y getTop() se puede conocer la ubicación de una vista y se comportan de la siguiente manera:\n" +
                        "getLeft() devuelve la coordenada izquierda (o valor X) del rectángulo representado en la vista.\n" +
                        "getTop() devuelve la coordenada superior (o valor Y) del rectángulo\n",
                author = "UNIDAD 5. Desarrollo de juegos 2D y 3D"
            ),
            PMQuoteModel(
                quote = "Para conocer el tamaño de una vista se representa como un ancho y una altura, aunque en realidad una vista tiene dos pares de valores de ancho (también conocido como anchura medida) y alto (altura medida).\n" +
                        "Para obtener estas dimensiones medidas se pueden invocar a los métodos getMeasuredWidth() y getMeasuredHeight() de la clase View.\n" +
                        "\n" +
                        "Para conocer el ancho y el alto se pueden usar los métodos getWidth() y getHeight().\n",
                author = "UNIDAD 5. Desarrollo de juegos 2D y 3D"
            ),
            PMQuoteModel(
                quote = "Los modelos 3D son ficheros digitales en tres dimensiones, mucho más realistas que las imágenes en dos dimensiones.\n" +
                        "\n" +
                        "En el caso de Unity se puede encontrar el llamado “Asset Store” con acceso a recursos de muchos tipos para juegos, incluidos modelos en tres dimensiones.\n" +
                        "En Asset Store se puede buscar recursos de todo tipo y descargarlos para usarlos posteriormente en Unity a través de su gestor de paquetes.",
                author = "UNIDAD 5. Desarrollo de juegos 2D y 3D"
            ),
            PMQuoteModel(
                quote = "En Unity, los “GameObjects” son objetos básicos que se usan para representar escenarios o personajes.\n" +
                        "\n" +
                        "Dentro de estos “GameObjects” se encuentran muchas formas 3D, conocidas como objetos primitivos, que representan elementos básicos con los que se pueden construir prototipos de objetos mucho más complejos.\n",
                author = "UNIDAD 5. Desarrollo de juegos 2D y 3D"
            ),
            PMQuoteModel(
                quote = "Los objetos GameObject necesitarán siempre tener asociado un componente de transformación ya que sin él no se pueden crear.\n" +
                        "\n" +
                        "La edición de las transformaciones se puede realizar:\n" +
                        "\n" +
                        "A través de la escena.\n" +
                        "A través de las propiedades del inspector de objetos\n",
                author = "UNIDAD 5. Desarrollo de juegos 2D y 3D"
            ),
            PMQuoteModel(
                quote = "La renderización es un proceso que permite generar una imagen a partir de un modelo.\n" +
                        "\n" +
                        "Se pueden utilizar cuatro tipos de renderizado en Unity:\n" +
                        "OPAQUE: se suele usar para elementos opacos sin transparencias.\n" +
                        "CUTOUT: Aplica efecto de transparencia a objetos distinguiendo los bordes de las áreas que son opacas de las transparentes, estableciendo un umbral de corte entre los elementos\n" +
                        "TRANSPARENT: Como su nombre indica, se suele utilizar para renderizar elementos transparentes.\n" +
                        "FADE: Permite que las transparencias de un elemento se puedan desvanecer por completo\n",
                author = "UNIDAD 5. Desarrollo de juegos 2D y 3D"
            ),
            PMQuoteModel(
                quote = "En el desarrollo de videojuegos se pueden encontrar elementos comunes ordenados en tres fases principalmente: diseño, producción y postproducción",
                author = "UNIDAD 5. Desarrollo de juegos 2D y 3D"
            ),
            PMQuoteModel(
                quote = "En todas las escenas de un juego intervienen elementos que contienen ciertas propiedades que es recomendable conocer para poder aplicar efectos o descubrir sus posibles comportamientos.\n" +
                        "\n" +
                        "En Unity, se pueden modificar las propiedades de estos elementos de manera sencilla a través del “Inspector de objetos”.",
                author = "UNIDAD 5. Desarrollo de juegos 2D y 3D"
            ),
            PMQuoteModel(
                quote = "Los shaders son fragmentos de código que realizan funciones de sombreado gráfico y que están diseñados específicamente para que el desarrollador pueda interactuar de manera sencilla con la GPU.\n" +
                        "En Unity existen tres tipos de shaders:\n" +
                        "- Shaders de Superficies: Luces y sombras\n" +
                        "- Shaders Vertex y de Fragment: Interactuar con la iluminación\n" +
                        "- Shaders con Funciones Fijas:Se utilizan con sistemas antiguos que pueden soportar shaders programables.\n",
                author = "UNIDAD 5. Desarrollo de juegos 2D y 3D"
            ),
            PMQuoteModel(
                quote = "El proceso de renderizado se puede entender como la generación de imágenes, tanto bidimensionales como tridimensionales, de manera real en el interior de una escena. A partir de modelos ya predefinidos, se establecen filtros para realizar la renderización deseada.\n" +
                        "\n" +
                        "Con Unity se pueden configurar estas propiedades de renderizado mediante la función Render Texture.",
                author = "UNIDAD 5. Desarrollo de juegos 2D y 3D"
            ),
            PMQuoteModel(
                quote = "En Unity existe una herramienta sencilla que permite organizar y gestionar animaciones: Animator Controller o controlador de animación.\n" +
                        "\n" +
                        "Gracias a esta herramienta, Unity puede añadir un grafo de escena para gestionar personajes o elementos añadiendo animación a los mismos.\n",
                author = "UNIDAD 5. Desarrollo de juegos 2D y 3D"
            ),


            )
        var longitud:Int  = PMQuoteProvider.quote.size-1
            get()= field

    }


}