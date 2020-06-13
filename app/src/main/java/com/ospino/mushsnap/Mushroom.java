package com.ospino.mushsnap;

import java.io.Serializable;


/**
 * Mushroom: Prediction results item.
 */
public class Mushroom implements Serializable, Comparable<Mushroom> {

    private String type;
    private String probability;

    /**
     * Constructor
     */
    public Mushroom() { }

    public void setType(String type) {
        this.type = type;
    }
    public void setProbability(String probability) {
        this.probability = probability;
    }

    public String getType() { return type; }
    public String getProbability() {
        return probability;
    }

    /**
     * Compare results
     * @param s
     * @return
     */
    @Override
    public int compareTo(Mushroom s) {
        return Float.valueOf(this.getProbability()).compareTo(Float.valueOf(s.getProbability()));
    }
}
