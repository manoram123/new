package graph;

public class MainGraphList {
    public static void main(String[] args) {
        AdjGraphList graph = new AdjGraphList();

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(2,4);
        graph.addEdge(3,4);
        graph.printGraph();
        graph.BFS(0);
        System.out.println(" ");
        graph.DepthForSearch(0);

        graph.findShortestPath(0,4);

    }
}
