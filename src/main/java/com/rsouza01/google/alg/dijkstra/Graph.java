package com.rsouza01.google.alg.dijkstra;

import java.util.LinkedList;
import java.util.List;

public class Graph {

    private List<Node> nodes = new LinkedList<>();
    
    public void addNode(Node nodeA) {
        nodes.add(nodeA);
    }

    public List<Node> getNodes() {
        return nodes;
    }
}
