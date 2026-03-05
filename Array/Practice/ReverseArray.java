package Array.Practice;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size?");
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

        for(int i=0;i<size/2;i++){
            int temp = arr[i];
            arr[i] = arr[size -1 -i];
            arr[size -1 -i] = temp;
        }
        
        System.out.println("Reverse Array:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
