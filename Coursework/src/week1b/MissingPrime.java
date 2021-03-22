package week1b;

import java.util.ArrayList;
import java.util.Scanner;

public class MissingPrime {
    Scanner sc = new Scanner(System.in);
    IsPrime p = new IsPrime();

    public void prime(int range, int []arr){

        //putting only prime number in their respective index
        int count = 0;
        int []arrayOfPrime = new int [range];
        for(int i=0; i<=range; i++){
            if(p.isPrime(i)) {
                arrayOfPrime[i] = i;
                count++;
            }
        }

        boolean []isIn = new boolean[range];
        for (int i=0; i<range;i++){
            isIn[i] = false;
        }


        for(int j=0; j<arrayOfPrime.length; j++){
            for (int k=0; k<arr.length; k++){
                if(arrayOfPrime[j] == arr[k]){
                    isIn[j] = true;
                }
            }
        }

        //adding missing elements in array
        int []missedArr = new int[arrayOfPrime.length];
        for(int n=arr[0]; n<arr[arr.length-1]; n++){
            if(!isIn[n]){
                missedArr[n] = arrayOfPrime[n];
            }
        }

        System.out.println("Missed Prime Numbers: ");
        int c = 0;
        for(int y: missedArr){
            if(y!=0) {
                System.out.print(y+ " ");;
            }
        }
    }

    public static void main(String[] args) {
        MissingPrime m = new MissingPrime();
        int []arr = {5,11,17,23};
        m.prime(arr[arr.length-1]+1, arr);
    }

}
