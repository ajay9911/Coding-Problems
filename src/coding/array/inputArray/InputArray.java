package coding.array.inputArray;

import java.util.Arrays;
import java.util.Scanner;

public class InputArray {

    public static void inputArray(int[] array){
        int size=array.length;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the elements of array");
        for (int i=0;i<size;i++){
            array[i]=scanner.nextInt();
        }
        System.out.println();

    }
}
