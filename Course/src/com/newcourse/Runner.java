package com.newcourse;


import javax.rmi.CORBA.Util;
import java.io.FileWriter;

/**
 * Created by Z on 5/22/2016.
 */
public class Runner {
    public static void main(String[] args) {
        FileWriter fw;
        Person pers1 = new Person("Alex",82.5,WhatDoYouWantToDo.GROW_THIN,PersonLevelOfTraining.BEGINNER);
        /*if(checkIfExcist(pers1.getName())) {
            loadData(pers1.getName());
        }else{
            calculateExercise(pers1);
        }*/
        fw =Utils.createFile();
        Utils.writeFile(fw,"Test");

    }

    private static void calculateExercise(Person pers1) {

    }

    private static void loadData(String name) {

    }

    private static boolean checkIfExcist(String name) {
        return Utils.checkName(name);
    }
}
