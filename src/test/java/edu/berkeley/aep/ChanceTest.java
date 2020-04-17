//package edu.berkeley.aep;
//
//import static org.junit.Assert.assertEquals;
//import org.junit.Test;
//
//public class ChanceTest {
//    @Test
//    public void testNotProb() {
//        Chance chance1 = new Chance(0.4);
//        assertEquals(0.6, chance1.NotProb(), 1e-6);
//    }
//
//    @Test
//    public void testAndProb() {
//        Chance chance1 = new Chance(0.3);
//        Chance chance2 = new Chance( 0.4);
//        assertEquals(0.3, chance1.AndProb(chance2), 1e-6);
//        assertEquals(0.58, chance1.OrProb(chance2), 1e-6);
//    }
//}
