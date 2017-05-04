package org.se.lab;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class InternalIteratorTest
{
    private List<String> list;
    
    @Before
    public void setUp()
    {
        list = Arrays.asList("eins","zwei","drei","vier","fünf","sechs","sieben","acht","neun");
    }
    
    @Test
    public void testToUpperCommand()
    {
    	InternalListIterator.forEach(list, new ToUpperCommand());
    
    	Assert.assertEquals("[EINS, ZWEI, DREI, VIER, FÜNF, SECHS, SIEBEN, ACHT, NEUN]", 
    			list.toString());
    }
    
}
