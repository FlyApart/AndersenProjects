package com.andersen.patterns.singleton;

public class DoubleCheckSingleton {
    private volatile static DoubleCheckSingleton singleton;

    private DoubleCheckSingleton() {}

    public static DoubleCheckSingleton getInstance(){
        if (singleton == null){
            synchronized (DoubleCheckSingleton.class){
                if (singleton == null){
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
