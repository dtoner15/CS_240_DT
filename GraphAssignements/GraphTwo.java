package GraphAssignements;

import java.util.*;
// Class to represent a graph
public class GraphTwo {
   private Map<Integer, List<Integer>> adjList; // Adjacency list
   
   // Constructor
   public GraphTwo() {
    adjList = new HashMap<>();
  }
   // Add a vertex to the graph
   public void addVertex(int vertex) {
    adjList.putIfAbsent(vertex, new ArrayList<>());
  }

   // Add an edge between two vertices
   public void addEdge(int source, int destination) {
    adjList.putIfAbsent(source, new ArrayList<>());
    adjList.putIfAbsent(destination, new ArrayList<>());
    adjList.get(source).add(destination);
    adjList.get(destination).add(source); // For undirected graph
  }

   // Print the graph
   public void printGraph() {
    for (Map.Entry<Integer, List<Integer>> entry : adjList.entrySet()) {
    System.out.print("Vertex " + entry.getKey() + ": ");
    for (Integer neighbor : entry.getValue()) {
    System.out.print(neighbor + " ");
   }
    System.out.println();
   }
 }

   // Breadth-First Search (BFS) traversal from a given source
   //using a set instead of a list because a set has a quicker look up time.
   public void bfs(int startVertex) {
    Set<Integer> visited = new HashSet<>();
    Queue<Integer> queue = new LinkedList<>();
    queue.add(startVertex);//Enqueue (add) the starting vertex to the queue
    visited.add(startVertex);//then mark the startingVertex as visited.
    System.out.print("BFS Traversal: ");
    while (!queue.isEmpty()) {
    int currentVertex = queue.poll();//Dequeue (remove) the current vertex out of the queue and process it, meaning more than just printing it possibly.
    System.out.print(currentVertex + " ");
    for (int neighbor : adjList.get(currentVertex)) {//Iterate through the neighbors of the currentVertex.
        if (!visited.contains(neighbor)) {
            queue.add(neighbor);//add the neighbor (vertex) to the queue
            visited.add(neighbor);//mark the neighbor as visited
        }
    }
  }
    System.out.println();//for formatting
 }

   // Depth-First Search (DFS) traversal from a given source
   public void dfs(int startVertex) {
    Set<Integer> visited = new HashSet<>();//just for parameter purposes.
    System.out.print("DFS Traversal: ");
    dfsRecursive(startVertex, visited);//call the helper method
    System.out.println();
  }

   // Helper method for DFS
   private void dfsRecursive(int vertex, Set<Integer> visited) {
    visited.add(vertex);//mark (add) the vertex to visited.
    System.out.print(vertex + " ");
    for (int neighbor : adjList.get(vertex)) {//iterate through the neighbors of the vertex
        if (!visited.contains(neighbor)) {
            dfsRecursive(neighbor, visited);//recursively search through the graph and check if all of the vertices or neighbors are visited
        }
    }
  }
}//end of class 

