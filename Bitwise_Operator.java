public class Bitwise_Operator {
    public static void main(String[] args) {
        
        int x = 12;
        int y = 9;
        int resultAnd = x & y;
        System.out.println("Bitwise AND: " + resultAnd);

        int resultOr = x | y;
        System.out.println("Bitwise OR: " + resultOr);

        int resultXor = x ^ y;
        System.out.println("Bitwise XOR: " + resultXor);

        x = 5;
        int resultNotX = ~x;
        System.out.println("Bitwise NOT: " + resultNotX);

        x = 12;
        int resultLeftShift = x << 2;
        System.out.println("Left Shift: " + resultLeftShift);

        int resultRightShift = x >> 2;
        System.out.println("Right Shift: " + resultRightShift);
    }
}
