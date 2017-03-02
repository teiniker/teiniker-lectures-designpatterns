package org.se.lab;

public class ControllerBottom
	implements ControllerState
{
	protected static final ControllerState INSTANCE = new ControllerBottom();
	 
	
	@Override
	public void handlePushUpButton(Controller c)
	{
		c.getMotor().runClockwise();
		c.setState(ControllerUpward.INSTANCE);
	}

	@Override
	public void handlePushDownButton(Controller c)
	{
		// do nothing
	}

	@Override
	public void handleEndSwitchTop(Controller c)
	{
		throw new IllegalStateException();
	}

	@Override
	public void handleEndSwitchBottom(Controller c)
	{
		// do nothing
	}
}
