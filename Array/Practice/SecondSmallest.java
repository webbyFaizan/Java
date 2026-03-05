package Array.Practice;

import java.util.Scanner;

public class SecondSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        if(size<2){
            System.out.println("Array must contain at least 2 elements");
            return;
        }

        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int min = arr[0];
        for(int i=1;i<size;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        boolean found = false;
        int secMin = 0;
        for(int i=0;i<size;i++){
            if(arr[i] != min){
                secMin = arr[i];
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("No smallet second element");
            return;
        }

        for(int i=1;i<size;i++){
            if(arr[i] < secMin && arr[i] != min){
                secMin = arr[i];
            }
        }
        System.out.println("Second smallest element: " + secMin);
    }   
}
