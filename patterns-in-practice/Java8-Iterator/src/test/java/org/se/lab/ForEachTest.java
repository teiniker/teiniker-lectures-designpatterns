package org.se.lab;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class ForEachTest
{
    private List<String> list;
    
    @Before
    public void setUp()
    {
        list = Arrays.asList("eins","zwei","drei","vier","fünf","sechs","sieben","acht","neun");
    }
    
    
//    public interface Iterable<T> {
//        Iterator<T> iterator();
//
//        default void forEach(Consumer<? super T> action) {
//            Objects.requireNonNull(action);
//            for (T t : this) {
//                action.accept(t);
//            }
//        }
//        //...
//    }
    
    @Test
    public void testIterableForEach()
    {
    	// Performs the given action for each element of the Iterable
        // until all elements have been processed or the action throws an
        // exception.
    	list.forEach((s) -> System.out.println(s));
    }
    
    @Test
    public void testIterableForEachMethodReference()
    {
    	// Performs the given action for each element of the Iterable
        // until all elements have been processed or the action throws an
        // exception.
    	list.forEach(System.out::println);
    }
}
