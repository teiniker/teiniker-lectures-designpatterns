package org.se.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExternalIteratorTest
{
    private List<String> list;
    
    @Before
    public void setUp()
    {
        list = Arrays.asList("eins","zwei","drei","vier","fünf","sechs","sieben","acht","neun");
    }
    
    
    @Test
    public void testFilter()
    {
        List<String> l = new ArrayList<>();
                
        for(Iterator<String> it = list.iterator(); it.hasNext(); )
        {
            String s = it.next();
            if(s.length() > 4)
                l.add(s);
        }        

        Assert.assertEquals(2L, l.size());        
    }
}
