package dataStructure.Array;

import java.util.Arrays;

public class MergeSortedArray {

    public static int[] mergeSortedArray(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int[] arr = new int[n+m];

        int index =0;
        int left=0;
        int right=0;
        while(left <n && right <m){
            if(arr1[left] <arr2[right]){
                arr[index++] =arr1[left++];
            } else{
                arr[index++] = arr2[right++];
            }
        }
            while(left < n){
                arr[index++] = arr1[left++];
            }
            while(right <m){
                arr[index++] = arr2[right++];
            }
        return arr;
    }
    public static void main(String[] args){
        int[] arr1 = {1,3,5,8};
        int[] arr2 = {2,4,6,7};

        System.out.println(Arrays.toString(mergeSortedArray(arr1, arr2)));
    }
}
