package com.andersen.structures.arrays;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ConcatenateTwoSortedArraysTest {

    @Test
    public void combine() {
        ConcatenateTwoSortedArrays concatenateTwoSortedArrays = new ConcatenateTwoSortedArrays();
        int[] arrA = new int[]{-1, 1, 4, 7, 10};
        int[] arrB = new int[]{2, 4, 8, 13};
        assertArrayEquals(new int[]{-1, 1, 2, 4, 4, 7, 8, 10, 13}, concatenateTwoSortedArrays.combine(arrA, arrB));
    }
}