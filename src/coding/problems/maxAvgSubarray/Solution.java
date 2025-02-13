package coding.problems.maxAvgSubarray;

public class Solution {
    public static double maxAvgSubArray(int[] arr,int k){
        int sum=0;
        for (int i=0;i<k;i++){
            sum =sum +arr[i];
        }

        int maxSum=sum;
        for (int i=k;i<arr.length;i++){
            sum=sum+arr[i]-arr[i-k];
            maxSum=Math.max(maxSum,sum);
        }
        return (double) maxSum / k;
    }

    public static void main(String[] args) {
        int[] arr={1,12,-5,-6,50,3};
        double d= maxAvgSubArray(arr,4) ;
        System.out.println(d);
    }
}
