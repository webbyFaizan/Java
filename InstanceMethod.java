public class InstanceMethod {
    int x = 100;
    static int y = 200;
    
    public static void main(String[] args) {
        InstanceMethod ironman = new InstanceMethod();
        ironman.showPower();
    }

    void showName(){
        System.out.println("I am Iron Man.");
        System.out.println("Value of x: " + x + "value of y: " + y);
    }

    void showPower(){
        System.out.println("Showing Avenger's Power!");
        showName();
    }
}
