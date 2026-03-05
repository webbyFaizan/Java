package Array.Practice;

import java.util.Scanner;

public class DuplicatesNumber{
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

        int[] unique = new int[size];
        int k = 0;

        for(int i=0;i<size;i++){
            boolean isDuplicate = false;
            
            for(int j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                unique[k] = arr[i];
                k++;
                System.out.print(arr[i] + " ");//Print only unique elements
            }
        }
        System.out.println();
        
        for(int i=0;i<k;i++){
            System.out.print(unique[i] + " ");//Print unique elements by storing in new array
        }
        
    }
}