package com.course;


import java.util.ArrayList;
import java.util.List;

public class PersonRunner {
    public static void main(String[] args) {
        Novice novice = new Novice("Alex", 100.);
        List<Exercise> noviceExerciseList = new ArrayList<>();
        noviceExerciseList.add(new Exercise("Arm","Arm exercise"));
        noviceExerciseList.add(new Exercise("Body","Body exercise"));
        noviceExerciseList.add(new Exercise("Leg","Leg exercise"));
        novice.setExercise(noviceExerciseList);
        for (Exercise exercise : noviceExerciseList) {
            System.out.println(exercise.getInfo());
        }

        System.out.println("novice = " + novice);
        System.out.println(novice.getInfo());


        Professional professional = new Professional("Bob", 80.);
       /* professional.exercise.add(new Exercise("Arm","Arm exercise"));
        professional.exercise.add(new Exercise("Leg","Leg exercise"));
        professional.exercise.add(new Exercise("Body","Body exercise"));*/

        Expert expert = new Expert("John", 120.);
        /*expert.exercise.add(new Exercise("Arm","Arm exercise"));
        expert.exercise.add(new Exercise("Leg","Leg exercise"));
        expert.exercise.add(new Exercise("Body","Body exercise"));*/

    }
}
