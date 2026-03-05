package Array.Practice;

public class SumOfArray {
    public static void main(String[] args) {
        
        SumOfArray sa = new SumOfArray();
        sa.sum(new double[] { });
        sa.sum(new double[] {-2.398});
        sa.sum(new double[] {1, 2, 3});
        sa.sum(new double[] {1, -2, 3, 7, -4});
        System.out.println(sa.sum(new double[] {}));
        System.out.println(sa.sum(new double[] {-2.398}));
        System.out.println(sa.sum(new double[] {1, 2, 3}));
        System.out.println(sa.sum(new double[] {1, -2, 3, 7, -4}));    
    }

    double sum(double[] arr){
        double total = 0;
        for(int i=0;i<arr.length;i++){
            total = total + arr[i];
        }
        return total;
    }
}
