package coding.array.remove_specific_elemets;

import coding.array.inputArray.InputArray;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize and fill the array
        int[] arr = new int[10];
        InputArray.inputArray(arr);

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Get the index to remove
        System.out.print("Enter index to remove (0 to " + (arr.length - 1) + "): ");
        int removeIndex = sc.nextInt();

        // Validate index
        if (removeIndex < 0 || removeIndex >= arr.length) {
            System.out.println("Invalid index! No changes made.");
        } else {
            // Shift elements left from the removeIndex
            for (int i = removeIndex; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }

            // Create a new array with reduced size
            arr = Arrays.copyOf(arr, arr.length - 1);

            System.out.println("Updated Array: " + Arrays.toString(arr));
        }
        System.out.println(arr.length);

        sc.close(); // Close the scanner
    }
}
