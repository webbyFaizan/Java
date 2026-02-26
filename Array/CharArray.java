package Array;

import java.util.Scanner;
public class CharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements:");
        int size = sc.nextInt();

        System.out.println("Enter the character:");
        char[] x = new char[size];

        for(int i=0;i<size;i++){
            x[i] = sc.next().charAt(0);
        }

        for(int i=0;i<size;i++){
            System.out.print(x[i]);
        }


    }
}
