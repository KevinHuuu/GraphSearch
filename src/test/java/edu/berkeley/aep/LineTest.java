package edu.berkeley.aep;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertEquals;
public class LineTest {

    @Test
    public void TestTheFirstGroupShouldBeServed(){
        Line line = new Line();
        Group groupA = new Group("Ao", 3);
        line.addNewGroup(groupA);
        assertEquals(line.numOfGroups(), 1);
    }

    @Test
    public void inputA2B3C2D1ShouldReturn2(){
        Group groupA = new Group("A",2);
        Group groupB = new Group("B",3);
        Group groupC = new Group("C",2);
        Group groupD = new Group("D",1);
        Line line = new Line();
        line.addNewGroup(groupA);
        line.addNewGroup(groupB);
        line.addNewGroup(groupC);
        line.addNewGroup(groupD);
        assertEquals(2,line.numOfGroups());
    }
}
