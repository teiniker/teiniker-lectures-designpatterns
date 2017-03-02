package org.se.lab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class XmlVisitorTest
{
	private XmlElement xml;
	
	@Before
	public void setup()
	{
		ItemList dayList = new ItemList(); 
		dayList.addItem(new Item("Montag"));        
		dayList.addItem(new Item("Dienstag"));
		dayList.addItem(new Item("Mittwoch"));
		
		ItemList hourList = new ItemList();
		hourList.addItem(new Item("10:00 am"));
		hourList.addItem(new Item("11:00 am"));
		
		dayList.addItem(hourList);
		
		xml = dayList;
	}
	
	
    @Test
    public void testXmlVisitor()
    {        
        String expected = 
        "<itemlist>" + "\n" + 
        "    <item>Montag</item>" + "\n" + 
        "    <item>Dienstag</item>" + "\n" + 
        "    <item>Mittwoch</item>" + "\n" + 
        "    <itemlist>" + "\n" + 
        "        <item>10:00 am</item>" + "\n" +
        "        <item>11:00 am</item>" + "\n" +
        "    </itemlist>" + "\n" +
        "</itemlist>";
        
        XmlVisitor visitor = new XmlVisitorImpl();
        System.out.println(visitor.visit(xml));
        Assert.assertEquals(expected, visitor.visit(xml));
    }
}
