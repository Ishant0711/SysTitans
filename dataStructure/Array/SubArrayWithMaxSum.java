package dataStructure.Array;

public class SubArrayWithMaxSum {
    public static int subArrayWithMaxSum(int[] arr){
        int count =0;
        int maxSum = Integer.MIN_VALUE;

        for(int m : arr){
           count += m;
           maxSum = Math.max(maxSum, count);
          if(count <0){
              count =0;
          }
        } return maxSum;
    }

    public static void main(String[] args){
        int[] arr = {1, -2, 3, 4, -1, 2, 1, -5, 4};
        System.out.println(subArrayWithMaxSum(arr));
    }
}








/*
Imagine you’re walking through the array, adding numbers as you go.

If the sum is positive, it’s worth keeping — it might help future subarrays grow bigger.

If the sum turns negative, it’s harmful — carrying it forward will only reduce the total.So, you reset and start fresh from the next element.
-----------------------------------------------------------------------------------------------------------------------
⚡ Kadane’s Algorithm (Optimal Approach)
Maintain two variables:

currentSum → running sum of the subarray.

maxSum → maximum sum found so far.

At each step:

Add the current element to currentSum.

If currentSum is greater than maxSum, update maxSum.

If currentSum becomes negative, reset it to 0 (because a negative sum will only reduce future totals).
*/
