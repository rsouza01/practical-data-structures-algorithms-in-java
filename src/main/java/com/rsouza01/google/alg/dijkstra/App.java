package com.rsouza01.google.alg.dijkstra;

public class App {
	
	public static void main (String[] args) {

		Node nodeV0 = new Node("V0");
		Node nodeV1 = new Node("V1");
		Node nodeV2 = new Node("V2");
		Node nodeV3 = new Node("V3");
		Node nodeV4 = new Node("V4");
		Node nodeV5 = new Node("V5");
		
		nodeV0.addDestination(nodeV1, 10);
		nodeV0.addDestination(nodeV2, 5);
		
		nodeV1.addDestination(nodeV3, 1);
		
		nodeV2.addDestination(nodeV1, 3);
		nodeV2.addDestination(nodeV3, 8);
		
		nodeV3.addDestination(nodeV4, 4);
		nodeV3.addDestination(nodeV5, 4);

		nodeV4.addDestination(nodeV5, 6);

		Graph graph = new Graph();
		
		graph.addNode(nodeV0);
		graph.addNode(nodeV1);
		graph.addNode(nodeV2);
		graph.addNode(nodeV3);
		graph.addNode(nodeV4);
		graph.addNode(nodeV5);

		
		int minDistance = Dijkstra.calculateShortestPathFromSourceToDestination(graph, nodeV0, nodeV5);

		System.out.println("minDistance = " + minDistance);

	}
}
