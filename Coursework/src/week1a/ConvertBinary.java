package week1a;

import java.util.ArrayList;

public class ConvertBinary {

    LinkList l = new LinkList();
    ArrayList al = new ArrayList();

    public void separate(int num){

        while (num>0){
            int a = num%10;
            num = num/10;
            l.addNode(a);
        }
    }


    public int[] permutation(int val){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(val>0){
            int a = val%10;
            val = val/10;
            arr.add(a);
        }
        int []ar = new int[arr.size()];
        for (int i=0; i< arr.size();i++){
            ar[i] = arr.get(i);
        }
        return ar;
    }


    public void convert(){
        int exp = 0;
        int sum = 0;
        Node travel = l.head;
        while (travel != null){
            int deci = travel.data*(int)Math.pow(2,exp);
            sum = sum+deci;
            exp++;
            travel = travel.next;
        }
        System.out.println("Integer Value: "+sum);
    }


    public static void main(String[] args) {
        ConvertBinary c = new ConvertBinary();
        Permutation p = new Permutation();
        int []a = c.permutation(101);
        p.permuteConvert(a,0);
    }
}
