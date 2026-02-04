public class PrimeNumber{
    public static void main(String[] args) {
        int n=47;
        for(int i=2;i<n;i++){
        if(n%i==0){
                System.out.println("It is not a prime number");
                break;
            }
            else{
                System.out.println("It is a prime number");
            }
        }
    }
}