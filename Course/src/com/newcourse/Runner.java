package com.newcourse;


import javax.rmi.CORBA.Util;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Z on 5/22/2016.
 */
public class Runner {
    public static void main(String[] args) {
        FileWriter fw;
        Person pers1 = new Person("Alex",82.5,WhatDoYouWantToDo.GROW_THIN,PersonLevelOfTraining.BEGINNER);
        Person pers2 = new Person("Bob",101.5,WhatDoYouWantToDo.PUMP_UP,PersonLevelOfTraining.EXPERT);
        /*if(checkIfExcist(pers1.getName())) {
            loadData(pers1.getName());
        }else{
            calculateExercise(pers1);
        }*/

        addExercise(pers1);
        addExercise(pers2);
        writePersonInfo(pers1);
        writePersonInfo(pers2);




    }

    private static void writePersonInfo(Person pers1) {
        FileWriter fw;
        fw = Utils.createFile(pers1.getName());
        Utils.writeFile(fw,"Name:" + pers1.getName());
        Utils.writeFile(fw,"Weight:" + pers1.getWeight());
        Utils.writeFile(fw,"WhatToDo:" + pers1.getWhatToDo());
        Utils.writeFile(fw,"LevelOfTraining:" + pers1.getLevelOfTraining());
        Utils.writeFile(fw,"DiffPercentWeight:" + pers1.getDiffPercentWeight());
        Utils.writeFile(fw,"DiffRepeatCount:" + pers1.getDiffRepeatCount());
        for (Exercise ex : pers1.exerciseList) {
            Utils.writeFile(fw,ex.exerciseName + " " + ex.exerciseType + " " + ex.defaultRepeat + " " + ex.defaultPercent);
        }
    }
private static void addExercise(Person pers1){
    List<Exercise> result = new ArrayList<>();
    result.add(new Exercise(ExercisesList.ARM,"arm"));
    result.add(new Exercise(ExercisesList.BODY,"body"));
    result.add(new Exercise(ExercisesList.LEGS,"legs"));
    pers1.exerciseList=result;
}
    private static void calculateExercise(Person pers1) {

    }

    private static void loadData(String name) {

    }

    private static boolean checkIfExcist(String name) {
        return Utils.checkName(name);
    }
}
