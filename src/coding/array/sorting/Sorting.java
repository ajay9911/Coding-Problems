package coding.array.sorting;

import coding.array.inputArray.InputArray;
import coding.array.sum.Sum;

import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int[] arr = new int[size];
        InputArray.inputArray(arr);
        System.out.println();

        sortArray(arr);


        System.out.println();



        System.out.println("sum of arrays elements:"+ Sum.sumArray(arr));

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
