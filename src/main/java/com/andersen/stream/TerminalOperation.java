package com.andersen.stream;

import com.andersen.stream.entity.Person;

import java.util.List;

public class TerminalOperation {

    public Person findFirstUserFromArray(List<Person> persons){
        return persons.stream().findFirst().orElse(null);
    }

    public boolean anyMatchUsersWithName(List<Person> persons, String name){
        return persons.stream().anyMatch(a -> a.getName().equals(name));
    }

    public double averageAgeUsers(List<Person> persons){
        return persons.stream().mapToInt(Person::getAge).average().orElse(0);
    }

}
