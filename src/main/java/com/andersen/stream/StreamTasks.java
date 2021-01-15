package com.andersen.stream;

import com.andersen.stream.entity.Gender;
import com.andersen.stream.entity.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTasks {

    /**
     * Counting the sum of element values
     * @param value any number of int values
     * @return sum of input values
     */
    public long sumValueCollect(Integer...value){
        return Arrays.stream(value).collect(Collectors.summingInt(Integer::intValue));
    }

    public long sumValueMapToInt(Integer...value){
        return Arrays.stream(value).mapToInt(Integer::intValue).sum();
    }

    public long sumValueReduce(Integer...value){
        return Arrays.stream(value).reduce(0, Integer::sum);
    }

    public long sumValueReduceV2(Integer...value){
        return Arrays.stream(value).reduce(0, StreamTasks::addValue);
    }

    /**
     * Counting the sum of element values
     * @param value any number of {@link String} values
     * @return sum of input values
     */
    public long sumStringValueCollect(String...value){
        return Arrays.stream(value).map(Integer::parseInt).collect(Collectors.summarizingInt(Integer::intValue)).getSum();
    }

    public long sumStringValueMapToInt(String...value){
        return Arrays.stream(value).mapToInt(Integer::parseInt).sum();
    }

    public long sumStringValueReduce(String...value){
        return Arrays.stream(value).map(Integer::parseInt).reduce(0, Integer::sum);
    }

    /**
     *
     * @param a int value
     * @param b int value
     * @return returns the sum of two incoming items
     */
    private static int addValue(Integer a, Integer b){
        return a + b;
    }

    /**
     *
     * @param persons arrays of {@link Person }
     * @return all people who should go to the army
     */
    public List<Person> findPersonOfMilitaryAge(List<Person> persons){
        return persons.stream().filter(a -> a.getAge() < 27 && a.getAge() > 17 && Gender.MALE.equals(a.getGender())).collect(Collectors.toList());
    }
}
