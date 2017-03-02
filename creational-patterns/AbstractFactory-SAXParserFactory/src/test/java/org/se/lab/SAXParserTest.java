package org.se.lab;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.junit.Test;
import org.xml.sax.SAXException;

public class SAXParserTest
{
	/*
	 * Running the test with the command line option:
	 * 	-Djaxp.debug=1
	 * prints out:
	 * 	JAXP: find factoryId =javax.xml.parsers.SAXParserFactory
	 *  JAXP: loaded from fallback value: com.sun.org.apache.xerces.internal.jaxp.SAXParserFactoryImpl
	 */
	
	@Test
	public void test() throws ParserConfigurationException, SAXException, IOException
	{			
		SAXParserFactory factory = SAXParserFactory.newInstance();		
		System.out.println("Implementation class is: " + factory);
		
		SAXParser parser = factory.newSAXParser();
		System.out.println("Implementation class is: " + parser);
				
		parser.parse(new File("xml", "note.xml"), new SimpleHandler());
	}
}
