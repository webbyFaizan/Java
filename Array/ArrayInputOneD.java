package Array;

import java.util.Scanner;

public class ArrayInputOneD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " element:");

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The array elements are:");
        for(int i=0;i<size;i++){
            System.out.println(arr[i] + " ");
        }

        sc.close();
    }
}
