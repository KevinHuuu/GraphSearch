package edu.berkeley.aep;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class transposeUnitTest {
    @Test
    public void testInch2Yard(){
        double inch = 36;
        assertEquals(inch/36, transposeUnit.inch2yard(inch), 1e-5);
    }

    @Test
    public void testInch2Mile(){
        double inch = 63360;
        assertEquals(1.0, transposeUnit.inch2mile(inch), 1e-5);
    }

    @Test
    public void testMile2Inch(){
        double mile = 1;
        assertEquals(63360.0, transposeUnit.mile2inch(mile), 1e-5);
    }

    @Test
    public void testMile2Yard(){
        double mile = 1;
        assertEquals(1760.0, transposeUnit.mile2yard(mile), 1e-5);
    }

    @Test
    public void testYard2Mile(){
        double yard = 1760;
        assertEquals(1.0, transposeUnit.yard2mile(yard), 1e-5);
    }
    @Test
    public void testYard2Inch(){
        double yard = 1;
        assertEquals(36.0, transposeUnit.yard2inch(yard), 1e-5);
    }

    @Test
    public void testInch2Ft(){
        double inch = 12;
        assertEquals(1.0, transposeUnit.inch2ft(inch), 1e-5);
    }

    @Test
    public void testFt2Inch(){
        double ft = 1;
        assertEquals(12.0, transposeUnit.ft2inch(ft), 1e-5);
    }
}
