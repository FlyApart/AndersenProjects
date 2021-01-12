package com.andersen.tasks;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
    Fibonacci fibonacci;

    @Before
    public void init(){
        fibonacci = new Fibonacci();
    }

    @Test
    public void getValue() {
        assertEquals(0, fibonacci.getValue(0));
        assertEquals(1, fibonacci.getValue(1));
        assertEquals(1, fibonacci.getValue(2));
        assertEquals(2, fibonacci.getValue(3));
        assertEquals(3, fibonacci.getValue(4));
        assertEquals(5, fibonacci.getValue(5));
        assertEquals(21, fibonacci.getValue(8));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getValueWithException() {
        fibonacci.getValue(-1);
    }

    @Test
    public void getValueSecondWay() {
        assertEquals(0, fibonacci.getValueSecondWay(0));
        assertEquals(1, fibonacci.getValueSecondWay(1));
        assertEquals(1, fibonacci.getValueSecondWay(2));
        assertEquals(2, fibonacci.getValueSecondWay(3));
        assertEquals(3, fibonacci.getValueSecondWay(4));
        assertEquals(5, fibonacci.getValueSecondWay(5));
        assertEquals(21, fibonacci.getValueSecondWay(8));
    }
    @Test(expected = IllegalArgumentException.class)
    public void getValueSecondWayWithException() {
        fibonacci.getValueSecondWay(-1);
    }
}