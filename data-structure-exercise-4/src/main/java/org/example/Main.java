package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(3, 6);

        System.out.println("DFS Traversal starting from node 0:");
        graph.dfs(0);

        System.out.println("\nDFS Order starting from node 0:");
        List<Integer> dfsOrder = graph.getDFSOrder(3);
        System.out.println(dfsOrder);
    }
}