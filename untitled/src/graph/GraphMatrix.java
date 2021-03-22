package graph;

import java.util.Arrays;

public class GraphMatrix {

    int size = 4;
    int[][] matrix = new int[size][size];

    public void addEdge(int source, int destination){
        matrix[source][destination] = 1;
        matrix[destination][source] = 1;
    }


    public void printMatrix(){
        for(int row[]:matrix){
            for(int col:row) {
                System.out.print(col+"  ");
            }
            System.out.println("");
        }
    }

    public void printGraph(){
        System.out.println("Printing the graph!!!");
        for(int i=0; i<size; i++){
            System.out.print(i +" is connected to:  ");
            for(int j=0; j<size; j++){
                if(matrix[i][j]==1) {
                    System.out.print(j+"   ");
                }
            }
            System.out.println(" ");
        }


    }
}
