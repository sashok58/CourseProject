package com.com.vitya;

/**
 * Created by Z on 5/24/2016.
 */
public class Person {
    String name;
    double weight;
    double weightMod;

    int repeatMod;

    double resultWeight;
    int resultRepeat;





    /*public Person(String name, double weight, Focus focus, Expiriense expiriense) {
        this.name = name;
        this.weight = weight;
        this.weightMod = focus.getWeightModFocus() + expiriense.getWeightModExpiriense();

        this.repeatMod = focus.getRepeatModFocus()+ expiriense.getRepeatModExpiriense();

        for (Exercises ex : Exercises.values())
//this.resultRepeat = repeatMod+ex.getRepeatModExercises();
            this.resultWeight = weight*ex.getWeightModExercises()/100+weight*ex.getWeightModExercises()*weightMod/100/100;

        System.out.print(resultWeight+"\n");
    }*/
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeightMod() {
        return weightMod;
    }

    public void setWeightMod(double weightMod) {
        this.weightMod = weightMod;
    }

    public int getRepeatMod() {
        return repeatMod;
    }

    public void setRepeatMod(int repeatMod) {
        this.repeatMod = repeatMod;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", weightMod=" + weightMod +
                ", repeatMod=" + repeatMod +

                ", resultWeight=" + resultWeight +
                ", resultRepeat=" + resultRepeat +
                '}'+"\n";
    }
}
