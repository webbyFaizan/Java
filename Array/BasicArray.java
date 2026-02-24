package Array;

public class BasicArray {
    public static void main(String[] args) {
        
        int [] x ;
        x = new int[5];

        // int[] x = new int[5]; Declaring and Initializing at same time.

        // int[] x = {10,20,30,40,50}; Declaring and assigning values at same time.

        x[0]=100;
        x[1]=200;
        x[2]=300;
        x[3]=400;
        x[4]=500;

        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
    }
    

}
