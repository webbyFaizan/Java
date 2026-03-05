package Array.Practice;

import java.util.Scanner;

public class PracticeSearchIndex{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements:");

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<size;i++){
            System.out.print(arr[i]);
        }
        System.out.println();

        System.out.println("Enter the number you want to search?");
        int n = sc.nextInt();

        boolean found = false;
        int count= 0;
        for(int i=0;i<size;i++){
            if(arr[i]==n){
                System.out.println("Element found at index:" + i);
                found = true;
                count ++;
            }
            }

            if(!found){
                System.out.println("Element not found");
            }else{
                System.out.println("Total occurence: " + count);
            }

        

    }
}