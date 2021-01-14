package com.andersen.collections;

import com.andersen.immutable.City;
import com.andersen.immutable.ImmutablePerson;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ImmutablePersonTest {

    static Logger log = Logger.getLogger(ImmutablePersonTest.class);


    ImmutablePerson personTest;
    String name;
    String secondName;
    Date birthday;
    City city;

    @Before
    public void init(){
        name = "Alex";
        secondName = "Zuev";
        city = new City("Minsk");
        birthday = new GregorianCalendar(1997, Calendar.MAY, 13).getTime();
        personTest = new ImmutablePerson(name, secondName, birthday, city);
    }

    @Test
    public void checkImmutablePerson(){
        log.info(personTest.toString());

        name = "Dima";
        secondName = "Ermakov";
        city.setName("Moscow");
        birthday.setTime(123);

        assertEquals("Alex", personTest.getName());
        assertEquals("Zuev", personTest.getSecondName());
        assertEquals(new City("Minsk"), personTest.getCity());
        assertEquals(new GregorianCalendar(1997, Calendar.MAY, 13).getTime(), personTest.getBirthday());

        log.info(personTest.toString());
    }

}