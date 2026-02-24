package Array;

import java.util.Scanner;

public class SecondMax{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of array: ");

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for(int i=0;i<size;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        int secMax=arr[0];
        for(int j=0;j<size;j++){
            if(arr[0] < arr[j] && max > arr[j]){
                secMax = arr[j];
            }
        }

        System.out.println("Maximum Number is: " + max);
        System.out.println("Second Max is: " +secMax);

        sc.close();
    }
}