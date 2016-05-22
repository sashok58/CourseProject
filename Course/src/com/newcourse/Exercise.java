package com.newcourse;

/**
 * Created by Z on 5/22/2016.
 */
public class Exercise {
    protected int defaultRepeat;
    protected int defaultPercent;
    protected ExercisesList exerciseType;
    protected String exerciseName;

    public Exercise(ExercisesList exerciseType, String exerciseName) {
        this.exerciseType = exerciseType;
        this.exerciseName = exerciseName;
        switch (exerciseType) {
            case LEGS:
                defaultPercent = 100;
                defaultRepeat = 6;
                break;
            case ARM:
                defaultPercent = 25;
                defaultRepeat = 10;
                break;
            case BODY:
                defaultPercent = 80;
                defaultRepeat = 8;
                break;
        }
    }
}