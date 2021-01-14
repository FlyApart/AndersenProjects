package com.andersen.patterns.observer.entity;

import com.andersen.patterns.observer.Observer;
import org.junit.Before;
import org.junit.Test;

public class ObserverTest {

    Observer emp1;
    Observer emp2;
    Observer emp3;

    Company company;

    @Before
    public void init(){
        emp1 = new Employee("Alex");
        emp2 = new Employee("Dima");
        emp3 = new Employee("Oleg");
        company = new Company();

        company.addObserver(emp1);
        company.addObserver(emp2);
        company.addObserver(emp3);
    }

    @Test
    public void observe(){
        company.addPrivilege("English courses");
        company.removeObserver(emp3);
        company.addPrivilege("Gym");
        company.removeObserver(emp2);
        company.addPrivilege("Healthy sleep");
        company.removePrivilege("Gym");
    }

}