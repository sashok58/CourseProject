package com.course;

/**
 * Created by Z on 5/18/2016.
 */
public interface Exercises {
    String getInfo();

    String getInfoAboutExercise(String exerciseType, int diffRepeatCount, double diffPercentWeight, double weight);

    int getRepeatCount(int diffRepeatCount, String exerciseType);

    double getExerciseWeight(double diffPercentWeight, String exerciseType, double weight);
}
