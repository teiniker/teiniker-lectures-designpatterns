package org.se.lab;

public class ParkingGateRaising
	implements ParkingGateState
{
	/*
	 * Singleton
	 */
	public static final ParkingGateState INSTANCE = new ParkingGateRaising();
	
	@Override
	public void handleCarAtGate(ParkingGate gate)
	{
		// Do nothing		
	}

	@Override
	public void handleTopSwitch(ParkingGate gate)
	{
		gate.stop();
		gate.setState(ParkingGateOpen.INSTANCE);		
	}

	@Override
	public void handleCarJustExited(ParkingGate gate)
	{
		// Do nothing	
	}

	@Override
	public void handleBottomSwitch(ParkingGate gate)
	{
		// Do nothing	
	}
}
