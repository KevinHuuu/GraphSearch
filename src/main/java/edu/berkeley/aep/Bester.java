package edu.berkeley.aep;
public class Bester {
    private final Bestable[] quantities;

    public Bester(Bestable... quantities) {
        this.quantities = quantities;
    }
    public Bestable best() {
        var champion = quantities[0];
        for (var challenger : quantities) {
            if (challenger.betterThan(champion)) {
                champion = challenger;
            }
        }
        return champion;
    }
}
