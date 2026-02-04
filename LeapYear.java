public class LeapYear{
    public static void main(String[] args) {
        int year=400;
        if(year%4==0 && (year%100!=0 || year%400==0)){
            System.out.println("It is a Leap year");
        }
        else{
            System.out.println("It is not a Leap year");
        }
    }
}