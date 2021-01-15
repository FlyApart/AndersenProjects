package com.andersen.stream;

import com.andersen.stream.entity.Gender;
import com.andersen.stream.entity.Person;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StreamTasksTest {

    static Integer[] intArray;
    static String[] stringArray;
    static StreamTasks tasks;
    static List<Person> persons;

    @BeforeClass
    public static void init() {
        intArray = new Integer[]{1, -3, 4, 8, 14, -2};
        stringArray = new String[]{"1", "-3", "4", "8", "14", "-2"};
        tasks = new StreamTasks();
        persons = List.of(
                new Person("Alex", 24, Gender.MALE),
                new Person("Olga", 10, Gender.FEMALE),
                new Person("Denis", 27, Gender.MALE),
                new Person("Ura", 22, Gender.MALE)
        );
    }


    @Test
    public void sumValueCollect() {
        assertEquals(22, tasks.sumValueCollect(intArray));
    }

    @Test
    public void sumValueMapToInt() {
        assertEquals(22, tasks.sumValueMapToInt(intArray));
    }

    @Test
    public void sumValueReduce() {
        assertEquals(22, tasks.sumValueReduce(intArray));
    }

    @Test
    public void sumValueReduceV2() {
        assertEquals(22, tasks.sumValueReduceV2(intArray));
    }

    @Test
    public void sumStringValueCollect() {
        assertEquals(22, tasks.sumStringValueCollect(stringArray));
    }

    @Test
    public void sumStringValueMapToInt() {
        assertEquals(22, tasks.sumStringValueMapToInt(stringArray));
    }

    @Test
    public void sumStringValueReduce() {
        assertEquals(22, tasks.sumStringValueReduce(stringArray));
    }

    @Test
    public void findPersonOfMilitaryAge() {
        assertEquals(2, tasks.findPersonOfMilitaryAge(persons).size());
    }
}