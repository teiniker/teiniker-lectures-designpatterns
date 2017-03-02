package org.se.lab;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SimpleHandler extends DefaultHandler
{
	private int indent = 0;
	
	public void startDocument() throws SAXException
	{
		System.out.println("start document");
	}

	public void endDocument() throws SAXException
	{
		System.out.println("end document");
	}

	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException
	{
		indent++;
		System.out.println(indentToString() + "<" + qName + ">");
	}

	public void endElement(String uri, String localName, String qName)
			throws SAXException
	{
		System.out.println(indentToString() + "</" + qName + ">");
		indent--;
	}
	
	private String indentToString()
	{
		StringBuilder space = new StringBuilder();
		for(int i=0; i<indent; i++)
			space.append("    ");
		return space.toString();	
	}
}
