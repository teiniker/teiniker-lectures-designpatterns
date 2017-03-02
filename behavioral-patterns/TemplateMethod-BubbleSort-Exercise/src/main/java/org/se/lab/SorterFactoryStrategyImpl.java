package org.se.lab;

public class SorterFactoryStrategyImpl
	implements SorterFactory
{
	@Override
	public BubbleSort createSorter(SortDirection direction)
	{
		switch(direction)
		{
			case ASCENTING: 
				return new BubbleSortAscendingStrategy();
			
			case DESCENTING: 
				return new BubbleSortDescentingStrategy();
				
			default: 
				throw new IllegalStateException();
		}
	}
}
