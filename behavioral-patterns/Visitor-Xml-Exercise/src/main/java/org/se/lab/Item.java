package org.se.lab;

public class Item 
	implements XmlElement 
{

	/* 
	 * Constructor 
	 */	
	public Item(String text) 
	{
		setText(text);
	}

	
	/*
	 * Property: text
	 */
	private String text;
	public final String getText() 
	{
		return text;
	}
	public final void setText(final String text) 
	{
		if(text == null)
			throw new NullPointerException("text");
		this.text = text;
	}
}
