package com.andersen.structures.arrays;

public class ConcatenateTwoSortedArrays {

    /**
     * Method joins 2 sorted arrays
     * @param arrA - first array
     * @param arrB - second array
     * @return - resulting sorted array
     */
    public int[] combine(int[] arrA, int[] arrB){
        int[] sumArray = new int[arrA.length + arrB.length];
        int positionA = 0;
        int positionB = 0;

        for (int i = 0; i < sumArray.length; i++) {
            if (positionA < arrA.length && positionB < arrB.length){
                if (arrA[positionA] >= arrB[positionB]){
                    sumArray[i] = arrB[positionB];
                    positionB++;
                }else {
                    sumArray[i] = arrA[positionA];
                    positionA++;
                }
            }else if(positionA < arrA.length){
                sumArray[i] = arrA[positionA++];
            }else if(positionB < arrB.length){
                sumArray[i] = arrB[positionB];
            }
        }
        for (int i = 0; i < sumArray.length; i++) {
            System.out.println(sumArray[i]);
        }
        return sumArray;
    }
}
