package coding.array.find_duplicates;

import coding.array.inputArray.InputArray;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        InputArray.inputArray(arr);  // Assuming this method reads input into the array

        // Loop to find duplicates
        for (int i = 0; i < arr.length; i++) {
            // Skip if the element has already been checked
            if (arr[i] == Integer.MIN_VALUE) {
                continue;
            }

            boolean isDuplicate = false;  // Flag to track if a duplicate is found

            // Inner loop to compare arr[i] with subsequent elements
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true; // Mark as duplicate
                    arr[j] = Integer.MIN_VALUE;  // Mark arr[j] as checked
                }
            }

            // If the element is a duplicate, print it
            if (isDuplicate) {
                System.out.println("Duplicate Element: " + arr[i]);
                arr[i] = Integer.MIN_VALUE;  // Mark arr[i] as checked
            }
        }
    }
}
