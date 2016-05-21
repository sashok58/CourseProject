package com.newcourse;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Z on 5/22/2016.
 */
public class Person {
    protected int diffPercentWeight;
    protected int diffRepeatCount;
    protected String name;
    protected double weight;
    protected List<Exercise> exerciseList;
    protected WhatDoYouWantToDo whatToDo;
    protected PersonLevelOfTraining levelOfTraining;

    public Person(String name, double weight, WhatDoYouWantToDo whatToDo, PersonLevelOfTraining levelOfTraining) {
        this.name = name;
        this.weight = weight;
        this.whatToDo = whatToDo;
        this.levelOfTraining = levelOfTraining;
        this.exerciseList=new ArrayList<>();
        switch (levelOfTraining){
            case BEGINNER: diffPercentWeight=-25;
                diffRepeatCount=-2;
                break;
            case PROFESSIONAL: diffPercentWeight=0;
                diffRepeatCount=0;
                break;
            case EXPERT: diffPercentWeight=20;
                diffRepeatCount=0;
                break;
        }
    }

    public PersonLevelOfTraining getLevelOfTraining() {
        return levelOfTraining;
    }

    public void setLevelOfTraining(PersonLevelOfTraining levelOfTraining) {
        this.levelOfTraining = levelOfTraining;
    }

    public int getDiffPercentWeight() {
        return diffPercentWeight;
    }

    public void setDiffPercentWeight(int diffPercentWeight) {
        this.diffPercentWeight = diffPercentWeight;
    }

    public int getDiffRepeatCount() {
        return diffRepeatCount;
    }

    public void setDiffRepeatCount(int diffRepeatCount) {
        this.diffRepeatCount = diffRepeatCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public List<Exercise> getExerciseList() {
        return exerciseList;
    }

    public void setExerciseList(List<Exercise> exerciseList) {
        this.exerciseList = exerciseList;
    }

    public WhatDoYouWantToDo getWhatToDo() {
        return whatToDo;
    }

    public void setWhatToDo(WhatDoYouWantToDo whatToDo) {
        this.whatToDo = whatToDo;
    }
}
