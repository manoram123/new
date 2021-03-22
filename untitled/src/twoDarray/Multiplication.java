package twoDarray;
import javax.imageio.ImageTranscoder;
import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of first Matrix: ");
        int rows = sc.nextInt();
        System.out.println("x");
        int columns = sc.nextInt();
        
        int matA[][] = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            int a = 1;
            System.out.println("Row:");
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter columns: ");
                matA[i][j] = sc.nextInt();
            }
        }

        for (int row[] : matA) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println(" ");
        }
    }
}
