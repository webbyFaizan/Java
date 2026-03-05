package Array.Practice;

import java.util.Scanner;

public class MissingNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();

        System.out.println("Enter the elements:");
        int arr[] = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }


        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for(int i=1;i<=size+1;i++){
            boolean found = false;
            for(int j=0;j<size;j++){
                if(arr[j] == i){
                    found = true;
                    break;
                }
            }

            if(!found) {
              System.out.println("Missing number: " + i);  
              break;
            }
        }

    }
}
