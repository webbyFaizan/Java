class Enemy{
    int power = 1000;
    void showPower(){
        System.out.println("Enemy power is: " + power);
    }
}

public class ObjectCreation {
    public static void main(String[] args) {
        System.out.println("Hello, Java!!!");
        Enemy e = new Enemy();
        System.out.println(e.power);
        e.showPower();
    }
}
