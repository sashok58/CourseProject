package com.course;

/**
 * Created by Z on 5/18/2016.
 */
public class PersonRunner {
    public static void main(String[] args) {
Novice novice = new Novice("Alex",100.);
novice.exercise.add(new Exercise("Leg","Leg exercise"));
        novice.exercise.add(new Exercise("Body","Body exercise"));
        novice.exercise.add(new Exercise("Arm","Arm exercise"));

        Professional professional = new Professional("Bob",80.);
        professional.exercise.add(new Exercise("Arm","Arm exercise"));
        professional.exercise.add(new Exercise("Leg","Leg exercise"));
        professional.exercise.add(new Exercise("Body","Body exercise"));

        Expert expert = new Expert("John",120.);
        expert.exercise.add(new Exercise("Arm","Arm exercise"));
        expert.exercise.add(new Exercise("Leg","Leg exercise"));
        expert.exercise.add(new Exercise("Body","Body exercise"));

    }
}
