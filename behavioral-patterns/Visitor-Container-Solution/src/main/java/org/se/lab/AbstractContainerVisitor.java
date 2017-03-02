package org.se.lab;

public abstract class AbstractContainerVisitor
	implements ContainerVisitor
{
	@Override
	public void visit(Container container)
	{
	    // calculate 
	    
	    // delegate
		for(Component c : container.getComponents())
		{
			visit(c);
		}
	}

	
	@Override
	public void visit(Component component)
	{
		if(component instanceof Product)
		{
			visit((Product)component);
		}
		else if(component instanceof Container)
		{
			visit((Container)component);
		}
		else
		{
		    throw new IllegalArgumentException();
		}
	}
}
