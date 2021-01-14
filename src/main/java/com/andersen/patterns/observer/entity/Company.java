package com.andersen.patterns.observer.entity;

import com.andersen.patterns.observer.Observed;
import com.andersen.patterns.observer.Observer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * when the company has new privileges for employees, it notifies all employees about it
 */
public class Company implements Observed {

    private List<String> privileges = new ArrayList<>();
    private Set<Observer> subscribers = new HashSet<>();

    public void addPrivilege(String privilege){
        privileges.add(privilege);
        notifyObservers();
    }
    public void removePrivilege(String privilege){
        privileges.remove(privilege);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        subscribers.forEach(s->s.handleEvent(privileges));
    }
}
