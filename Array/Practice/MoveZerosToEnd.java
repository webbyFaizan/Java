package Array.Practice;

import java.util.Scanner;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();

        System.out.println("Enter the elements:");
        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int k = 0;
        for(int i=0;i<size;i++){
            if(arr[i] != 0){
                arr[k] = arr[i];
                k++;
            }
        }

        for(int i=k;i<size;i++){
            arr[i] = 0;
        }

        System.out.println("Array after moving zeros to end:");

        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
