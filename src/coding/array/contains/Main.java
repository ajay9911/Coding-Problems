package coding.array.contains;

import coding.array.inputArray.InputArray;

public class Main {
    public static void main(String[] args) {

        int[] arr=new int[5];
        InputArray.inputArray(arr);
        int target =10;
         boolean  b= contain(arr,target);
        System.out.println(b);


    }

    public static boolean contain(int[]  arr, int target){
        for (int i : arr) {
            if (i==target){
                return true;
            }

        }
        return false;
    }
}
