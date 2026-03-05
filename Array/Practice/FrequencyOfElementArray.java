package Array.Practice;

import java.util.Scanner;
public class FrequencyOfElementArray {
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

        for(int i=0;i<size;i++){
            boolean alreadyChecked = false;
            for(int j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    alreadyChecked = true;
                    break;
                }
            }

            if(alreadyChecked){
                continue;
            }
            
            int count = 0;
            for(int j=0;j<size;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            System.out.println(arr[i] + " repeated " + count + " times.");
        }
    }
}
