package com.test;

import java.util.List;

/**
 * Created by Z on 5/19/2016.
 */
public class Novice implements Person {
    private final int diffPercentWeight=20;
    private final int diffRepeatCount = 2;
    private String name;
    private double weight;
    private List<Exercise> exercise;

    public Novice(String name, double weight, List<Exercise> exercise) {
        this.name = name;
        this.weight = weight;
        this.exercise = exercise;
    }

    public int getDiffPercentWeight() {
        return diffPercentWeight;
    }

    public int getDiffRepeatCount() {
        return diffRepeatCount;
    }

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

    public List<Exercise> getExercise() {
        return exercise;
    }

    public void setExercise(List<Exercise> exercise) {
        this.exercise = exercise;
    }



    @Override
    public String sayAboutYourSelf() {
        return "Hello my name is " + name + " my weight is " + weight + " kg";
    }
}
