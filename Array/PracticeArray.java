package Array;

import java.util.Scanner;

public class PracticeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements:");

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The Array Elents are: ");
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
        System.out.println("Maximum element is: " + max);

        int min = arr[0];
        for(int i=1;i<size;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Minimum element is: " + min);

        int sum = 0;
        for(int i=0;i<size;i++){
            sum += arr[i];
        }
        System.out.println("Addition of the element is: " + sum);

        int avg = sum / size;
        System.out.println("Average is: " + avg);

        sc.close();
    }
}
