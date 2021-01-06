package com.andersen.patterns.observer.entity;

import com.andersen.patterns.observer.Observer;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * subscriber get notified when a new privilege appears in the company
 */
public class Employee implements Observer {

    private static Logger log = Logger.getLogger(Employee.class);
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> privileges) {
        log.info(name + ", now your have this privileges " + privileges + ".\n====================================\n");
    }
}
