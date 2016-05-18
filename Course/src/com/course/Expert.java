package com.course;

import java.util.List;

/**
 * Created by Z on 5/18/2016.
 */
public class Expert extends Person implements Persons {
    protected List<Exercise> exercise;

    public Expert(String name, double weight) {
        super(name, weight);

    }

    @Override
    public String getInfo() {
        return null;
    }
}
