package edu.berkeley.aep;

public class ArithmeticQuantity extends ScaledQuantity {

    //Constructor function
    public ArithmeticQuantity(int size, Unit units) {
        super(size, units);
    }

    public ArithmeticQuantity add (ArithmeticQuantity other) {
        return new ArithmeticQuantity(size + other.convertTo(units), units);
    }
}