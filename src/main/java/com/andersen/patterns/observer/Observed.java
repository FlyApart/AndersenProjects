package com.andersen.patterns.observer;

/**
 * interface for the object to be monitored
 */
public interface Observed {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
