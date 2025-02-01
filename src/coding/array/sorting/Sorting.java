package coding.array;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int[] arr = new int[size];


        // Reading integer array
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the " + i + "th element of array:");
            arr[i] = sc.nextInt();
        }

        // Consume the leftover newline
        sc.nextLine();



        // Printing integer array
        System.out.println("Integer Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Newline for clarity


        sortArray(arr);

     sc.close();
    }

    public static void sortArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]<arr[j]){
                    int max=arr[i];
                    arr[i]=arr[j];
                    arr[j]=max;
                    
                }
            }
        }

        System.out.println("array after sorting:");
        for (int j : arr) {
            System.out.print(j+" ");
        }
    }
}
