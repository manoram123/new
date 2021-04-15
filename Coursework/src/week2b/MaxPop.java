package week2b;

public class MaxPop {
    int maxCount =0;
    int k =11;
    Stack s1 = new Stack();
    Stack s2 = new Stack();

    public int pop(int []a1, int []a2){

        for(int i=0; i<a1.length; i++){
            s1.push(a1[i]);
        }

        for(int i=0; i<a2.length; i++){
            s2.push(a2[i]);
        }

        for (int i=0; i<s2.size(); i++){
            int a = s1.pop();
            int b = s2.pop();

            if (a+b <=k ){
                maxCount++;
            }
        }
        return maxCount*2;
    }

    public static void main(String[] args) {
        int []a1 = {9,7,4,9,2};
        int []a2 = {1,4,2,1};

        MaxPop mp = new MaxPop();

        System.out.println(mp.pop(a1,a2));
    }
}
