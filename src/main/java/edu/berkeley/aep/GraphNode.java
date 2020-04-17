package edu.berkeley.aep;

import java.util.ArrayList;
import java.util.List;

public class GraphNode<T> {
    T data;
    private List<GraphNode<T>> directedNeighborList;
    private boolean visited;
    public GraphNode(T data){
        this.data = data;
        directedNeighborList = new ArrayList<GraphNode<T>>();
        visited = false;
    }
    public void addDirectedNeighborList(List<GraphNode<T>> directedNeighborList){
        this.directedNeighborList = directedNeighborList;
    }

    public List<GraphNode<T>> getDirectedNeighborList() {
        return this.directedNeighborList;
    }
    public void setVisited(boolean isVisited){
        this.visited = isVisited;
    }

    public boolean isVisited() {
        return this.visited;
    }

}
