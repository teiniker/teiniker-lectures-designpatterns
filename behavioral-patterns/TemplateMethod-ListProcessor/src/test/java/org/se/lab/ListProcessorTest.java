package org.se.lab;


import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.se.lab.ListToLower;
import org.se.lab.ListToUpper;

public class ListProcessorTest
{
    @Test
    public void testCollectionToUpper()
    {
        List<String> list = Arrays.asList("Eins", "Zwei", "Drei", "Vier");
        
        ListProcessor proc = new ListToUpper();
        proc.process(list);
        
        System.out.println(list);
        Assert.assertEquals("[EINS, ZWEI, DREI, VIER]", list.toString());
    }

    
    @Test
    public void testCollectionToLower()
    {
        List<String> list = Arrays.asList("Eins", "Zwei", "Drei", "Vier");
        
        ListProcessor proc = new ListToLower();
        proc.process(list);
        
        System.out.println(list);
        Assert.assertEquals("[eins, zwei, drei, vier]", list.toString());
    }
}
