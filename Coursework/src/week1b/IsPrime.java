package week1b;

public class IsPrime {

    public boolean isPrime(int n){
        int c = 0;
        boolean isPrime = true;

        if(n == 1 ){
            isPrime =false;
        }

        if(n == 2){
            isPrime = true;
        }

        for(int i=1; i<=n; i++){
            if(n%i == 0){
                c++;
            }
        }

        if(c>2){
            isPrime = false;
        }

        return isPrime;
    }

    public static void main(String[] args) {
        IsPrime i = new IsPrime();
        System.out.println(i.isPrime(15));
    }

}
