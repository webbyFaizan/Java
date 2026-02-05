public class Palindrome {
    public static void main(String[] args) {
        int n = 1221;
        int temp = n;
        int sum = 0;
        while(n>0){
            int r = n % 10;
            n = n / 10;
            sum = sum*10+r;
        }
        System.out.println(sum);
        if(sum==temp){
            System.out.println("It is palindrome");
        }else{
            System.out.println("It is not palindrome");
        }
    }
}
