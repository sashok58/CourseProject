package com.course;

/**
 * Created by Z on 5/18/2016.
 */
public class Exercise implements Exercises {
    String exerciseType;
    String exerciseName;

    protected final int defaultRepeatLegs = 6;
    protected final int defaultRepeatArm = 10;
    protected final int defaultRepeatBody = 8;
    protected final int defaultBodyPercent = 80;
    protected final int defaultArmPercent = 25;
    protected final int defaultLegPercent = 100;


    public Exercise(String exerciseType, String exerciseName) {
        this.exerciseType = exerciseType;
        this.exerciseName = exerciseName;
    }

    public String getExerciseType() {
        return exerciseType;
    }

    public void setExerciseType(String exerciseType) {
        this.exerciseType = exerciseType;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    @Override
    public String getInfo() {
        return "You doing exercise type " + getExerciseType() + " and his name is " + getExerciseName();
    }

    @Override
    public String getInfoAboutExercise(String exerciseType, int diffRepeatCount, double diffPercentWeight, double weight) {
        return "exercise " + getExerciseName() + " you must doing " + getRepeatCount(diffRepeatCount, exerciseType) + " times with weight " +
                getExerciseWeight(diffPercentWeight, exerciseType, weight);
    }


    @Override
    public int getRepeatCount(int diffRepeatCount, String exerciseType) {
        int result = 0;
        switch (exerciseType) {
            case "Leg":
                result = defaultRepeatLegs - diffRepeatCount;
                break;
            case "Arm":
                result = defaultRepeatArm - diffRepeatCount;
                break;
            case "Body":
                result = defaultRepeatBody - diffRepeatCount;
                break;
        }
        return result;
    }

    @Override
    public double getExerciseWeight(double diffPercentWeight, String exerciseType, double weight) {
        double result = 0.;
        switch (exerciseType) {
            case "Leg":
                result = getDefaultWeight(weight, defaultLegPercent) - (getDefaultWeight(weight, defaultLegPercent) / 100 * diffPercentWeight);
                break;
            case "Arm":
                result = getDefaultWeight(weight, defaultArmPercent) - (getDefaultWeight(weight, defaultArmPercent) / 100 * diffPercentWeight);
                break;
            case "Body":
                result = getDefaultWeight(weight, defaultBodyPercent) - (getDefaultWeight(weight, defaultBodyPercent) / 100 * diffPercentWeight);
                break;
        }
        return result;
    }

    private double getDefaultWeight(double weight, int defaultPercent) {
        return (weight / 100) * defaultPercent;
    }
}
