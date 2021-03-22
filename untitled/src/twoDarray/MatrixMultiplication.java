package twoDarray;
public class MatrixMultiplication  {
    public static void main(String[] args) {
        int matA[][]= {{1,2,3}, {4,5,6}};
        int matB[][]= {{1,2}, {3,4}, {5,6}};


        int rows= matA.length;
        int columns= matB[0].length;

        int commonIndex= matB.length; //or matA[0].length

        int matMultiple[][]= new int[rows][columns];

        //calculations for matrix multiplications

        for(int i=0; i<rows;i++){
            for(int j=0; j<columns; j++){
                for(int k=0; k<commonIndex;k++){
                    matMultiple[i][j]+= matA[i][k]*matB[k][j];
                }
            }
        }

        for(int row[]: matMultiple){
            for(int col: row){
                System.out.print(col+" ");
            }
            System.out.println(" ");
        }
    }
}
