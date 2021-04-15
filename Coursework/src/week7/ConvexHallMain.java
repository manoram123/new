package week7;
import java.util.Scanner;
public class ConvexHallMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of points: ");
        int n = sc.nextInt();
        Coordinate point[] = new Coordinate[n];
        for (int i = 0; i < n; i++) {
            int x = (int) ((Math.random() * 100) + 1);
            int y = (int) ((Math.random() * 100) + 1);
            point[i] = new Coordinate(x, y);
        }

        GiftWrapping gfw = new GiftWrapping();
        gfw.ConvexHall(point);
    }
}
