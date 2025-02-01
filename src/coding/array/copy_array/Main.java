package coding.array.copy_array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6,7,8,9,10};
        int[] arr2=arr1;

        for (int i = 0; i <arr1.length; i++) {
            arr2[i]=arr1[i];

        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

}
