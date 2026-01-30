public class ForLoop {
    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            System.out.println("Outer Loop");
            for(int j=1;j<4;j++){
                System.out.println("Inner Loop");
                for(int k=1;k<3;k++){
                    System.out.println("Inside K Loop");
                }
            }
            System.out.println("Another Loop Begin");
        }
        System.out.println("Loop Begin");
    }
}
