public class AutomorphicNumber{
    public static void main(String[] args) {
        int n=625;
        int count=0;

        int temp=n;
        while(temp>0){
            temp=temp/10;
            count++;
        }

        int square=n*n;
        int lastDigits=square % (int) Math.pow(10,count);

        if(n==lastDigits){
            System.out.println("Automorphic Number");
        }else{
            System.out.println("Not an Automorphic Number");
        }

    }
}