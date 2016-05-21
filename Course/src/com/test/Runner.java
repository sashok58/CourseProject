package com.test;

import java.util.ArrayList;
import java.util.List;


public class Runner {
    public static void main(String[] args) {
        List<Exercise> exerciseNovice = new ArrayList<>();
        Person novice = new Novice("Novice", 100., exerciseNovice);
        System.out.println(novice.sayAboutYourSelf());
        exerciseNovice.add(new Leg(novice.getDiffPercentWeight(), novice.getDiffRepeatCount(), novice.getWeight()));
        exerciseNovice.add(new Arm(novice.getDiffPercentWeight(),novice.getDiffRepeatCount(),novice.getWeight()));
        exerciseNovice.add(new Body(novice.getDiffPercentWeight(),novice.getDiffRepeatCount(),novice.getWeight()));
        for (Exercise exercises : exerciseNovice) {
            System.out.println(exercises.getInfoAboutExercise(novice.getDiffRepeatCount(), novice.getDiffPercentWeight(), novice.getWeight()));
        }


        List<Exercise> exerciseProf = new ArrayList<>();
        Person profi = new Professional("Profesional", 150., exerciseProf);
        System.out.println(profi.sayAboutYourSelf());
        exerciseProf.add(new Leg(profi.getDiffPercentWeight(), profi.getDiffRepeatCount(), profi.getWeight()));
        exerciseProf.add(new Arm(profi.getDiffPercentWeight(),profi.getDiffRepeatCount(),profi.getWeight()));
        exerciseProf.add(new Body(profi.getDiffPercentWeight(),profi.getDiffRepeatCount(),profi.getWeight()));
        for (Exercise exercises : exerciseProf) {
            System.out.println(exercises.getInfoAboutExercise(profi.getDiffRepeatCount(), profi.getDiffPercentWeight(), profi.getWeight()));
        }

        List<Exercise> exerciseGod = new ArrayList<>();
        Person god = new Expert("God", 200., exerciseGod);
        System.out.println(god.sayAboutYourSelf());
        exerciseGod.add(new Leg(god.getDiffPercentWeight(), god.getDiffRepeatCount(), god.getWeight()));
        exerciseGod.add(new Arm(god.getDiffPercentWeight(),god.getDiffRepeatCount(),god.getWeight()));
        exerciseGod.add(new Body(god.getDiffPercentWeight(),god.getDiffRepeatCount(),god.getWeight()));
        for (Exercise exercises : exerciseGod) {
            System.out.println(exercises.getInfoAboutExercise(god.getDiffRepeatCount(), god.getDiffPercentWeight(), god.getWeight()));
        }
    }
}
