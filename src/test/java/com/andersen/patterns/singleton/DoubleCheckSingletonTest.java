package com.andersen.patterns.singleton;

import org.apache.log4j.Logger;
import org.junit.Test;

import static org.junit.Assert.*;

public class DoubleCheckSingletonTest {

    @Test
    public void createSingleton(){
        Logger logger = Logger.getLogger(this.getClass());
        DoubleCheckSingleton singleton1 = DoubleCheckSingleton.getInstance();
        DoubleCheckSingleton singleton2 = DoubleCheckSingleton.getInstance();

        assertEquals(singleton1,singleton2);

        logger.info(singleton1);
        logger.info(singleton2);
    }
}