package Array.Practice;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        
        if(size<2){
            System.out.println("Array must contain at least 2 elements");
            return;
        }

        int[] arr = new int[size];

        System.out.println("Enter the elements:");

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int max = arr[0];
        for(int i=1;i<size;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        
        boolean found = false;
        int secMax = 0;
        for(int i=0;i<size;i++){
            if(arr[i] != max){
                secMax = arr[i];
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("No second largest element");
            return;
        }
        
        
        for(int i=0;i<size;i++){
            if(arr[i] > secMax && arr[i] != max){
                secMax = arr[i];
            }
        }
        System.out.println("Second largest: " + secMax);

        
    }
}
