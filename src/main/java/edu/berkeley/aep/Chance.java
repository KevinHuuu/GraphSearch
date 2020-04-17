package edu.berkeley.aep;

public class Chance {
    private static final int CERTAINTY = 1;
    private double probability;

    public Chance(double probability) {
        this.probability = probability;
    }
    public double NotProb() {
        return CERTAINTY - this.probability;
    }

    public double AndProb(Chance chance1) {
        return this.probability * chance1.probability;
    }

    public double OrProb(Chance chance1) {
        return this.probability + chance1.probability - this.probability * chance1.probability;
    }
}
