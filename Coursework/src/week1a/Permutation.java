package week1a;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutation {
    ArrayList al = new ArrayList();

    public void permuteConvert(int[]array, int currentIndex){
        ConvertBinary b = new ConvertBinary();
        for(int i = currentIndex; i<array.length; i++){
            swap(array, i, currentIndex);
            permuteConvert(array, currentIndex+1);
            swap(array, currentIndex, i);
        }
        if(currentIndex == array.length -1){
            String n = "";
            for(int i=0; i<array.length; i++) {
                String a = Integer.toString(array[i]);
                n = n + a;
            }
            al.add(n);

            System.out.println("Binary Number: "+n);
            b.separate(Integer.parseInt(n));
            b.convert();
            System.out.println();
        }
    }


    public void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
