package org.se.lab;

public interface XmlVisitor
{
	String visit(XmlElement element);
	String visit(Item item);
	String visit(ItemList list);
}
