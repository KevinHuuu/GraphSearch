package edu.berkeley.aep;


import org.junit.Test;
import org.testng.AssertJUnit;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

//import static org.testng.AssertJUnit.assertEquals;
//import static org.testng.AssertJUnit.assertTrue;

public class GraphSearchTest {
    GraphNode<String> a = new GraphNode<String>("a");
    GraphNode<String> b = new GraphNode<String>("b");
    GraphNode<String> c = new GraphNode<String>("c");
    GraphNode<String> d = new GraphNode<String>("d");
    GraphNode<String> e = new GraphNode<String>("e");
    GraphNode<String> f = new GraphNode<String>("f");
    GraphNode<String> g = new GraphNode<String>("g");
    GraphNode<String> h = new GraphNode<String>("h");
    final static int UNREACHABLE = Integer.MAX_VALUE;

//    static {
    public GraphSearchTest () {
        a.addDirectedNeighborList(new ArrayList<GraphNode<String>>(Arrays.asList(f)));
        b.addDirectedNeighborList(new ArrayList<GraphNode<String>>(Arrays.asList(a, c)));
        c.addDirectedNeighborList(new ArrayList<GraphNode<String>>(Arrays.asList(d, e)));
        d.addDirectedNeighborList(new ArrayList<GraphNode<String>>(Arrays.asList(e)));
        e.addDirectedNeighborList(new ArrayList<GraphNode<String>>(Arrays.asList(b)));
        f.addDirectedNeighborList(new ArrayList<GraphNode<String>>(Arrays.asList()));
        g.addDirectedNeighborList(new ArrayList<GraphNode<String>>(Arrays.asList()));
        h.addDirectedNeighborList(new ArrayList<GraphNode<String>>(Arrays.asList(b)));
    }

    @Test
    public void oneCanReachItself() {
        GraphNode<String> a = new GraphNode<String>("a");
        GraphSearch graphSearch = new GraphSearch();
        boolean res = graphSearch.canReach(a, a);
        AssertJUnit.assertTrue(res);
    }

    @Test
    public void hCanReachd() {
        GraphSearch graphSearch = new GraphSearch();
//        boolean res = graphSearch.canReach(a, f);
        boolean res = graphSearch.canReach(h, d);
        System.out.print(res);
        AssertJUnit.assertTrue(res);
    }

    @Test
    public void eCanReachh() {
        GraphSearch graphSearch = new GraphSearch();
//        boolean res = graphSearch.canReach(a, f);
        boolean res = graphSearch.canReach(e, h);
        AssertJUnit.assertTrue(!res);
    }

    @Test
    public void bCanReachg() {
        GraphSearch graphSearch = new GraphSearch();
//        boolean res = graphSearch.canReach(a, f);
        boolean res = graphSearch.canReach(b, g);
        AssertJUnit.assertTrue(!res);
    }


    @Test
    public void hCanReachfButfCanNotReachh() {
        GraphSearch graphSearch = new GraphSearch();
//        boolean res = graphSearch.canReach(a, f);
        AssertJUnit.assertTrue(graphSearch.canReach(h, f));
        AssertJUnit.assertTrue(graphSearch.canReach(h, f));
    }

    @Test
    public void hthreeStepsf() {
        GraphSearch graphSearch = new GraphSearch();
//        boolean res = graphSearch.canReach(a, f);

        assertEquals(graphSearch.validSteps(h, f), 3);
    }

    @Test
    public void dMinusOneStepsg() {
        GraphSearch graphSearch = new GraphSearch();
//        boolean res = graphSearch.canReach(a, f);
        System.out.println(graphSearch.validSteps(d, g));
        assertEquals(graphSearch.validSteps(d, g), UNREACHABLE);
    }
    @Test
    public void shortestBtoEequals2() {
        GraphSearch graphSearch = new GraphSearch();
//        boolean res = graphSearch.canReach(a, f);
        assertEquals(graphSearch.shortestSteps(b, e), 2);
    }
    @Test
    public void shortestBtoGunreachable() {
        GraphSearch graphSearch = new GraphSearch();
//        boolean res = graphSearch.canReach(a, f);
        assertEquals(graphSearch.shortestSteps(b, g), UNREACHABLE);
    }
    @Test
    public void shortestCtoB2() {
        GraphSearch graphSearch = new GraphSearch();
//        boolean res = graphSearch.canReach(a, f);
        assertEquals(graphSearch.shortestSteps(c, b), 2);
    }
}
