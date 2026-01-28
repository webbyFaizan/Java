public class Unary_Operator {
    public static void main(String[] args) {
        int a = 5;

        int negative = -a;
        System.out.println("Unary minus (-a): " + negative);

        int positive = +a;
        System.out.println("Unary plus (+a): " + positive);
        
        System.out.println("Original a: " + a);
        System.out.println("Post-increment: " + (a++));
        System.out.println("After Post-increment, a: " + a);

        System.out.println("Pre-increment (++a): " + (++a));

        System.out.println("Post-decrement (a--): " + (a--));
        System.out.println("After Post-decrement, a: " + a);

        System.out.println("Pre-decrement (--a): " + (--a));
    }
}
