package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Graph {
    private int numVertices;
    private List<List<Edge>> adjList;

    // Inner class to represent an edge
    class Edge implements Comparable<Edge> {
        int vertex;
        int weight;

        Edge(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge other) {
            return Integer.compare(this.weight, other.weight);
        }
    }

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjList = new ArrayList<>(numVertices);
        for (int i = 0; i < numVertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    // Add an edge to the graph
    public void addEdge(int src, int dest, int weight) {
        adjList.get(src).add(new Edge(dest, weight));
        adjList.get(dest).add(new Edge(src, weight));  // Undirected graph
    }

    // Prim's algorithm to find the MST
    public int primMST(int start) {
        // Store the total weight of the MST
        int totalCost = 0;
        // Min-heap to store edges (vertex, weight)
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        // To track whether a vertex is in the MST or not
        boolean[] inMST = new boolean[numVertices];

        // Start with the given node
        pq.add(new Edge(start, 0));

        while (!pq.isEmpty()) {
            // Get the edge with the smallest weight
            Edge edge = pq.poll();
            int u = edge.vertex;

            // Skip if the node is already included in the MST
            if (inMST[u]) {
                continue;
            }

            // Include this node in the MST and add its cost
            inMST[u] = true;
            totalCost += edge.weight;

            // Explore the neighbors of the current node
            for (Edge neighbor : adjList.get(u)) {
                if (!inMST[neighbor.vertex]) {
                    pq.add(neighbor);
                }
            }
        }

        return totalCost;
    }

    public void printGraph() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print(i + ": ");
            for (Edge edge : adjList.get(i)) {
                System.out.print("(" + edge.vertex + ", " + edge.weight + ") ");
            }
            System.out.println();
        }
    }
}
