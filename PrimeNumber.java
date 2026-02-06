public class PrimeNumber{
    public static void main(String[] args) {
        int n=47;
        if(n<=1){
            System.out.println("Not a Prime");
            return;
        }

        if(n==2){
            System.out.println("Prime Number");
            return;
        }

        if(n%2==0){
            System.out.println("Not a Prime");
            return;
        }

        boolean isPrime=true;

        for(int i=3;i*i<=n;i+=2){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}