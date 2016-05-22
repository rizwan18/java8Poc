package com.riz.poc.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Java8StreamFilter {

    private final List<Person> persons;

    public Java8StreamFilter() {
        persons = getPersons();
    }

    public void filterGetValuesAndPrintIt() {
        persons.stream()
                .filter(abc -> abc.getCountry().equals("Pakistan"))
                .map((Person abc) -> abc.getName())
                .forEach(abc -> System.out.println("Person value: " + abc));
    }

    public void streamIntoArray() {
        Person[] persons1 = persons.stream().toArray(Person[]::new);
        Arrays.asList(persons1).forEach(name -> System.out.println("Persons array: " + name));
    }

    private List<Person> getPersons() {
        return Arrays.asList(
                new Person("Rizwan", "Australia"),
                new Person("Test", "USA"),
                new Person("Hello", "Pakistan"),
                new Person("Pak", "Pakistan"));
    }
}
