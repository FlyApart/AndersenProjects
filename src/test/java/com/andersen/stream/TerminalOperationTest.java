package com.andersen.stream;

import com.andersen.stream.entity.Gender;
import com.andersen.stream.entity.Person;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TerminalOperationTest {

    static List<Person> persons;
    static TerminalOperation task;

    @BeforeClass
    public static void init() {
        task = new TerminalOperation();
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
    public void findFirstUserFromArray() {
        assertEquals(new Person("Alex", 24, Gender.MALE), task.findFirstUserFromArray(persons));
    }

    @Test
    public void anyMatchUsersWithName() {
        assertTrue(task.anyMatchUsersWithName(persons, "Alex"));
        assertFalse(task.anyMatchUsersWithName(persons, "Dima"));
    }

    @Test
    public void averageAgeUsers() {
        assertEquals(22.5, task.averageAgeUsers(persons), 0.01);
        assertEquals(0, task.averageAgeUsers(new ArrayList<>()), 0.01);
    }
}