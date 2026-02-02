public class Pattern {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int a=1;a<=5;a++){
            for(int b=1;b<=a;b++){
                System.out.print(a);
            }
            System.out.println();
        }

        for(int c=1;c<=4;c++){
            for(int d=1;d<=c;d++){
                System.out.print(d);
            }
            System.out.println();
        }
    }
}
