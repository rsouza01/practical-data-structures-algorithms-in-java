package com.rsouza01.google.alg.dijkstra;

import java.util.Map.Entry;

public class Dijkstra {

    public static int calculateShortestPathFromSourceToDestination(Graph graph, Node source, Node destination) {

        source.setDistance(0);
        source.setSettled(true);

        for (Node currentNode : graph.getNodes()) {

            if(currentNode == destination) break;
        
            System.out.println("Current node: " + currentNode.getName());

            Integer smallerEdgeDistance = Integer.MAX_VALUE;

            Node nodeToClose = null;

            for (Entry <Node, Integer> adjacencyPair:  currentNode.getAdjacentNodes().entrySet()) {

                Node adjacentNode = adjacencyPair.getKey();
                Integer edgeWeight = adjacencyPair.getValue();


                relaxEdge(currentNode, adjacentNode, edgeWeight);

                if(adjacentNode.getDistance() < smallerEdgeDistance) {
                    smallerEdgeDistance = adjacentNode.getDistance();
                    nodeToClose = adjacentNode;
                }

                System.out.println("Current edge: " + currentNode.getName() + "-> " + adjacentNode.getName() + "(" + adjacentNode.getDistance() +")");
    
            }
            nodeToClose.setSettled(true);
            System.out.println("[Settled Node : " + nodeToClose.getName() + "]");
        }



        return 0;
    }

    public static void relaxEdge(Node source, Node node, Integer edgeWeight) {
        if(source.getDistance() + edgeWeight < node.getDistance()) {
            node.setDistance(source.getDistance() + edgeWeight);
        }
    }

}