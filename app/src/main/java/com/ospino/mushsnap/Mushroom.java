package com.ospino.mushsnap;

import java.io.Serializable;


public class Mushroom implements Serializable, Comparable<Mushroom> {

    private String type;
    private String probability;

    public void setType(String type) {
        this.type = type;
    }

    public void setProbability(String probability) {
        this.probability = probability;
    }

    public String getType() {
        return type;
    }

    public String getProbability() {
        return probability;
    }

    public Mushroom() {
        this.type = type;
        this.probability = probability;
    }

    @Override
    public int compareTo(Mushroom s) {
        return Float.valueOf(this.getProbability()).compareTo(Float.valueOf(s.getProbability()));
    }
}
