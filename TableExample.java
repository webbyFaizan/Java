public class TableExample {
    public static void main(String[] args) {

        System.out.println("------Table Example");
        int a=4;
        for(int t=1;t<=10;t++){
            System.out.println(a + "*" + t  + "=" + (a*t) );
        }

        int n = 5;
        for(int i=1;i<=n;i++){
            System.out.println("Table of "+i);
            for(int j=1;j<=10;j++){
                System.out.println(i + " * " + j + " = " + (i*j));
            }
        }
    }
}
