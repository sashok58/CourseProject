package com.test;

import java.util.List;

/**
 * Created by Z on 5/19/2016.
 */
public class Professional implements Person {
    private final int diffPercentWeight=0;
    private final int diffRepeatCount = 0;
    private String name;
    private double weight;
    private List<Exercise> exercise;

    @Override
    public int getDiffPercentWeight() {
        return diffPercentWeight;
    }

    @Override
    public int getDiffRepeatCount() {
        return diffRepeatCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
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

    public Professional(String name, double weight, List<Exercise> exercise) {
        this.name = name;
        this.weight = weight;
        this.exercise = exercise;
    }

    @Override
    public String sayAboutYourSelf() {
        return "Hello my name is " + name + " my weight is " + weight + " kg";
    }






}
