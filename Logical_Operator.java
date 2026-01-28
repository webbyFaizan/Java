public class Logical_Operator {
    public static void main(String[] args) {
        
        boolean x = true;
        boolean y = false;
        boolean resultAnd = x && y;
        System.out.println("Logical AND: " + resultAnd);

        boolean resultOr = x || y;
        System.out.println("Logical OR: " + resultOr);

        boolean resultNotX = !x;
        boolean resultNotY = !y;
        System.out.println("Logical NOT for x: " + resultNotX);
        System.out.println("Logical NOt for y: " + resultNotY);
    }
}
