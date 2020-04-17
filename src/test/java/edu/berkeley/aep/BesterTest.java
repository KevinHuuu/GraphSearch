package edu.berkeley.aep;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BesterTest {
    @Test
    public void FindTheLargestQuantity() {
        List<ScaledQuantity> alist = new ArrayList<>();
        alist.add(new ScaledQuantity(3,Unit.TSP));
        alist.add(new ScaledQuantity(2,Unit.TSP));
        alist.add(new ScaledQuantity(1,Unit.TSP));
        alist.add(new ScaledQuantity(21,Unit.TSP));
        alist.add(new ScaledQuantity(2,Unit.TSP));
//        Collections.sort(alist);
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }
//        assertEquals(true, alist[0]);

    }
}
