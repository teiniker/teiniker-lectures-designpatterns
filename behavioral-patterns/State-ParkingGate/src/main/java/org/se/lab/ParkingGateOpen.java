package org.se.lab;

public class ParkingGateOpen
	implements ParkingGateState
{
	/*
	 * Singleton
	 */
	public static final ParkingGateState INSTANCE = new ParkingGateOpen();
	
	@Override
	public void handleCarAtGate(ParkingGate gate)
	{
		// Do nothing	
	}

	@Override
	public void handleTopSwitch(ParkingGate gate)
	{
		// Do nothing	
	}

	@Override
	public void handleCarJustExited(ParkingGate gate)
	{
		gate.lower();
		gate.setState(ParkingGateLowering.INSTANCE);
	}

	@Override
	public void handleBottomSwitch(ParkingGate gate)
	{
		// Do nothing	
	}
}
