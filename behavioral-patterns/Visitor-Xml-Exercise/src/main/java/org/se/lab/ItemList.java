package org.se.lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ItemList 
	implements XmlElement
{
	/*
	 * Property: items
	 */
    private List<XmlElement> items = new ArrayList<XmlElement>();
    public List<XmlElement> getItems()
    {
        return Collections.unmodifiableList(items);
    }
	public void addItem(final XmlElement element)
	{
		if(element == null)
			throw new NullPointerException("element");
		items.add(element);
	}
    public void removeItem(final XmlElement element)
    {
		if(element == null)
			throw new NullPointerException("element");
        items.remove(element);
    }
}
