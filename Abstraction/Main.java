package Abstraction;

public class Main {
    public static void main(String[] args) {
        
        Circle c = new Circle(5);
        System.out.println("Area of Circle is: " + c.area());
        System.out.println("Perimeter of Circle is: " + c.perimeter());

        Rectangle r = new Rectangle(4,5);
        System.out.println("Area of Rectangle is: " + r.area());
        System.out.println("Perimeter of Rectangle is: " + r.perimeter());
    }
}
