package org.example.OBJECT;

import java.util.Objects;

public class Person {

    String name;
    int age;
    int wheit;

    public Person(String name, int age, int wheit) {
        this.name = name;
        this.age = age;
        this.wheit = wheit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && wheit == person.wheit && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, wheit);
    }
}
