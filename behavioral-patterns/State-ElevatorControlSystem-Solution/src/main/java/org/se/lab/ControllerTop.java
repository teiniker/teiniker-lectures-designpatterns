package org.se.lab;

public class ControllerTop
	implements ControllerState
{
	public static final ControllerState INSTANCE = new ControllerTop();
	 
	
	@Override
	public void handlePushUpButton(Controller c)
	{
		// do nothing
	}

	@Override
	public void handlePushDownButton(Controller c)
	{
		c.getMotor().runCounterclockwise();
		c.setState(ControllerDownward.INSTANCE);
	}

	@Override
	public void handleEndSwitchTop(Controller c)
	{
		// do nothing
	}

	@Override
	public void handleEndSwitchBottom(Controller c)
	{
		throw new IllegalStateException();
	}
}
