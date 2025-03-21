package GraphAssignements;

import java.util.Scanner;

public class GraphTwoTest {
    public static void main(String[] args) {
        GraphTwo tester = new GraphTwo();
        Scanner input = new Scanner(System.in);
        //int result = pickVertex;

        System.out.println("This simple program has you simply build your graph by inputing the vertices and edges yourself.");
        System.out.println("Enter 6 vertices:");
        //create vertices to work with.
         for(int i = 1; i <= 6; i++ ){
            int pickVertex = input.nextInt();
            tester.addVertex(pickVertex);
        }

        System.out.println("Enter 6 sets of sources and destinations out of your vertices to create your edges: ");
        for(int i = 1; i <= 6; i++){
           int pickSource = input.nextInt();
           int pickDestination = input.nextInt();
           tester.addEdge(pickSource, pickDestination);
           System.out.println("Edge added (source) -> (destination)");
           System.out.println();
        }

        tester.printGraph();

        System.out.println("Enter a startingVertex for the traversals: ");
        int pickVertex = input.nextInt();
        tester.bfs(pickVertex);
        tester.dfs(pickVertex);


        input.close();
    }
}
