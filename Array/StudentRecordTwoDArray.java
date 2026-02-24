package Array;

import java.util.Scanner;

public class StudentRecordTwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many students are there?");
        int size1 = sc.nextInt();

        System.out.println("Enter how many subjects are there?");
        int size2 = sc.nextInt();

        int arr[][] = new int[size1][size2];

        System.out.println("Enter marks of student: ");

        for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }

        System.out.println();

        for(int i=0;i<size1;i++){
            System.out.println("Marks of each student are:");
            for(int j=0;j<size2;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for(int i=0;i<size1;i++){
            int add = 0;
            for(int j=0;j<size2;j++){
                add=add + arr[i][j];
            }
            System.out.println("Total marks of Student " + (i+1) + " is: " + add);
        }

        for(int i=0;i<size1;i++){
            int max = arr[i][0];
            for(int j=0;j<size2;j++){
                if(arr[i][j] > max){
                    max=arr[i][j];
                }
            }
            System.out.println("Maximum marks of Student " + (i+1) + " is: " + max);
        } 
        sc.close();  
    }
}
