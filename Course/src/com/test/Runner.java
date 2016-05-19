package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Z on 5/19/2016.
 */
public class Runner {
    public static void main(String[] args) {
        List<Exercise> exercise = new ArrayList<>();
        Person novice = new Novice("Bob",100.,exercise);
        exercise.add(new Leg(novice.getDiffPercentWeight(),novice.getDiffRepeatCount(),novice.getWeight()));




    }
}
