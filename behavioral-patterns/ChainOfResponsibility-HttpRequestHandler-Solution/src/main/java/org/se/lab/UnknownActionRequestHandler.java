package org.se.lab;

public class UnknownActionRequestHandler
	extends HttpRequestHandler
{

	@Override
	public String handleRequest(HttpRequest request)
	{
		String action = request.getParameters().get("action");
		
		throw new IllegalArgumentException("Unknown action " + action);
	}
}
