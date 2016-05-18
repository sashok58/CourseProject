package com.course;

import java.util.List;

/**
 * Created by Z on 5/18/2016.
 */
public class Novice extends Person implements Persons {
    protected List<Exercise> exercise;
    public Novice(String name, double weight) {
        super(name, weight);
    }

    public String getInfo(Object object) {
        return null;
    }
}
