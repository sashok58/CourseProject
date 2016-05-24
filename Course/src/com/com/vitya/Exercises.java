package com.com.vitya;

/**
 * Created by Z on 5/24/2016.
 */
public enum Exercises {
    ARM(25, 12),
    LEGS(120, 8),
    BODY(80, 10);
    private int weightModExercises;
    private int repeatModExercises;


    Exercises(int weightModExercises, int repeatModExercises) {
        this.weightModExercises = weightModExercises;
        this.repeatModExercises = repeatModExercises;
    }

    public int getWeightModExercises() {
        return weightModExercises;
    }

    public void setWeightModExercises(int weightModExercises) {
        this.weightModExercises = weightModExercises;
    }

    public int getRepeatModExercises() {
        return repeatModExercises;
    }

    public void setRepeatModExercises(int repeatModExercises) {
        this.repeatModExercises = repeatModExercises;
    }
}
