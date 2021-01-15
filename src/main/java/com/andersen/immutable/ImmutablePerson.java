package com.andersen.immutable;

import java.util.Date;

public final class ImmutablePerson {
    private final String name;
    private final String secondName;
    private final Date birthday;
    private final City city;

    public ImmutablePerson(String name, String secondName, Date birthday, City city) {
        this.name = name;
        this.secondName = secondName;
        this.birthday = (Date) birthday.clone();
        this.city = (City) city.clone();
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public Date getBirthday() {
        return (Date) birthday.clone();
    }

    public City getCity() {
        return (City) city.clone();
    }

    @Override
    public String toString() {
        return "ImmutablePerson{" + '\n' +
                "name='" + name + '\n' +
                "secondName='" + secondName + '\n' +
                "birthday=" + birthday + '\n' +
                "city=" + city + '\n' +
                '}';
    }
}
