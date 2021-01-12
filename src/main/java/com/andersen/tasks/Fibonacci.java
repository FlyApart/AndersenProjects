package com.andersen.tasks;

public class Fibonacci {

    public int getValue (int index){

        int result = 1;
        int prev = 1;
        int past = 1;

        if(index < 0){
            throw new IllegalArgumentException("incorrect index");
        }else if (index < 2){
            return index;
        }

        while (index - 2 > 0){
            result = prev+past;
            past=prev;
            prev=result;
            index--;
        }

        return result;
    }

    public int getValueSecondWay(int index){
        if(index < 0){
            throw new IllegalArgumentException("incorrect index");
        }else if (index < 2){
            return index;
        }return getValueSecondWay(index-2) + getValueSecondWay(index-1);
    }


}