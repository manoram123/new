package twoDarray;
import java.util.Scanner;
public class Two {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number od columns: ");
        int columns = sc.nextInt();
        int firstTable[][] = new int[rows][columns];
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns;j++){
                System.out.print("Enter Data: ");
                firstTable[i][j] = sc.nextInt();
            }
        }
        //display using for loop
        for(int a=0;a<rows;a++){
            for(int b=0;b<columns;b++){
                System.out.print(firstTable[a][b]+" ");
            }
            System.out.println("");
        }
        System.out.println("-----------------");
        //display using for each loop
        for(int row[]:firstTable){
            for(int col:row){
                System.out.print(col+" ");
            }
            System.out.println(" ");

        }
    }
}