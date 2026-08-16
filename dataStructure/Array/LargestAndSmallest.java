package dataStructure.Array;

import java.util.Arrays;

public class LargestAndSmallest {
    public static int largestAndSmallest(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int n : arr){
            min = Math.min(n, min);
            max = Math.max(n, max);
        }
        System.out.println(" Smallest element: " +min);
        return max==Integer.MIN_VALUE ? 0: max;
    }
    public static void main(String[] args){

        int []arr = {10, -2, 0, 15, -7};
        System.out.println("Largest element: " +largestAndSmallest(arr));
    }
}
