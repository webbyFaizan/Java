package Array.Practice;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();

        System.out.println("Enter elements:");
        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // int max = arr[0];
        // for(int i=1;i<size;i++){
        //     if(arr[i] > max){
        //         max = arr[i];
        //     }
        // }
        // System.out.println("Maximum element: " + max);

        // int min = arr[0];
        // for(int i=1;i<size;i++){
        //     if(arr[i] < min){
        //         min = arr[i];
        //     }
        // }
        // System.out.println("Minimum element: " + min);

        // for(int i=0;i<size/2;i++){
        //     int temp = arr[i];
        //     arr[i] = arr[size -1 -i];
        //     arr[size -1 -i] = temp;
        // }

        // for(int i=0;i<size;i++){
        //     System.out.print(arr[i] + " ");
        // }

        System.out.println("Enter the element you want to search:");
        int n = sc.nextInt();

        boolean found = false;
        for(int i=0;i<size;i++){
            if(n == arr[i]){
                found = true;
                System.out.println("Found at index: " + i);
                break;
            }
        }
        if(!found){
            System.out.println("Element not found");
        }
    }
}
