package com.course;


import java.util.List;

/**
 * Created by Z on 5/18/2016.
 */
public class Novice extends Person implements Persons {
    private List<Exercise> exercise;
    public Novice(String name, double weight) {
        super(name, weight);
    }

    public List<Exercise> getExercise() {
        return exercise;
    }

    public void setExercise(List<Exercise> exercise) {
        this.exercise = exercise;
    }

    public String getInfo() {
        return "My name is " + super.getName() + " my weight is " + super.getWeight();
    }
}
