package com.rsouza01.google.alg.dijkstra;

import java.util.HashMap;
import java.util.Map;

public class Node {

    private Integer distance = Integer.MAX_VALUE;

    private String name = "";

    private boolean settled = false;
    
    private Map<Node, Integer> adjacentNodes = new HashMap<>();

    private Node predecessor = null;

    public Map<Node, Integer> getAdjacentNodes() {
        return adjacentNodes;
    }

    /**
     * @return the predecessor
     */
    public Node getPredecessor() {
        return predecessor;
    }

    /**
     * @param predecessor the predecessor to set
     */
    public void setPredecessor(Node predecessor) {
        this.predecessor = predecessor;
    }

    /**
     * @return the settled
     */
    public boolean isSettled() {
        return settled;
    }

    /**
     * @param settled the settled to set
     */
    public void setSettled(boolean settled) {
        this.settled = settled;
    }

    public Node(String name) {
        this.setName(name);
    }

    /**
     * @return the distance
     */
    public Integer getDistance() {
        return distance;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }


	public void addDestination(Node destination, int distance) {
        adjacentNodes.put(destination, distance);
    }


}
