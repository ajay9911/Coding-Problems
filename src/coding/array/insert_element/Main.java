package coding.array.insert_element;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int size=arr.length;
        System.out.println(Arrays.toString(arr));
        System.out.println("enter the position of element");
        int position=sc.nextInt();
        System.out.println("enter the value ");
        int value=sc.nextInt();

        if (position < 0 || position > size) {
            System.out.println("Invalid position!");
        } else {
            // Create a new array with an extra space
            int[] newArr = new int[size + 1];

            // Copy elements before the position
            for (int i = 0; i < position; i++) {
                newArr[i] = arr[i];
            }

            // Insert new element
            newArr[position] = value;

            // Copy remaining elements
            for (int i = position; i < size; i++) {
                newArr[i + 1] = arr[i];
            }

            System.out.println("Updated Array: " + Arrays.toString(newArr));
        }


    }
}
