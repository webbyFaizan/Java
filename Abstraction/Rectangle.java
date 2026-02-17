package Abstraction;

public class Rectangle extends Shape {
    
    double length;
    double breadth;

    Rectangle(double length, double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    double area(){
        return length * breadth;
    }

    double perimeter(){
        return 2 * (length + breadth);
    }
}
