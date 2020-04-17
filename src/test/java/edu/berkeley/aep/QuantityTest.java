package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuantityTest {
    @Test
    public void twelveInchesShouldEqualOneFoot() {
        assertEquals(new ArithmeticQuantity(12, Unit.INCHES), new ArithmeticQuantity(1, Unit.FEET));
    }

    @Test
    public void oneTBSPShouldEqualThreeTSP(){
        assertEquals(
                new ArithmeticQuantity(1, Unit.TBSP),
                new ArithmeticQuantity(3, Unit.TSP)
        );
    }

    @Test
    public void oneOZShouldEqualTwoTBSP(){
        assertEquals(
                new ArithmeticQuantity(1, Unit.OZ),
                new ArithmeticQuantity(2, Unit.TBSP)
        );
    }

    @Test
    public void oneCUPShouldEqualEightOZ(){
        assertEquals(
                new ArithmeticQuantity(1, Unit.CUP),
                new ArithmeticQuantity(8, Unit.OZ)
        );
    }


    @Test(expected = RuntimeException.class)
    public void shouldNotBeAbleToCompareTeaspoonsAndFeet() {
        var oneTbsp = new ArithmeticQuantity(1, Unit.TBSP);
        var threeFeet = new ArithmeticQuantity(3, Unit.FEET);
        assertEquals(oneTbsp, threeFeet);
    }

    //Test the temperature unit 212F = 100C
    @Test
    public void twoHundredAndTwelveFahrenheitShouldEqualOneHundredCelsuis(){
        var twoHundredTwelveFahrenheit = new ScaledQuantity(212, Unit.FAHRENHEIT);
        var oneHundredCelsius = new ScaledQuantity(100, Unit.CELSIUS);
        assertEquals(twoHundredTwelveFahrenheit, oneHundredCelsius);
    }

    //Test the temperature unit 32F = 0C
    @Test
    public void thirtyTwoFahrenheitShouldEqualZeroCelsius(){
        var thirtyTwoFahrenheit = new ScaledQuantity(32, Unit.FAHRENHEIT);
        var zeroCelsius = new ScaledQuantity(0, Unit.CELSIUS);
        assertEquals(zeroCelsius, thirtyTwoFahrenheit);
    }

    @Test
    public void TwoTSPShouldBeLargerThanOneTSP() {
        var TwoTSP = new ScaledQuantity(2, Unit.TSP);
        var OneTSP = new ScaledQuantity(1, Unit.TSP);
        assertEquals(true, TwoTSP.betterThan(OneTSP));
    }

//    @Test
//    public void FindTheLargestQuantity() {
//        List<ScaledQuantity> alist = new ArrayList<>();
//        alist.add(new ScaledQuantity(3,Unit.TSP));
//        alist.add(new ScaledQuantity(2,Unit.TSP));
//        alist.add(new ScaledQuantity(1,Unit.TSP));
//        alist.add(new ScaledQuantity(21,Unit.TSP));
//        alist.add(new ScaledQuantity(2,Unit.TSP));
////        Collections.sort(alist);
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }
//        assertEquals(true, alist[0]);
//
//    }
}
