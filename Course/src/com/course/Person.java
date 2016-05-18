package com.course;

/**
 * Created by Z on 5/18/2016.
 */
public class Person {
    protected String name;
    protected double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Person(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
}
