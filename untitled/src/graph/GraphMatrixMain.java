package graph;

public class GraphMatrixMain {
    public static void main(String[] args) {
        GraphMatrix n = new GraphMatrix();
        n.addEdge(0,1);
        n.addEdge(0,3);
        n.addEdge(1,2);
        n.addEdge(2,3);
        n.printMatrix();
        n.printGraph();
    }
}
