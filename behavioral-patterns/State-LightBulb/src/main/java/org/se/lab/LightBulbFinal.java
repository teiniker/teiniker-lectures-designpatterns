package org.se.lab;

public class LightBulbFinal
	implements LightBulbState
{
	public static final LightBulbState INSTANCE = new LightBulbFinal();

	@Override
	public void handleTurnOn(LightBulb b)
	{
		// do nothing
	}

	@Override
	public void handleTurnOff(LightBulb b)
	{
		// do nothing
	}

	@Override
	public void handleBurnOut(LightBulb b)
	{
		// do nothing
	}
}
