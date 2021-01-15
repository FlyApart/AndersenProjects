package com.andersen.immutable;

import org.apache.log4j.Logger;

import java.util.Objects;

public class City implements Cloneable {
    private static Logger log = Logger.getLogger(City.class);
    private String name;

    public City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object clone() {
        City c = null;
        try {
            c = (City)super.clone();
        } catch (CloneNotSupportedException e) {log.error("Exception in clone method", e);}
        return c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                '}';
    }
}
