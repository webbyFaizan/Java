public class FibonacieSeries{
    public static void main(String[] args) {
        int n=9;
        int x0=0;
        int x1=1;
        System.out.print(x0 + " " + x1 + " ");
        for(int i=2;i<n;i++){
            int x2=x0+x1;
            System.out.print(x2+" ");
            x0=x1;
            x1=x2;
        }
    }


}