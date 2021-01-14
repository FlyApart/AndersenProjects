package com.andersen.structures.arrays;

public class Array {

    private int[] intArray;
    private int capacity = 0;

    public Array(int length) {
        this.intArray = new int[length];
    }

    /**
     * filling the array with elements from in to max values.
     * @param length - number of elements
     * @param min - minimum required value
     * @param max - maximum required value
     * @return - filled array
     */
    public int[] fill(int length, int min, int max) {
        if (length > intArray.length) {
            length = intArray.length;
        }
        if(max < min) {
            throw new IllegalArgumentException("Max < Min");
        }
        for (int i = 0; i < length; i++,capacity++) {
            intArray[i] = min + (int) (Math.random() * ((max - min) + 1));
        }
        return intArray;
    }

    /**
     * adds a value to the end of the array
     * @param value - value for add
     * @return - filled array
     */
    public int[] add(int value) {
        if (capacity < intArray.length) {
            intArray[capacity] = value;
            capacity++;
        }else {
            throw new IndexOutOfBoundsException();
        }
        return intArray;
    }

    /**
     * adding an element by index with offset of subsequent elements
     * @param value - element
     * @param index - the index of the element in the array
     * @return - filled array
     */
    public int[] insert(int value, int index){
        if (index >= 0 && index < intArray.length && capacity < intArray.length){

            for (int i = capacity; i > index;) {
                intArray[i] = intArray[--i];
            }
            capacity++;
            intArray[index] = value;
        }else {
            throw new IndexOutOfBoundsException();
        }
        return intArray;
    }

    /**
     * deleting an element by index
     * @param index - the index of the element in the array
     * @return - array
     */
    public int[] delete(int index) {
        if (index >= 0 && index < intArray.length){
            capacity--;
            while (index < capacity){
                intArray[index] = intArray[++index];
            }
            intArray[capacity] = 0;
        }
        return intArray;
    }

    /**
     * finds a value by index in an array
     * @param index - the index of the element in the array
     * @return - index value
     */
    public int findByIndex(int index) {
        if (index >= 0 && index < intArray.length) {
            return intArray[index];
        }
        throw new IllegalArgumentException("index is incorrect");
    }

    /**
     * search for the first occurrence of an element in the array, otherwise -1
     * @param value - desired value
     * @return - the index of the element in the array
     */
    public int findFirstValue(int value) {
        for (int i = 0; i < intArray.length; i++) {
            if (value == intArray[i]) {
                return i;
            }
        }
        return -1;
    }
}
