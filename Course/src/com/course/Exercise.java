package com.course;

/**
 * Created by Z on 5/18/2016.
 */
public class Exercise implements Exercises{
    String exerciseType;
    String exerciseName;

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
}
