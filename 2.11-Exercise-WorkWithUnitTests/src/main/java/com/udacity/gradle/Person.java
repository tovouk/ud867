package com.udacity.gradle;

public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    //causes the test to fail as it will always return foo
    public String getName() {
        return "foo";
    }
}
