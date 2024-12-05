package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Graph {
    private Map<Integer, List<Integer>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    // Add an edge to the graph (undirected graph)
    public void addEdge(int u, int v) {
        adjList.putIfAbsent(u, new ArrayList<>());
        adjList.putIfAbsent(v, new ArrayList<>());
        adjList.get(u).add(v);
        adjList.get(v).add(u); // Since the graph is undirected
    }

    // Depth-First Search (DFS) using recursion
    public void dfs(int start) {
        Set<Integer> visited = new HashSet<>();
        dfsRecursive(start, visited);
    }

    // Helper method for DFS recursion
    private void dfsRecursive(int node, Set<Integer> visited) {
        visited.add(node);  // Mark the node as visited
        System.out.print(node + " ");  // Process the node (print it)

        // Explore all adjacent nodes
        for (int neighbor : adjList.getOrDefault(node, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                dfsRecursive(neighbor, visited);
            }
        }
    }

    // Method to perform DFS on the graph and return the traversal order
    public List<Integer> getDFSOrder(int start) {
        Set<Integer> visited = new HashSet<>();
        List<Integer> dfsOrder = new ArrayList<>();
        getDFSOrderRecursive(start, visited, dfsOrder);
        return dfsOrder;
    }

    // Helper method to return DFS order
    private void getDFSOrderRecursive(int node, Set<Integer> visited, List<Integer> dfsOrder) {
        visited.add(node);
        dfsOrder.add(node);

        // Explore all adjacent nodes
        for (int neighbor : adjList.getOrDefault(node, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                getDFSOrderRecursive(neighbor, visited, dfsOrder);
            }
        }
    }
}
