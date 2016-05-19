package com.test;

/**
 * Created by Z on 5/19/2016.
 */
public class Arm implements Exercise {
    protected final int defaultRepeatArm = 10;
    protected final int defaultArmPercent = 25;
    protected int diffPercentWeight;
    protected int diffRepeatCount;
    protected double weight;
    protected String exerciseType="Arm";

    public String getExerciseType() {
        return exerciseType;
    }

    public int getDefaultRepeatArm() {
        return defaultRepeatArm;
    }

    public int getDefaultArmPercent() {
        return defaultArmPercent;
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

    public Arm(int diffPercentWeight, int diffRepeatCount, double weight) {
        this.diffPercentWeight = diffPercentWeight;
        this.diffRepeatCount = diffRepeatCount;
        this.weight = weight;
    }


    @Override
    public String getInfoAboutExercise(int diffRepeatCount, int diffPercentWeight, double weight) {
        return "exercise " + getExerciseType() + " you must doing " + getRepeatCount(diffRepeatCount) + " times with weight " +
                getExerciseWeight(diffPercentWeight, weight);
    }

    private int getRepeatCount(int diffRepeatCount) {
        return getDefaultRepeatArm() - diffRepeatCount;
    }

    private double getExerciseWeight(int diffPercentWeight, double weight) {
        return getDefaultWeight(weight) - (getDefaultWeight(weight) / 100 * diffPercentWeight);
    }

    private double getDefaultWeight(double weight) {
        return (weight / 100) * getDefaultArmPercent();
    }
}
