Abstract Factory Pattern
---------------------------------------------------------------------

Es handelt sich ume eine Variante eines Abstract Factory Patterns.

SAXParserFactory: 
(entspricht der AbstractFactory)
Es wurde eine abstrakte Klasse statt eines Interfaces verwendet,
weil einige Methoden bereits implementiert wurden.
Beachte: SAXParserFactory.newInstance() ist nicht Teil eines
Singletons, da die static Method newInstance() immer eine
neue Instanz liefert!


com.sun.org.apache.xerces.internal.jaxp.SAXParserFactoryImpl
(entspricht einer ConcreteFactory)
Diese Default-Implementierung erlaut die Erstellung der
eigentlichen SAXPaser Instanz.


SAXParser:
(entspricht dem AbstractProduct)
Auch hier wird statt eines Interfaces eine abstrakte Klasse verwendet
um ein Produkt zu spezifizieren.


com.sun.org.apache.xerces.internal.jaxp.SAXParserImpl:
(entspricht einem ConcreteProduct)
Auch hier eine Defaultimplementierung die mit der JRE mitkommt.


Beachten Sie, dass durch die Bereitstellung einer anderen Implementierung
von SAXParserFactoryImpl (ConcreteFactory) eine neue Familie von 
SAXParser Klassen instanziert werden kann.



Java API
---------------------------------------------------------------------

public static SAXParserFactory newInstance()

This static method creates a new factory instance.
This method uses the following ordered lookup procedure to determine 
the SAXParserFactory implementation class to load:

o) Use the javax.xml.parsers.SAXParserFactory system property.

o) Use the properties file "lib/jaxp.properties" in the JRE directory. 
	This configuration file is in standard java.util.Properties format 
	and contains the fully qualified name of the implementation class 
	with the key being the system property defined above. 
	The jaxp.properties file is read only once by the JAXP implementation 
	and it's values are then cached for future use. 
	If the file does not exist when the first attempt is made to read 
	from it, no further attempts are made to check for its existence. 
	It is not possible to change the value of any property in 
	jaxp.properties after it has been read for the first time.

o) Use the Services API (as detailed in the JAR specification), if 
	available, to determine the classname. 
	The Services API will look for a classname in the file 
	META-INF/services/javax.xml.parsers.SAXParserFactory in jars available 
	to the runtime.

*) Platform default SAXParserFactory instance.

Once an application has obtained a reference to a SAXParserFactory it 
can use the factory to configure and obtain parser instances.

