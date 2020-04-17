package edu.berkeley.aep;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SquareTest {
    @Test
    public void testSquareArea(){
        Square s1 = new Square(4);
        assertEquals(16, s1.getArea(), 1e-6);
    }

    @Test
    public void voidSquarePremiter(){
        Square s1 = new Square(4);
        assertEquals(16, s1.getPerimeter(), 1e-6);
    }
}

