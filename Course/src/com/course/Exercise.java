package com.course;

/**
 * Created by Z on 5/18/2016.
 */
public class Exercise implements Exercises{
    String exerciseType;
    String exerciseName;

    protected final int defaultRepeatLegs = 6;
    protected final int defaultRepeatArm = 10;
    protected final int defaultRepeatBody = 8;

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

    @Override
    public String getInfoAboutExercise() {
        return null;
    }

    @Override
    public int getRepeatCount(int diffRepeatCount,String exerciseType) {
        int result =0;
        switch (exerciseType){
            case "Leg": result= defaultRepeatLegs -diffRepeatCount;
            break;
            case  "Arm": result= defaultRepeatArm - diffRepeatCount;
            break;
            case "Body": result=defaultRepeatBody - diffRepeatCount;
            break;
        }
return result;
    }

    @Override
    public double getExerciseWeight() {
        return 0;
    }

}
