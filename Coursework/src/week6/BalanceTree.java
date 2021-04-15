package week6;

public class BalanceTree {

    String []arr = {"1", "4", "5", null, "3", "2", "9",null, null, null, null, null, null, "8", "7"};

    public void tree(){
        BalanceTree b = new BalanceTree();

        String data = "4";

        String left = arr[2*b.index(data)+1];
        String right = arr[2*b.index(data)+2];

        System.out.println(left);
        System.out.println(right);
    }
    public int index(String data){
        int v =0;
        for(int i=0; i<arr.length;i++){
            if(data.equals(arr[i])){
                v= i;
            }
        }
        return v;
    }

    public static void main(String[] args) {
        int []head = {5,9};
        BalanceTree bt = new BalanceTree();
        bt.tree();
    }

}
