public class MethodOverloading {
    
    void Area(){
        System.out.println("Printing Area");
    }

    void Area(float r){
        double circle = 3.14 *r * r;
        System.out.println("Area of circle: " + circle);
    }

    void Area(int r){
        int square = r*r;
        System.out.println("Area of square " + square);
    }

    void Area(int x, int y){
        int rectangle = x*y;
        System.out.println("Area of rectangle " + rectangle);
    }

    void Area(int x, int y, int z){
        int cuboid = x*y*z;
        System.out.println("Area of cuboid: " + cuboid);
    }

    public static void main(String[] args) {
        MethodOverloading a = new MethodOverloading();
        a.Area();
        a.Area(3.5f);
        a.Area(6);
        a.Area(3,5);
        a.Area(10,20,3);
    }
}
