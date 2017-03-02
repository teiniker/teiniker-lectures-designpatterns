package org.se.lab;

public class FileSystemSizeVisitor 
	extends FileSystemVisitor
{
	/*
	 * Property: size
	 */
	private int size=0;
	public int getSize()
	{
		return size;
	}

	@Override
	public void visit(File file)
	{
		size += file.getSize();
	}

	@Override
	public void visit(Directory dir)
	{
		for(Node n : dir.getNodes())
		{
			visit(n);
		}
	}
}
