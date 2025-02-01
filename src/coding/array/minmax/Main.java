package coding.array.minmax;

import coding.array.inputArray.InputArray;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for array size
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        // Validate size
        if (size <= 0) {
            System.out.println("Invalid size! Size should be greater than zero.");
            return;
        }

        int[] arr = new int[size];

        // Input elements into the array
        InputArray.inputArray(arr);
        System.out.println("Array: " + Arrays.toString(arr));

        // Find min and max elements
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Max element: " + max);
        System.out.println("Min element: " + min);

        sc.close();
    }
}
