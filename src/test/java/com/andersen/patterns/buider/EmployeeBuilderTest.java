package com.andersen.patterns.buider;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeBuilderTest {

    PersonBuilder alex;
    PersonBuilder dima;
    Logger logger;

    @Before
    public void init(){
        alex = new PersonBuilder.Builder().setAge(10).setName("Alex").setSecondName("Zuev").build();
        dima = new PersonBuilder.Builder().setAge(25).setName("Dima").setSecondName("Zaharov").build();
        logger = Logger.getLogger(this.getClass());
    }

    @Test
    public void buildPerson(){
        assertEquals(10,alex.getAge());
        assertEquals("Alex",alex.getName());
        assertEquals("Zuev",alex.getSecondName());
        logger.info(alex.toString());

        assertEquals(25,dima.getAge());
        assertEquals("Dima",dima.getName());
        assertEquals("Zaharov",dima.getSecondName());
        logger.info(dima.toString());
    }

}