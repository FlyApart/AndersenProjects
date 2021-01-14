package com.andersen.stream;

import com.andersen.stream.entity.Gender;
import com.andersen.stream.entity.Person;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ConveyorOperationsTest {

    static List<Person> persons;
    static ConveyorOperations task;

    @BeforeClass
    public static void init() {
        task = new ConveyorOperations();
        persons = List.of(
                new Person("Alex", 24, Gender.MALE),
                new Person("Olga", 10, Gender.FEMALE),
                new Person("Denis", 27, Gender.MALE),
                new Person("Oleg", 5, Gender.MALE),
                new Person("Masha", 20, Gender.FEMALE),
                new Person("Katya", 50, Gender.FEMALE),
                new Person("Ura", 22, Gender.MALE),
                new Person("Ura", 22, Gender.MALE)
        );
    }

    @Test
    public void filterUsersGenderCount() {
        assertEquals(5, task.filterUsersGenderCount(persons, Gender.MALE));
        assertEquals(3, task.filterUsersGenderCount(persons, Gender.FEMALE));
    }

    @Test
    public void skipFirstUsers() {
        assertEquals(4, task.skipFirstUsers(persons, 4).size());
    }

    @Test
    public void distinctUsersInArray() {
        assertEquals(7, task.distinctUsersInArray(persons).size());
    }

    @Test
    public void mapSumUsersAge() {
        assertEquals(180, task.mapSumUsersAge(persons));
    }

    @Test
    public void sortUsersArray() {
        List<Person> sortedList = new ArrayList<>(persons);
        Collections.sort(sortedList);
        assertEquals(sortedList, task.sortUsersArray(persons));
    }

    @Test
    public void flatMapUsersToStringName() {
        assertArrayEquals(new String[]{"Alex", "Olga", "Denis", "Oleg", "Masha", "Katya", "Ura", "Ura"}, task.flatMapUsersToStringName(persons));
    }

    @Test
    public void flatMapUsersToMaxAge() {
        assertEquals(50, task.flatMapUsersToMaxAge(persons));
        assertEquals(0, task.flatMapUsersToMaxAge(new ArrayList<>()));
    }
}