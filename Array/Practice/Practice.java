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

        // System.out.println("Enter the element you want to search:");
        // int n = sc.nextInt();

        // boolean found = false;
        // for(int i=0;i<size;i++){
        //     if(n == arr[i]){
        //         found = true;
        //         System.out.println("Found at index: " + i);
        //         break;
        //     }
        // }
        // if(!found){
        //     System.out.println("Element not found");
        // }

        // int max = arr[0];
        // for(int i=0;i<size;i++){
        //     if(arr[i] > max){
        //         max = arr[i];
        //     }
        // }

        // int secMax = 0;
        // boolean found = false;
        // for(int i=0;i<size;i++){
        //     if(arr[i] != max){
        //         secMax = arr[i];
        //         found = true;
        //         break;
        //     }
        // }

        // if(!found){
        //     System.out.println("No second largest element");
        //     return;
        // }

        // for(int i=0;i<size;i++){
        //     if(arr[i] > secMax && arr[i] != max){
        //         secMax = arr[i];
        //     }
        // }
        // System.out.println("Second largest element: " + secMax);

        // int[] unique = new int[size];
        // int k = 0;

        // for(int i=0;i<size;i++){
        //     boolean isDuplicate = false;
        //     for(int j=0;j<i;j++){
        //         if(arr[i] == arr[j]){
        //             isDuplicate = true;
        //             break;
        //         }
        //     }
            
        //     if(!isDuplicate){
        //         unique[k] = arr[i];
        //         k++;
        //         System.out.print(arr[i] + " ");
        //     }
        // }

        // for(int i=0;i<size;i++){
        //     boolean isAlreadyChecked = false;
        //     for(int j=0;j<i;j++){
        //         if(arr[i] == arr[j]){
        //             isAlreadyChecked = true;
        //             break;
        //         }
        //     }
        //     if(isAlreadyChecked){
        //         continue;
        //     }
        //     int count =0;
        //     for(int j=0;j<size;j++){
        //         if(arr[i] == arr[j]){
        //             count++;
        //         }
        //     }
        //     System.out.println(arr[i] + " repeated " + count + " times " );
        // }

        // boolean isSorted = true;
        // for(int i=0;i<size-1;i++){
        //         if(arr[i] > arr[i+1]){
        //             isSorted = false;
        //             break;
        //         }
        //     }

        // if(isSorted){
        //     System.out.println("Array is sorted");
        // }else{
        //     System.out.println("Array is not sorted");
        // }

        // int k=0;
        // for(int i=0;i<size;i++){
        //     if(arr[i] != 0){
        //         arr[k] = arr[i];
        //         k++;
        //     }
        // }

        // for(int i=k;i<size;i++){
        //     arr[i] = 0;
        // }

        // for(int i=0;i<size;i++){
        //     System.out.print(arr[i] + " ");
        // }

        // int temp = arr[0];
        // for(int i=0;i<size-1;i++){
        //     arr[i] = arr[i+1];
        // }
        // arr[size-1] = temp;

        // for(int i=0;i<size;i++){
        //     System.out.print(arr[i] + " ");
        // }

        int temp = arr[size-1];
        for(int i=size-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;

        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }


    }
}

   