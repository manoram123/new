package graph;

public class Graph {
    int size = 4;
    int matrix[][] = new int[size][size];

    void addEdge(int source, int destination){
        matrix[source][destination] = 1;
        matrix[destination][source] = 1;
    }
    void printGraph(){
        for(int i=0; i<size;i++){
            for(int j=0; j<size; j++){
                System.out.println(matrix[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph();
        g.addEdge(1,0);
        g.addEdge(0,1);
        g.printGraph();
    }
}


