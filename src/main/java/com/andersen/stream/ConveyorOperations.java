package com.andersen.stream;

import com.andersen.stream.entity.Gender;
import com.andersen.stream.entity.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConveyorOperations {

    public long filterUsersGenderCount (List<Person> persons, Gender gender){
        return persons.stream().filter(a -> a.getGender().equals(gender)).count();
    }

    public List<Person> skipFirstUsers(List<Person> persons, int skipElement){
        return persons.stream().skip(skipElement).collect(Collectors.toList());
    }

    public List<Person> distinctUsersInArray(List<Person> persons){
        return persons.stream().distinct().collect(Collectors.toList());
    }

    public int mapSumUsersAge(List<Person> persons){
        return persons.stream().map(Person::getAge).reduce(0, Integer::sum);
    }

    public List<Person> sortUsersArray(List<Person> persons){
        return persons.stream().sorted().collect(Collectors.toList());
    }

    public String[] flatMapUsersToStringName(List<Person> persons){
        return persons.stream().flatMap((a) -> Arrays.stream(a.getName().split("name="))).toArray(String[]::new);
    }

    public int flatMapUsersToMaxAge(List<Person> persons){
        return persons.stream().flatMapToInt((a) -> IntStream.of(a.getAge())).max().orElse(0);
    }
}
