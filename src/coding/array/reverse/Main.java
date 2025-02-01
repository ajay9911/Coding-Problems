package coding.array.reverse;

import coding.array.inputArray.InputArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr=new int[10];
        InputArray.inputArray(arr);

        int n=arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
