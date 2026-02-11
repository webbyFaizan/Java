// import java.util.*;
public class Practice{
    public static void main(String[] args) {
        // int n=14598;
        // int sum=0;
        // while(n>0){
        //     int r=n%10;
        //     n=n/10;
        //     sum=sum+r;
        // }
        // System.out.println(sum);

        // int n=9351;
        // int reverse=0;
        // while(n>0){
        //     int r=n%10;
        //     reverse=reverse*10+r;
        //     n=n/10;
        // }
        // System.out.println(reverse);

        // int n=47;

        // if(n<=8){
        //     System.out.println("Not a Prime Number");
        //     return;
        // }

        // if(n==2){
        //     System.out.println("Prime Number");
        //     return;
        // }

        // if(n%2==0){
        //     System.out.println("Not a Prime Number");
        //     return;
        // }

        // boolean isPrime=true;

        // for(int i=3;i*i<=n;i+=2){
        //     if(n%i==0){
        //         isPrime=false;
        //         break;
        //     }

        // }
        // if(isPrime){
        //     System.out.println("Prime Number");
        // }else{
        //     System.out.println("Not a Prime Number");
        // }

        // int n=121;
        // int sum=0;

        // int temp=n;
        // while (temp>0) {
        //     int r=temp%10;
        //     sum=sum*10+r;
        //     temp=temp/10;
        // }
        // if(sum==n){
        //     System.out.println("It is a Palindrome");
        // }
        // else{
        //     System.out.println("It is not a Palindrome");
        // }

        // int year=1628;
        // if(year%4==0 && (year%100!=0 || year%400==0)){
        //     System.out.println("It is a Leap Year");
        // }else{
        //     System.out.println("It is not a Leap Year");
        // }

        // int n=6;
        // int x0=0;
        // int x1=1;

        // System.out.print(x0 + " " + x1 + " ");

        // for(int i=2;i<n;i++){
        //     int x2=x0+x1;
        //     System.out.print(x2 + " ");
        //     x0=x1;
        //     x1=x2;
        // }

        // int n=5;
        // int fact=1;
        // for(int i=1;i<=n;i++){
        //     fact=fact*i;
        // }
        // System.out.println(fact);

        // int n=625;
        // int count=0;

        // int temp=n;
        // while (temp>0) {
        //     temp=temp/10;
        //     count++;
        // }

        // int square=n*n;
        // int lastDigits=square % (int) Math.pow(10,count);

        // if(n==lastDigits){
        //     System.out.println("It is an Automorhic Number");
        // }else{
        //     System.out.println("Not an Automorphic Number");
        // }

        int n=153;
        int sum=0;
        int count=0;

        int temp=n;
        while(temp>0){
            temp=temp/10;
            count++;
        }

        temp=n;
        while (temp>0) {
            int digit=temp%10;
            int power=1;
            for(int i=1;i<=count;i++){
                power=power*digit;
            }
            
            sum=sum+power;
            temp=temp/10;
        }

        if(n==sum){
            System.out.println("It is an Armstrong Number");
        }else{
            System.out.println("Not an Armstrong Number");
        }

    }
}