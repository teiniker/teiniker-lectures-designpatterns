package org.se.lab;

public class ToUpperCommand
	implements Command
{
	public String modify(String s)
	{
		return s.toUpperCase();
	}
}
