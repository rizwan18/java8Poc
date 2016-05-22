package com.riz.poc.java8;

public class Person {
    public String name;
    public String country;
    public Person(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
