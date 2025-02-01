package coding.array.sum;

public class Sum {
    public static int sumArray(int[] array){
        int sum=0;
        for (int i : array) {
            sum=sum+i;
        }
        return sum;
    }
}
