package com.andersen.structures.arrays;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ArrayTest {

    @BeforeAll
    @Test
    public void add() {
        Array array = new Array(1);
        assertEquals(0, array.add(0)[0]);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void addGreaterThanIndex() {
        Array array = new Array(0);
        array.add(0);
    }

    @Test
    public void insert() {
        Array array = new Array(3);
        array.add(2);
        array.add(6);
        assertEquals(10, array.insert(10, 1)[1]);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void insertGreaterThanCapacity() {
        Array array = new Array(2);
        array.add(2);
        array.add(6);
        array.insert(10, 1);
    }

    @Test
    public void fill() {
        Array array = new Array(3);
        int min = 0;
        int max = 999;
        int[] currentArray = array.fill(3, min, max);
        for (int value : currentArray) {
            if (value < min || value > max) {
                fail("Incorrect Value");
            }
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void fillGreaterThanIndex() {
        Array array = new Array(3);
        array.fill(5, 5, 0);
    }

    @Test
    public void delete() {
        Array array = new Array(5);
        array.add(1);
        array.add(2);
        array.add(6);
        int[] ints = array.delete(1);
        assertEquals(6, ints[1]);
        assertEquals(0, ints[2]);
    }

    @Test
    public void findByIndex() {
        Array array = new Array(5);
        array.add(1);
        array.add(2);
        array.add(6);
        assertEquals(6, array.findByIndex(2));
        assertEquals(1, array.findByIndex(0));
        assertEquals(0, array.findByIndex(4));
    }

    @Test
    public void findFirstValue() {
        Array array = new Array(5);
        array.add(1);
        array.add(2);
        array.add(6);
        array.add(2);
        assertEquals(0, array.findFirstValue(1));
        assertEquals(1, array.findFirstValue(2));
        assertEquals(2, array.findFirstValue(6));
        assertEquals(-1, array.findFirstValue(66));
    }
}

