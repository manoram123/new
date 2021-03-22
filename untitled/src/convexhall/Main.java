package convexhall;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of points: ");
        int n = sc.nextInt();
        Coordinate point[] = new Coordinate[n];

//        point[0] = new Coordinate(0,0);
//        point[1] = new Coordinate(1,2);
//        point[2] = new Coordinate(3,2);
//        point[3] = new Coordinate(2,3);
//        point[4] = new Coordinate(4,0);
//        point[5] = new Coordinate(5,5);
//        point[6] = new Coordinate(2,2);
//        point[7] = new Coordinate(2,4);


//        for(int i =0; i<point.length;i++){
//            System.out.println("Enter Coordinates: ");
//            int x = sc.nextInt();
//            System.out.print(",");
//            int y = sc.nextInt();
//
//            point[i] = new Coordinate(x,y);
//        }

        for (int i = 0; i < n; i++) {
            int x = (int) ((Math.random() * 100) + 1);
            int y = (int) ((Math.random() * 100) + 1);
            point[i] = new Coordinate(x, y);
        }

        GiftWrapping gfw = new GiftWrapping();
        gfw.ConvexHall(point);
    }
}
