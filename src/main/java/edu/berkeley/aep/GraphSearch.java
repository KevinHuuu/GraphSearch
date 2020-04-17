package edu.berkeley.aep;

import java.util.*;

public class GraphSearch {
    public final static int UNREACHABLE = Integer.MAX_VALUE;
    public int DFS(GraphNode<String> root, GraphNode<String> target) {
        if (root == null) {
            return UNREACHABLE;
        }
        
        if (root == target) {
            root.setVisited(false); // set visited to false after the DFS search
            return 0;
        }
        int crtSteps = UNREACHABLE;
        root.setVisited(true);
        for (GraphNode<String> node: root.getDirectedNeighborList()) {
            if (!node.isVisited()) {
                int childResult = DFS(node, target);
                if (childResult != UNREACHABLE) {
                    crtSteps = childResult + 1;
                }
            }
        }
        root.setVisited(false); // set visited to false after the DFS search

        return crtSteps;
    }
    public boolean canReach(GraphNode A, GraphNode B) {
        int res = DFS(A, B);
        if (res == UNREACHABLE) {
            return false;
        } else {
            return true;

        }
    }

    public int BFS(GraphNode<String> root, GraphNode<String> target) {
        if (root == target) {return 0;}
        LinkedList<GraphNode> queue = new LinkedList<>();
        LinkedList<Integer> hopsQueue = new LinkedList<Integer>();
        int distance = 0;
        queue.add(root);
        hopsQueue.add(0);
        root.setVisited(true);
        while(!queue.isEmpty()) {
            GraphNode<String> crtCity = queue.poll();
            int crtHops = hopsQueue.poll();
            if (crtCity == target) {
                return crtHops;
            }
            for (GraphNode<String> node: crtCity.getDirectedNeighborList()) {
                if (!node.isVisited()) {
                    queue.add(node);
                    hopsQueue.add(crtHops + 1);
                }
            }
        }
        return UNREACHABLE;
    }

    public int validSteps(GraphNode A, GraphNode B) {
        return DFS(A, B);
    }
    public int shortestSteps(GraphNode A, GraphNode B) { return BFS(A, B);}
}
