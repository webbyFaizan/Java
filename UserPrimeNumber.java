import java.util.Scanner;
public class UserPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int prime = sc.nextInt();

        if(prime<=1){
            System.out.println("Not a Prime Number");
            return;
        }

        if(prime==2){
            System.out.println("Prime Number");
            return;
        }

        if(prime%2==0){
            System.out.println("Not a Prime Number");
            return;
        }

        boolean isPrime=true;

        for(int i=3;i*i<prime;i+=2){
            if(prime%i==0){
                isPrime=false;
                break;
            }
        }

        if(isPrime){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not a Prime number");
        }
    }
}
