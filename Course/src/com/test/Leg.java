package com.test;

/**
 * Created by Z on 5/19/2016.
 */
public class Leg implements Exercise {
    protected final int defaultRepeatLegs = 6;
    protected final int defaultLegPercent = 100;
    protected int diffPercentWeight;
    protected int diffRepeatCount;
    protected double weight;
    protected final String exerciseType = "Leg";

    public String getExerciseType() {
        return exerciseType;
    }

    public Leg(int diffPercentWeight, int diffRepeatCount, double weight) {
        this.diffPercentWeight = diffPercentWeight;
        this.diffRepeatCount = diffRepeatCount;
        this.weight = weight;
    }


    public int getDefaultRepeatLegs() {
        return defaultRepeatLegs;
    }

    public int getDefaultLegPercent() {
        return defaultLegPercent;
    }

    public int getDiffPercentWeight() {
        return diffPercentWeight;
    }

    public void setDiffPercentWeight(int diffPercentWeight) {
        this.diffPercentWeight = diffPercentWeight;
    }

    public int getDiffRepeatCount() {
        return diffRepeatCount;
    }

    public void setDiffRepeatCount(int diffRepeatCount) {
        this.diffRepeatCount = diffRepeatCount;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String getInfoAboutExercise(int diffRepeatCount, int diffPercentWeight, double weight) {
        return "exercise " + getExerciseType() + " you must doing " + getRepeatCount(diffRepeatCount) + " times with weight " +
                getExerciseWeight(diffPercentWeight, weight);
    }

    private double getExerciseWeight(int diffPercentWeight, double weight) {
        return getDefaultWeight(weight) - (getDefaultWeight(weight) / 100 * diffPercentWeight);

    }

    private double getDefaultWeight(double weight) {
        return (weight / 100) * getDefaultLegPercent();
    }

    private int getRepeatCount(int diffRepeatCount) {


        return getDefaultRepeatLegs() - diffRepeatCount;


    }
}
