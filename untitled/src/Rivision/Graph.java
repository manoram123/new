package Rivision;

public class Graph {
    int size = 5;
    int [][]matrix = new int[size][size];

    public void addEdge(int origin, int destination){
        matrix[origin][destination] = 1;
        matrix[destination][origin] = 1;
    }

    public void displayGraph(){
        for(int row[]:matrix){
            for(int column: row){
                System.out.print(column+"  ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Graph gra = new Graph();
        gra.addEdge(1,2);
        gra.addEdge(1,3);
        gra.addEdge(1,4);
        gra.addEdge(2,4);
        gra.addEdge(3,4);
        gra.displayGraph();

    }

}
