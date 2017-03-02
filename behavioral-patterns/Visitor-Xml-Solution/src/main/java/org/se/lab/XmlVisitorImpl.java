package org.se.lab;

public class XmlVisitorImpl
	implements XmlVisitor
{
	private int indent;
	
	public String visit(XmlElement element)
	{
		if(element instanceof Item)
		{
			return visit((Item)element);
		}
		else if(element instanceof ItemList)
		{
			return visit((ItemList)element);
		}
		else
		{
			throw new IllegalArgumentException();
		}
	}
	
	
	@Override
	public String visit(Item item)
	{		
		return getIndentAsString() + "<item>" + item.getText() + "</item>";
	}

	@Override
	public String visit(ItemList list)
	{
	    String spaces = getIndentAsString();
	    
	    StringBuilder s = new StringBuilder();
	    s.append(spaces).append("<itemlist>\n");
	    indent++;
		for(XmlElement element : list.getItems()) 
		{
			s.append(visit(element)).append("\n");
		}
		indent--;
		s.append(spaces).append("</itemlist>");
		return s.toString(); 
	}

	
	public final static String TAB = "    ";
	protected String getIndentAsString()
	{
		StringBuilder spaces = new StringBuilder();
		for(int i = 0; i < indent ; i++)
		{
			spaces.append(TAB);
		}
		return spaces.toString();
	}
}
