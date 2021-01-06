package com.andersen.patterns.buider;

/**
 * class to be created using the builder
 */
public class PersonBuilder {
    private String name;
    private String secondName;
    private int age;

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "PersonBuilder{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * private constructor for the impossibility of creating a class without using a builder
     * @param builder - object with identical, already filled fields
     */
    private PersonBuilder(Builder builder) {
        this.name = builder.name;
        this.secondName = builder.secondName;
        this.age = builder.age;
    }

    /**
     * helper builder inner class with progressive build methods
     */
    public static class Builder{
        private String name;
        private String secondName;
        private int age;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSecondName(String secondName) {
            this.secondName = secondName;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder build(){
            return new PersonBuilder(this);
        }
    }
}
