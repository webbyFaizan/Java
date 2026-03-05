package Array.Practice;

import java.util.Scanner;

public class RightRotateArrayByOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();

        System.out.println("Enter the elements:");
        int arr[] = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Before Rotate: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int temp = arr[size-1];
        for(int i=size-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        
        System.out.print("After rotating: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
