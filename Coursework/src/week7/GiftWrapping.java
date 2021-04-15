package week7;

import java.security.cert.CertPathParameters;
import java.util.Stack;

class Coordinate{
    int x;
    int y;
    Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class GiftWrapping {

    public int direction(Coordinate p, Coordinate q, Coordinate r){
        int area =  (q.x-p.x)*(r.y-q.y) - (q.y-p.y)*(r.x-q.x);
        return area;
    }

    public void ConvexHall(Coordinate point[]){
        Stack<Coordinate> stack = new Stack<Coordinate>();
        int left = 0;
        int n = point.length;
        for(int i=1; i<n; i++){
            if(point[i].x<point[left].x){
                left = i;
            }
        }
        int p = left;
        do{
            stack.add(point[p]);
            int q = (p+1)%n;
            for(int r=0; r<n; r++){
                if (direction(point[p], point[q], point[r]) > 0) {
                    q = r;
                }
            }
            p = q;
        }
        while(p!=left);
        stack.add(point[p]);

        //display
        System.out.println("The Coordinates for Convex Hall: ");
        for(Coordinate i: stack){
            System.out.println("("+i.x+","+i.y+")");
        }

    }
}
