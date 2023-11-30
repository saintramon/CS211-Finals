/**
 * JASMIN, Ramon Emmiel P.
 * 30 November 2023
 */

import java.util.*;
import java.io.*;

/**
 * The class Person holds the name and the age of an individual
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "("+name+","+age+")";
    }

    @Override
    public boolean equals(Object obj) {
        return toString().equals(((Person) obj).toString());
    }

    public int compareTo(Person another){
        return toString().compareTo(another.toString());
    }
}
